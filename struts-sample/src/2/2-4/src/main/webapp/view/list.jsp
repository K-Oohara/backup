<%@page contentType="text/html; charset=utf-8" %>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<HTML>
 <HEAD>
  <TITLE>Web日記</TITLE>
 </HEAD>
 <BODY>
  <H1>2-4のサンプル Web日記</H1><BR>
  
  <logic:iterate id="content" name="diary" scope="request">
  <TABLE>
   <TR><bean:write name="content" property="date" /></TR>
   <TR>
    <TD><bean:write name="content" property="content" /><TD>

    <!-- 1)画像ファイルがない場合はimgタグを作成しない -->
     <logic:notEqual name="content" property="imgFileUrl" value="" >

    <!-- 2)初期化のしかた -->
      <TD><img src="<%= ((model.Diary)pageContext.findAttribute("content")).getImgFileUrl() %>" /><TD>
     </logic:notEqual>
   </TR>
  </TABLE>
  </logic:iterate>
</HTML>