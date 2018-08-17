package com.inertia.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.springframework.beans.factory.annotation.Autowired;

public class HibernateUtil {
	
	@Autowired
	private static SessionFactory sessionFactory;
	
	private static SessionFactory getSessionFactory(String filename){
		if(HibernateUtil.sessionFactory == null){
			Configuration c = new Configuration().configure(filename);
			ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(c.getProperties()).build();
			HibernateUtil.sessionFactory = c.buildSessionFactory(sr);
		}
		return HibernateUtil.sessionFactory;
	}
	
	public static Session getSession(){
		return getSessionFactory("hibernate.cfg.xml").openSession();
	}
}