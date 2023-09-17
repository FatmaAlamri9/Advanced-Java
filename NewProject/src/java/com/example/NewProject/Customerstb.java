package com.example.NewProject;
// Generated May 13, 2023 5:10:41 PM by Hibernate Tools 4.3.1

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.*;
import org.hibernate.*;


@ManagedBean(name="myCustomer")
@RequestScoped
public class Customerstb  implements java.io.Serializable {

         
    protected SessionFactory sessionFactory;
    protected Transaction transaction;
    protected Session session;
    protected Configuration configuration;
    
    public List<Customerstb> mycustomer;
       
     private int phoneno;
     private String name;
     private String password;
     private String country;
     private String gender;

     
    public Customerstb() {
           configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        sessionFactory = configuration.buildSessionFactory();
        session = sessionFactory.openSession();
    }


      // To add / save customer data - Registration page
    public void savelog(){
        session.clear();
        transaction = session.beginTransaction();
        session.save(new Customerstb(getPhoneno(),getName(),getPassword(),getCountry(),getGender()));
                transaction.commit();
    }
   
    // admin and customer login
        public String login(){
        String page = "";
        session.clear();
        transaction=session.beginTransaction();
        Query query = session.createQuery("From Customerstb u where u.name = :uname");
        query.setParameter("uname", getName());
         mycustomer = query.list();
         if(mycustomer.size()>0)
        {         
       if(mycustomer.get(0).password.equals(getPassword()))
            {
                page="CustomerPage";
            }
        }else{
                page="error";
            }
            
        transaction.commit();
    
        if(name.equals("admin")&& password.equals("admin123"))
            {
                page="admin";
            }
        
        return page;
   }
               
  
    public Customerstb(int phoneno) {
        this.phoneno = phoneno;
    }
    public Customerstb(int phoneno, String name, String password, String country, String gender) {
       this.phoneno = phoneno;
       this.name = name;
       this.password = password;
       this.country = country;
       this.gender = gender;
    }
 
    
    public int getPhoneno() {
        return this.phoneno;
    }
    
    public void setPhoneno(int phoneno) {
        this.phoneno = phoneno;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getCountry() {
        return this.country;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }
    public String getGender() {
        return this.gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<Customerstb> getMycustomer() {
        return mycustomer;
    }

    public void setMycustomer(List<Customerstb> mycustomer) {
        this.mycustomer = mycustomer;
    }

}


