
package action.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class VariousInputForm extends ActionForm {
	private String name;
	private String password;
	private String etc;
	private boolean check1;
	private boolean check2;
	private String[] multi1;
	private String radio1;
	private String[] select1;
	private String[] select2;
	
	private String hidden1;
	
	public VariousInputForm(){
		multi1 = new String[0];
		select2 = new String[0];
		check2 = true;
	}

	public boolean getCheck1() {
		return check1;
	}

	public boolean getCheck2() {
		return check2;
	}

	public String getEtc() {
		return etc;
	}


	public String[] getMulti1() {
		return multi1;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public String getRadio1() {
		return radio1;
	}

	public String[] getSelect1() {
		return select1;
	}

	public String[] getSelect2() {
		return select2;
	}

	public void setCheck1(boolean check) {
		check1 = check;
	}

	public void setCheck2(boolean check) {
		check2 = check;
	}

	public void setEtc(String etc) {
		this.etc = etc;
	}

	public void setMulti1(String[] multi) {
		multi1 = multi;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPassword(String pass) {
		password = pass;
	}

	public void setRadio1(String radio) {
		radio1 = radio;
	}

	public void setSelect1(String[] select) {
		select1 = select;
	}

	public void setSelect2(String[] selects) {
		select2 = selects;
	}

	public String getHidden1() {
		return hidden1;
	}

	public void setHidden1(String hiddenString) {
		hidden1 = hiddenString;
	}

	public void reset(ActionMapping mapping, HttpServletRequest request) {
      //1)Formクラスの状態を初期化する
	   check1 = false;
	   check2 = false;
      select1 = new String[0];
      multi1 = new String[0];
	}
}
