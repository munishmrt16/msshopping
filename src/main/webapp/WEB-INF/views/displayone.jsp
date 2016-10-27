<jsp:include page="menu.jsp" />
<jsp:include page="header.jsp" />



<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<spring:url value="/resources/images/product" var="productImages" />
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="req" value="${pageContext.request.contextPath}" />

<c:set var="f" value="file:///C:/ms_web_app/shop/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/shop/resources/images/product" />


<c:set var="fp" value="shop/resources/images/product/" /> 
<link rel="stylesheet" type="text/css" href="${css}/style.css">

<script src="${req}/resources/js/angular.js"></script>
 

<link rel="stylesheet" type="text/css" href="${css}/style.css">


<body>
<div class="panel pannel-default">
	<div class="panel-header" align="center">Product Form</div>
	<div class="panel-body">
 
		<form:form action="" method="post" modelAttribute="product" enctype="multipart/form-data">
			<table border="1" width="600" align="center">
				<tr>
					<td></td>
					<td><form:hidden path="pid" /></td>
				</tr>
				<tr>
					<td>Product Category</td>
					<td><form:input path="pcat" cssClass="form-control" disabled="true"/><error path="pcat" cssclass="error" />
					<span><form:errors  path="pcat" cssclass="error" disabled="true" /> </span></td>
				</tr>
				<tr>
					<td>Product Name</td>
					<td><form:input path="pname" cssClass="form-control" disabled="true"/></td>

				</tr>
				<tr>
					<td>Product Price</td>
					<td><form:input path="pprice" cssClass="form-control"  disabled="true"/></td>
				</tr>
				
				<tr>
					<td colspan=2 align="center">
					<form:hidden path="purl" />
					<img src="${productImages}/${product.pid}.jpg" /></td>
				</tr>

				<tr align="center">
				    <td><a href="/shop/cart/cartview" class="btn btn-info" role="button">Add to Cart</a></td>
					<td align="center"><a href="/shop/displayall"  class="btn btn-info" role="button">Back</a>
					<a href="${req}/visitor/regisview" class="btn btn-info" role="button">Proceed for Payment</a></td>
					</td>
				</tr>
			</table>
		</form:form>
	</div>
</div>
</table>
</body>
<div class="panel panel-default" id="footer" style="background:#ffab62;	width:100%;	height:20px;position:absolute;bottom:0;	left:0;">
    <div class="panel-footer">@Copyright : Copyright © 2016 Shopping Inc. All rights reserved.</div>
</div>

