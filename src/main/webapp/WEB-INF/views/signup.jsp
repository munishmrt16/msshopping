<jsp:include page="menu.jsp" />
<jsp:include page="header.jsp" />

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="req" value="${pageContext.request.contextPath}" />


<html>
<head>
<title>Sign IN</title>
</head>
<body>

	<
	<h2 align="center">Sign IN</h2>
	<form:form action="${req}/userdatasave" modelAttribute="user" method="GET">
		<table align="center">
			<tr>
				<form:hidden path="uid" />
				<form:hidden path="enabled" value="true" />
				<form:hidden path="role" value="ROLE_USER" />
			</tr>
			<tr>
				<td><form:label path="name">User Name</form:label></td>
				<td><form:input path="name" /></td>
			</tr>

			<tr>
				<td><form:label path="email">Email ID</form:label></td>
				<td><form:input path="email" /></td>
			</tr>
			
			<tr>
				<td><form:label path="password">Password:</form:label></td>
				<td><form:password path="password" /></td>
			</tr>
			
			<tr>
				<td colspan="2"><input type="submit" value="Submit"
					class="btn btn-sm btn-primary" /></td>
			</tr>
		</table>
	</form:form>
</body>
<div class="panel panel-default" id="footer"
	style="background: #ffab62; width: 100%; height: 20px; position: absolute; bottom: 0; left: 0;">
	<div class="panel-footer">@Copyright : Copyright © 2016 Shopping
		Inc. All rights reserved.</div>
</div>
</html>
