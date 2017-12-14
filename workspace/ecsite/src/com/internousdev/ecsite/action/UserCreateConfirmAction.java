package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.UserCreateConfirmDAO;
import com.internousdev.ecsite.dto.UserCreateDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author internous
 *
 */
public class UserCreateConfirmAction extends ActionSupport implements SessionAware {

	private String loginUserId;

	private String loginPassword;

	private String userName;

	/**
	 * ログイン検証情報取得DAO
	 *
	 */
	private UserCreateConfirmDAO userCreateConfirmDAO = new UserCreateConfirmDAO();

	/**
	 * ログイン検証情報格納DTO
	 */
	private UserCreateDTO userCreateDTO = new UserCreateDTO();


	public Map<String,Object> session;

	private String errorMassage;

	public String execute() {

		String result = ERROR;

		if(!(loginUserId.equals("")) && !(loginPassword.equals("")) && !(userName.equals(""))) {

			session.put("loginUserId", loginUserId);
			session.put("loginPassword", loginPassword);
			session.put("userName", userName);
			result = SUCCESS;
		} else {

			setErrorMassage("未入力の項目があります。");
			result = ERROR;
		}

		return result;
	}

	public String getLoginUserId() {
		return loginUserId;
	}

	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getErrorMassage() {
		return errorMassage;
	}

	public void setErrorMassage(String errorMassage) {
		this.errorMassage = errorMassage;
	}
}
