package com.example.ajaxwebdemoapp;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="mybean")
@RequestScoped
public class AjaxJSFManagedBean {
    protected String mytext;
    protected double tempC,tempF;
    public AjaxJSFManagedBean() {
    }
    
    public double convertTempFahrenheit (){
    
     tempF = tempC * 1.8 + 32;
     return tempF;
    }

    public double convertTempKelvin(){
    
    return tempC + 273.15;
    }
    
    public double getTempC() {
        return tempC;
    }

    public void setTempC(double tempC) {
        this.tempC = tempC;
    }

    public double getTempF() {
        return tempF;
    }

    public void setTempF(double tempF) {
        this.tempF = tempF;
    }

    
    public String getMytext() {
        return mytext;
    }

    public void setMytext(String mytext) {
        this.mytext = mytext;
    }
    
    
}
