<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>total-out</title>
</head>
<body>
<%@page errorPage="total-error.jsp"%>
<%
request.setCharacterEncoding("UTF-8");
int price=Integer.parseInt(request.getParameter("price"));
int count=Integer.parseInt(request.getParameter("count"));
int delivery=Integer.parseInt(request.getParameter("delivery"));
Double tax=Double.parseDouble(request.getParameter("tax"));
%>
<p>価格:<%=price %>
個数:<%=count %>
送料:<%=delivery %>
消費税:<%=tax %>
</p>

<p>(価格*個数+送料)</p>
<p>(<%=price %> * <%=count %> + <%=delivery%> ) =
<%= (price*count+delivery) %>
<p>(価格*個数+送料)*消費税</p>
<p>(<%=price %> * <%=count %> + <%=delivery%> ) * <%=tax %> =
<%= (price*count+delivery)*tax %>
</p>
</body>
</html>