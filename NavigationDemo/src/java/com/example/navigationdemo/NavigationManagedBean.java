package com.example.navigationdemo;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "mybean")
@RequestScoped
public class NavigationManagedBean {
     protected String userName,userPassword;
    public NavigationManagedBean() {
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
    
    public String moveToPage(){
      return "Page1";
    }
    public String checkLogin(){
    
    if(userName.equals("hct")&& userPassword.equals("123"))
        return "Page2";
    else
        return "Page3";
    }
    
    public String moveToPage(String pid){
       String movePage="";
       
       if (pid.equals("1")) movePage="Page1"; 
       if (pid.equals("2")) movePage="Page2";  
       if (pid.equals("3")) movePage="Page3";  
       
    return movePage;
    }
}
