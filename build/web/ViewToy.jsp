<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>View Toys</title>
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
            width: 700px;
        }
        h2 {
            text-align: center;
            margin-bottom: 20px;
        }
        table {
            width: 100%;
            border-collapse: collapse;
        }
        table, th, td {
            border: 1px solid #ddd;
        }
        th, td {
            padding: 10px;
            text-align: center;
        }
        th {
            background-color: #28a745;
            color: white;
        }
        .btn-delete, .btn-update {
            padding: 5px 10px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
        .btn-delete {
            background-color: #dc3545;
            color: white;
        }
        .btn-update {
            background-color: #007bff;
            color: white;
        }
        .btn-delete:hover {
            background-color: #c82333;
        }
        .btn-update:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>

<div class="container">
    <h2>List of Toys</h2>
    <table>
        <thead>
            <tr>
                <th>Toy Name</th>
                <th>Toy Price</th>
                <th>Action</th>
                <th>Update</th>
            </tr>
        </thead>
        <tbody>
            <%
                // Database connection and retrieval of data
                try {
                    // Load JDBC driver and establish a connection
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/toydb", "root", "");

                    // Query to fetch all toys from the 'toy' table
                    String sql = "SELECT tname, tprice FROM toy";
                    Statement stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery(sql);

                    // Iterate through the result set and display data in table rows
                    while (rs.next()) {
                        String toyName = rs.getString("tname");
                        String toyPrice = rs.getString("tprice");
            %>
                        <tr>
                            <td><%= toyName %></td>
                            <td><%= toyPrice %></td>
                            <td>
                                <form action="DeleteToy.jsp" method="post" onsubmit="return confirm('Are you sure you want to delete this toy?');">
                                    <input type="hidden" name="tname" value="<%= toyName %>">
                                    <button type="submit" class="btn-delete">Delete</button>
                                </form>
                            </td>
                            <td>
                                <form action="UpdateToy.jsp" method="get">
                                    <input type="hidden" name="tname" value="<%= toyName %>">
                                    <input type="hidden" name="tprice" value="<%= toyPrice %>">
                                    <button type="submit" class="btn-update">Update</button>
                                </form>
                            </td>
                        </tr>
            <%
                    }

                    // Close the database connection
                    rs.close();
                    stmt.close();
                    con.close();
                } catch (Exception e) {
                    out.print("<div class='container'><h2>Error: " + e.getMessage() + "</h2></div>");
                }
            %>
        </tbody>
    </table>
</div>
<li><a href="validadmin.jsp">Back to home</a></li>

</body>
</html>
