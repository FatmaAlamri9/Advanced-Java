package com.example.pagenavigationdemo;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "mybean")
@RequestScoped
public class NavigationManagedBean {
    protected String userName,userPassword;
   public NavigationManagedBean() {
    }

   public String checkLogin(){
    if(userName.equals("hct")&& userPassword.equals("123"))
           return "Page1";
       else
           return "Page2";
   }
   
   public String moveToPage(String pageID)
   {
       String movePage="";
         if(pageID.equals("1")) movePage="Page1";
         if(pageID.equals("2")) movePage="Page2";
         if(pageID.equals("3")) movePage="Page3";  
       return movePage;
   }
   
   
   
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
   
   
    
    
    
    
}
