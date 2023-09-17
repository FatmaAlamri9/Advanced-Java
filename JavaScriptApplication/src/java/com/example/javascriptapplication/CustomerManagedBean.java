package com.example.javascriptapplication;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "mybean")
@RequestScoped
public class CustomerManagedBean {
    protected String custName;
    protected int numOFTicket, ticketPrice;
    
    // for calulate amount .....
    
    public int showAmount(){
        return (numOFTicket*ticketPrice);
    }
    public CustomerManagedBean() {
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public int getNumOFTicket() {
        return numOFTicket;
    }

    public void setNumOFTicket(int numOFTicket) {
        this.numOFTicket = numOFTicket;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
    
}
