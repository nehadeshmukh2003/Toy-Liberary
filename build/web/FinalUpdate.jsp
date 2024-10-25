<%-- 
    Document   : FinalUpdate.jsp
    Created on : 16 Oct, 2024, 2:20:20 PM
    Author     : deshm
--%>
<%@ page import="java.util.*, java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Update User</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 20px;
        }
        h1 {
            text-align: center;
            color: #333;
        }
        .container {
            background-color: white;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            max-width: 500px;
            margin: auto;
        }
        .message {
            text-align: center;
            font-size: 18px;
            margin: 20px 0;
        }
        .error {
            color: red;
        }
        .success {
            color: green;
        }
    </style>
</head>
<body>
    <h1>Update User Details</h1>
    
    <div class="container">
        <%
            // Get form data from request
            String name = request.getParameter("Name");
            String address = request.getParameter("Address");
            String mobileno = request.getParameter("Mobileno");
            String email = request.getParameter("Email");
            String username = request.getParameter("Username");
            String password = request.getParameter("Password");
            
            try {
                // Load JDBC driver
                Class.forName("com.mysql.jdbc.Driver");
                
                // Establish a connection to the database
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/toydb", "root", "");
                
                // Prepare the SQL update statement
                String sql = "UPDATE users SET name = ?, address = ?, mobile_no = ?, email = ?, password = ? WHERE username = ?";
                PreparedStatement ps = con.prepareStatement(sql);
                
                // Set the values in the SQL statement
                ps.setString(1, name);
                ps.setString(2, address);
                ps.setString(3, mobileno);
                ps.setString(4, email);
                ps.setString(5, password);
                ps.setString(6, username); // Bind the 'username' in the WHERE clause
                
                // Execute the update
                int i = ps.executeUpdate();
                
                // Check if the record was successfully updated
                if (i > 0) {
                    out.print("<div class='message success'>User record updated successfully.</div>");
                } else {
                    out.print("<div class='message error'>Error: Unable to update the user record.</div>");
                }
                
                // Close the connection
                con.close();
            } catch (Exception e) {
                out.print("<div class='message error'>Exception: " + e.getMessage() + "</div>");
                e.printStackTrace();
            }
        %>
        
        <center><a href="validadmin.jsp" class="back-button">Back to Home</a> </center>
    </div>
</body>
</html>
