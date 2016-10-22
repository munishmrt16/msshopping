<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Category Detail</title>
</head>
<body>

<h2>Category Detail</h2>
<form:form method="POST" action="/HelloWeb/addStudent">
   <table>
    <tr>
        <td><form:label path="cid">Category ID</form:label></td>
        <td><form:input path="cid" /></td>
    </tr>
    <tr>
        <td><form:label path="cname">Product Category</form:label></td>
        <td><form:input path="cname" /></td>
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
