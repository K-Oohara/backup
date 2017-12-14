
package action.form;

import org.apache.struts.validator.ValidatorForm;


public class CheckMailForm extends ValidatorForm {
    private String mailAddress;
    private String reMailAddress;

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
