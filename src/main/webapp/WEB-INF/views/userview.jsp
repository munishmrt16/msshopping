<jsp:include page="menu.jsp" />
<jsp:include page="header.jsp"/>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="req" value="${pageContext.request.contextPath}" />

<div class="panel pannel-default">
	<div class="panel-header" align="center">User Form</div>
	<div class="panel-body">

		<form:form action="${req}/user/save" method="post" modelAttribute="user">
			<table border="1" width="600" align="center">
				<tr>
					<td></td>
					<td><form:hidden path="userid" /></td>
				</tr>
				<tr>
					<td>User Name</td>
					<td><form:input path="username" cssClass="form-control" /></td>
				</tr>
				<tr>
					<td>E Mail ID</td>
					<td><form:input path="emailid" cssClass="form-control" /></td>
					
				</tr>
				<tr>
					<td>Password</td>
					<td><form:input path="passwd" cssClass="form-control" /></td>
				</tr>
				<tr align="center">
					<td align="center"><input type="submit" value="Save" class="btn btn-sm btn-primary"/></td>
					<td align="center"><input type="reset" value="Reset" class="btn btn-sm btn-primary"/></td>
				</tr>
			</table>
		</form:form>
	</div>
</div>
<div class="panel panel-default" id="footer" style="background:#ffab62;	width:100%;	height:20px;position:absolute;bottom:0;	left:0;">
    <div class="panel-footer">@Copyright : Copyright © 2016 Shopping Inc. All rights reserved.</div>
</div>