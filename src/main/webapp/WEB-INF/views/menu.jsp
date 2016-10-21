<jsp:include page="header.jsp" />

<nav class="navbar">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="">Home</a>
		</div>
		<div class="collapse navbar-collapse" id="myNavbar">
			<ul class="nav navbar-nav">
				<li class="active"><a href="${req.contextPath}/about">About</a></li>
				<li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown">View Product Details <span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="#">Category Wise</a></li>
						<li><a href="#">Product Wise</a></li>
						<li><a href="#">Supplier Wise</a></li>
					</ul>
				</li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="${req.contextPath}/signup"><span class="glyphicon glyphicon-user"></span>
						Sign Up</a></li>
				<li><a href="${req.contextPath}/signin"><span class="glyphicon glyphicon-log-in"></span>
						Login</a></li>
			</ul>
		</div>
	</div>
</nav>



