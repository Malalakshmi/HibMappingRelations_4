package com.learningTech.DemoHibMappingRelations4;

import javax.imageio.spi.ServiceRegistry;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	
    	Laptop lap = new Laptop();
    	lap.setLid(1);
    	lap.setLname("Del");
    	
    	
    	Student student = new Student();
    	student.setRollno(101);
    	student.setName("lakshmi");
    	student.setMarks(98);
    	student.getS().add(lap);
    	lap.getLs().add(student);
    	Configuration config = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
    	org.hibernate.service.ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
    	SessionFactory sf = config.buildSessionFactory(reg);
    	Session session = sf.openSession();
    	
    	session.beginTransaction();
    	session.save(student);
    	session.save(lap);
    	
    	session.getTransaction().commit();
    }
}
