package com.example.tempconversion;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="paymentbean")
@RequestScoped
public class PaymentManagedBean {
    protected int outputValue;
    protected int[] courseList;
    public PaymentManagedBean() {
    }

    
    public int calculatePayment(){
    
     int total =0;
     
     for(int i= 0;i<courseList.length; i++)
     {
         total = total + courseList[i];
     }
     
     
    return total;
    }
    
    public int getOutputValue() {
        return outputValue;
    }

    public void setOutputValue(int outputValue) {
        this.outputValue = outputValue;
    }

    public int[] getCourseList() {
        return courseList;
    }

    public void setCourseList(int[] courseList) {
        this.courseList = courseList;
    }
    
}
