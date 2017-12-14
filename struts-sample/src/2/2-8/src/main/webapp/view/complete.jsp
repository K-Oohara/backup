<%@page contentType="text/html; charset=utf-8" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>

<html:html lang="ja" >
 <BODY>
  <H1><bean:message key="title" /></H1>
  <bean:write name="MemberEntryForm" property="name" />
  <bean:message key="thank" />
 </BODY>
</html:html>