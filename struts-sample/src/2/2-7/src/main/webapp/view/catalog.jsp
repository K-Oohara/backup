<%@page contentType="text/html; charset=utf-8" %>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="ja">
  <HEAD>
    <TITLE>カタログ</TITLE>
  </HEAD>
  
  <BODY>
   詳細を見たい商品の商品番号をクリックしてください。
   <TABLE>
    <TBODY>
     <TR>
      <TH>商品番号</TH>
      <TH>商品名</TH>
      <TH>価格</TH>
     </TR>
     <logic:iterate id="product" name="products" type="model.Product" offset="<%=(String)request.getAttribute(\"offset\") %>" length="10" >
      <TR>
       <TD><html:link action="/CatalogDetail" paramId="id" paramName="product" paramProperty="id" ><bean:write name="product" property="id" /></html:link></TD>
       <TD><bean:write name="product" property="name" /></TD>
       <TD><bean:write name="product" property="price" /></TD>
      </TR>
     </logic:iterate>
    </TBODY>
   </TABLE>
   <html:form action="/CatalogPage" >
     <logic:greaterThan name="offset" value="0">
      <html:submit property="action" >
       <bean:message key="back" />
      </html:submit>
     </logic:greaterThan>
     <logic:lessThan name="offset" value="<%=Integer.toString(((java.util.List)session.getAttribute(\"products\")).size() -10) %>" >
     <html:submit property="action" >
      <bean:message key="next" />
     </html:submit>
    </logic:lessThan>
    <html:hidden property="offset" value="<%=(String)request.getAttribute(\"offset\") %>" />
   </html:form>
  </BODY>
</html:html>
