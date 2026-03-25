package com.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hibernetutils {
	
	private static SessionFactory factory = null;
	
	public static SessionFactory getSessionFactory() {
		
	  try {
		//create singletone factory session
		  if (factory == null) {
			  Configuration configuration = new Configuration();
			  configuration.configure("hibernate.cfg.xml");
				
			  factory = configuration.buildSessionFactory();
		}
	} catch (Exception e) {
		e.printStackTrace();
		System.out.println("Unable to create session factory object");
	}
	
	  return factory;
	}
     	
	
}
