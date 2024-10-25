<%@ page session="true" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Dashboard - Toy Library</title>
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

        /* Description about the Toy Library */
        .description {
            text-align: center;
            margin: 20px 0;
            font-size: 18px;
            color: #555;
            max-width: 800px;
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
            transition: transform 0.2s;
        }

        .box:hover {
            transform: scale(1.05);
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

        /* Logout button */
        .logout-btn {
            position: absolute;
            top: 20px;
            right: 20px;
            background-color: red;
            color: white;
            padding: 10px 15px;
            text-decoration: none;
            border-radius: 5px;
        }

        .logout-btn:hover {
            background-color: darkred;
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

        /* Flexbox for layout */
        .box-container {
            display: flex;
            justify-content: space-around;
            flex-wrap: wrap;
            margin-top: 20px;
        }

        /* Responsive Design */
        @media (max-width: 768px) {
            .box-container {
                flex-direction: column;
                align-items: center;
            }

            .box {
                width: 80%; /* Responsive width for small screens */
            }
        }
    </style>
</head>

<body>
    <header>
        <h1>Welcome to Toy Library</h1>
        <a href="index.jsp" class="logout-btn">Logout</a> <!-- Logout button -->
    </header>

    <main>
        <div class="description">
            <p>Welcome to the Toy Library! Here, you can manage toys efficiently, add new toys for rental, and view customer data. Enjoy a seamless experience in managing our extensive toy collection!</p>
        </div>

        <div class="box-container">
            <div class="box">
                <h2>Add Toy</h2>
                <p>Quickly add new toys to the library.</p>
                <a href="AdminAddToy.html" class="btn">Go to Add Toy</a>
            </div>
            <div class="box">
                <h2>View Toy</h2>
                <p>View and manage all toys in the library.</p>
                <a href="ViewToy.jsp" class="btn">Go to View Toy</a>
            </div>
            <div class="box">
                <h2>All User Data</h2>
                <p>Access data for all registered users.</p>
                <a href="AllCustomer.jsp" class="btn">View Users</a>
            </div>
        </div>
    </main>

    <footer>
        <p>Explore our wide range of toys and enjoy your rentals!</p>
    </footer>
</body>
</html>
