<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<c:url value="/alteraEmpresa" var="linkServletMostraEmpresa"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<form action="${ linkServletMostraEmpresa }" method = "post">
	
    	Nome: <input type="text" name="nome" value="${empresa.nome}" />
		Data de aberura : <input type="text" name="data" value="<fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/>"/>
		<input type="hidden" name="id" value="${empresa.id}">
		<input type="submit">
	</form>
</body>
</html>