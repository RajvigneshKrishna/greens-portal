<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="/css/bootstrap/bootstrap.min.css" rel="stylesheet" >
<link href="/css/course/addCourse.css" rel="stylesheet" >
<script type="text/javascript" src="/js/bootstrap/bootstrap.bundle.js"></script>
<meta charset="ISO-8859-1">
<title>Add Course</title>
</head>
<body>
	<div id="addCourse" class="container">
		<h2>Add Courses</h2>
		<form action="/courses/register" enctype="multipart/form-data" method="post">
			<div class="form-group">
				<label for="courseName">Name:</label> 
				<input type="text" name="courseName" class="form-control" id="courseName" placeholder="Enter Course Name" required />
			</div>
			<div class="form-group">
				<label for="courseFees">Fees:</label> 
				<input type="text" name="courseFees" class="form-control" id="courseFees" placeholder="Enter Course Fees" required />
			</div>
			<div class="form-group">
				<label for="courseSyllabus">Syllabus:</label> 
				<input type="file" name="courseSyllabus" class="form-control" id="courseSyllabus" placeholder="Enter Course Syllabus" required />
			</div>
			<div class="form-group">
				<label for="courseDuration">Duration:</label> 
				<input type="text" name="courseDuration" class="form-control" id="courseDuration" placeholder="Enter Course Duration" required />
			</div>
			<input type="submit" class="btn btn-register" value="Add Course" />
		</form>
	</div>
</body>
</html>