

<html>
<link rel="stylesheet" type="text/css" href="compre.css">
<head>
<h1>
Login Page
</h1>
</head>
<hr>
<body>
<form name=studentlogin action="student.jsp" method = 'post'>
User ID: 
<% out.println("   ");%> 
<input type="text" name="firstname" align="center" />
<br/>
Password:  
<% out.println("   ");%> 
<input type="password" name="password" /><br/><br/>
<input type="submit" value="Submit" />

</form>
</body> 
</html>