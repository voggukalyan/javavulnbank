<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<body>


      <%
    
   	 String  un = (String)session.getAttribute("user");
      
      
      
      if(un=="admin")
      {
    	  out.println("You are admin");
    	  //response.sendRedirect("feedback_user.jsp");
      }
      else
      {
    	  out.println("You are user");
    	  //response.sendRedirect("feedback_admin.jsp");
    	  
      }
      %>

</body>
</html>