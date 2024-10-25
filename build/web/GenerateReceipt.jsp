<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@page import="javax.sql.*"%>
<%@page import="java.util.*"%>

<!DOCTYPE html>
<html>
<head>
    <title>Receipt - Toy Library</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 20px;
        }
        h1, h3 {
            text-align: center;
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin-bottom: 20px;
        }
        table, th, td {
            border: 1px solid #000;
            padding: 10px;
            text-align: left;
        }
        .terms {
            margin-top: 20px;
            font-size: 14px;
        }
    </style>
</head>
<body>
    <h1>Toy Library Receipt</h1>

    <%
        // Database connection setup
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        String email = (String) session.getAttribute("email");

        try {
            // Load MySQL JDBC driver (adjust according to your DB setup)
            Class.forName("com.mysql.jdbc.Driver");
            
            // Establish connection (replace with your own connection details)
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/toydb", "root", "");
            
            // Query to fetch user details using email as the primary key
            String query = "SELECT name, address, email, mobile_no FROM users WHERE username = ?";
            pst = con.prepareStatement(query);
            pst.setString(1, email);
            rs = pst.executeQuery();

            String name = "", address = "", mobileNo = "";
            if (rs.next()) {
                name = rs.getString("name");
                address = rs.getString("address");
                mobileNo = rs.getString("mobile_no");
            }
        } catch (Exception e) {
            out.println("Error: " + e.getMessage());
        } finally {
            if (rs != null) try { rs.close(); } catch (SQLException e) {}
            if (pst != null) try { pst.close(); } catch (SQLException e) {}
            if (con != null) try { con.close(); } catch (SQLException e) {}
        }

        // Retrieve cart and toy prices
        String[] cart = (String[]) session.getAttribute("cart");
         Map<String, Integer> toyPrices = new HashMap<String, Integer>();
        toyPrices.put("Teddy Bear", 1500);
        toyPrices.put("Jeep", 3000);
        toyPrices.put("Electric cell car set", 2000);
        toyPrices.put("Helicopter", 1500);
        toyPrices.put("Robot set", 1000);
        toyPrices.put("Barbie House", 2300);
        toyPrices.put("Remote Control Car", 670);
        toyPrices.put("Hot Wheels", 900);

        int totalAmount = 0;
    %>

    <!-- Display customer details -->
    <h3>Customer Details</h3>
    <p>Name: <%=rs.getString("name")%></p>
    <p>Address: <%=rs.getString("address")%></p>
    <p>Email: <%=rs.getString("email")%></p>
    <p>Mobile No: <%=rs.getString("mobile_no")%></p>

    <!-- Display cart and calculate total -->
    <h3>Toys in Your Cart</h3>
    <table>
        <tr>
            <th>Toy Name</th>
            <th>Price</th>
        </tr>
        <%
            for (int i = 0; i < cart.length; i++) {
                if (cart[i] != null) {
                    totalAmount += toyPrices.get(cart[i]);
        %>
        <tr>
            <td><%= cart[i] %></td>
            <td><%= toyPrices.get(cart[i]) %></td>
        </tr>
        <%
                }
            }
        %>
    </table>

    <!-- Display total amount -->
    <h3>Total Amount: <%= totalAmount %> </h3>

    <!-- Footer with terms and conditions -->
    <div class="terms">
        <p>Thank you for using Toy Library! Please make the payment at the counter.</p>
    </div>

</body>
</html>
