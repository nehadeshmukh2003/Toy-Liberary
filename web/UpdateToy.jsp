<%-- 
    Document   : UpdateToy.jsp
    Created on : 16 Oct, 2024, 9:56:30 PM
    Author     : deshm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="java.sql.*" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Update Toy</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .container {
            background-color: white;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            width: 400px;
        }
        h2 {
            text-align: center;
            margin-bottom: 20px;
        }
        input[type="text"] {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #ddd;
            border-radius: 5px;
        }
        button {
            background-color: #28a745;
            color: white;
            padding: 10px 15px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            width: 100%;
        }
        button:hover {
            background-color: #218838;
        }
    </style>
</head>
<body>

<div class="container">
    <h2>Update Toy</h2>
    <%
        // Retrieve toy details from the request
        String toyName = request.getParameter("tname");
        String toyPrice = request.getParameter("tprice");
    %>
    <form action="UpdateToyProcess.jsp" method="post">
        <label for="tname">Toy Name:</label>
        <input type="text" id="tname" name="tname" value="<%= toyName %>">

        <label for="tprice">Toy Price:</label>
        <input type="text" id="tprice" name="tprice" value="<%= toyPrice %>">

        <input type="hidden" name="originalTname" value="<%= toyName %>">

        <button type="submit">Update Toy</button>
    </form>
</div>

</body>
</html>

