package com.Hibernate.PracticeGround;

import java.io.ObjectInputFilter.Config;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "Hello World!" );
        Student std = new Student();
        std.setName("Vishal");
        std.setRollno(1318731121);
        std.setBranch("ECE");
        Configuration con= new Configuration();
        con.configure("com/Hibernate/PracticeGround/hibernate.cfg.xml");
		
		  SessionFactory sf=con.buildSessionFactory(); Session
		  session=sf.openSession(); Transaction transaction= (Transaction)
		  session.beginTransaction();
		  
		  session.save(std); transaction.commit();
		 
        
    }
}
