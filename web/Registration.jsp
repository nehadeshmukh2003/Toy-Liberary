<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.*,java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Registration</title>
    
    <style>
        h1 {
            color: #4CAF50; /* Green color for heading */
            text-align: center;
        }
        button {
            background-color: #FF69B4; /* Pink color for button */
            color: white;
            padding: 15px 32px;
            font-size: 20px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
        button a {
            color: white;
            text-decoration: none;
        }
        button:hover {
            background-color: #FF1493; /* Darker pink on hover */
        }
        .logo {
            display: block;
            margin: 20px auto; /* Centers the image */
            max-width: 100%; /* Responsive image */
            height: auto; /* Maintain aspect ratio */
        }
    </style>

</head>
<body>     
    <%
        // Server-side: Inserting registration data into the 'users' table in 'toydb'
        
        // Check if form fields are not null (in case of validation bypass)
        try {
            String name = request.getParameter("name");
            String address = request.getParameter("address");
            String email = request.getParameter("email");
            String mobileno = request.getParameter("mobileno");
            String username = request.getParameter("username");
            String password = request.getParameter("password");

            // Input validation
            if (mobileno == null || mobileno.length() != 10 || !mobileno.matches("\\d+")) {
                throw new Exception("Invalid mobile number. Please enter a 10-digit mobile number.");
            }

            // Load JDBC driver and establish connection
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/toydb", "root", "");

            // Using PreparedStatement to avoid SQL injection and to handle string inputs safely
            String sql = "INSERT INTO users(name, address, mobile_no, email, username, password) VALUES(?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, address);
            ps.setString(3, mobileno);
            ps.setString(4, email);
            ps.setString(5, username);
            ps.setString(6, password);

            int result = ps.executeUpdate();

            if (result > 0) {
                // Store values in session attributes
                session.setAttribute("name", name);
                session.setAttribute("address", address);
                session.setAttribute("email", email);
                session.setAttribute("mobileno", mobileno);
                session.setAttribute("username", username);

                out.print("Data inserted successfully!!!!");
            } else {
                out.print("Failed to insert data.");
            }
            
            con.close();
        } catch (Exception e) {
            out.print("<br> Exception: " + e.getMessage());
        }
    %>
    
    <center>
        <h1>Welcome to Toy's Library</h1>
        <button><a href="CustomerHomepage.jsp">Homepage</a></button>
      
        <img src="image/img11.png" width="350" height="150" alt="img11"/>

    </center>
    
    <!-- User details are stored in session attributes here -->
</body>
</html>
