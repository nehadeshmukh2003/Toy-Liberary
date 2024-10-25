<%-- 
    Document   : CustomerHomepage.jsp
    Created on : 4 Oct, 2024, 4:43:18 PM
    Author     : deshm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Homepage - Toy Library</title>

        <!-- Embedded CSS -->
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

            /* Search bar styles */
            #search-bar {
                text-align: center;
                margin: 10px 0;
            }

            #search-bar input[type="text"] {
                width: 300px;
                padding: 10px;
                border-radius: 5px;
                border: 1px solid #ccc;
                font-size: 16px;
            }

            #search-bar button {
                padding: 10px 15px;
                background-color: yellow;
                border: none;
                color: black;
                font-size: 16px;
                border-radius: 5px;
                cursor: pointer;
            }

            #search-bar button:hover {
                background-color: #e6e600;
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
            main h1 {
                color: #4CAF50;
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

            /* Different colors for each box */
            #subscription-section {
                background-color: #e3f2fd;
            }

            #browse-toys {
                background-color: #e3f2fd;
            }

            #rental-history {
                background-color: #e3f2fd;
            }

            /* Button styles */
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

            /* Responsive Design */
            @media (max-width: 768px) {
                nav ul li {
                    display: block;
                    margin: 10px 0;
                }
                main {
                    flex-direction: column;
                    align-items: center;
                }
            }

            /* Flexbox for layout */
            .box-container {
                display: flex;
                justify-content: space-around;
                flex-wrap: wrap;
                margin-top: 20px;
            }

            /* Toy image styles */
            .toy-box {
                background-color: #fff;
                padding: 10px;
                margin: 10px;
                border-radius: 8px;
                box-shadow: 0 0 5px rgba(0, 0, 0, 0.1);
                width: 250px;
                text-align: center;
            }

            .toy-box img {
                max-width: 60%;
                height: 50%;
                border-radius: 8px;
            }

            .toy-box h3 {
                margin: 10px 0;
            }

            .toy-box p {
                color: #777;
            }

        </style>
    </head>
    <body>
        <header>
            <h1>Welcome to Toy Library</h1>
            <nav>
                <ul>
                
                <li><a href="AddToCart.jsp">Add to Cart</a></li>
                <li><a href="Subscription.jsp">Subscription</a></li>
                <li><a href="index.jsp">Logout</a></li>
            </ul>
            </nav>
        </header>

        
       <main>
            <section id="welcome-section">
                <h1><center>Hello Users!!!</center><br>for get rented the toys first register <br></h1>
               
            </section>

            <!-- Toys section -->
            <section id="toy-section">
                <center><h2>Available Toys</h2></center>
                <div class="box-container">
                    <!-- Toy 1 -->
                    <div class="toy-box">
                        <img src="image/toy1.jpg" alt="toy 1"><br><br>
                        <h3>Teddy Bear</h3>
                         <p>Price: 1000</p>
                        <a href="AddToCart.jsp?toyName=Teddy Bear" class="btn" <% if (session.getAttribute("isSubscribed") == null || !((Boolean) session.getAttribute("isSubscribed"))) { %> 
    disabled 
<% } %>>Add to cart</a>
                    </div>

                    <!-- Toy 2 -->
                    <div class="toy-box">
                        <img src="image/toy2.jpg" alt="toy 2"><br><br>
                        <h3>Jeep</h3>
                         <p>Price: 3000</p>
                      
                       <a href="AddToCart.jsp?toyName=Jeep" class="btn" <% if (session.getAttribute("isSubscribed") == null || !((Boolean) session.getAttribute("isSubscribed"))) { %> 
                        disabled 
                     <% } %>>Add to cart</a>
                    </div>

                    <!-- Toy 3 -->
                    <div class="toy-box">
                        <img src="image/toy3.jpg" alt="toy 3"><br><br>
                        <h3>Electric cell car set</h3>
                        <p>Price: 2000</p>
                        <a href="AddToCart.jsp?toyName=Electric cell car set" class="btn" <% if (session.getAttribute("isSubscribed") == null || !((Boolean) session.getAttribute("isSubscribed"))) { %> 
    disabled 
<% } %>>Add to cart</a>
                    </div>
                    <!-- Toy 4 -->
                   <div class="toy-box">
                        <img src="image/toy4.jpg" alt="toy 4"><br><br>
                        <h3>Helicopter </h3>
                         <p>Price: 1500</p>
                        <a href="AddToCart.jsp?toyName=Helicopter" class="btn" <% if (session.getAttribute("isSubscribed") == null || !((Boolean) session.getAttribute("isSubscribed"))) { %> 
    disabled 
<% } %>>Add to cart</a>
                    </div>
                    <!-- Toy 5 -->
                    <div class="toy-box">
                        <img src="image/toy5.jpg" alt="Toy 5">
                        <h3>Robot set</h3><br>
                        <p>Price: 1000</p>
                        <a href="AddToCart.jsp?toyName=Robot set" class="btn" <% if (session.getAttribute("isSubscribed") == null || !((Boolean) session.getAttribute("isSubscribed"))) { %> 
    disabled 
<% } %>>Add to cart</a>
                    </div>
                    <!-- Toy 6 -->
                    <div class="toy-box">
                        <img src="image/toy6.jpg" alt="toy 6">
                        <h3>Barbie House</h3><br>
                         <p>Price: 2300</p>
                        <a href="AddToCart.jsp?toyName=Barbie House" class="btn" <% if (session.getAttribute("isSubscribed") == null || !((Boolean) session.getAttribute("isSubscribed"))) { %> 
    disabled 
<% } %>>Add to cart</a>
                    </div>
                    <!-- Toy 7 -->
                    <div class="toy-box">
                        <img src="image/toy7.jpg" alt="toy 7">
                        <h3>Remote Control Car</h3><br>
                        <p>Price: 670</p>
                        <a href="AddToCart.jsp?toyName=Remote Control Car" class="btn" <% if (session.getAttribute("isSubscribed") == null || !((Boolean) session.getAttribute("isSubscribed"))) { %> 
    disabled 
<% } %>>Add to cart</a>
                    </div>
                    <!-- Toy 8 -->
                    <div class="toy-box">
                        <img src="image/toy8.jpg" alt="toy 8"><br>
                        <h3>Hot Wheels</h3><br>
                        <p>Price: 900</p>
                        <a href="AddToCart.jsp?toyName=Hot Wheels" class="btn" <% if (session.getAttribute("isSubscribed") == null || !((Boolean) session.getAttribute("isSubscribed"))) { %> 
    disabled 
<% } %>>Add to cart</a>
                    </div>

                   
                    <!-- Add more toy boxes as needed -->
                </div>
            </section>
            <p>
                <br><br><br><br>
                
            </p>
        </main>

        <footer>
            <p>Explore our wide range of toys and enjoy your rentals!!</p>
        </footer>
        <script>
        // JavaScript to retrieve session values and populate the spans
        document.getElementById("nameSpan").innerText = "<%= session.getAttribute("name") %>";
        document.getElementById("addressSpan").innerText = "<%= session.getAttribute("address") %>";
        document.getElementById("emailSpan").innerText = "<%= session.getAttribute("email") %>";
        document.getElementById("mobileSpan").innerText = "<%= session.getAttribute("mobileno") %>";
        document.getElementById("usernameSpan").innerText = "<%= session.getAttribute("username") %>";
        
        
    </script>
    
    
    
    <%
        session.setAttribute("name", request.getParameter("name"));
        session.setAttribute("address", request.getParameter("address"));
        session.setAttribute("email", request.getParameter("email"));
        session.setAttribute("mobileno", request.getParameter("mobileno"));
        session.setAttribute("username", request.getParameter("username"));
        session.setAttribute("password", request.getParameter("password")); 
    %>
    </body>
</html>


