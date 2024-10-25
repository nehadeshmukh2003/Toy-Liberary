<%-- 
    Document   : index.jsp
    Created on : 4 Oct, 2024, 4:18:03 PM
    Author     : deshm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                    <li><a href="Adminlogin.html">Admin Login</a></li>
                    <li><a href="Registration.html">User Login</a></li>
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
                        <a href="ToyDetails.jsp?id=1" class="btn">Add to cart</a>
                    </div>

                    <!-- Toy 2 -->
                    <div class="toy-box">
                        <img src="image/toy2.jpg" alt="toy 2"><br><br>
                        <h3>Jeep</h3>
                      
                        <a href="ToyDetails.jsp?id=2" class="btn">Add to cart</a>
                    </div>

                    <!-- Toy 3 -->
                    <div class="toy-box">
                        <img src="image/toy3.jpg" alt="toy 3"><br><br>
                        <h3>Electric cell car set</h3>
                       
                        <a href="ToyDetails.jsp?id=3" class="btn">Add to cart</a>
                    </div>
                   <div class="toy-box">
                        <img src="image/toy4.jpg" alt="toy 4"><br><br>
                        <h3>Helicopter </h3>
                        <a href="ToyDetails.jsp?id=3" class="btn">Add to cart</a>
                    </div>
                    <div class="toy-box">
                        <img src="image/toy5.jpg" alt="Toy 5">
                        <h3>Robot set</h3><br>
                       
                        <a href="ToyDetails.jsp?id=3" class="btn">Add to cart</a>
                    </div>
                    <div class="toy-box">
                        <img src="image/toy6.jpg" alt="toy 6">
                        <h3>Barbie House</h3><br>
                        
                        <a href="ToyDetails.jsp?id=3" class="btn">Add to cart</a>
                    </div>
                    <div class="toy-box">
                        <img src="image/toy7.jpg" alt="toy 7">
                        <h3>Remote Control Car</h3><br>
                       
                        <a href="ToyDetails.jsp?id=3" class="btn">Add to cart</a>
                    </div>

                    <div class="toy-box">
                        <img src="image/toy8.jpg" alt="toy 8"><br>
                        <h3>Hot Wheels</h3><br>
                       
                        <a href="ToyDetails.jsp?id=3" class="btn">Add to cart</a>
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
    </body>
</html>


