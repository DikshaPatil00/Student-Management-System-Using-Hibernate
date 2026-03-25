package com.web;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entityOJO.Student;
import com.util.Hibernetutils;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/list")
public class STUDENTlistservlet extends HttpServlet {

	@SuppressWarnings("deprecation")
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		SessionFactory sessionFactory = Hibernetutils.getSessionFactory();
    	Session session = sessionFactory.openSession();
    	List<Student> list = null;
		 
	    try {
			
	    	Criteria criteria= session.createCriteria(Student.class);
			list = criteria.list();
			
	    	
		} catch (Exception e) {
			System.out.println("There is problem while fetching database");
		}finally {
			session.close();
		}
		
	    if(list!=null){
	    	req.setAttribute("data",list);
	    }
	    
		RequestDispatcher rd = req.getRequestDispatcher("studentlist.jsp");
		rd.forward(req, resp);
	}

}
