<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add-Book</title>
    <style>
        form {
            font-family: Arial, Helvetica, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }
        input, label, select{
            border: 1px solid #ddd;
            padding: 8px;
        }
        p, a{
            border: 1px solid #ddd;
            padding: 8px;
        }
        p{
            :nth-child(even){background-color: #f2f2f2;}
        }
        p:hover {background-color: #ddd;}

        input{
            :nth-child(even){background-color: #f2f2f2;}
        }
        input:hover {background-color: #ddd;}

        label{
            padding-top: 12px;
            padding-bottom: 12px;
            text-align: left;
            background-color: #04AA6D;
            color: white;
        }

        input, label, select {
            border: 1px solid #ddd;
            padding: 8px;
        }

        input:nth-child(even){background-color: #f2f2f2;}

        input:hover {background-color: #ddd;}

        select {
            padding-top: 12px;
            padding-bottom: 12px;
            text-align: left;
            background-color: #04AA6D;
            color: white;
        }
    </style>
</head>
<body>
<h1>Add Book</h1>
<form action="${pageContext.request.contextPath}/books/add" method="post" style="border: black solid 1px">
    <label for="title">Title : </label>
    <input type="text" name="title" id="title" placeholder="Title Of Book" required> <br>

    <label for="pages">Pages ًQuantity </label>
    <input type="number" name="pages" id="pages" placeholder="e.g. 88" required> <br>

    <label for="authorId">Author ID</label>
    <select name="authorId" id="authorId" required>
        <option value="">-- Select Author --</option>
        <c:forEach var="author" items="${authors}">
            <option value="${author.id}">${author.name}</option>
        </c:forEach>
    </select><br><br>
    <button>ADD</button>
</form>

<p><a href="${pageContext.request.contextPath}/books">Back To Books</a></p>
</body>
</html>
