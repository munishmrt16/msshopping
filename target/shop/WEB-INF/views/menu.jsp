<jsp:include page="header.jsp" />
<nav class="navbar navbar-inverse">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="${req.contextPath}/shop">Home</a>
		</div>
		<ul class="nav navbar-nav">
			<li class="active"><a href="${req.contextPath}/shop/about">About</a></li>
			<li class="active"><a href="${req.contextPath}/shop/visitor/view">Contact Us</a></li>
			<li class="dropdown"><a class="dropdown-toggle"
				data-toggle="dropdown" href="#">View Detail <span class="caret"></span></a>
				<ul class="dropdown">
					<div class="dropdown-content">
						<p><a href="${req.contextPath}/shop/pro/view">Products</a></p>
						<p><a href="${req.contextPath}/shop/cate/view">Category</a></p>
						<p><a href="${req.contextPath}/shop/supp/view">Supplier</a></p>
						</div>
				</ul>
			<li><a href="${req.contextPath}/shop/signup">SignUp</a></li>
			<li><a href="${req.contextPath}/shop/user/view">SignIn</a></li>
		</ul>
	</div>
</nav>










