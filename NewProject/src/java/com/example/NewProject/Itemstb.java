package com.example.NewProject;
// Generated May 13, 2023 5:10:41 PM by Hibernate Tools 4.3.1


import java.util.List;
import java.util.Random;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.*;
import org.hibernate.*;



@ManagedBean(name="myitem")
@RequestScoped
public class Itemstb  implements java.io.Serializable {

     protected SessionFactory sessionFactory;
    protected Transaction transaction;
    protected Session session;
    protected Configuration configuration;
    
    protected String paymentMethod;
 
protected int orderNo;
protected double[] price;
protected double[] lest;
protected String Name="";

     private String itemid;
     private String itemname;
     private String iteminfo;
     private Double itemprice;

    public Itemstb() {
          configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        sessionFactory = configuration.buildSessionFactory();
        session = sessionFactory.openSession();
    }

	
    public Itemstb(String itemid) {
        this.itemid = itemid;
    }
    public Itemstb(String itemid, String itemname, String iteminfo, Double itemprice) {
       this.itemid = itemid;
       this.itemname = itemname;
       this.iteminfo = iteminfo;
       this.itemprice = itemprice;
    }
   
  
       //display all records 
    public List<Itemstb> displayAllItems(){
        transaction = session.beginTransaction();
        Query query = session.createQuery("from Itemstb");
        List<Itemstb> items = query.list();
        transaction.commit();
        return items;
    }
  
    // To add / save items
    public void saveItems(){
       // session.clear();
        transaction = session.beginTransaction();
        session.save(new Itemstb (getItemid(),getItemname(),getIteminfo(),getItemprice()));
        transaction.commit();
    }
    
    // To Update items
     public void updateItems(){
        session.clear();
        transaction = session.beginTransaction();
        session.update(new Itemstb (getItemid(),getItemname(),getIteminfo(),getItemprice()));
        transaction.commit();
    }
     
     //To Delete items
     public void deleteItems(){
        session.clear();
        transaction = session.beginTransaction();
        session.delete(new Itemstb(getItemid()));
        transaction.commit();
    }
     
     // serch for items by ID
        public void searchitem(){
          transaction = session.beginTransaction();
        Query query = session.createQuery("from Itemstb I WHERE I.itemid=:item_id");
        query.setParameter("item_id", itemid);
        List<Itemstb> Items = query.list();
        transaction.commit();
        itemid = Items.get(0).itemid;
        itemname = Items.get(0).itemname;
        iteminfo = Items.get(0).iteminfo;
        itemprice = Items.get(0).itemprice;
      }
        
      // Bill Number
         public int billNo()
    {
        Random x = new Random();
        orderNo = x.nextInt(50000);
        return orderNo;
    }
    
         //calculate total amount (price)
          public double totalAmount()
    {
        double amount=0.0, total;
        for(int i=0;i<price.length;i++)
            amount+=price[i];
        total = amount;
        return total;
          
    }
          // to display Item name - not working
//          public String displayName() {
//        double amount=0.0;
//        for(int i=0;i<=lest.length;i++)
//        {
//            amount=lest[i];
//            if(lest[i]==3.5)
//                Name+="syringe";
//             if(lest[i]==2.0)
//                Name+="plaster";
//             if(lest[i]==10.0)
//                Name+="first aid kit";
//             if(lest[i]==20.0)
//                Name+="walker";
//        }
//        return ("itemName"+Name+"payment"+amount);
//    }
         
    public String getItemid() {
        return this.itemid;
    }
    
    public void setItemid(String itemid) {
        this.itemid = itemid;
    }
    public String getItemname() {
        return this.itemname;
    }
    
    public void setItemname(String itemname) {
        this.itemname = itemname;
    }
    public String getIteminfo() {
        return this.iteminfo;
    }
    
    public void setIteminfo(String iteminfo) {
        this.iteminfo = iteminfo;
    }
    public Double getItemprice() {
        return this.itemprice;
    }
    
    public void setItemprice(Double itemprice) {
        this.itemprice = itemprice;
    }

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    public double[] getPrice() {
        return price;
    }

    public void setPrice(double[] price) {
        this.price = price;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public double[] getLest() {
        return lest;
    }

    public void setLest(double[] lest) {
        this.lest = lest;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    

}
