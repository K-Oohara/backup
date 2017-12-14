
package action.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.validator.ValidatorForm;


public class CheckMailForm extends ValidatorForm{
    private String mailAddress;
    private String reMailAddress;

	public ActionErrors validate(ActionMapping mapping, HttpServletRequest req) {
		
		//1)superの呼び出しをすることでStruts Validatorを有効にしている
		ActionErrors errors = super.validate(mapping,req);
		
		//2)Struts Validatorでエラーがあった場合はValidatorのチェックのみでエラー画面を返す
		//必須チェックによってnullを回避する
		if(!errors.isEmpty()){
			return errors;
		}
		
		//入力された2つのアドレスを比較、異なっていれば検証エラーとする
		if(!mailAddress.equals(reMailAddress)){
			errors.add("reMailAddress",new ActionMessage("error.reMailAddress.notsame"));
		}
		
		return errors;
		
	}

	public String getMailAddress() {
		return mailAddress;
	}

	public String getReMailAddress() {
		return reMailAddress;
	}

	public void setMailAddress(String string) {
		mailAddress = string;
	}

	public void setReMailAddress(String string) {
		reMailAddress = string;
	}

}
