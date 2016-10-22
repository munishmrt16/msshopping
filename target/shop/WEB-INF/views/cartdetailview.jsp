<jsp:include page="menu.jsp" />
<jsp:include page="header.jsp"/>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="req" value="${pageContext.request.contextPath}" />

<div class="panel pannel-default">
	<div class="panel-header" align="center">Cart Detail Form</div>
	<div class="panel-body">

		<form:form action="${req}/user/save" method="post" modelAttribute="cd">
			<table border="1" width="600" align="center">
				<tr>
					<td></td>
					<td><form:hidden path="cartid" /></td>
				</tr>
				<tr>
					<td>User Name</td>
					<td><form:input path="usrid" cssClass="form-control" /></td>
				</tr>
				<tr>
					<td>No of Products</td>
					<td><form:input path="noofprod" cssClass="form-control" /></td>
					
				</tr>
				<tr>
					<td><form:hidden path="grandtot" /></td>
				</tr>
				<tr align="center">
					<td align="center"><input type="submit" value="Save" /></td>
					<td align="center"><input type="reset" value="Reset" /></td>
				</tr>
			</table>
		</form:form>
	</div>
</div>

