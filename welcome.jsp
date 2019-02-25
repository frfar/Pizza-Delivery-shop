<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome Page</title>
</head>
<BODY BGCOLOR="YELLOW">
<body>
<h1> ${message} ! </h1>
Please order from the following menu:<br>
1) Cheese Pizza<br>
2) Pepperoni Pizza<br>
3) VeggiePizza<br>
4) Italian Pizza<br>
5) Supereme Pizza<br>
6) Make Your Own<br>

<form name="chooseOption" action="Menu" method="post">

Enter the number of your option: <input type="text" name="choice" id="choice"><br>
<input type="submit" name="submit" value="choose"><br>
${message}<br>
	
	
</form>	
	<a href="logout.jsp">logout</a>

</body>
</html>
