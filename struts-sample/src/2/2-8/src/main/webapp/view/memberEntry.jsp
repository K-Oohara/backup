<%@page contentType="text/html; charset=utf-8" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>


<html:html lang="ja" >
 <BODY>
  <H1><bean:message key="title" /></H1>
  <TABLE>
  <TR>
  <TD><html:link action="/changeLocale.do?language=en&country=US&page=/view/memberEntry.jsp">English</html:link></TD>
  <TD><html:link action="/changeLocale.do?language=ja&country=JP&page=/view/memberEntry.jsp">日本語</html:link></TD>
  </TR>
  </TABLE> 
  <html:errors />
   <html:form action="/MemberEntry">
   <TABLE>
    <TR>
     <TD><bean:message key="name" /></TD>
     <TD><html:text property="name" /></TD>
    </TR>
    <TR>
     <TD><bean:message key="mail" /></TD>
     <TD><html:text property="mail" /></TD>
    </TR>
    <TR>
     <TD><bean:message key="password" /></TD>
     <TD><html:password property="password" redisplay="false" /></TD>
    </TR>
    <TR>
     <TD><bean:message key="address" /></TD>
     <TD><html:text property="address" /></TD>
    </TR>
    <TR>
     <TD><bean:message key="tel" /></TD>
     <TD><html:text property="tel" /></TD>
    </TR>
    <TR>
     <TD><bean:message key="birth" /></TD>
     <TD><html:text property="birth" /></TD>
    </TR>
    <TR>
     <TD>
      <html:submit>
         <bean:message key="submit" />
      </html:submit>
     </TD>
    </TR>
   </TABLE>
  </html:form>
 </BODY>
</html:html>