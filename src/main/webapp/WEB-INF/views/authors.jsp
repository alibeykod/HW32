<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Authors</title>
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
<table>
    <thead>
        <tr>
            <th>Author ID</th>
            <th>Author Name</th>
        </tr>
    </thead>
<c:forEach var="author" items="${authors}">
        <tr>
            <td>${author.id}</td>
            <td>${author.name}</td>
        </tr>
</c:forEach>
</table>

    <p><a href="${pageContext.request.contextPath}/books">Back To Books</a></p>
</body>
</html>
