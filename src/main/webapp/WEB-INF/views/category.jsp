<jsp:include page="menu.jsp" />
<jsp:include page="header.jsp" />

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="req" value="${pageContext.request.contextPath}" />


<div class="panel pannel-default">
	<div class="panel-header" align="center">Category Form</div>
	<div class="panel-body">

		<form:form action="${req}/category/catesave" method="post" modelAttribute="cats" >
			<table border="1" width="600" align="center">
				 		
					<form:hidden path="cid" /> 
					<tr>
			 		<td>Category ID</td>
					<td><form:input path="cateid" /> </td>
				</tr>
				<tr>
					<td>Category Name</td>
					<td><form:input path="catename" cssClass="form-control" /></td>
				</tr>
				
				<tr align="center">
					<td align="center"><input type="submit" value="Save" class="btn btn-sm btn-primary"/></td>
					<td align="center"><input type="reset" value="Reset" class="btn btn-sm btn-primary"/></td>
				</tr>
			</table>
		</form:form>
	</div>
</div>
<table class="table table-striped">
	<tr>
		<th> Id</th>
		<th> Category Id</th>
		<th>Category Name</th>
		<th>&#160;</th>
	</tr>
	<c:forEach items="${cat}" var="cat">
		<tr>
			<td>${cat.cid}</td>
			<td>${cat.cateid}</td>
			<td>${cat.catename}</td>
			    <td><a href="${req}/category/cateview/${cat.cid}"
				class="btn btn-sm btn-primary">Edit</a>&#160; <a
				href="${req}/category/deletecate/${cat.cid}"
				class="btn btn-sm btn-primary">Delete</a></td>
		</tr>
	</c:forEach>
</table>
<div class="panel panel-default" id="footer" style="background:#ffab62;	width:100%;	height:20px;position:absolute;bottom:0;	left:0;">
    <div class="panel-footer">@Copyright : Copyright © 2016 Shopping Inc. All rights reserved.</div>
</div>