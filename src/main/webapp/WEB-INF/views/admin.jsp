<jsp:include page="menu.jsp" />
<jsp:include page="header.jsp"/>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="req" value="${pageContext.request.contextPath}" />

<div class="panel pannel-default">
	<div class="panel-header" align="center">Product Form</div>
	<div class="panel-body">

		<form:form action="${req}/admin/save" method="post"
			modelAttribute="product">
			<table border="1" width="600" align="center">
				<tr>
					<td></td>
					<td><form:hidden path="pid" /></td>
				</tr>
				<tr>
					<td>Product Category</td>
					<td><form:input path="pcat" cssClass="form-control" /></td>
				</tr>
				<tr>
					<td>Product Name</td>
					<td><form:input path="pname" cssClass="form-control" /><span name="pname.errors" style="color: red">Field is required.</span></td>
					
				</tr>
				<tr>
					<td>Product Price</td>
					<td><form:input path="pprice" cssClass="form-control" /><span name="pprice.errors" style="color: red">Field is required.</span></td>
				</tr>
				<tr>
					<td colspan=2 align="center">
					<form:input path="purl" cssClass="form-control"/><img src="${req}/resources/images/${product.purl}.jpg" /> </td>
				</tr>
				<tr align="center">
					<td align="center"><input type="submit" value="Save" /></td>
					<td align="center"><input type="reset" value="Reset" /></td>
				</tr>
			</table>
		</form:form>
	</div>
</div>

<table class="table table-striped">
	<tr>
		<th>Product Id</th>
		<th>Product Name</th>
		<th>Product Price</th>
		<th>&#160;</th>
	</tr>

	<c:forEach items="${products}" var="product">
		<tr>
			<td>${product.pid}</td>
			<td>${product.pname}</td>
			<td>${product.pprice}</td>
			<td><a href="${req}/admin/view/${product.pid}" class="btn btn-sm btn-primary">View</a>&#160;
			 <a	href="${req}/admin/delete/${product.pid}" class="btn btn-sm btn-primary">Delete</a></td>
		</tr>
	</c:forEach>
</table>

