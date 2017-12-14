package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.ecsite.dto.UserCreateDTO;
import com.internousdev.ecsite.util.DBConnector;

public class UserCreateConfirmDAO {

	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();
	private UserCreateDTO userCreateDTO = new UserCreateDTO();

	public UserCreateDTO getLoginUserTransaction(String loginUserId){
		String sql = "SELECT login_id,login_pass,user_name FROM login_user_transaction";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			if(rs.next()){
				userCreateDTO.setLoginId(rs.getString("login_id"));
				userCreateDTO.setLoginPassword(rs.getString("login_pass"));
				userCreateDTO.setUserName(rs.getString("user_name"));
			}
		}catch(Exception e){
			e.printStackTrace();
		}

		return userCreateDTO;
	}
}
