
<jsp:useBean class="model.Student" id="s"/>
<%--<jsp:useBean id="studentBean" class="model.Student" scope="session" />--%>

<%@page import="dao.StudentDao" %>
<jsp:setProperty name="s" property="*"/>

<%

int result = StudentDao.saveStudent(s);
if(result > 0){
    
response.sendRedirect("success.jsp");
    }
    else{
    response.sendRedirect("error.jsp");
    }

%>