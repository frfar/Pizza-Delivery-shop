<%@page import="db.DbManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Checkout Page</title>
</head>
<BODY BGCOLOR="YELLOW">
<body>

<%-- START PAGE FORMATTING --%>
	<p style="text-align: left;">Checkout Page</p>
<%-- END PAGE FORMATTING --%>

<%-- START JAVA CODE --%>
	<%
		out.println("Subtotal: ");
		out.println("Tax: .0825%");
		//out.print(${message} );
		
		//out.println(request.getParameter("message"));
	%>
	<h1>${message}</h1>	
<%-- END JAVA CODE --%>

<%-- START FORM --%>
	<form name= "ord" action= "LoginController" method= "post" onsubmit= "return ordValidate()">
		<input type="submit" name="submit" value="Confirm"><br><br>
	</form>
<%-- END FORM --%>

<%-- START PAGE FORMATTING --%>
	<a href="welcome.jsp">Cancel/Go Home</a>
<%-- END PAGE FORMATTING --%>

</body>
</html>