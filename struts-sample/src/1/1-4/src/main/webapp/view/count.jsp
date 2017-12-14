<%@page contentType="text/html; charset=utf-8" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<html:html lang="ja" >
 <BODY>
  <H1>1-4のサンプル 複数対応の例 </H1>
  
  繰り返す回数を入力してください。<BR> （正の整数　入力値チェックは1-5以降を参照してください。）
  <html:form action="/PluralRequest" >
    繰り返し回数<html:text property="count" />
   <html:submit value="データ生成" />
  </html:form>
 </BODY>
</html:html>