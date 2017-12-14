package dao;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.apache.commons.dbcp.*;
import org.apache.commons.pool.impl.*;

import util.SettingUtil;

public class DaoUtil {
	private DataSource source;

        //�V���O���g���Ƃ��Ď�������
	private static DaoUtil inst = new DaoUtil();

        //�ݒ�t�@�C���̐ݒ�̃L�[��\���萔
	private static final String JDBC_URL = "jdbc.driver.url";
	private static final String JDBC_USER = "jdbc.driver.user";
	private static final String JDBC_PASS = "jdbc.driver.pass";
	private static final String JDBC_DRIVER = "jdbc.driver.classname";

	private DaoUtil() {
		source = createDataSource();
	}

	public static DataSource getSource() {
		return inst.source;
	}

	private DataSource createDataSource(){

		//Commns DBCP��BasicDataSource�𐶐����āA�ݒ�t�@�C������Driver�N���X���AJDBC�̐ڑ�URL�ADB�̃��[�U���ADB�̃p�X���[�h��ݒ肷��

		BasicDataSource bds = new BasicDataSource();

		bds.setDriverClassName(SettingUtil.getProperty(JDBC_DRIVER));
		bds.setUsername(SettingUtil.getProperty(JDBC_USER));
		bds.setPassword(SettingUtil.getProperty(JDBC_PASS));
		bds.setUrl(SettingUtil.getProperty(JDBC_URL));

    		return bds;
	}

}