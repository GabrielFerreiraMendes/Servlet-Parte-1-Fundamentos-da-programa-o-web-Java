<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, br.com.alura.gerenciador.servlet.Empresa" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de empresas</title>
</head>
<body>		
	Lista de empresas: <br />	
	<ul>
		<c:forEach items="${ empresas }" var= "empresa">			
			<li> ${empresa.nome} - <fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/></li>	
			<a href="/gerenciador/mostraEmpresa?id=${empresa.id}">edita</a>
			<a href="/gerenciador/removeEmpresa?id=${empresa.id}">remove</a>
		</c:forEach>
	</ul>		
</body>
</html>