<%@page contentType="text/html; charset=utf-8" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html lang="ja" >
 <BODY>
  <H1>1-4のサンプル 複数対応の例 </H1>
  
  <html:form action="/Plural" >
   <logic:iterate id="data" name="PluralForm" property="allData" type="model.DataModel" >
        <!-- 1）indexed属性の利用 -->
        <html:text name="data" property="name" indexed="true" />
        <html:text name="data" property="value" indexed="true" /><BR>
   </logic:iterate>
   <html:submit value="変更" />
  </html:form>
 </BODY>
</html:html>