<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		
		<a href="<c:url value="/jsp/index.jsp"/>">Index</a> -
			 <a href="<c:url value="/jsp/validateDate.jsp"/>">Validate Date</a> -
			 <a href="<c:url value="/jsp/validateEmail.jsp"/>">Validate E-mail</a> - 
			 <a href="<c:url value="/jsp/validatePhone.jsp"/>">Validate Phone</a> - 
			 <a href="<c:url value="/jsp/validateCPF.jsp"/>">Validate CPF</a> -
			 <a href="<c:url value="/jsp/validateCNPJ.jsp"/>">Validate CNPJ</a> -
			 <a href="#">Documents</a>
		
		<br />
		<br />
		<br />
		<br />
</body>
</html>