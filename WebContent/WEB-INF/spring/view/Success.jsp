<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script type="text/javascript">

$(document).ready(function(){
	var text = "<table border='black'><tr><th>Name</th><th>Occupation</th></tr><tr><td>${customer.name}</td><td>${customer.occupation}</td></tr><table>"
    $("button").click(function(){
        $.get("http://localhost:8081/LoginTest/Customer/${customer.name}", function(data, status){
        	$(demo).append(text);
        });
    });
});

</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success!</title>
</head>
<body>
<div style="color:red">${message} ${userName}
			</div>
<button> Display Details</button>
<div> </div>
<div id="demo"></div>
</body>
</html>