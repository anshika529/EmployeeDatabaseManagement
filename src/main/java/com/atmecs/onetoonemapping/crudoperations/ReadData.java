package com.atmecs.onetoonemapping.crudoperations;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionException;

import com.atmecs.onetoonemapping.entity.Users;
import com.atmecs.onetoonemapping.util.HibernateUtil;


public class ReadData {
	public void readData() {
		Session session = HibernateUtil.currentSession();
		Scanner sc = new Scanner(System.in);
		try {
			session.beginTransaction();
			System.out.println("Enter id to read the data:");
			Users user = (Users) session.get(Users.class, sc.nextInt());
			System.out.println("Id is:" + user.getUserid());
			System.out.println("First Name : " + user.getName());
			System.out.println("Record Displayed successfully");
		} catch (SessionException e) {
			System.out.println(e);
		} finally {
			HibernateUtil.closeSession();
		}
	}
}
