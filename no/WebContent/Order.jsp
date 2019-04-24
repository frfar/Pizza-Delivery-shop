<%@page import="db.DbManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Order Page</title>
</head>
<BODY BGCOLOR="YELLOW">
<body>

<%-- START PAGE FORMATTING --%>
	<p style="text-align: left;">Order Page</p>
	<p style="text-align: left;">Please Select Items to Order</p>
	<p style="text-align: left;">Select Item/Quantity</p>
<%-- END PAGE FORMATTING --%>

<%-- START JAVA CODE --%>
	<%

	%>
<%-- END JAVA CODE --%>

<%-- START FORM --%>
	<form name= "order" action= "orderController" method= "post" onsubmit= "return ordValidate()">
		Pepperoni ($10.00):
    	<input type= "number" id= "ordah1" name= "ordah1" value= "0" min="0" max="100" required><br>
    	Margherita ($9.00): 
    	<input  type= "number" id= "ordah2" name= "ordah2" value= "0" min="0" max="100" required><br>
   		Veggie ($9.00):
    	<input  type= "number" id= "ordah3"  name= "ordah3" value= "0" min="0" max="100" required><br>
    
		<input type="submit" name="submit" value="ProceedToCheckout"><br><br>
	</form>
<%-- END FORM --%>

<%-- START PAGE FORMATTING --%>
	<a href="welcome.jsp">Cancel/Go Home</a>
<%-- END PAGE FORMATTING --%>

</body>
</html>