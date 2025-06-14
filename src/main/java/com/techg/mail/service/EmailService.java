package com.techg.mail.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.internet.MimeMessage;

@Service
public class EmailService {

	@Autowired
	private JavaMailSender javaMailSender;

	public void sendEmail(String email, String name) {
		int otp = getOTP();
		MimeMessage mm = javaMailSender.createMimeMessage();
		MimeMessageHelper mmh = new MimeMessageHelper(mm);
		try {
			mmh.setTo(email);
			mmh.setSubject("Welcome to Tech With Gagan");
			mmh.setText(this.getHtml(name, otp), true);
			javaMailSender.send(mm);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private int getOTP() {
		int otp = 0;
		while (otp < 1000)
			otp = (int) (Math.random() * 10000);
		return otp;
	}

	private String getHtml(String name, int otp) {
		String s = "<!DOCTYPE html>\r\n" + "<html>\r\n" + "<head>\r\n"
				+ "    <title>Welcome to Tech With Gagan</title>\r\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
				+ "    <style>\r\n" + "        @media only screen and (max-width: 600px) {\r\n"
				+ "            .container {\r\n" + "                width: 90% !important;\r\n"
				+ "                padding: 20px !important;\r\n" + "            }\r\n" + "\r\n"
				+ "            .heading {\r\n" + "                font-size: 6vw !important;\r\n"
				+ "                padding: 4vw !important;\r\n" + "            }\r\n" + "\r\n"
				+ "            .button {\r\n" + "                font-size: 4vw !important;\r\n"
				+ "                padding: 3vw 6vw !important;\r\n" + "            }\r\n" + "\r\n"
				+ "            ul li {\r\n" + "                font-size: 4vw !important;\r\n" + "            }\r\n"
				+ "\r\n" + "            p {\r\n" + "                font-size: 4vw !important;\r\n"
				+ "            }\r\n" + "        }\r\n" + "    </style>\r\n" + "</head>\r\n"
				+ "<body style=\"font-family: Arial, sans-serif; margin: 0; padding: 40px; background: linear-gradient(to right, #ffecd2, #fcb69f);\">\r\n"
				+ "\r\n"
				+ "    <div class=\"container\" style=\"max-width: 600px; width: 100%; margin: auto; background-color: #ffffff; padding: 30px; border-radius: 15px; box-shadow: 0 8px 20px rgba(0,0,0,0.15);\">\r\n"
				+ "        \r\n" + "        <!-- Header -->\r\n"
				+ "        <h2 class=\"heading\" style=\"text-align: center; background: linear-gradient(to right, #ff416c, #ff4b2b); color: white; padding: 20px; border-radius: 10px; margin-top: 0; font-family: 'Segoe UI', sans-serif; font-weight: bold; font-size: 24px;\">\r\n"
				+ "            Welcome to Tech With Gagan\r\n" + "        </h2>\r\n" + "\r\n"
				+ "        <!-- Greeting -->\r\n"
				+ "        <p style=\"font-size: 16px; color: #333; margin-top: 20px;\">\r\n"
				+ "            Hey <strong style=\"color: black;\">" + name.toUpperCase() + "</strong>,\r\n"
				+ "        </p>\r\n" + "\r\n" + "        <!-- Message -->\r\n"
				+ "        <p style=\"font-size: 15px; color: #333;\">\r\n"
				+ "             Congratulations! You are now a part of <strong>Tech With Gagan</strong>.\r\n"
				+ "        </p>\r\n" + "\r\n" + "        <!-- OTP Section -->\r\n"
				+ "        <div style=\"background-color: #f7f7f7; padding: 15px; border-left: 5px solid #ff4b2b; margin: 20px 0; border-radius: 5px;\">\r\n"
				+ "            <p style=\"margin: 0; font-size: 16px;\"><strong>Your OTP:</strong> <span style=\"color: #ff4b2b; font-weight: bold;\">"
				+ otp + "</span></p>\r\n" + "        </div>\r\n" + "\r\n" + "        <!-- Question -->\r\n"
				+ "        <p style=\"margin-top: 20px; font-size: 15px; color: #333;\">\r\n"
				+ "             Do you want to become a very good Java Developer?\r\n" + "        </p>\r\n" + "\r\n"
				+ "        <p style=\"font-size: 15px; color: #333;\"> Then follow me on my YouTube channel!</p>\r\n"
				+ "\r\n" + "        <!-- Past Records -->\r\n" + "        <div style=\"margin-top: 25px;\">\r\n"
				+ "            <p style=\"font-weight: bold; color: #444;\"> Our Past Records:</p>\r\n"
				+ "            <ul style=\"padding-left: 20px; color: #222; line-height: 1.6;\">\r\n"
				+ "                <li><strong>2+ years</strong> of Teaching Experience</li>\r\n"
				+ "                <li><strong>50+</strong> Corporate Trainings</li>\r\n"
				+ "                <li><strong>5000+</strong> Happy Learners</li>\r\n" + "            </ul>\r\n"
				+ "        </div>\r\n" + "\r\n" + "        <!-- Subscribe Button -->\r\n"
				+ "        <div style=\"margin-top: 30px; text-align: center;\">\r\n"
				+ "            <a href=\"https://www.youtube.com/@tech-with-gagan\" target=\"_blank\" class=\"button\" style=\"display: inline-block; background: linear-gradient(to right, #ff416c, #ff4b2b); color: white; font-size: 16px; text-decoration: none; padding: 12px 30px; border-radius: 8px; transition: background 0.3s;\">\r\n"
				+ "                 Subscribe Now \r\n" + "            </a>\r\n" + "        </div>\r\n" + "\r\n"
				+ "        <!-- Footer -->\r\n"
				+ "        <p style=\"margin-top: 40px; font-size: 14px; color: #777; text-align: center;\">Made with love by Gagan</p>\r\n"
				+ "        <p style=\"font-size: 14px; color: #777; text-align: center;\">Thank you for joining!</p>\r\n"
				+ "    </div>\r\n" + "\r\n" + "</body>\r\n" + "</html>\r\n" + "";
		return s;
	}

}
