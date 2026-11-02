<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <title>Book-Detail™</title>
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
<table border="1">
    <tr>
        <th>Title</th>
        <td>${book.title}</td>
    </tr>
    <tr>
        <th>Author</th>
        <td>${author.name}</td>
    </tr>
    <tr>
        <th>Page Count</th>
        <td>${book.pages}</td>
    </tr>
</table>
    <p><a href="${pageContext.request.contextPath}/books">Books</a></p>
</body>
</html>
