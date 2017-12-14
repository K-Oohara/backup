<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>top-page</title>
</head>
<body>
<p>計算練習</p>
<form method="post" action="total-out.jsp">
価格：
<input type="text" name="price">
<br>
個数：
<input type="text" name="count">
<br>
送料：
<input type="text" name="delivery">
<br>
税金：
<input type="text" name="tax">
<br>
<input type="submit" value="計算">

</form>
</body>
</html>