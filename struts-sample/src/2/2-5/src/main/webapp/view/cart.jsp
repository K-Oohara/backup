<%@page contentType="text/html; charset=utf-8" %>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html lang="ja">
  <HEAD>
    <TITLE>ショッピングカートの内容</TITLE>
  </HEAD>
  
  <BODY>
  　購入予定のリストです。ご確認ください。

   <html:form action="/ChangeCount" >
   <TABLE border="1" >
    <TBODY>
     <TR>
      <TH>商品番号</TH>
      <TH>商品名</TH>
      <TH>価格</TH>
      <TH>数量</TH>
      <TH>小計</TH>
     </TR>
     <logic:iterate id="item" name="cart" property="items" type="model.CartItem">
      <TR>
       <TD><bean:write name="item" property="product.id" /></TD>
       <TD><bean:write name="item" property="product.name" /></TD>
       <TD><bean:write name="item" property="product.price" /></TD>
       
       <bean:define name="item" property="count" id="count" type="java.lang.Integer" toScope="request" />
       
       <!-- 購入数量を変更できるようにテキストボックスに表示している -->
       <!-- 別のBeanを用意していないのでindexed=trueにしていない -->
       <TD><html:text property="counts" value='<%= count.toString() %>' /></TD>
       <TD align="right" ><bean:write name="item" property="sumPrice" /></TD>
     </logic:iterate>
     </TR>
     <TR>
      <TD colspan="4">合計</TD>
      <TD><bean:write name="cart" property="sumPrice" /></TD>
     </TR>
    </TBODY>
   </TABLE>
    <html:submit value="数量変更" />
   </html:form>
  </BODY>
 </html:html>