<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Sign UP</title>
</head>
<body>

<h2>Sign IN</h2>
<form:form method="POST" action="">
   <table>
    <tr>
        <td><form:label path="un">User Name</form:label></td>
        <td><form:input path="un" /></td>
    </tr>
    <tr>
        <td><form:label path="pwd">Password</form:label></td>
        <td><form:input path="pwd" /></td>
    </tr>
    
    <tr>
        <td colspan="2">
            <input type="submit" value="Submit"/>
        </td>
    </tr>
</table>  
</form:form>
</body>
</html>
