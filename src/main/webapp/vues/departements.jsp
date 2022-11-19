<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<c:set var="cxt" value = "${dispatcher-servlet.request.contextPath}"></c:set>
</head>
<body>
<h1>Liste des Departements</h1>
<table border="1">
  <tr>
  <th>ID</th>
  <th>Titre</th>
  <th></th>
  </tr>
  
  <c:forEach items="${deps}" var="dep" >
                <tr>
                    <td>${dep.id}</td>
                    <td>${dep.titre}</td>
                    <td><a href="matrls/${dep.id}" >liste produits</a> </td>
                </tr>
  </c:forEach>
</table>
</body>
</html>