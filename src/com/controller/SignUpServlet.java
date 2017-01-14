package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
		String username= request.getParameter("newUsername");
		String password = request.getParameter("password");
		Person newPerson = new User(username,password,"user");
		PersonDaoImplement personDao=new PersonDaoImplement();
		if (personDao.findPerson(newPerson)){
			request.setAttribute("result", "Sorry! Username is existed in system!");
			request.setAttribute("username", username);
			System.out.println(username);
			request.getRequestDispatcher("/view/signuppage.jsp").forward(request, response);
		}
		else{
			// add into database
			PersonDaoImplement createPersonDao=new PersonDaoImplement();
			Person person = new User(username,password,"user");
			createPersonDao.addPerson(person);
			HttpSession session=request.getSession();
			session.setAttribute("username", username);
			session.setMaxInactiveInterval(30);
			request.setAttribute("sessionid", session.getId());	
			request.getRequestDispatcher("/view/user.jsp").forward(request, response);
		}
	}

}
