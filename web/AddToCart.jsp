<%-- 
    Document   : AddToCart
    Created on : 4 Oct, 2024, 7:01:21 PM
    Author     : deshm
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <title>Add to Cart - Toy Library</title>
    <style>
            /* General body and font settings */
            body {
                font-family: Arial, sans-serif;
                margin: 0;
                padding: 0;
                background-color: #f0f0f0;
                min-height: 100vh;
                overflow-y: auto;
                color: #333;
            }

            /* Header styles */
            header {
                background-color: orange;
                color: white;
                padding: 20px;
                text-align: center;
            }

            header h1 {
                margin: 0;
            }

            /* Navbar styles */
            nav ul {
                list-style-type: none;
                padding: 0;
                background-color: orange;
                text-align: center;
            }

            nav ul li {
                display: inline;
                margin: 0 20px;
            }

            nav ul li a {
                color: white;
                text-decoration: none;
                font-weight: bold;
                font-size: 18px;
            }

            nav ul li a:hover {
                text-decoration: underline;
            }

            /* Main content */
            main {
                padding: 20px;
                max-width: 1200px;
                margin: 0 auto;
                display: flex;
                flex-direction: column;
                align-items: center;
            }

            main h2 {
                color: black;
            }

            .btn {
                background-color: yellow;
                color: black;
                padding: 10px 15px;
                text-decoration: none;
                border-radius: 5px;
            }

            .btn:hover {
                background-color: #e6e600;
            }

            /* Cart table */
            table {
                width: 50%;
                border-collapse: collapse;
                margin-top: 20px;
            }

            table, th, td {
                border: 1px solid #ccc;
            }

            th, td {
                padding: 10px;
                text-align: center;
            }

            th {
                background-color: #f4f4f4;
            }

            /* Footer */
            footer {
                background-color: pink;
                color: #333;
                text-align: center;
                padding: 10px 0;
                position: fixed;
                width: 100%;
                bottom: 0;
            }
        </style>

    <script>
        // JavaScript function to confirm toy removal
        function confirmRemove(toyName) {
            if (confirm('Are you sure you want to remove ' + toyName + ' from the cart?')) {
                window.location.href = 'AddToCart.jsp?removeToy=' + toyName;
            }
        }
    </script>
</head>
<body>
    <header>
        <h1>Your Cart</h1>
        <nav>
            <ul>
                <li><a href="CustomerHomepage.jsp">Home</a></li>
                
                <li><a href="AddToCart.jsp">Add to Cart</a></li>
                <li><a href="Subscription.jsp">Subscription</a></li>
                <li><a href="index.jsp">Logout</a></li>
            </ul>
        </nav>
    </header>

    <main>
        <h2>Toy Added to Cart</h2>

        <%
            // Initialize the cart in the session if it's not already present
            if (session.getAttribute("cart") == null) {
                session.setAttribute("cart", new String[5]);
            }

            // Retrieve the toy name from the query parameter and the cart from session
            String[] cart = (String[]) session.getAttribute("cart");
            String toyName = request.getParameter("toyName");
            String removeToy = request.getParameter("removeToy");

            // Add the toy to the cart if toyName is provided
            if (toyName != null) {
                boolean added = false;
                for (int i = 0; i < cart.length; i++) {
                    if (cart[i] == null) {
                        cart[i] = toyName;
                        added = true;
                        break;
                    }
                }
                if (!added) {
                    out.println("<h3>Your cart is full (max 5 toys).</h3>");
                }
            }

            // Remove the toy if removeToy is provided
            if (removeToy != null) {
                for (int i = 0; i < cart.length; i++) {
                    if (removeToy.equals(cart[i])) {
                        cart[i] = null;
                        break;
                    }
                }
            }

            // Update the session with the modified cart
            session.setAttribute("cart", cart);
        %>

        <!-- Display the cart in a table -->
        <table>
            <tr>
                <th>Toy Name</th>
                <th>Action</th>
               
            </tr>
            <%
                boolean cartEmpty = true;
                for (int i = 0; i < cart.length; i++) {
                    if (cart[i] != null) {
                        cartEmpty = false;
            %>
            <tr>
                <td><%= cart[i] %></td>
                <td><a href="javascript:void(0);" onclick="confirmRemove('<%= cart[i] %>')">Remove</a></td>
                
            </tr>
            <%
                    }
                }

                if (cartEmpty) {
            %>
            <tr>
                <td colspan="2">Your cart is empty.</td>
            </tr>
            <%
                }
            %>
        </table>

        <a href="CustomerHomepage.jsp" class="btn">Continue Shopping</a>
         <a href="GenerateReceipt.jsp" class="btn">Download Receipt</a>
    </main>

    <footer>
        <p>Thank you for using Toy Library!</p>
    </footer>
</body>
</html>
