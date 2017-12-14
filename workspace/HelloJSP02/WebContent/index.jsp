<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TEST</title>
</head>
<body>
<!--
<p><% out.println(Math.random()); %></p>
<p><%=Math.random() %></p>
 -->
<p>お名前を入力してください。</p>
<form method="post" action="greeting-out.jsp">
  <div>
    <input type="text" name="user">
  </div>
  <div>
    <p>メール</p>
    <label for ="name"></label>
    <input type="email" name="mail">
  </div><input type="checkbox" value="!">
  <input type="submit" value="確定">
  <input type="reset" value="取り消し">
</form>
<form method="post" action="total-out.jsp">
  <input type="text" name="price">
  円 x
  <input type="text" name="count">
  個+送料
  <input type="text" name="delivery">
  円=
  <input type="submit" value="計算">
</form>
</body>
</html>