<%@page import="java.util.*,java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Login Result</title>
    </head>
    <body>
        <%
        try {
            // Retrieve form parameters from the login form
            String username = request.getParameter("ANAME");
            String password = request.getParameter("PASS");

            // Ensure both username and password are provided
            if (username != null && password != null && !username.isEmpty() && !password.isEmpty()) {

                // Load MySQL JDBC driver
                Class.forName("com.mysql.jdbc.Driver");

                // Establish connection to the database
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/toydb", "root", "");

                // SQL query to retrieve the admin record from the 'ad' table
                String sql = "SELECT adminname, adminpass FROM ad WHERE adminname=? AND adminpass=?";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, username); // Bind the username parameter
                pst.setString(2, password); // Bind the password parameter

                ResultSet rs = pst.executeQuery();

                if (rs.next()) {
                    // If username and password match an existing admin record, redirect to validadmin.jsp
                    response.sendRedirect("validadmin.jsp");
                } else {
                    // If invalid credentials, redirect to invalidadmin.jsp
                    response.sendRedirect("invalidadmin.jsp");
                }

                // Close all resources
                rs.close();
                pst.close();
                con.close();
            } else {
                out.print("Please provide both username and password.");
            }
        } catch (Exception e) {
            out.print("Error: " + e.getMessage());
        }
        %>
    </body>
</html>
