<jsp:include page="header.jsp" />

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<c:set var="req" value="${pageContext.request}" />

<div id="myCarousel" class="carousel slide" data-ride="carousel" data-interval="3000">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active" ></li>
      <li data-target="#myCarousel" data-slide-to="1" ></li>
      <li data-target="#myCarousel" data-slide-to="2" ></li>
      <li data-target="#myCarousel" data-slide-to="3" ></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
      <div class="item active">
         <img src="./resources/images/p1.jpg" alt="Chania" >
        
      </div>

      <div class="item">
         <img src="./resources/images/p2.jpg" alt="Chania">
      </div>
    
      <div class="item">
        <img src="./resources/images/p3.jpg" alt="Chania" >
      </div>

      <div class="item">
		<img src="./resources/images/p4.jpg" alt="Chania" width="460" height="200">
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>

  <div class="row hidden-xs" id="slider-thumbs" style="height:200px;width=20%">
                        <!-- Bottom switcher of slider -->
                        <ul class="hide-bullets">
                            <li class="col-sm-2">
                                <a class="thumbnail" id="carousel-selector-0" href="${req.contextPath}/pro/view"><img src="./resources/images/p001.jpg" style="height:200px;width=20%"></a>
                            </li>

                            <li class="col-sm-2">
                                <a class="thumbnail" id="carousel-selector-1" href="${req.contextPath}/pro/view"><img src="./resources/images/p002.jpg" style="height:250px;width=20%" ></a>
                            </li>

                            <li class="col-sm-2">
                                <a class="thumbnail" id="carousel-selector-2" href="${req.contextPath}/pro/view"><img src="./resources/images/p003.jpg" style="height:250px;width=20%"></a>
                            </li>
							<li class="col-sm-2">
                                <a class="thumbnail" id="carousel-selector-0" href="${req.contextPath}/pro/view"><img src="./resources/images/p004.jpg" style="height:250px;width=20%"></a>
                            </li>

                            <li class="col-sm-2">
                                <a class="thumbnail" id="carousel-selector-1" href="${req.contextPath}/pro/view"><img src="./resources/images/p005.jpg" style="height:250px;width=20%"></a>
                            </li>

                            <li class="col-sm-2">
                                <a class="thumbnail" id="carousel-selector-2" href="${req.contextPath}/pro/view"><img src="./resources/images/p006.jpg" style="height:250px;width=20%"></a>
                            </li>

                        </ul>                 
                </div>
        </div>
  
  