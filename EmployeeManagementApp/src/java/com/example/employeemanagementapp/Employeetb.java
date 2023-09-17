package com.example.employeemanagementapp;
// Generated Mar 14, 2023 1:33:03 PM by Hibernate Tools 4.3.1

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.hibernate.*;
import org.hibernate.cfg.*;
        

@ManagedBean (name = "empbean")
@RequestScoped

public class Employeetb  implements java.io.Serializable {

    protected Session session;
    protected SessionFactory sessionFactory;
    protected Transaction transaction;
    protected Configuration cfg;
    protected String answer="";
    protected String [] mySelectedList = {};
    protected Map<String,String> myCountryList = new TreeMap<String,String>();
    protected Map<String,String> myEmployeeNameList = new TreeMap<String,String>();
     private int eid;
     private String ename;
     private Double ebasic;
     private String edepartment;

     public Map<String,String> dynamicCountryList(){
     myCountryList.put("OMAN", "oman");
     myCountryList.put("UAE", "uae");
     myCountryList.put("USA", "usa");
     myCountryList.put("CANADA", "canada");   
     return myCountryList;
     }
     
    public Map<String,String>empNameList(){
      transaction = session.beginTransaction();
      Query q = session.createQuery("from Employeetb");
      List <Employeetb> empRecords = q.list();
      transaction.commit();
      for(int i=0;i<empRecords.size();i++)
      {
         myEmployeeNameList.put(empRecords.get(i).ename.toUpperCase(),""+empRecords.get(i).eid);          
      }
       return myEmployeeNameList;
    } 
     
    public String displayValue(){
     
    for(int i =0 ; i<mySelectedList.length;i++)
    {
    answer = answer + " " + mySelectedList[i];
    }
    return answer;
    }
     
    public Employeetb() {        
        cfg= new Configuration();
        cfg.configure("hibernate.cfg.xml");
        sessionFactory = cfg.buildSessionFactory();
        session = sessionFactory.openSession();
    }

    public String[] getMySelectedList() {
        return mySelectedList;
    }

    public void setMySelectedList(String[] mySelectedList) {
        this.mySelectedList = mySelectedList;
    }

    public Map<String, String> getMyCountryList() {
        return myCountryList;
    }

    public void setMyCountryList(Map<String, String> myCountryList) {
        this.myCountryList = myCountryList;
    }

    public Map<String, String> getMyEmployeeNameList() {
        return myEmployeeNameList;
    }

    public void setMyEmployeeNameList(Map<String, String> myEmployeeNameList) {
        this.myEmployeeNameList = myEmployeeNameList;
    }

    
    
    //delete record based on employee name
    public void deleteEmpName(){
    String qstr=" DELETE from Employeetb E where E.ename = :empname";
      transaction = session.beginTransaction();
      Query q = session.createQuery(qstr);
      q.setParameter("empname", ename);
      int x = q.executeUpdate();
      transaction.commit();
    }
    
    // update department  base on id
    public void updateDept(){
    String qstr = "UPDATE Employeetb E set E.edepartment = :dept "+
                  "where E.eid = :empid";
        transaction = session.beginTransaction();
        Query q = session.createQuery(qstr);
        q.setParameter("dept", "Business");
        q.setParameter("empid",eid);
        int x = q.executeUpdate();
        transaction.commit();
    }
    
    
    
    public List<Employeetb> displayAllRecords()
    {
      transaction = session.beginTransaction();
      Query query = session.createQuery("from Employeetb E ORDER BY E.edepartment,E.ename desc");
      List<Employeetb> emp = query.list();
      transaction.commit();
      return emp; 
    
    }
    
    // search an employee ....
    public List<Employeetb> findEmployeeRecord(){
    transaction = session.beginTransaction();
    Query query = session.createQuery("from Employeetb E where E.edepartment Like :keyword");
    query.setParameter("keyword","%IT%");
    List<Employeetb> emp = query.list();
    transaction.commit();
    return emp;     
    }
    
    public void findEmployeeRecord1(){
    transaction = session.beginTransaction();
    Query query = session.createQuery("from Employeetb E where E.ename = :emp_name");
    query.setParameter("emp_name",ename);
    List<Employeetb> emp = query.list();
    transaction.commit();
        eid = emp.get(0).eid;
        ename = emp.get(0).ename;
        ebasic = emp.get(0).ebasic;
        edepartment = emp.get(0).edepartment;
//        if(edepartment.equals(""))
//            edepartment = "NA";
          
       }
    
    
    
    
    
    // add a record ......
    
    public void addRecord()
    {
      session.clear();
      transaction = session.beginTransaction();
      session.save(new Employeetb(getEid(),getEname(),getEbasic(),getEdepartment()));
      transaction.commit();   
    }
            
    // update record .....
    public void updateRecord()
    {
         session.clear();
          transaction = session.beginTransaction();
           session.update(new Employeetb(getEid(),getEname(),getEbasic(),getEdepartment()));
         transaction.commit();  
    }
     // delete record 
    
    public void deleteRecord()
    {session.clear();
         transaction = session.beginTransaction();
         session.delete(new Employeetb(getEid()));
         transaction.commit();  
    
    }
            
            
            
	
    public Employeetb(int eid) {
        this.eid = eid;
    }
    public Employeetb(int eid, String ename, Double ebasic, String edepartment) {
       this.eid = eid;
       this.ename = ename;
       this.ebasic = ebasic;
       this.edepartment = edepartment;
    }
   
    public int getEid() {
        return this.eid;
    }
    
    public void setEid(int eid) {
        this.eid = eid;
    }
    public String getEname() {
        return this.ename;
    }
    
    public void setEname(String ename) {
        this.ename = ename;
    }
    public Double getEbasic() {
        return this.ebasic;
    }
    
    public void setEbasic(Double ebasic) {
        this.ebasic = ebasic;
    }
    public String getEdepartment() {
        return this.edepartment;
    }
    
    public void setEdepartment(String edepartment) {
        this.edepartment = edepartment;
    }




}


