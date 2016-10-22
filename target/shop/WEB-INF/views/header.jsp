<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<spring:url value="/resources/images" var="images" />
<spring:url value="/resources/css" var="css" />
<spring:url value="/resources/js" var="js" />

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<c:set var="req" value="${pageContext.request}" />

 
<head>
<link rel="stylesheet" type="text/css" href="${css}/bootstrap.css">
<link rel="stylesheet" type="text/css" href="${css}/bootstrap-theme.css">
<link rel="stylesheet" type="text/css" href="${css}/bootstrap-theme.min.css">
<link rel="stylesheet" type="text/css" href="${css}/dropdn.css">
<script src="${js}/angular.js"></script>
<script src="${js}/angular.min.js"></script>
<script src="${js}/bootstrap.js"></script>
<script src="${js}/jquery.js"></script>
<script src="${js}/jquery.min.js"></script>
<script src="${js}/npm.js"></script>


<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
</head>


