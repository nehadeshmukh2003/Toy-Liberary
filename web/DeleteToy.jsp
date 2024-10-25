<%-- 
    Document   : DeleteToy.jsp
    Created on : 16 Oct, 2024, 9:52:25 PM
    Author     : deshm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Delete Toy</title>
    <style>
        body {
            margin: 0;
            padding: 0;
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .container {
            background-color: #ffffff;
            padding: 40px;
            border-radius: 10px;
            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);
            text-align: center;
        }

        h2 {
            color: #FF6347; /* Tomato color for status message */
            font-size: 24px;
            margin-bottom: 20px;
        }

        h2.success {
            color: #4CAF50; /* Green for success */
        }

        a {
            display: inline-block;
            margin-top: 20px;
            padding: 10px 20px;
            background-color: #007BFF;
            color: white;
            text-decoration: none;
            border-radius: 5px;
        }

        a:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>

    <div class="container">
        <%
            String tname = request.getParameter("tname");

            // Delete the toy from the database based on 'tname'
            try {
                // Load JDBC driver and establish a connection
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/toydb", "root", "");

                // Create the SQL delete query
                String sql = "DELETE FROM toy WHERE tname = ?";

                // Prepare the statement to avoid SQL injection
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, tname);

                // Execute the update
                int result = ps.executeUpdate();

                if (result > 0) {
                    out.print("<h2 class='success'>Toy deleted successfully!</h2>");
                } else {
                    out.print("<h2>Failed to delete toy.</h2>");
                }

                // Close the connection
                ps.close();
                con.close();
            } catch (Exception e) {
                out.print("<h2>Error: " + e.getMessage() + "</h2>");
            }
        %>

        <a href="ViewToy.jsp">Back to View Toys</a>
    </div>

</body>
</html>
