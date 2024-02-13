<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ page import="com.mvc.java.FoodDAOImpl"%>
<%@ page import="java.util.List"%>
<%@ page import="com.mvc.java.Food"%>

<jsp:useBean id="foodServlet" class="com.mvc.java.FoodcartServlet" />
<jsp:useBean id="foodList" class="java.util.ArrayList" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Menu</title>
</head>
<body>
<center>
	<h1>Welcome to Menu</h1>
	</center>
	<%
		FoodDAOImpl dao = new FoodDAOImpl();
		List<Food> foodlist = dao.getFoodList();
	%>
	<table border="3" align="center">
		<tr>
		<th>ID</th>
		<th>Items</th>
		<th>Price</th>	
	    </tr>
	    <%
		int id;
		for(Food food : foodlist) {
			id = food.getId();
		%>
		<tr>
			<td><%=food.getId() %> </td>
			<td><%=food.getItem() %>  </td>
			<td><%=food.getPrice() %> </td>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>
