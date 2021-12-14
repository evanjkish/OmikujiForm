<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form</title>
</head>
<body>
	<h1>Send an Omikuji!</h1>
	
	<h1>${testing}</h1>
	
	<form action="/submit" method="post">
	<label for="years">Pick any number from 5 to 25</label>
	<input type="number" name="years" min="5" max="25">

    <label for="city">Any real city:</label>
    <input type="text" name="city">

    <label for="person">Any real person's name:</label>
    <input type="text" name="person">

    <label for="activity">Professional endeavor or hobby:</label>
    <input type="text" name="activity">

    <label for="creature">Any type of living thing:</label>
    <input type="text" name="creature">

    <label for="comment">Something nice to say to someone:</label>
    <textarea name="comment"  cols="30" rows="10"></textarea>

    <p>Send and show a friend</p>
    <input type="submit" value="Send">
	</form>
</body>
</html>