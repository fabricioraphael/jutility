<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Validate Phone</title>
	<script type="text/javascript" src="../javascript/validatePhone.js"></script>
</head>
<body>
	<center>
		<h1>Java Utility</h1>
		<h2>Register Phone</h2>
		<c:import url="/jsp/menu.jsp"></c:import>
		<form name="frm" onsubmit="return validatePhone(this);" method="post" action="phone.do">

			Phone: <input name="phone" type="text" onkeyup="maskPhone(this);" maxlength="11" size="13" /><br />
			<input type="submit" value="Submit" /> <br />
			<%if(request.getAttribute("msg") != null){out.print(request.getAttribute("msg"));}%>
		</form>
		<c:import url="/jsp/tail.jsp"></c:import>
	</center>
</body>
</html>