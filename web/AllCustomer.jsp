<%-- 
    Document   : AllCustomer.jsp
    Created on : 16 Oct, 2024, 9:09:04 AM
    Author     : deshm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*, java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>All Customer Data</title>
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
            table {
                width: 100%;
                border-collapse: collapse;
                margin-top: 20px;
            }
            th, td {
                border: 1px solid #ddd;
                padding: 12px;
                text-align: left;
            }
            th {
                background-color: #28a745;
                color: white;
            }
            tr:nth-child(even) {
                background-color: #f2f2f2;
            }
            tr:hover {
                background-color: #ddd;
            }
            a {
                color: #007bff;
                text-decoration: none;
            }
            a:hover {
                text-decoration: underline;
            }
            .container {
                max-width: 800px;
                margin: auto;
                background-color: white;
                padding: 20px;
                border-radius: 8px;
                box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            }
        </style>
    </head>
    <body>

        <div class="container">
            <%
            try {
                ResultSet rs = null;
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/toydb", "root", "");
                Statement st = con.createStatement();
                String sql = "SELECT * FROM users";
                rs = st.executeQuery(sql);
            %>
            
            <h2>User Data</h2>
            <table>
                <thead>
                    <tr>
                        <th>Name</th>
                        <th>Address</th>
                        <th>Mobile No</th>
                        <th>Email</th>
                        <th>Username</th>
                        <th>Password</th>
                        <th>Update Record</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                    while (rs.next()) {
                    %>
                        <tr>
                            <td><%= rs.getString("name") %></td>
                            <td><%= rs.getString("address") %></td>
                            <td><%= rs.getString("mobile_no") %></td>
                            <td><%= rs.getString("email") %></td>
                            <td><%= rs.getString("username") %></td>
                            <td><%= rs.getString("password") %></td>
                            <td><a href="UserUpdate.jsp?username=<%= rs.getString("username") %>">Update Info</a></td>
                        </tr>
                    <%
                    }
                    %>
                </tbody>
            </table>
            <%
                con.close();
            } catch (Exception e) {
                System.out.print(e);
            }
            %>
        </div>
    <center> <a href="validadmin.jsp">Back to View Toys</a></center>
    </body>
</html>
