<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<c:set var="cxt" value = "${dispatcher-servlet.request.contextPath}"></c:set>
<body>
<h1>Liste des Materielles</h1>
<h2>Département choisi: Departement ${depart}</h2>
<p><a href="/TP-SPRING-DATA/addMateriel/${id_dep}">Ajouter un matériel</a></p>
<table border="1">
  <tr>
  <th>ID</th>
  <th>Titre</th>
  <th>Type</th>
  <th>Série</th>
  <th>Quantité</th>
  <th>Etat</th>
  <th></th>
  </tr>
  
  <c:forEach items="${matrls}" var="mat" >
                <tr>
                    <td>${mat.id}</td>
                    <td>${mat.titre}</td>
                    <td>${mat.type}</td>
                    <td>${mat.numSerie}</td>
                    <td>${mat.qte}</td>
                    <td>${mat.etat}</td> 
                    <td><a href="/TP-SPRING-DATA/deleteMat/${mat.id}">supprimer</a></td>
                </tr>
  </c:forEach>
</table>
<p><a href="/TP-SPRING-DATA/deps">liste des departements</a></p>
</body>
</html>