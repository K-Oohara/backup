<%@page contentType="text/html; charset=utf-8" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>

<html>
<head>

   <!-- 1) ページによって変更する文字列を設定　-->
   <title>
      <tiles:getAsString name="title"/>
   </title>
</head>
<body>

<!-- レイアウトを定義するファイル　-->
    <table cellspacing="2" cellpadding="3" border="0" width="100%">
      <tr>
        <td colspan="3">
         <!-- 2) 内容を部品用JSPで置き換える設定　-->
          <tiles:insert attribute="header"/>
        </td>
      </tr>
      <tr>
        <td width="20%" >
          <tiles:insert attribute="menu"/>
        </td>
        <td>
          <tiles:insert attribute="main"/>
        </td>
        <td width="30%">
          <tiles:insert attribute="info"/>
        </td>
      </tr>
      <tr>
        <td colspan="3">
          <tiles:insert attribute="footer"/>
        </td>
      </tr>
    </table>
</body>
</html>