<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page import = "java.io.*,java.util.*" %>
<%@ page import="dao.UserDAOImpl"%>
<%@ page import = "java.sql.*" %>
<%@ page import = "org.owasp.esapi.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
     
   	 String  un = (String)session.getAttribute("user");
    
      UserDAOImpl userdao = new UserDAOImpl();
      ResultSet data;
      
      data=userdao.data(un);
      String fb=data.getString("feedback");
      
      %>
      
      Hello <% out.println(un); %>
      <br><br>
      Your feedback is: <% out.println(fb); %> <br>

 <a href="home.jsp">Home</a>
</body>
</html>