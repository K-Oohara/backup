<%@page contentType="text/html; charset=utf-8" %>
<HTML>
    <BODY>
        <H4>getRemoteUser()で取り出す</H4><BR>
        あなた(<%= request.getRemoteUser() %>)はメンバーです。<BR>
        <H4>getPrincipal()で取り出す</H4><BR>
        あなた(<%= request.getUserPrincipal().getName() %>)はメンバーです。<BR>
        <H4>isUserInRole()で取り出す</H4><BR>
        あなたのロールとしてuserは<%= request.isUserInRole("user") %>（trueなら持っている）<BR>
        あなたのロールとしてvipは<%= request.isUserInRole("vip") %>（trueなら持っている）<BR>
    </BODY>
</HTML>