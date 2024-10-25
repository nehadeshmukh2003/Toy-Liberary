<%-- 
    Document   : Profile.jsp
    Created on : 4 Oct, 2024, 4:45:44 PM
    Author     : deshm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
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

        /* Box styles */
        .box {
            background-color: white;
            padding: 20px;
            margin: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            width: 300px;
            text-align: center;
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
</head>
<body>
    <header>
        <h1>Welcome to Toy Library</h1>
        <nav>
            <ul>
                 <li><a href="CustomerHomepage.jsp">Home</a></li>
                <li><a href="Profile.jsp">Profile</a></li> <!-- Add profile link -->
                <li><a href="AddToCart.jsp">Add to Cart</a></li>
                <li><a href="Subscription.jsp">Subscription</a></li>
                <li><a href="index.jsp">Logout</a></li>
            </ul>
        </nav>
    </header>

    <main>
        <section id="profile-section">
            <h2>Your Profile</h2>
            <div class="box">
                <p><strong>Name:</strong> <%= session.getAttribute("name") != null ? session.getAttribute("name") : "Not set" %></p>
                <p><strong>Address:</strong> <%= session.getAttribute("address") != null ? session.getAttribute("address") : "Not set" %></p>
                <p><strong>Email:</strong> <%= session.getAttribute("email") != null ? session.getAttribute("email") : "Not set" %></p>
                <p><strong>Mobile No:</strong> <%= session.getAttribute("mobileno") != null ? session.getAttribute("mobileno") : "Not set" %></p>
                <p><strong>Username:</strong> <%= session.getAttribute("username") != null ? session.getAttribute("username") : "Not set" %></p>
            </div>
        </section>
    </main>
            
            
    

    <footer>
        <p>Explore our wide range of toys and enjoy your rentals!!</p>
    </footer>
</body>
</html>
