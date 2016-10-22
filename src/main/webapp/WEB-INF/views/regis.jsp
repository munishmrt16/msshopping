<jsp:include page="menu.jsp" />
<jsp:include page="header.jsp"/>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="req" value="${pageContext.request.contextPath}" />

<div class="panel pannel-default">
	<div class="panel-header" align="center">User Form</div>
	<div class="panel-body">

		<form:form action="${req}/visitor/save" method="post" modelAttribute="vis">
			<table border="1" width="600" align="center">
				<tr>
					<td></td>
					<td><form:hidden path="visid" /></td>
				</tr>
				<tr>
					<td>Visitor Name</td>
					<td><form:input path="visname" cssClass="form-control" /></td>
				</tr>
				<tr>
					<td>Contact Number</td>
					<td><form:input path="viscontact" cssClass="form-control" /></td>
					
				</tr>
				<tr>
					<td>Email Id</td>
					<td><form:input path="visemailid" cssClass="form-control" /></td>
				</tr>
				<tr>
					<td>Comments/Remarks</td>
					<td><form:input path="viscomm" cssClass="form-control" /></td>
				</tr>
				
				<tr align="center">
					<td align="center"><input type="submit" value="Save" /></td>
					<td align="center"><input type="reset" value="Reset" /></td>
				</tr>
			</table>
		</form:form>
	</div>
	</div>
