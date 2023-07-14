<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="/css/bootstrap/bootstrap.min.css" rel="stylesheet" >
<link href="/css/student/studentRegistration.css" rel="stylesheet" >
<script type="text/javascript" src="/js/bootstrap/bootstrap.bundle.js"></script>
<title>Student Registration</title>
</head>
<body>
	<div id="studentRegistration" class="container">
		<h2>Registration</h2>
		<form action="/students/register" method="post">
			<div class="form-group">
				<label for="studentName">Name:</label>
				<input type="text" name="studentName" class="form-control" id="studentName" placeholder="Enter your name" required/>
			</div>
			<div class="form-group">
				<label for="studentEmailId">Email:</label>
				<input type="email" name="studentEmailId" class="form-control" id="studentEmailId" placeholder="Enter your email" required/>
			</div>
			<div class="form-group">
				<label for="studentPassword">Password:</label>
				<input type="text" name="studentPassword" class="form-control" id="studentPassword" placeholder="Enter your Password" required/>
			</div>
			<div class="form-group">
				<label for="studentPhone">Mobile Number:</label>
				<input type="text" name="studentPhone" class="form-control" id="studentPhone" placeholder="Enter your Mobile Number" required/>
			</div>
			<div class="form-group">
				<label for="studentDateOfBirth">Date Of Birth:</label>
				<input type="date" name="studentDateOfBirth" class="form-control" id="studentDateOfBirth" placeholder="Enter your Date of Birth" required/>
			</div>
			<div class="form-group">
				<label for="studentAddress">Address:</label>
				<textarea name="studentAddress" rows="2" cols="50"  class="form-control" id="studentAddress" placeholder="Enter your Address" required></textarea>
			</div>
			<input type="submit" class="btn btn-register" value="Register"/>
		</form>
	</div>
</body>
</html>