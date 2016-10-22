<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Supplier Detail</title>
</head>
<body>

<h2>Supplier Detail</h2>
<form:form method="POST" action="">
   <table>
    <tr>
        <td><form:label path="sid">Supplier ID</form:label></td>
        <td><form:input path="sid" /></td>
    </tr>
    <tr>
        <td><form:label path="sname">Supplier Name</form:label></td>
        <td><form:input path="sname" /></td>
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
