package com.techg.mail.content;

import org.springframework.stereotype.Service;

@Service
public class ContentLibrary {
	
	public String getLandingPage() {
		return """
				<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tech With Gagan</title>
    <style>
        body {
            margin: 0;
            padding: 0;
            font-family: Arial, sans-serif;
            background: linear-gradient(135deg, #7F00FF, #FF00FF);
            color: white;
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            height: 100vh;
            text-align: center;
        }

        h1, h2 {
            margin: 0.5rem;
        }

        .content {
            max-width: 90%;
            padding: 20px;
            background: rgba(0, 0, 0, 0.5);
            border-radius: 10px;
            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.5);
        }

        .call-to-action {
            background-color: #ff9900;
            padding: 12px 30px;
            font-size: 1.5rem;
            color: white;
            border: none;
            cursor: pointer;
            border-radius: 5px;
            transition: background-color 0.3s;
            text-decoration: none;
            display: inline-block;
        }

        .call-to-action:hover {
            background-color: #ff6600;
        }

        .info-text {
            margin: 20px 0;
            font-size: 1.2rem;
            line-height: 1.6;
        }

        .footer {
            position: absolute;
            bottom: 20px;
            font-size: 1rem;
            color: rgba(255, 255, 255, 0.7);
            width: 100%;
            text-align: center;
        }

        .footer a {
            color: white;
            text-decoration: none;
        }

        .footer a:hover {
            text-decoration: underline;
        }

        /* Responsive Styles */
        @media (max-width: 768px) {
            h1 {
                font-size: 6vw;
            }

            h2 {
                font-size: 4vw;
            }

            .info-text {
                font-size: 1rem;
            }

            .call-to-action {
                font-size: 1.2rem;
                padding: 10px 25px;
            }

            .footer {
                font-size: 1.1rem;
            }
        }

        @media (max-width: 480px) {
            h1 {
                font-size: 8vw;
            }

            h2 {
                font-size: 5vw;
            }

            .info-text {
                font-size: 0.9rem;
            }

            .call-to-action {
                font-size: 1rem;
                padding: 8px 20px;
            }

            .content {
                padding: 15px;
                max-width: 83%;
            }

            .footer {
                font-size: 1rem;
                bottom: 10px; /* Slightly adjust the footer position */
            }
        }
    </style>
</head>
<body>
    <div class="content">
        <h1>Welcome to Tech With Gagan</h1>
        <h2>Your Gateway to Learning Java Development with Spring Boot</h2>

        <p class="info-text">
            Join my YouTube channel to get exclusive access to tutorials on Spring Boot, Java development, 
            and much more. Whether you're just starting out or want to advance your skills, this is the place 
            to learn in a structured and easy-to-understand manner.
        </p>

        <p class="info-text">
            Subscribe now and start learning how to create powerful, enterprise-level applications with Java and 
            Spring Boot. You'll gain hands-on experience through step-by-step lessons and projects designed to 
            enhance your skills.
        </p>

        <a href="reg" class="call-to-action">
            Subscribe to Tech With Gagan
        </a>
    </div>

    <div class="footer">
        <p>Copyright © 2025 <a href="#" target="_blank">Tech With Gagan</a>. All rights reserved.</p>
    </div>
</body>
</html>

				""";
	}

	public String getRegistrationPage() {
		return 
"""
				<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Email Subscription</title>
    <style>
        body {
            margin: 0;
            padding: 0;
            font-family: Arial, sans-serif;
            background: linear-gradient(135deg, #7F00FF, #FF00FF); /* Gradient Background */
            color: white;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .form-container {
            background-color: white;
            padding: 30px;
            border-radius: 8px;
            max-width: 500px;
            width: 100%;
            box-shadow: 0 0 15px rgba(0,0,0,0.1);
        }

        h2 {
            text-align: center;
            color: #333;
            margin-bottom: 20px;
        }

        form {
            display: flex;
            flex-direction: column;
        }

        label {
            font-size: 1rem;
            margin-bottom: 5px;
            color: #333;
        }

        input, select, button {
            padding: 10px;
            margin-bottom: 20px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }

        input[type="submit"] {
            background: linear-gradient(45deg, #FF007F, #FF7F00, #FF00FF);
            color: white;
            cursor: pointer;
            border: none;
            font-size: 1rem;
            font-weight: bold;
            transition: background 0.3s ease, transform 0.2s ease;
        }

        input[type="submit"]:hover {
            background: linear-gradient(45deg, #FF7F00, #FF00FF, #FF007F);
            transform: scale(1.05); /* Slight scaling effect when hovered */
        }

        select {
            background-color: white;
        }

        .form-footer {
            text-align: center;
            font-size: 0.9rem;
            color: #777;
        }

        /* Gender Section Styling */
        .gender-group {
            display: flex;
            gap: 15px;
            margin-bottom: 20px;
        }

        .gender-group input {
            display: none; /* Hide the default radio buttons */
        }

        .gender-group label {
            display: flex;
            align-items: center;
            cursor: pointer;
            padding: 10px;
            background-color: #f0f0f0;
            border-radius: 4px;
            transition: background-color 0.3s ease;
        }

        .gender-group input:checked + label {
            background-color: #28a745;
            color: white;
        }

        .gender-group label:hover {
            background-color: #ddd;
        }

        /* Responsive Design */
        @media (max-width: 600px) {
            .form-container {
                padding: 20px;
                max-width: 90%;
            }

            h2 {
                font-size: 1.5rem;
            }

            input, select, button {
                font-size: 1rem;
                padding: 8px;
            }

            .gender-group {
                flex-direction: column;
            }
        }
    </style>
</head>
<body>

    <div class="form-container">
        <h2>Enter Your Details</h2>
        
        <form action="email" method="GET">
            
            <label for="name">Name:</label>
            <input type="text" id="name" name="name" required>
            
            <label for="email">Email Address:</label>
            <input type="email" id="email" name="email" required>
            
            <label for="phone">Phone Number:</label>
            <input type="tel" id="phone" name="phone" required pattern="[0-9]{10}" placeholder="123-456-7890">
            
            <label for="dob">Date of Birth:</label>
            <input type="date" id="dob" name="dob" required>
            
            <label>Gender:</label>
            <div class="gender-group">
                <input type="radio" id="male" value="male" name="gender">
                <label for="male">Male</label>

                <input type="radio" id="female" value="female" name="gender">
                <label for="female">Female</label>
            </div>
            
            <button type="submit">Submit</button>
        </form>
    </div>

</body>
</html>

""";
	}

	public String getMailSentPage() {
		return
"""
				<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Email Sent Successfully</title>
    <style>
        body {
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
            background: linear-gradient(135deg, #57C785, #28a745); /* Gradient background */
            color: white;
            font-family: Arial, sans-serif;
            text-align: center;
        }

        h1 {
            font-size: 5vw;
            margin: 0.5rem;
            font-weight: bold;
        }

        h2 {
            font-size: 3vw;
            margin: 0.5rem;
        }

        .success-icon {
            font-size: 6rem;
            margin-bottom: 20px;
            color: #fff;
        }

        .message-box {
            background: rgba(0, 0, 0, 0.6); /* Darker background to contrast the gradient */
            padding: 40px 20px;
            border-radius: 10px;
            max-width: 600px;
            width: 90%; /* Set max-width and width to allow scaling */
            box-shadow: 0 4px 20px rgba(0, 0, 0, 0.3);
        }

        .footer {
            margin-top: 20px;
            font-size: 1rem;
            color: rgba(255, 255, 255, 0.7);
        }

        .footer a {
            color: white;
            text-decoration: none;
        }

        .footer a:hover {
            text-decoration: underline;
        }

        /* Responsive design */
        @media (max-width: 768px) {
            h1 {
                font-size: 8vw;
            }

            h2 {
                font-size: 4vw;
            }

            .success-icon {
                font-size: 5rem;
            }

            .message-box {
                padding: 30px 20px;
            }

            .footer {
                font-size: 1.1rem;
            }
        }

        @media (max-width: 480px) {
            h1 {
                font-size: 10vw;
            }

            h2 {
                font-size: 5vw;
            }

            .success-icon {
                font-size: 4rem;
            }

            .message-box {
                padding: 20px 15px;
            }

            .footer {
                font-size: 1rem;
            }
        }
    </style>
</head>
<body>

    <div class="message-box">
        <div class="success-icon">✔️</div>
        <h1>Email Sent Successfully!</h1>
        <h2>Check Your Email</h2>
        <h2>For OTP</h2>
    </div>

    <div class="footer">
        <p>Need help? <a href="https://www.youtube.com/@tech-with-gagan">Contact us</a></p>
    </div>

</body>
</html>
							
""";
	}
	
	
}
