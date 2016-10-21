<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<jsp:include page="header.jsp"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<c:set var="req" value="${pageContext.request.contextPath}" />

<script src="${req}/resources/js/angular.js"></script>

  
<div ng-app="myApp" ng-controller="myCtrl" ng-init="test='${pid}'"> 

<p>Search:<input type="text" ng-model="test"></p>


<table border="1" width="50%" class="table table-hover table-responsive" >
<tr>
<th ng-click="orderByMe('pid')">Product ID</th>
<th ng-click="orderByMe('pcat')">Product Category</th>
<th ng-click="orderByMe('pname')">Product Name</th>
<th ng-click="orderByMe('purl')">Product Image</th>
<th ng-click="orderByMe('pprice')">Product Price</th>
<th ng-click="">Image</th>
<th ng-click="">View</th>
<th ng-click="">Add To Cart</th>
</tr>

<tr ng-repeat="x in names | orderBy:myOrderBy | filter:test">
<td>{{x.pid}}</td>
<td>{{x.pcat}}</td>
<td>{{x.pname}}</td>
<td>{{x.purl}}</td>
<td>{{x.pprice}}</td>
<!-- <td><img src="/webapp/resources/images/{{x.purl}}.jpg" width="50" height="50"></td> -->
<td><a href="/webapp/view/{{x.pid}}" class="btn btn-info" role="button">View</a></td>
<td> <a href="#" class="btn btn-info" role="button">Add to cart</a></td>
</tr>
</table>
</div>
<script>
var app = angular.module('myApp', []);
app.controller('myCtrl', function($scope, $http) {
 $http.get("/product/all")
  .then(function(response) {
      $scope.names= response.data;
  });
});
</script>
