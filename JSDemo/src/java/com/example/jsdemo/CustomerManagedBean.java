package com.example.jsdemo;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "mybean")
@RequestScoped
public class CustomerManagedBean {
    protected String customerName;
    protected int numberOfTickets,ticketPrice;
   
    // calculate amount;
    public int calculateAmount()
    {
       return (numberOfTickets * ticketPrice);
    }
    
    
    public CustomerManagedBean() {
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }


    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
   
    
    
}
