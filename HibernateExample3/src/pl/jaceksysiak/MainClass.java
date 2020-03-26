package pl.jaceksysiak;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) {
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        
        Employee employee = new Employee();
        //user.setId(105);
        employee.setUsername("dddddddd");
        employee.setPassword("dddddddddddddd");
        employee.setEmail("ioii@wwwe.pl");
		session.persist(employee);
		
		transaction.commit();
		session.close();
		//sessionFactory.close();

	}

}
