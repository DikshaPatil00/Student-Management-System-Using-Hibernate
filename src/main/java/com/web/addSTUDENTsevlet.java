package com.web;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.hibernate.Hibernate;
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

@WebServlet(urlPatterns ="/add")
public class addSTUDENTsevlet extends HttpServlet {


		@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	
		RequestDispatcher rd = req.getRequestDispatcher("addform.jsp");
		rd.forward(req, resp);
	}

	
		
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			//in post method we will set student object
			SessionFactory sessionFactory = Hibernetutils.getSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			
			//getting data from Html from(client)
			String name= req.getParameter("sname");
			Double marks= Double.parseDouble(req.getParameter("smarks"));
			int rollnum= Integer.parseInt(req.getParameter("srollnum"));
			String city= req.getParameter("scity");
			String grade=req.getParameter("sgrade") ;
			 
			
			try {
				
				Student s = new Student();
				s.setName(name);
				s.setMarks(marks);
				s.setRollnum(rollnum);
				s.setGrade(grade);
				s.setCity(city);
				session.save(s);
				
				transaction.commit();
				
				resp.sendRedirect("list");
				
			} catch (Exception e) {
				System.out.println("Their is problem while add data to database");
				e.printStackTrace();
			}finally {
				session.clear();
					
		   }
			
	   }	
		
	}

		
  
