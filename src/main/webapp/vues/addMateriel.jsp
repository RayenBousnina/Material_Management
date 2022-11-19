<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Affectation</title>
</head>
<body>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<h1>
<form:form method="post" action="/TP-SPRING-DATA/addMateriel/${mat.dep.id}" modelAttribute="mat">    
       <br><br>  
             
          Titre:    
          <form:input path="titre" />
         <br><br>  
        Type: <form:select path="type">  
        <form:option value="Réseau" label="Réseau"/>  
        <form:option value="Info" label="Info"/>  
        <form:option value="Cisco" label="Cisco"/>  
        <form:option value="Huawei" label="Huawei"/>  
        </form:select>  
        <br><br>  
             
         Serie:    
          <form:input path="numSerie" />
          
          <br><br>  
           Quantity:    
          <form:input path="qte" />
          
          <br><br>  
        Type: <form:select path="etat">  
        <form:option value="Fonctionnel" label="Fonctionnel"/>  
        <form:option value="NonFonctionnel" label="NonFonctionnel"/>  

        </form:select>  
        <br><br>  
             &nbsp &nbsp &nbsp &nbsp
         
          <input type="submit" value="Add Matiere" />   
       </form:form>


</h1>
</body>
</html>