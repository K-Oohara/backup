<%@page contentType="text/html; charset=utf-8" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<html:html lang="ja" >
 <BODY>
  <H1>1-5のサンプル 検証の例 </H1>
  
  <!-- 1) html:errorsタグの利用　-->
  <html:errors />
  
  あなたの年齢を入力してください。（0以上200以下の整数でお願いいたします。）
  <html:form action="/CheckAge" >
    年齢<html:text property="age" />
    <!-- 1) html:errorsタグの利用　-->
    <html:errors property="age" />
    <html:submit value="報告" />
  </html:form>
 </BODY>
</html:html>