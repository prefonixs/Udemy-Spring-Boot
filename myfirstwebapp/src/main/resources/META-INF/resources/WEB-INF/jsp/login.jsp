<html>
<head>
<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css"
	rel="stylesheet">
<title>Login Page</title>
</head>
<body>
	<div class="container">
		<h1>Login</h1>
		<form method="post">
			Name:<input type="text" name="name"> <br /> Password:<input
				type="password" name="password"> <br />
			<pre>${error}</pre>
			<input type="submit">
		</form>
	</div>
	<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
</body>
</html>