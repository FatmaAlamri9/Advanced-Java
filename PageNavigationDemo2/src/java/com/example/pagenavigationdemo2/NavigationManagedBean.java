package com.example.pagenavigationdemo2;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "mybean")
@RequestScoped
public class NavigationManagedBean {
 protected String userName, userPassword , userRoll;
    public NavigationManagedBean() {
    }
public String moveToPage(){
 // do the loging validation process .....
 return "successful";
 }
    
    
    
//public String checkLogin(){
//    if(userName.equals("hct") && userPassword.equals("123"))
//        return "admin";
//    else
//        return "customer";
//  }    

    public String getUserRoll() {
        return userRoll;
    }

    public void setUserRoll(String userRoll) {
        this.userRoll = userRoll;
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
