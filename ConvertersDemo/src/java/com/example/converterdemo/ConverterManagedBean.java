package com.example.converterdemo;

import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "mybean")
@RequestScoped
public class ConverterManagedBean {
    protected double temValue;
    protected Date date =  new Date();

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    
    
    
    
    
    public ConverterManagedBean() {
        temValue = 12345.6789;
    }

    public double getTemValue() {
        return temValue;
    }
    public void setTemValue(double temValue) {
        this.temValue = temValue;
    }
    
}
