package com.example.demoscope;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="mybean")
//@RequestScoped
//@SessionScoped
@ApplicationScoped
public class DemoManagedBean {
    int count=0;
    public DemoManagedBean() {
    }

    public int getCount() {
        return count++;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    
}
