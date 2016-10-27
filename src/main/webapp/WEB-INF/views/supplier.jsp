<jsp:include page="menu.jsp" />
<jsp:include page="header.jsp" />

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="req" value="${pageContext.request.contextPath}" />


<div class="panel pannel-default">
	<div class="panel-header" align="center">Supplier Form</div>
	<div class="panel-body">

		<form:form action="${req}/supplier/suppsave" method="post" modelAttribute="supps" >
			<table border="1" width="600" align="center">
				 		
					<form:hidden path="sid" /> 
					<tr>
			 		<td>Supplier ID</td>
					<td><form:input path="suppid" /> </td>
				</tr>
				<tr>
					<td>Supplier  Name</td>
					<td><form:input path="suppname" cssClass="form-control" /></td>
				</tr>
				
				<tr align="center">
					<td align="center"><input type="submit" value="Save" class="btn btn-sm btn-primary" /></td>
					<td align="center"><input type="reset" value="Reset" class="btn btn-sm btn-primary"/></td>
				</tr>
			</table>
		</form:form>
	</div>
</div>
<table class="table table-striped">
	<tr>
		<th> Id</th>
		<th> Supplier Id</th>
		<th>Supplier Name</th>
		<th>&#160;</th>
	</tr>
	<c:forEach items="${supp}" var="supp">
		<tr>
			<td>${supp.sid}</td>
			<td>${supp.suppid}</td>
			<td>${supp.suppname}</td>
			    <td><a href="${req}/supplier/suppview/${supp.sid}"
				class="btn btn-sm btn-primary">Edit</a>&#160; <a
				href="${req}/supplier/suppdel/${supp.sid}"
				class="btn btn-sm btn-primary">Delete</a></td>
		</tr>
	</c:forEach>
</table>
<div class="panel panel-default" id="footer" style="background:#ffab62;	width:100%;	height:20px;position:absolute;bottom:0;	left:0;">
    <div class="panel-footer">@Copyright : Copyright © 2016 Shopping Inc. All rights reserved.</div>
</div>
