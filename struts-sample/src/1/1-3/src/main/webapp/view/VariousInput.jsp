<%@page contentType="text/html; charset=utf-8" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<html:html lang="ja" >
 <BODY>
  <H1>1-3のサンプル</H1>
  <html:form action="/VariousInput" >
    入力部品名（）の中は属性名<HR>
    <TABLE border="1" >
     <TBODY>
      <TR>
       <TH>チェックボックス　デフォルトオフ（check1） </TH>
       <TD><html:checkbox property="check1" />チェック1</TD>
     </TR>
     <TR>
      <TH>チェックボックス　デフォルトオン（check2）HTMLで記述している</TH>
      <TD><INPUT type="checkbox" name="check2" checked >チェック2</TD>
     </TR>
     <TR>
      <TH rowspan="2" >マルチボックス(multi1)　同じmulti1で複数の選択をサポート</TH>
      <TD><html:multibox property="multi1" value="Check1" />チェック1</TD>
     </TR>
     <TR>
      <TD><html:multibox property="multi1" value="Check2"/>チェック2</TD>
     </TR>
     <TR>
      <TH>ラジオボタン(radio1)</TH>
      <TD><html:radio property="radio1" value="check1" >ラジオ1</html:radio></TD>
     </TR>
     <TR>
      <TH>セレクト(select1)　複数選択可能 </TH>
      <TD><html:select property="select1" multiple="true" size="3" >
           <html:option value="S1" >リスト1</html:option>
           <html:option value="S2" >リスト2</html:option>
           <html:option value="S3" >リスト3</html:option>
          </html:select>
      </TD>
     </TR>
     <TR>
      <TD>
       <html:submit value="送信" />
      </TD>
     </TR>
　  </TBODY>
   </TABLE>
  </html:form>
 </BODY>
</html:html>