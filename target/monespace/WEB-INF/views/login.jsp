<%@ include file = "header.jsp" %>
<head>
<title>Login</title>
</head>
<body>
<form method="POST" action="perform_login" class="form-inline">
			<div class="form-group">
			<label for="username">UserName:</label>
			<input type="text" class="form-control" id="username" name="username"/>
			</div><br>
			<div class="form-group">
			<label for="password">Password:</label>
			<input type="password" class="form-control" id="password" name="password"/>
			<input type="submit">
		</div>
		<button type="submit" class="btn btn-default">login</button>
		</form>

<div class="container" >  
            <div class="col-lg-4 col-md-3 col-sm-2"></div>
            <div class="col-lg-4 col-md-6 col-sm-8">
                <div class="logo">
                    <img src="https://s16.postimg.org/3wg150ysl/download.jpg"  alt="Logo"  > 
                </div>
                <div class="row loginbox">                    
                    <div class="col-lg-12">
                        <span class="singtext" >Sign in </span>   
                    </div>

                    <div class="col-lg-12 col-md-12 col-sm-12">
                        <input class="form-control" type="text" placeholder="Please enter your user name" > 
                    </div>
                    <div class="col-lg-12  col-md-12 col-sm-12">
                        <input class="form-control" type="password" placeholder="Please enter password" >
                    </div>
                    <div class="col-lg-12  col-md-12 col-sm-12">
                        <a href="#" class="btn  submitButton">Submit </a> 
                    </div>                     

                </div>
                <div class="row forGotPassword">
                    <a href="#" >Forgot Username / Password? </a> 
                </div>
                <br>                
                <br>
                <footer  class="footer">                
                    <a href='#'>Terms of use</a> | 
                    <a href='#'>Privacy Policy</a> | 
                    <a href='#'>Contact us</a> | 
                    <a href='#'>Feedback</a> 
                    <p >©2016   Company All rights reserved </p>                 
                </footer> <!--footer Section ends-->

            </div>
            <div class="col-lg-4 col-md-3 col-sm-2"></div>
        </div>

</body>