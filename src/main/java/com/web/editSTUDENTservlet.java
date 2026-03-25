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

@WebServlet(urlPatterns = "/edit")
public class editSTUDENTservlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	int sid = Integer.parseInt(req.getParameter("id"));
	
	SessionFactory sessionFactory = Hibernetutils.getSessionFactory();
	Session session = sessionFactory.openSession();

	Student s = null;
	
    try {
		
    	s=session.get(Student.class, sid);
    	
	} catch (Exception e) {
		System.out.println("There is problem while fetching database");
	}finally {
		//closing resources
		
	}
	
    if(s !=null){
		req.setAttribute("obj" , s);
	}
	
	RequestDispatcher rd = req.getRequestDispatcher("editstudent.jsp");
	rd.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		SessionFactory sessionFactory = Hibernetutils.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Student s = null;
		
		int sid= Integer.parseInt(req.getParameter("id"));
		String name= req.getParameter("sname");
		Double marks= Double.parseDouble(req.getParameter("smarks"));
		int rollnum= Integer.parseInt(req.getParameter("srollnum"));
		String grade=req.getParameter("sgrade"); 
		String city= req.getParameter("scity");
		
		
		System.out.println(name);
		System.out.println(marks);
		System.out.println(rollnum);
		System.out.println(grade);
		System.out.println(city);
		
		try {
			
			s=session.get(Student.class, sid);
			s.setName(name);
			s.setMarks(marks);
			s.setRollnum(rollnum);
			s.setGrade(grade);
			s.setCity(city);
			
			session.update(s);
			
			transaction.commit();
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		resp.sendRedirect("list");
	}

}
