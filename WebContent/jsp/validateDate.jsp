<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Validate Date</title>
	<script type="text/javascript" src="../javascript/validateDate.js"></script>
</head>

<body>
	<center>
		<h1>Java Utility</h1>
		<h2>Validate Date</h2>
		<c:import url="/jsp/menu.jsp"></c:import>
		
		<form name="frm" onsubmit="return validateDate();" method="post" action="date.do">

			Date: <input name="date" type="text" onkeyup="maskDate(this);" maxlength="10"  size="11"/><br />
			<input type="submit" value="Submit" /> <br />		
			<%if(request.getAttribute("msg") != null){out.print(request.getAttribute("msg"));}%>
		</form>

		<c:import url="/jsp/tail.jsp"></c:import>
	</center>
</body>
</html>