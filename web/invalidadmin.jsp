<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Invalid Admin</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0; /* Light gray background */
            color: #333; /* Dark text color */
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            height: 100vh; /* Full viewport height */
            margin: 0; /* Remove default margin */
            text-align: center; /* Center text alignment */
        }

        h2 {
            color: #d9534f; /* Bootstrap danger color */
            margin-bottom: 20px; /* Space below the heading */
        }

        p {
            margin-bottom: 20px; /* Space below the paragraph */
            line-height: 1.5; /* Improve readability */
        }

        a {
            background-color: #007bff; /* Bootstrap primary color */
            color: white; /* White text */
            padding: 10px 15px; /* Padding around the link */
            border-radius: 5px; /* Rounded corners */
            text-decoration: none; /* Remove underline */
            transition: background-color 0.3s; /* Smooth transition for hover effect */
        }

        a:hover {
            background-color: #0056b3; /* Darker blue on hover */
        }
    </style>
</head>
<body>
    <h2>You are not allowed to create a new admin account.</h2>
    <p>Only one admin account is permitted. Please contact support for further assistance.</p>
    <a href="index.jsp">Go back to login page</a> <!-- Link to return to the login page -->
</body>
</html>
