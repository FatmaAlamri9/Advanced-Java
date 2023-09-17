package com.example.pizzaapp1;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.Random;

@ManagedBean(name = "mybean")
@RequestScoped
public class PizzaManagedBean {
   protected String pizzaName;
   protected int billNumber, qtyRequired;
   protected double pizzaSize,totalPrice;
   protected double[]pizzaExtra;
   protected String customerPhoneNumber;
    
   public double calculatePayment(){
   double extra=0;
   for (int i =0 ;i<pizzaExtra.length;i++)
       extra+=pizzaExtra[i];
   totalPrice = (pizzaSize * qtyRequired)+extra;
   return totalPrice;
   }
    
    public PizzaManagedBean() {
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    
    
    
    public String getPizzaName() {
        return pizzaName;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public int getBillNumber() 
    {
        Random bno = new Random();
        billNumber = bno.nextInt(4000)+1000;          
        return billNumber;
    }

    public void setBillNumber(int billNumber) {
        this.billNumber = billNumber;
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

    public void setPizzaSize(double pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double[] getPizzaExtra() {
        return pizzaExtra;
    }

    public void setPizzaExtra(double[] pizzaExtra) {
        this.pizzaExtra = pizzaExtra;
    }
 
    
    
    
}
