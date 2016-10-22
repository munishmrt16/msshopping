<jsp:include page="menu.jsp" />
<jsp:include page="header.jsp"/>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="req" value="${pageContext.request.contextPath}" />

<div class="panel pannel-default">
	<div class="panel-header" align="center">Cart Detail Form</div>
	<div class="panel-body">

		<form:form action="${req}/user/save" method="post" modelAttribute="ci">
			<table border="1" width="600" align="center">
				<tr>
					<td></td>
					<td><form:hidden path="id" /></td>
				</tr>
				<tr>
					<td>Cart Id</td>
					<td><form:input path="cartid" cssClass="form-control" /></td>
				</tr>
				<tr>
					<td>Item</td>
					<td><form:input path="cartitemid" cssClass="form-control" /></td>
					
				</tr>
				
				<tr align="center">
					<td align="center"><input type="submit" value="Save" /></td>
					<td align="center"><input type="reset" value="Reset" /></td>
				</tr>
			</table>
		</form:form>
	</div>
</div>

