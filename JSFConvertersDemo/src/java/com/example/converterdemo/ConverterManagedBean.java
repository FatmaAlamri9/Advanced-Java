package com.example.converterdemo;

import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "mybean")
@RequestScoped
public class ConverterManagedBean {
    protected double studentGPA;
    protected Date date = new Date();

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    
    
    public ConverterManagedBean() {
        studentGPA = 3.7895;
    }
    public double getStudentGPA() {
        return studentGPA;
    }
    public void setStudentGPA(double studentGPA) {
        this.studentGPA = studentGPA;
    }
 
}
