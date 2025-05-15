package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {
	
	@GetMapping
	public String hello() {
		return  "    <style>\n"
				+ "        body {\n"
				+ "            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;\n"
				+ "            background-color: #f4f4f4;\n"
				+ "            display: flex;\n"
				+ "            justify-content: center;\n"
				+ "            align-items: center;\n"
				+ "            min-height: 100vh;\n"
				+ "            margin: 0;\n"
				+ "        }\n"
				+ "\n"
				+ "        .container {\n"
				+ "            background-color: #fff;\n"
				+ "            border-radius: 12px;\n"
				+ "            box-shadow: 0 8px 16px rgba(0, 0, 0, 0.1);\n"
				+ "            padding: 40px 60px;\n"
				+ "            text-align: center;\n"
				+ "        }\n"
				+ "\n"
				+ "        h1 {\n"
				+ "            color: #3498db;\n"
				+ "            font-size: 3.5em;\n"
				+ "            margin-bottom: 20px;\n"
				+ "            text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.05);\n"
				+ "        }\n"
				+ "\n"
				+ "        p {\n"
				+ "            color: #555;\n"
				+ "            font-size: 1.2em;\n"
				+ "            margin-top: 0;\n"
				+ "        }\n"
				+ "\n"
				+ "        .highlight {\n"
				+ "            color: #2ecc71;\n"
				+ "            font-weight: bold;\n"
				+ "        }\n"
				+ "\n"
				+ "        .animation {\n"
				+ "            animation: pulse 1.5s infinite alternate;\n"
				+ "        }\n"
				+ "\n"
				+ "        @keyframes pulse {\n"
				+ "            0% {\n"
				+ "                transform: scale(1);\n"
				+ "                opacity: 0.8;\n"
				+ "            }\n"
				+ "            100% {\n"
				+ "                transform: scale(1.05);\n"
				+ "                opacity: 1;\n"
				+ "            }\n"
				+ "        }\n"
				+ "    </style>    <div class=\"container animation\">\n"
				+ "        <h1>Olá, Mundo!</h1>\n"
				+ "        <p>Este é um <span class=\"highlight\">Hello World</span> com um toque especial de estilo.</p>\n"
				+ "    </div>";
	}
}
