package com.example.pizzafoodapp;
import java.util.Random;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="pizzabean")
@RequestScoped
public class PizzaManagedBean {
    protected int billNo,qtyRequired;
    protected double pizzaSize;
    protected double[] pizzaExtra;
    protected String pizzaName, customerMobileNumber;
    public PizzaManagedBean() {
    }

    public String getCustomerMobileNumber() {
        return customerMobileNumber;
    }

    public void setCustomerMobileNumber(String customerMobileNumber) {
        this.customerMobileNumber = customerMobileNumber;
    }

    public double calculatePayment()
    {
         double extra=0.0, payment;
         for(int i=0;i<pizzaExtra.length;i++)
             extra+=pizzaExtra[i];
       
         payment = ((qtyRequired*pizzaSize)+extra);
         return payment;
    }
    
    
    public int getBillNo() {
        Random x = new Random();
        billNo = x.nextInt(5000);
        return billNo;
    }

    public void setBillNo(int billNo) {
        this.billNo = billNo;
    }

    public int getQtyRequired() {
        return qtyRequired;
    }

    public void setQtyRequired(int qtyRequired) {
        this.qtyRequired = qtyRequired;
    }

    public double getPizzaSize() {
        return pizzaSize;
    }

    public void setPizzaSize(double pizaSize) {
        this.pizzaSize = pizaSize;
    }

    public double[] getPizzaExtra() {
        return pizzaExtra;
    }

    public void setPizzaExtra(double[] pizaExtra) {
        this.pizzaExtra = pizaExtra;
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }
    
    
}
