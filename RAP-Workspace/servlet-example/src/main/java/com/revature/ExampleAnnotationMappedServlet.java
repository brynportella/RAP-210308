package com.revature;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/")
public class ExampleAnnotationMappedServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// set the content type as plain text
    	resp.setContentType("text/plain");
            
        PrintWriter out = resp.getWriter();
        out.println("Hello World mapped from Annotation");  // writes a plain text to the response object
	}
	
}
