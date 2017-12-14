<%@page contentType="text/html; charset=utf-8" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<html:html lang="ja" >
 <BODY>
  <!-- 1)HTMLのFORMタグに変換される -->
  <html:form action="/HelloWorld" >
    
    <!-- 2)メッセージリソースを表示する -->
    <bean:message key="greeting" /><BR>
    
    お名前をどうぞ。<BR><html:text property="name" /><BR>
    <html:submit>
      <bean:message key="greeting" />
    </html:submit>
  </html:form>
 </BODY>
</html:html>