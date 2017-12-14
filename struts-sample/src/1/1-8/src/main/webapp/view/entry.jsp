<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@page contentType="text/html; charset=utf-8" %>
<html:form action="/view/Entry" >
 ユーザID<html:text property="userid" /><BR>
 パスワード<html:password property="password" /><BR>
 氏名<html:text property="name" /><BR>
 年齢<html:text property="age" /><BR>
 <html:submit value="登録" />
</html:form>
<BR>
<BR>