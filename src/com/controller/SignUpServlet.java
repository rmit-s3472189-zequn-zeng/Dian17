package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Person;
import com.model.PersonDaoImplement;
import com.model.User;

/**
 * Servlet implementation class SignUpServlet
 */
@WebServlet("/view/SignUpServlet")
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//user name ==> phone number
		String username= request.getParameter("username");
		String password = request.getParameter("password");
		Person newPerson = new User(username,password,"user");
		PersonDaoImplement personDao=new PersonDaoImplement();
		if (personDao.isExistedPerson(newPerson)){
			System.out.println("Sign up failed");
		}
		else{
			System.out.println("Sign up successfully");
			//Then add new person into data base
		}
	}

}
