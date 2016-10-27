<jsp:include page="menu.jsp" />
<jsp:include page="header.jsp" />

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="req" value="${pageContext.request.contextPath}" />


<html>
<head>
    <title><centre> Sign UP</centre></title>
</head>
<body>

<br/>
<br/><br/><br/><br/>

<h2 align="center">User Form</h2>
<form:form  action="${req}/saveuserdet" modelAttribute="usr"  method="GET">
   <table align="center">
    <tr>
        <form:hidden path="usrid" />
     </tr>
    <tr>    
        <td><form:label path="usrname" cssClass="form-control" >User Name</form:label></td>
        <td><form:input path="usrname" cssClass="form-control"/></td>
    </tr>
    
    <tr>    
        <td><form:label path="usremailid" cssClass="form-control">Email ID</form:label></td>
        <td><form:input path="usremailid" cssClass="form-control" /></td>
    </tr>
    <tr>    
        <td><form:label path="usrpasswd" cssClass="form-control">Password</form:label></td>
        <td><form:input path="usrpasswd" cssClass="form-control"/></td>
    </tr>
    
    <tr>
        <td><form:label path="usrcontact" cssClass="form-control">Contact  Number:</form:label></td>
        <td><form:input path="usrcontact" cssClass="form-control"/></td>
    </tr>
    <tr>
        <td><form:label path="usrrole" cssClass="form-control">Role:</form:label></td>
        <td><form:input path="usrrole" cssClass="form-control"/></td>
    </tr>
    
    <tr>
        <td colspan="2" align="center">
            <input type="submit" value="SignUp" class="btn btn-sm btn-primary"/>
            <input type="submit" value="SignIn" class="btn btn-sm btn-primary"/>
        </td>
    </tr>
</table>  
</form:form>
</body>
<div class="panel panel-default" id="footer" style="background:#ffab62;	width:100%;	height:20px;position:absolute;bottom:0;	left:0;">
    <div class="panel-footer">@Copyright : Copyright © 2016 Shopping Inc. All rights reserved.</div>
</div>
</html>
