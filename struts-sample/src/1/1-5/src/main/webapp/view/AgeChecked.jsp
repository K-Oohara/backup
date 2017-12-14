<%@page contentType="text/html; charset=utf-8" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>

<html:html lang="ja" >

 <!-- 1)複数のFormやアクションからなるのでリクエストパラメータから取り出す -->
 <bean:parameter id="result" name="age" />

 <BODY>
  <H1>1-5のサンプル 検証の例 </H1>
  あなたの年齢は、<bean:write name="result" />です。
 </BODY>
</html:html>