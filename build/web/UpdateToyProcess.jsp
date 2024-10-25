<%-- 
    Document   : UpdateToyProcess.jsp
    Created on : 16 Oct, 2024, 9:58:20 PM
    Author     : deshm
--%>

<%@page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Update Toy Process</title>
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
            color: #4CAF50; /* Green success color */
            font-size: 24px;
            margin-bottom: 20px;
        }

        h2.error {
            color: #FF0000; /* Red error color */
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
            String originalTname = request.getParameter("originalTname");
            String newTname = request.getParameter("tname");
            String newTprice = request.getParameter("tprice");

            // Update the toy in the database
            try {
                // Load JDBC driver and establish a connection
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/toydb", "root", "");

                // Create the SQL update query
                String sql = "UPDATE toy SET tname=?, tprice=? WHERE tname=?";
                PreparedStatement pstmt = con.prepareStatement(sql);
                pstmt.setString(1, newTname);
                pstmt.setString(2, newTprice);
                pstmt.setString(3, originalTname);

                // Execute the update
                int rowsUpdated = pstmt.executeUpdate();

                if (rowsUpdated > 0) {
                    out.println("<h2>Toy updated successfully!</h2>");
                } else {
                    out.println("<h2 class='error'>Error updating toy.</h2>");
                }

                // Close the database connection
                pstmt.close();
                con.close();
            } catch (Exception e) {
                out.println("<h2 class='error'>Error: " + e.getMessage() + "</h2>");
            }
        %>

        <a href="ViewToy.jsp">Back to View Toys</a>
    </div>

</body>
</html>
