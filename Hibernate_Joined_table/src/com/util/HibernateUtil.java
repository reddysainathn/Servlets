package com.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory;
	
	static{
		
		Configuration configuration = new Configuration();
		
		//loads hibernate.cfg.xml
		configuration.configure();
		
		StandardServiceRegistryBuilder serviceRegistry = new StandardServiceRegistryBuilder();
		
		ServiceRegistry registry =	serviceRegistry.applySettings(configuration.getProperties()).build();
		
		sessionFactory = configuration.buildSessionFactory(registry);
		
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	

}
