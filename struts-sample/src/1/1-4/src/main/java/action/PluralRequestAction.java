
package action;

import java.util.List;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DataModel;
import action.form.PluralForm;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;

public class PluralRequestAction extends Action {

    public static final String DATA = "data";
    private static final String NAME_PRE = "Name";
    private static final String DATA_PRE = "Data";

    public ActionForward execute(
              ActionMapping mapping,ActionForm form,
              HttpServletRequest req,HttpServletResponse res) throws Exception {
        
        //1)DynaActionFormから行数を取得する
        DynaActionForm dForm = (DynaActionForm)form;
        int count = ((Integer)dForm.get("count")).intValue();
        
        //表示するデータを格納するList
        List<DataModel> list = new ArrayList<DataModel>();
        
        for(int i=0;i<count;i++){
            //2)表形式データの生成を行う
            DataModel model = new DataModel();
            model.setName(NAME_PRE+i);
            model.setValue(DATA_PRE+i);
            list.add(model);
        }
        
        //3)次画面のフォーム情報の初期化
        PluralForm pForm = new PluralForm();
        pForm.setData(list);
        req.setAttribute("PluralForm",pForm);

        //4)比較用にセッションに格納する
        req.getSession().setAttribute(DATA,list);
        
        return mapping.findForward("show");
    }

}
