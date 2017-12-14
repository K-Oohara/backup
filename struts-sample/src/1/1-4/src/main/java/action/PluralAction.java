
package action;

import java.util.List;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DataModel;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import action.form.PluralForm;
import action.viewhelper.PluralResultHelper;

public class PluralAction extends Action {

    private static final String RESULT = "Result";

    public ActionForward execute(ActionMapping mapping,ActionForm form,
              HttpServletRequest req,HttpServletResponse res) throws Exception {
        
        PluralForm pForm = (PluralForm)form;
        
        //比較用に格納しておいたデータを取り出す
        @SuppressWarnings("unchecked")
        List<DataModel> beforeData = (List)req.getSession().getAttribute(PluralRequestAction.DATA);
        
        //ViewHelperを格納するList
        List<PluralResultHelper> resultList = new ArrayList<PluralResultHelper>();
        
        //入力されたデータを取り出す
        List<DataModel> afterData = pForm.getAllData();
        
        for(int i=0;i<beforeData.size();i++){
            //ViewHelperを生成する
            PluralResultHelper helper = new PluralResultHelper();
            
            //値の変更の有無を設定
            DataModel model = beforeData.get(i);
            boolean flag = model.getName().equals((afterData.get(i)).getName()) && model.getValue().equals((afterData.get(i)).getValue());
            helper.setChange(!flag);
            
            //変更された内容を設定
            helper.setData(afterData.get(i));
            
            resultList.add(i,helper);
        }
        
        //最初のデータ値は必要ないのでセッションオブジェクトから削除する
        req.getSession().removeAttribute(PluralRequestAction.DATA);
        
        //ViewHelperを結果としてリクエストに設定
        req.setAttribute(RESULT,resultList);
        
        return mapping.findForward("result");
    }

}
