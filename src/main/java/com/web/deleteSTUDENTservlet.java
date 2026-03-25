package com.web;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.entityOJO.Student;
import com.util.Hibernetutils;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/delete")
public class deleteSTUDENTservlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int sid = Integer.parseInt(req.getParameter("id"));
		
		Student s = null;
		
		SessionFactory sessionFactory = Hibernetutils.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
	    try {
			
	    	s=session.get(Student.class, sid);
	    	
		} catch (Exception e) {
			System.out.println("There is problem while fetching database");
		}finally {
			
		}session.close();
		
	    if(s !=null){
			req.setAttribute("obj" , s);
		}
		
		RequestDispatcher rd = req.getRequestDispatcher("delete.jsp");
		rd.forward(req, resp);
		
		}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int sid = Integer.parseInt(req.getParameter("id")); 
		Student s =null;
		SessionFactory sessionFactory = Hibernetutils.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		try {
			s = session.get(Student.class, sid);
			
			session.delete(s);
			
			transaction.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("There is problem in deleting object..");
		}finally {
			session.close();
		}
         resp.sendRedirect("list");
	
	}	
}
