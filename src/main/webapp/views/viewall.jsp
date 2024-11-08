<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Users</title>
    <style>
        table{
            
            background-color: aliceblue;
            height: 400px;
            width: 900px;
        }
       th{
        
        color: rgb(226, 67, 43);
       }
       td{
      
        color: rgba(251, 14, 239, 0.999);
       }
       body{
       background-color: rgb(215, 228, 163);
       }
    </style>
</head>
<body>

    <center>
<h1 style="color:rgb(43, 134, 226);">Students Results List</h1>
<table >
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Course</th>
        <th>Html</th>
        <th>Hibernet</th>
        <th>Spring</th>
        <th>Springboot</th>
        <th>Total</th>
        <th>Persentage</th>
        <th>Grade</th>
        <th>Result</th>
        <th>Edit</th>
        <th>Delete</th>
    </tr>
    <c:forEach var="std" items="${students}">
        <tr>
            <td>${std.sid}</td>
            <td>${std.name}</td>
            <td>${std.course}</td>
            <td>${std.html}</td>
            <td>${std.hibernet}</td>
            <td>${std.spring}</td>
            <td>${std.springboot}</td>
            <td>${std.total}</td>
            <td>${std.persentage}</td>
            <td>${std.grade}</td>
            <td>${std.result}</td>
            <td><a href="/edit/${std.sid}">Edit</a></td>
            <td><a href="/delete/${std.sid}" >Delete</a></td>
        </tr>
    </c:forEach>
</table>
<p></p>
<a href="/">Home</a>
</center>
</body>
</html>
