package service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import itemdetails.Item;

public class Driver {

	public static void main(String[] args) {

		Configuration config = new Configuration();

		config.configure();

		ServiceRegistry serviceregistry = new ServiceRegistryBuilder().applySettings(
				config.getProperties()).buildServiceRegistry();

		SessionFactory sessionfactory = config.buildSessionFactory(serviceregistry);

		Session session = sessionfactory.openSession();

		session.beginTransaction();

		Item item1 = new Item();
		
		
		//save 
		session.save(item1);
		
		session.getTransaction().commit();

		session.close();


	}

}

