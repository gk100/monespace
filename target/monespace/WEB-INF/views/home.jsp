<%@ include file="header.jsp"%>
<body>
<div id="navbar">
  <nav class="navbar navbar-default navbar-static-top" role="navigation">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbar-collapse-1">
      <span class="sr-only">Toggle navigation</span>
      <span class="icon-bar"></span>
      <span class="icon-bar"></span>
      <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#">Brand</a>
    </div>
    <div class="collapse navbar-collapse" id="navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#">Active Link</a></li>
        <li><a href="#">Link</a></li>
        
        <c:forEach items="${listDealsCategory}" var="d">
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown">${d.dealsCategoryName} <b class="caret"></b></a> 
          <ul class="dropdown-menu">
            <li class="kopie"><a href="#">Dropdown1</a></li>
  
            <li><a href="#">${k.propertyType}</a></li>
            <li class="active"><a href="#">Dropdown Link 2</a></li>
            <li><a href="#">Dropdown Link 3</a></li>
            <li class="dropdown dropdown-submenu">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown Link 4</a>
              <ul class="dropdown-menu">
                <li class="kopie"><a href="#">Dropdown Link 4</a></li>
                <li><a href="#">Dropdown Submenu Link 4.1</a></li>
                <li><a href="#">Dropdown Submenu Link 4.2</a></li>
                <li><a href="#">Dropdown Submenu Link 4.3</a></li>
                <li><a href="#">Dropdown Submenu Link 4.4</a></li>
              </ul>
            </li>
            <li class="dropdown dropdown-submenu">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown Link 5</a>
              <ul class="dropdown-menu">
                <li class="kopie"><a href="#">Dropdown Link 5</a></li>
                <li><a href="#">Dropdown Submenu Link 5.1</a></li>
                <li><a href="#">Dropdown Submenu Link 5.2</a></li>
                <li><a href="#">Dropdown Submenu Link 5.3</a></li>
                <li class="dropdown dropdown-submenu">
                  <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown Submenu Link 5.4</a>
                  <ul class="dropdown-menu">
                    <li class="kopie"><a href="#">Dropdown Submenu Link 5.4</a></li>
                    <li><a href="#">Dropdown Submenu Link 5.4.1</a></li>
                    <li><a href="#">Dropdown Submenu Link 5.4.2</a></li>
                  </ul>
                </li>
              </ul>
            </li>
          </ul>
        </li>
        </c:forEach>


<!--         <li class="dropdown"> -->
<!--           <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown2 <b class="caret"></b></a> -->
<!--           <ul class="dropdown-menu"> -->
<!--             <li class="kopie"><a href="#">Dropdown2</a></li> -->
<!--             <li><a href="#">Dropdown2 Link 1</a></li> -->
<!--             <li><a href="#">Dropdown2 Link 2</a></li> -->
<!--             <li><a href="#">Dropdown2 Link 3</a></li> -->
<%--             <c:forEach items="${listDealsCategory}" var="k"> --%>
<!--             <li class="dropdown dropdown-submenu"> -->
<%--               <a href="#" class="dropdown-toggle" data-toggle="dropdown">${k.dealsCategoryName}</a> --%>
<!--               <ul class="dropdown-menu"> -->
<%--                 <li class="kopie"><a href="#">${k.dealsCategoryName}</a></li> --%>
<%--                 <c:forEach items="${listDealsCategories}" var="g"> --%>
<!--                 <li><a href="#">Dropdown2 Submenu Link 4.1</a></li> -->
<!--                 <li><a href="#">Dropdown2 Submenu Link 4.2</a></li> -->
<!--                 <li><a href="#">Dropdown2 Submenu Link 4.3</a></li> -->
<!--                 <li><a href="#">Dropdown2 Submenu Link 4.4</a></li> -->
<!--               </ul> -->
<!--             </li> -->
<%--             </c:forEach> --%>
<!--             <li class="dropdown dropdown-submenu"> -->
<!--               <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown2 Link 5</a> -->
<!--               <ul class="dropdown-menu"> -->
<!--                 <li class="kopie"><a href="#">Dropdown Link 5</a></li> -->
<!--                 <li><a href="#">Dropdown2 Submenu Link 5.1</a></li> -->
<!--                 <li><a href="#">Dropdown2 Submenu Link 5.2</a></li> -->
<!--                 <li><a href="#">Dropdown2 Submenu Link 5.3</a></li> -->
<!--                 <li class="dropdown dropdown-submenu"> -->
<!--                   <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown Submenu Link 5.4</a> -->
<!--                   <ul class="dropdown-menu"> -->
<!--                     <li class="kopie"><a href="#">Dropdown2 Submenu Link 5.4</a></li> -->
<!--                     <li><a href="#">Dropdown2 Submenu Link 5.4.1</a></li> -->
<!--                     <li><a href="#">Dropdown2 Submenu Link 5.4.2</a></li> -->
<!--                   </ul> -->
<!--                 </li> -->
<!--               </ul> -->
<!--             </li> -->
<!--           </ul> -->
<!--         </li> -->
      </ul>
    </div>
    <!-- /.navbar-collapse -->
  </nav>
</div>

<h2>
		<b>Welcom to Homepage!</b>
	</h2>
	
<div class="jumbotron">
  <div class="container text-center">
    <h1>My Portfolio</h1>
    <p>Some text that represents "Me"...</p>
  </div>
</div>
  
<div class="container-fluid bg-3 text-center">
  <h3>Some of my Work</h3><br>
  <div class="row">
    <div class="col-sm-3">
      <p>Some text..</p>
      <img src="resources/img/BlankImage.png" class="img-responsive" style="width:100%" alt="Image">
    </div>
    <div class="col-sm-3">
      <p>Some text..</p>
      <img src="resources/img/BlankImage.png" class="img-responsive" style="width:100%" alt="Image">
    </div>
    <div class="col-sm-3">
      <p>Some text..</p>
      <img src="resources/img/BlankImage.png" class="img-responsive" style="width:100%" alt="Image">
    </div>
    <div class="col-sm-3">
      <p>Some text..</p>
      <img src="resources/img/BlankImage.png" class="img-responsive" style="width:100%" alt="Image">
    </div>
  </div>
</div><br>

<div class="container-fluid bg-3 text-center">
  <div class="row">
    <div class="col-sm-3">
      <p>Some text..</p>
      <img src="resources/img/BlankImage.png" class="img-responsive" style="width:100%" alt="Image">
    </div>
    <div class="col-sm-3">
      <p>Some text..</p>
      <img src="resources/img/BlankImage.png" class="img-responsive" style="width:100%" alt="Image">
    </div>
    <div class="col-sm-3">
      <p>Some text..</p>
      <img src="resources/img/BlankImage.png" class="img-responsive" style="width:100%" alt="Image">
    </div>
    <div class="col-sm-3">
      <p>Some text..</p>
      <img src="resources/img/BlankImage.png" class="img-responsive" style="width:100%" alt="Image">
    </div>
  </div>
</div><br><br>

<%@ include file="footer.jsp"%>
</body>