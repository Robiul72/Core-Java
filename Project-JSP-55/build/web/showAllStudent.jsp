

<%@include file="header.jsp"%>

<%@taglib prefix="hasan" uri="http://java.sun.com/jsp/jstl/core"%>

<%@page import="model.Student"%>
<%@page import="Dao.StudentDao"%>
<%@page import="java.util.*"%>



<% 

List<Student> list = StudentDao.getAllStudent();
request.setAttribute("list", list);

int counter = 0;

%>



<div class="container my-3 py-3">
    <div class="bg-info text-center">
        <h1 class="jumborton"> Student</h1>
    </div>

    <table class="table table-striped md-3">
        <thead>
            <tr>
                <th scope="col">Id</th>               
                <th scope="col">First Name</th>               
                <th scope="col">Last Name</th>         
            </tr>
        </thead>
    </table>

    <tbody>
        <hasan:forEach items="${list}" var="s">

            <tr>
                <td>${s.getId()}</td>
                <td>${s.getFirstName()}</td>
                <td>${s.getLastName()}</td>

                <td>
                    <a class="btn btn-primary" href="editForm.jsp?hasan=${s.getId()}">Edit</a>
                    <a class="btn btn-warning" href="delete.jsp?id=${s.getId()}">Delete</a>
                </td>
            </tr>
        </hasan:forEach>
   </tbody>

</div>

<div class="mb-3"></div>

<%@include file="footer.jsp" %>