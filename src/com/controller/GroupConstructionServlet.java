package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Group;
import com.model.GroupDaoImplement;
import com.model.Person;
import com.model.PersonDaoImplement;
import com.model.User;

/**
 * Servlet implementation class GroupConstructionServlet
 */
@WebServlet("/view/GroupConstructionServlet")
public class GroupConstructionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=(String) request.getSession().getAttribute("username");
		System.out.println(username);
		String groupname= request.getParameter("newgroupname");
		System.out.println(groupname);
		GroupDaoImplement groupmanage = new GroupDaoImplement();
		PersonDaoImplement personDaoImplement = new PersonDaoImplement();
		Person person = new User(username,"user");
		Group group = new Group(groupname, person);
		if (personDaoImplement.isInGroup(person)){
			//if a user name is in database, it can not be created. show failed.
			
		}
		else {
			//then check whether in database then add
			if (groupmanage.isExistedGroupName(group)){
				//if group name is existed in database, it can not be added into database;
				
			}
			else{
				//add into database and return true;
			}
		}
		
	}

}
