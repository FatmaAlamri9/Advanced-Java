package com.example.pagenavigationdemo3;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "mybean")
@RequestScoped
public class NavigationManagedBean {
    protected String userName,userPassword, userType;
    public NavigationManagedBean() {
    }

    
    public String checkUserType(){
        // do the user validation from database .......
        return "sucessful";
    }
    
    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    
    
    
    
    
    public String checkLogin(){
    if(userName.equals("admin")&& userPassword.equals("hct"))
         return "admin";
    else
        return "customer";
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
