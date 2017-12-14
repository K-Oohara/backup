<%@page contentType="text/html; charset=utf-8" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>

<html:html lang="ja" >
 <BODY>
  <H1>2-2のサンプル<BR> データベース更新の例 </H1>
  <bean:write name="MemberEntryForm" property="name" />さん<BR>
  ご登録ありがとうございました。
 </BODY>
</html:html>