package com.example.demoapp;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="demobean")
@ApplicationScoped
public class DemoManagedBean {
     protected int counter=0;
    public DemoManagedBean() {
    }
    public int getCounter() {
        return counter++;
    }
    public void setCounter(int counter) {
        this.counter = counter;
    }
    
}
