<jsp:include page="menu.jsp" />
<jsp:include page="header.jsp"/>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="req" value="${pageContext.request.contextPath}" />
<div class="panel pannel-default">
	<div class="panel-header" align="center">Cart Detail Form</div>
	<div class="panel-body">

		<form:form action="${req}/cart/cartsave" method="post" modelAttribute="cart">
			<table border="1" width="600" align="center">
				<tr>
					<td></td>
					<td><form:hidden path="cartid" /></td>
				</tr>
				<tr>
					<td>Email ID </td>
					<td><form:input path="emailid" cssClass="form-control" /></td>
				</tr>
				<tr>
					<td>Category </td>
					<td><form:input path="pcat" cssClass="form-control" /></td>
				</tr>
				
				<tr>
					<td>Product</td>
					<td><form:input path="pname" cssClass="form-control" /></td>
				</tr>
				<tr>
					<td>Price</td>
					<td><form:input path="price" cssClass="form-control" /></td>
				</tr>
				<tr>
					<td>Quantity</td>
					<td><form:input path="qty" cssClass="form-control" /></td>
				</tr>
				
				<tr align="center">
					<td align="center"><input type="submit" value="Save" />
					<td align="center"><a href="/shop/displayall"  class="btn btn-info" role="button">Back</a></td>
					<td align="center"><input type="reset" value="Reset" />
					<a href="${req}/visitor/regisview" class="btn btn-info" role="button">Proceed for Payment</a></td>
				</tr>
			</table>
		</form:form>
	</div>
</div>

<table class="table table-striped">
	<tr>
		<th>Cart Id</th>
		<th>Email Id</th>
		<th>Category</th>
		<th>Product</th>
		<th>Quantity</th>
		<th>Price</th>
	</tr>
	
	<c:forEach items="${carts}" var="carts">
		<tr>
			<td>${carts.cartid}</td>
			<td>${carts.emailid}</td>
			<td>${carts.pcat}</td>
			<td>${carts.pname}</td>
			<td>${carts.price}</td>
			<td>${carts.qty}</td>
			    <td><a href="${req}/cart/cartview/${carts.cartid}"
				class="btn btn-sm btn-primary">View</a>&#160; <a
				href="${req}/cart/cartdel/${carts.cartid}"
				class="btn btn-sm btn-primary">Delete</a></td>
				<td>
				<a href="${req}/displayall" class="btn btn-info" role="button">Back</a>
				</td>
		</tr>
	</c:forEach>
</table>
<<div class="panel panel-default" id="footer" style="background:#ffab62;	width:100%;	height:20px;position:absolute;bottom:0;	left:0;">
    <div class="panel-footer">@Copyright : Copyright © 2016 Shopping Inc. All rights reserved.</div>
</div>
