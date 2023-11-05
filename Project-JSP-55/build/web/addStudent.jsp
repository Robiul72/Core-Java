
<jsp:useBean class="model.Student" id="s"/>

<%@page import="Dao.StudentDao" %>

<jsp:setProperty name="s" property="*" />

<%

//int result = StudentDao.saveStudent(s);

//if(result > 0){
//    response.sendRedirect("showAllStudent.jsp");    
//    }
//    else{
//    response.sendRedirect("error.jsp");
//    }

int result = -1; // Default result value

try {
    result = StudentDao.saveStudent(s);
} catch (Exception e) {
    e.printStackTrace(); // Log the exception for debugging
}

if (result > 0) {
    response.sendRedirect("showAllStudent.jsp"); 
} else {
    out.println("error.jsp"); // Provide an error message
}

%>