<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
    <meta charset="utf-8">
    <title>Home</title>
	
  </head>
  <body>
  	<div>
  		<h3>What is the code?</h3>
  		<% if(session.getAttribute("res") == "incorrect") { %>
  				<p>You must train harder!</p>
  			<% } %>
  		<form method="POST" action="/process">
  			<input type="text" name="code"></input><br>
  			<button type="submit">Submit</button>
  		</form>
  	</div>
    
  </body>
</html>