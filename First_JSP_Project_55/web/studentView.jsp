
<%@include file="header.jsp" %>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page import="model.student, dao.studentDao, java.util.* " %>


<%
List<student> list = studentDao.getAllStudent();
request.setAttribute("list", list);
%>

<div class="container my-3 py-3">
    <div class="bg-success text-center">
        <h1 class="jumborton"> Add Student</h1>
    </div>
    
    <table class="table table-striped mb-2">
        <thead>
            <tr>
                <th scope="col">ID</th>
                <th scope="col">First Name</th>
                <th scope="col">Last Name</th>
                <th scope="col">Father's First Name</th>
                <th scope="col">Father's Last Name</th>
                <th scope="col">Mother's First Name</th>
                <th scope="col">Mother's Last Name</th>
                <th scope="col">Gender</th>
                <th scope="col">Date Of Birth</th>
                <th scope="col">NID NO</th>
                <th scope="col">Contact No</th>
                <th scope="col">Email No</th>
                <th scope="col">Entry Date</th>
                <th scope="col">Address</th>
            </tr>
        </thead>
        
        <tbody>
            <c:forEach items="${list}" var="s">
                <tr>
                    <td>${s.getId()}</td>
                    <td>${s.getFirstName}</td>
                    <td>${s.getlastName}</td>
                    <td>${s.getFatherFirstName}</td>
                    <td>${s.getFatherLastName}</td>
                    <td>${s.getMotherFirstName}</td>
                    <td>${s.getMotherLastName}</td>
                    <td>${s.getGender}</td>
                    <td>${s.getDateOfBirth}</td>
                    <td>${s.getNid}</td>
                    <td>${s.getContact}</td>
                    <td>${s.getEmail}</td>
                    <td>${s.getEntryDate}</td>
                    <td>${s.getAddress}</td>
                    
                    <td>
                        <button type="Submit" class="btn btn-primary">Edit</button>
                        <button type="Submit" class="btn btn-warning">Delete</button>
                    </td>
                    
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>

<div class="mb-3">
</div>
<%@include file="footer.jsp" %>