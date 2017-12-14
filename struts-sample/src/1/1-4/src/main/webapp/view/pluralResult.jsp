<%@page contentType="text/html; charset=utf-8" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<HTML>
 <BODY>
  <H1>1-4のサンプル  複数対応の例 </H1>
  <H3>変更内容の表示</H3>
  データ番号の色が赤いデータが変更されています。
  <TABLE border="1">
   <TR>
    <TH>
     データ番号
    </TH>
    <TH>
     Name
    </TH>
    <TH>
     Value
    </TH>
   </TR>

   <logic:iterate id="viewhelper" scope="request" name="Result" type="action.viewhelper.PluralResultHelper" indexId="index">
   <TR>
    <TH>
     <!-- 1)logic:equalタグ、logic:notEqualタグの利用の仕方 -->
     <logic:equal name="viewhelper" property="change" value="true" >
      <FONT color="#ff0000">
       <bean:write name="index" />
      </FONT>
     </logic:equal>
     <logic:notEqual name="viewhelper" property="change" value="true" >
      <bean:write name="index" />
     </logic:notEqual>
    </TH>

    <!-- 2) 入れ子データを取得する時の bean:write タグ -->
    <bean:define id="model" name="viewhelper" property="data" />

    <TD>
     <bean:write name="model" property="name" />
    </TD>
    <TD>
   
    <!-- 2) 入れ子データを取得する時の bean:write タグ -->
     <bean:write name="viewhelper" property="data.value" />
    </TD>
   </TR>
   </logic:iterate>

 </TABLE>
 </BODY>
</HTML>