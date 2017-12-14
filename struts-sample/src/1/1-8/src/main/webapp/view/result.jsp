<%@page contentType="text/html; charset=utf-8" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>

<!-- 入力されたフォーム情報をそのまま表示 -->
 ユーザID:<bean:write name="UserEntryForm" property="userid" /><BR>
 パスワード:<bean:write name="UserEntryForm" property="password" /><BR>
 氏名:<bean:write name="UserEntryForm" property="name" /><BR>
 年齢:<bean:write name="UserEntryForm" property="age" />歳<BR>