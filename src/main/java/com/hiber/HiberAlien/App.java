package com.hiber.HiberAlien;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Lapy l=new Lapy();
       l.setLid(3);
       l.setLname("gaming lapy");
              
       MyName n=new MyName();
       n.setFname("k");
       n.setMname("kj");
       n.setLname("j");
      
       Alien alien=new Alien();
       alien.setAid(8);
       alien.setName(n);
      alien.setColor("blue");
      alien.getLaptop().add(l);      
      
      l.getAlly().add(alien);

        
        Configuration con=new Configuration().configure().addAnnotatedClass(Alien.class).addAnnotatedClass(Lapy.class);
        SessionFactory sf=con.buildSessionFactory();
        Session s1=sf.openSession();
        Transaction tx= s1.beginTransaction();
        
        s1.save(alien);
        s1.save(l);
        alien=s1.get(Alien.class, 1);
        s1.getTransaction().commit();
        s1.close();
      //first level caching so no need to go to the database and it is provided by hibernate itself but second level caching is not provided by hibernate but we need to implement by setting property in hibernate cfg file    
        Session s2=sf.openSession();
        Transaction tx2= s2.beginTransaction();
        
        alien=s2.get(Alien.class, 1);
        s2.getTransaction().commit();
        s2.close();
        
        
        System.out.println(alien);
    }
}
