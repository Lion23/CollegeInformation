package com.as.samples;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Sayfa1Action
 */
@WebServlet("/Sayfa1Action")
public class Sayfa1Action extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
    	
    	String username = request.getParameter("username");
		String surname = request.getParameter("surname");
		String telephone = request.getParameter("telephone");
		
		System.out.println("Öðrenci ismi: " +username);
		System.out.println("Öðrenci Soyismi: "+surname);
		System.out.println("Öðrenci Telefonu: "+telephone);
		
		request.getSession().setAttribute("username", username);
		request.getSession().setAttribute("surname", surname);
		request.getSession().setAttribute("telephone", telephone);
		
		response.sendRedirect("html/sayfa2.html");
		
		
		
	}

}
