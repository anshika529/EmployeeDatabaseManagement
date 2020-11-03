package com.atmecs.employeedatabase.util;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.atmecs.employeedatabase.entity.Employee;
import com.atmecs.employeedatabase.entity.EmployeeDetails;
import com.atmecs.employeedatabase.entity.EmployeeProjects;
import com.atmecs.employeedatabase.entity.EmployeeSkills;

public class HibernateUtil {
	public static final SessionFactory sessionFactory;

	static {
		try {
			Configuration config = new Configuration();
			config.addAnnotatedClass(Employee.class);
			config.addAnnotatedClass(EmployeeDetails.class);
			config.addAnnotatedClass(EmployeeSkills.class);
			config.addAnnotatedClass(EmployeeProjects.class);
			config.configure();
			sessionFactory = config.buildSessionFactory();
		} catch (Throwable e) {
			System.err.println("Initial SessionFactory creation failed." + e);
			throw new ExceptionInInitializerError(e);
		}
	}

	public static final ThreadLocal session = new ThreadLocal();

	public static Session currentSession() throws HibernateException {
		Session s = (Session) session.get();
		// Open a new Session, if this thread has none yet
		if (s == null) {
			s = sessionFactory.openSession();
			// Store it in the ThreadLocal variable
			session.set(s);
		}
		return s;
	}

	public static void closeSession() throws HibernateException {
		Session s = (Session) session.get();
		if (s != null)
			s.close();
		session.set(null);
	}
}
