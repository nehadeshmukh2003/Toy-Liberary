<%-- 
    Document   : AdminAddToy.jsp
    Created on : 16 Oct, 2024, 9:28:16 PM
    Author     : deshm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="java.sql.*" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Toy</title>
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
        .form-group {
            margin-bottom: 15px;
        }
        .form-group label {
            display: block;
            margin-bottom: 5px;
        }
        .form-group input {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        .btn-submit {
            background-color: #28a745;
            color: white;
            padding: 10px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            width: 100%;
        }
        .btn-submit:hover {
            background-color: #218838;
        }
    </style>
</head>
<body>

<%
    // Get the values from the form (toy name and price)
    String tname = request.getParameter("tname");
    String tprice = request.getParameter("price");

    // Insert data into the 'toy' table with only 'tname' and 'tprice'
    try {
        // Load JDBC driver and establish a connection
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/toydb", "root", "");

        // Create the SQL insert query to add only 'tname' and 'tprice'
        String sql = "INSERT INTO toy (tname, tprice) VALUES (?, ?)";

        // Prepare the statement to avoid SQL injection
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, tname);
        ps.setString(2, tprice);

        // Execute the update
        int result = ps.executeUpdate();

        if (result > 0) {
            out.print("<div class='container'><h2>Data inserted successfully!</h2></div>");
        } else {
            out.print("<div class='container'><h2>Failed to insert data.</h2></div>");
        }

        // Close the connection
        ps.close();
        con.close();
    } catch (Exception e) {
        out.print("<div class='container'><h2>Error: " + e.getMessage() + "</h2></div>");
    }
%>

<li><a href="validadmin.jsp">Back to Homepage</a></li>

</body>
</html>

