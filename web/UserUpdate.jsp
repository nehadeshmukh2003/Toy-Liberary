<%-- 
    Document   : UserUpdate
    Created on : 16 Oct, 2024, 2:05:09 PM
    Author     : deshm
--%>
<%@page import="java.util.*,java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>User Update</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 20px;
        }
        h2 {
            text-align: center;
            color: #333;
        }
        form {
            background-color: white;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            max-width: 500px;
            margin: auto;
        }
        label {
            display: block;
            margin-bottom: 10px;
            font-weight: bold;
        }
        input[type="text"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 20px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        input[type="submit"] {
            background-color: #28a745;
            color: white;
            padding: 10px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            width: 100%;
        }
        input[type="submit"]:hover {
            background-color: #218838;
        }
        .error-message {
            color: red;
            text-align: center;
        }
    </style>
</head>
<body>
    <h2>User Update</h2>
    <center>
        <%
            try {
                // Get the 'username' parameter from the request
                String username = request.getParameter("username");

                // Check if the username is not null or empty
                if (username != null && !username.isEmpty()) {
                    // Load the MySQL JDBC driver
                    Class.forName("com.mysql.jdbc.Driver");
                    
                    // Establish a connection to the database
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/toydb", "root", "");
                    
                    // Create a statement object
                    Statement st = con.createStatement();
                    
                    // Execute a SQL query to get user data for the provided username
                    String sql = "SELECT * FROM users WHERE username = '" + username + "'";
                    ResultSet rs = st.executeQuery(sql);
                    
                    // Check if the result set has data
                    if (rs.next()) {
        %>
        <h2>Update User Data</h2>
        <form action="FinalUpdate.jsp" method="post">
            <!-- Display user data in the form fields -->
            <label for="Name">Name:</label>
            <input type="text" id="Name" name="Name" value="<%=rs.getString("name")%>" required />
            
            <label for="Address">Address:</label>
            <input type="text" id="Address" name="Address" value="<%=rs.getString("address")%>" required />
            
            <label for="Mobileno">Mobile No:</label>
            <input type="text" id="Mobileno" name="Mobileno" value="<%=rs.getString("mobile_no")%>" required />
            
            <label for="Email">Email:</label>
            <input type="text" id="Email" name="Email" value="<%=rs.getString("email")%>" required />
            
            <label for="Username">Username:</label>
            <input type="text" id="Username" name="Username" value="<%=rs.getString("username")%>" readonly />
            
            <label for="Password">Password:</label>
            <input type="text" id="Password" name="Password" value="<%=rs.getString("password")%>" required />
            
            <input type="submit" value="Update" />
        </form>
        <%
                    } else {
                        out.println("<h3 class='error-message'>No user found with the given username.</h3>");
                    }
                    
                    // Close the connection
                    con.close();
                } else {
                    out.println("<h3 class='error-message'>Invalid or missing username.</h3>");
                }
            } catch (Exception e) {
                out.println("<h3 class='error-message'>Error: " + e.getMessage() + "</h3>");
                e.printStackTrace();
            }
        %>
    </center>
</body>
</html>
