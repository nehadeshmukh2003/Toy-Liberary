<%-- 
    Document   : Subscription.jsp
    Created on : 4 Oct, 2024, 5:10:02 PM
    Author     : deshm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Subscription</title>
        <style>
            body {
                font-family: Arial, sans-serif;
                background-color: #f9f9f9;
                margin: 0;
                padding: 0;
            }
            .subscription-form {
                width: 300px;
                margin: 50px auto;
                padding: 20px;
                background-color: white;
                box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
                border-radius: 10px;
            }
            h2 {
                text-align: center;
                color: #4CAF50;
            }
            input[type="text"], input[type="submit"], select {
                width: 100%;
                padding: 10px;
                margin: 10px 0;
                border: 1px solid #ccc;
                border-radius: 5px;
            }
            input[type="submit"] {
                background-color: orange;
                color: white;
                border: none;
                cursor: pointer;
            }
            input[type="submit"]:hover {
                background-color: darkorange;
            }
            .error {
                color: red;
                font-size: 14px;
            }
            .price-display {
                text-align: center;
                font-size: 18px;
                margin-top: 20px;
                color: #333;
            }
        </style>
    </head>
    <body>
        <div class="subscription-form">
            <h2>Subscribe Now</h2>
            <form name="subscriptionForm" onsubmit="return validateForm()" method="post" action="CustomerHomepage.jsp">
                
                <!-- Card Number Field -->
                <label for="cardNo">Enter Card Number (Transaction ID):</label>
                <input type="text" id="cardNo" name="cardNo" required>
                <div class="error" id="cardError"></div>
                
                <!-- Subscription Options -->
                <label for="subscriptionDuration">Choose Subscription Duration:</label>
                <select id="subscriptionDuration" name="subscriptionDuration" onchange="updatePrice()">
                    <option value="">Select Duration</option>
                    <option value="1">1 Month - ₹500</option>
                    <option value="2">2 Months - ₹900</option>
                    <option value="3">3 Months - ₹1200</option>
                </select>
                <div class="error" id="durationError"></div>

                <!-- Price Display -->
                <div class="price-display" id="priceDisplay">Price: ₹0</div>

                <!-- Submit Button -->
                <input type="submit" value="Complete Subscription">
            </form>
        </div>

        <script>
            function validateForm() {
                var cardNo = document.getElementById("cardNo").value;
                
                var cardError = document.getElementById("cardError");
                var durationError = document.getElementById("durationError");
                var valid = true;

                // Clear previous error messages
                cardError.innerHTML = "";
                durationError.innerHTML = "";

                // Validate if card number is exactly 10 digits
                if (!/^\d{10}$/.test(cardNo)) {
                    cardError.innerHTML = "Transaction ID must be exactly 10 digits.";
                    valid = false;
                }

                // Validate if subscription duration is selected
                if (subscriptionDuration === "") {
                    durationError.innerHTML = "Please select a subscription duration.";
                    valid = false;
                }

                return valid; // Only submit the form if validation passes
            }

            function updatePrice() {
                var subscriptionDuration = document.getElementById("subscriptionDuration").value;
                var priceDisplay = document.getElementById("priceDisplay");

                var prices = {
                    "1": 500,
                    "2": 900,
                    "3": 1200
                };

        </script>
        
        <% 
        // Set the isSubscribed attribute to true after subscription is complete
        session.setAttribute("isSubscribed", true); 
        %>

    </body>
</html>


