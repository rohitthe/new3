<html>
<head>
<meta charset="utf-8"> 
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
<title>Login Success</title> 
<link rel="stylesheet" href="css/style.css">
</head>
<body>
<center> 
        <center>Login Success</center>
        Welcome <%= session.getAttribute("userId") %>
</center>
</body>
</html>