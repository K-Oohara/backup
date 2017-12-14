<%@page contentType="text/html; charset=utf-8" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<html:html lang="ja" >
 <BODY>
  <H1>1-6のサンプル メールアドレスの検証の例 </H1>
  
  <html:errors />
  
  登録するメールアドレスを入力してください。

  <html:form action="/CheckMail">
    メールアドレス<html:text property="mailAddress" /> <html:errors property="mailAddress" /><BR>
    メールアドレス（確認用）<html:text property="reMailAddress" /> <html:errors property="reMailAddress" />
    <html:submit value="登録" />
  </html:form>
 </BODY>
</html:html>