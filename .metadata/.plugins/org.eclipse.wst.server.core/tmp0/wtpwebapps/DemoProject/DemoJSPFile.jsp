<%@page import="java.util.Date"%>
<%@page import ="java.lang.Math" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP</title>
</head>
<body onload="demoFunction2()">

		
	<br/>
	
	
	
	
	<h3>Welcome Kamal</h3>
	<%= 12 + 6%>
	<br/>
	<%= 12 - 7 %>
	
	<br/>
	<br/>
	<%
		for(int i = 1; i <= 10; i ++){
			out.print(i+" * 10 = "+i*10+ "<br/>");
			
		}
	%>
	<%= new java.util.Date() %>
	<br/>
	<%
		out.print(Math.random() +"<br/>");
	   	out.print(Math.abs(-54));
	%>
	
	<br/>
	
	<%!
		int addition(int num1, int num2){
		return num1 + num2;
	}
	%>
	
	
	<%= addition(12, 5)%>
	<br/>
	<br/>
	<br/>
	<%
		String str=request.getParameter("txtbtn");
		out.print("Hello "+str+"<br/>I'm from HTML");
		
	%>
	<br/>
	<br/>
	
	
	<script type = "text/javascript">
	
		function demoFunction(){
			alert("Time gonna end");
			
		}
		
		function demoFunction2(){
			alert("Time started");
		}
	
	</script>
	
	
	
	<button name="button1" onclick="demoFunction()">Sample Button</button>

	<%
		if(str.equals("kamal"))
			response.sendRedirect("AnotherFile.html");
		else
			response.sendRedirect("DemoHTMLFile.html");
	%>
	
	
</body>
</html>