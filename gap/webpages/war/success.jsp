<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
  <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
		
      <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.3/jquery-ui.min.js"></script>
		
      <script type="text/javascript">
   
         $(document).ready(function() {

            $(".target").hover(function(){
            	$(".target").effect('explode');
               
            });

         });
      </script>
    <style>
  .para1{ 
  position:absolute;
  top:450px;
  left:250px;
  color:white;
  
  }
  .para2{ 
  position:absolute;
  top:520px;
  left:250px;
  color:white;
  }
  </style>
		
      
   </head>
  
  
<body>
<div class="jumbotron">
    <img src="https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcSfjBoC7e0KFCCKz_a_EbQjpV04TA2KztoWjSQC-h56ov4Te9sB7lXfOUM"> 
    
 <nav class="navbar navbar-default">
   <div class="container-fluid">
    <div class="navbar-header">
    </div>
         <div>
              <ul class="nav navbar-nav">
                 <li><a href="index.html">Home</a></li>
                 <li class="active"><a href="#">Innovations</a></li>
                 <li><a href="http://www.adaptavant.com/people">People</a></li>
                 <li><a href="http://www.adaptavant.com/global">Global</a></li>
                 <li><a href="http://www.adaptavant.com/culture">Culture</a></li>
                 <li><a href="http://www.adaptavant.com/career">Careers</a></li>
              </ul>
         </div>
    </div>
 </nav>
 <p class="target"><img src="http://www.vyrex.com/img/it-company-1.jpg" width="1350" height="500" /></p>
 <div class="container"> 
  
<p class="para1"><font size="50"><%String name=request.getParameter("username");

                                  out.print("Welcome"+" "+name);%></font><br></p>
<p class="para2"><font size="50">Successfull login.</font><br></p>

<div class="container">
  <img src="http://www.bolegaindia.com/images/gossips/yuvraj_singh_post_1344672470.jpg" class="img-circle" alt="Cinque Terre" width="600" height="500"> 
</div>
 </div><!-- first div completes here -->
</body>
</html>

