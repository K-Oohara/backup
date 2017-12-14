<%@page contentType="text/html; charset=utf-8" %>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="ja">
  <HEAD>
    <TITLE>カタログ詳細</TITLE>
  </HEAD>
  
  <BODY>
   <TABLE border="2" >
     <TR>
      <TH>商品番号</TH>
      <TH>商品名</TH>
      <TH>価格</TH>
     </TR>
     <TR>
      <TD><bean:write name="product" property="id" /></TD>
      <TD><bean:write name="product" property="name" /></TD>
      <TD><bean:write name="product" property="price" /></TD>
     </TR>
     <TR>
      <!-- 1) bean:define タグと html:image タグの組み合わせ -->
      <bean:define id="url" >
       <bean:write name="product" property="pictureUrl" />
      </bean:define>
       
      <TD colspan="3" ><html:img page="<%= url %>" /></TD>
      </TR>
   </TABLE>
   <html:form action="/AddCart">
    <bean:define id="pId" >
     <bean:write name="product" property="id" />
    </bean:define>
    <html:hidden property="id" value="<%= pId %>" />
    <html:image pageKey="addcart.image" />この商品をカートに入れる。
   </html:form>
  </BODY>
</html:html>