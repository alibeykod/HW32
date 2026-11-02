<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <title>${libraryName}</title>
    <style>
        table {
            font-family: Arial, Helvetica, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }
        p, a{
            border: 1px solid #ddd;
            padding: 8px;
        }
        p{
            :nth-child(even){background-color: #f2f2f2;}
        }
        p:hover {background-color: #ddd;}

        a{
            padding-top: 12px;
            padding-bottom: 12px;
            text-align: left;
            background-color: #04AA6D;
            color: white;
        }

        td, th {
            border: 1px solid #ddd;
            padding: 8px;
        }

        tr:nth-child(even){background-color: #f2f2f2;}

        tr:hover {background-color: #ddd;}

        th {
            padding-top: 12px;
            padding-bottom: 12px;
            text-align: left;
            background-color: #04AA6D;
            color: white;
        }
    </style>
</head>
<body>
<h1>${libraryName}</h1>
<table>
    <tr>
        <th>ID</th>
        <th>Title</th>
        <th>Author Name</th>
        <th>Pages</th>
    </tr>
    <c:forEach var="book" items="${books}">
        <tr>
            <td>${book.id}</td>
            <td>${book.title}</td>
            <td>${authorNames[book.authorId]}</td>
            <td>${book.pages}</td>
        </tr>
    </c:forEach>

</table>
<hr>
<br>
<p>
    <a href="${pageContext.request.contextPath}/books/add">Add a book</a>
</p>
<br>
<br>
<p>
    <a href="${pageContext.request.contextPath}/books/detail">Book-Detail</a>
</p>
<br>
<br>
<p>
    <a href="${pageContext.request.contextPath}/authors">View all authors</a>
</p>
</body>
</html>
