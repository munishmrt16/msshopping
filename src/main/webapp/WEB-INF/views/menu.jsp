<jsp:include page="header.jsp" />

<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>

<nav class="navbar navbar-inverse">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="${req.contextPath}/shop">Home</a>
		</div>
		<ul class="nav navbar-nav">
			<li><a href="${req.contextPath}/shop/about">About</a></li>
			<li><a href="${req.contextPath}/shop/visitor/view">Contact
					Us</a></li>
			<sec:authorize access="hasRole('ROLE_ADMIN')">
				<li><a href="${req.contextPath}/shop/pro/view">Products</a></li>
				<li><a href="${req.contextPath}/shop/category/cateview">Category</a></li>
				<li><a href="${req.contextPath}/shop/supplier/suppview">Supplier</a></li>
			</sec:authorize>
			<li><a href="${req.contextPath}/shop/displayall">Shopping</a></li>
			<li><a href="${req.contextPath}/shop/login">SignIn</a></li>
			<sec:authorize access="hasRole('ROLE_ADMIN')">
				<li><a href="${req.contextPath}/shop/logout">SignOut</a></li>
			</sec:authorize>
		</ul>
	</div>
</nav>
