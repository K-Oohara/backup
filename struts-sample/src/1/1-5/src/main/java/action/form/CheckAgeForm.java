
package action.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class CheckAgeForm extends ActionForm{
    private int age;
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest req) {
        
        
        ActionErrors errors = new ActionErrors();
        
        try{
            String ageString = req.getParameter("age");
          
            //1)入力データの必須チェック
            if(ageString == null || "".equals(ageString)){
                errors.add("age",new ActionMessage("error.age.required"));
                return errors;
            }
          
            int age = Integer.parseInt(ageString);
        
            //2)入力データの数値の範囲チェック
            if(age<0 || age >200){
                //検証失敗
                //ageプロパティの検証失敗なので、ageプロパティに エラーメッセージのキーがerror.ageを設定する。
                errors.add("age",new ActionMessage("error.age.range"));
            }
        }catch(NumberFormatException ex){
             //3)入力データの型チェック
             errors.add("age",new ActionMessage("error.age.notint"));
        }
        return errors;
    }

}
