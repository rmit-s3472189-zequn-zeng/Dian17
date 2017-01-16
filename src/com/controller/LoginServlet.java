package com.controller;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;
import javax.xml.ws.Response;

import com.model.PersonDaoImplement;
import com.model.JDBCUtils;
import com.model.Person;
import com.model.User;
import com.sun.corba.se.spi.activation.Repository;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/view/LoginServlet")
public class LoginServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password=request.getParameter("password");
		HttpSession session=request.getSession();
		User person = new User(username,password,"user");
		if (session.getAttribute("username")==null){
			if (person.verifyPassword()){
				session.setAttribute("username", username);
				session.setMaxInactiveInterval(30);
				request.setAttribute("sessionid", session.getId());			
				request.getRequestDispatcher("/view/user.jsp").forward(request, response);
			}
			else {
				System.out.println(" Login failed");
			}
					
		}
		else {
			response.sendRedirect(request.getContextPath()+"/index.html");
		}
	}

}
