
<%--<jsp:useBean class="model.student" id="s" />--%>
<jsp:useBean id="studentBean" class="model.Student" scope="session" />

<%@page import="dao.studentDao" %>
<jsp:setProperty name="s" property="*"/>

<%

int result = studentDao.saveStudent(s);
if(result > 0){
    
response.sendRedirect("success.jsp");
    }
    else{
    response.sendRedirect("error.jsp");
    }

%>