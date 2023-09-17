package com.example.tempconversion;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="mybean")
@RequestScoped
public class TempManagedBean {
    protected double inputValue;
    protected String outValue, selectedRadioValue;
    
    protected double newRadioValue;
    
    
   public String displayResult()
   {
       if (newRadioValue==273.15)
           outValue = inputValue + newRadioValue + " "+ "Kelvin";
       else
           outValue = ((inputValue* newRadioValue)+32) + " "+"Fahrenheit";
       
          return outValue;
//    if(selectedRadioValue.equals("Kelvin"))
//    {
//       outValue = (inputValue + 273.15)+ " "+ selectedRadioValue;
//    }
//    else
//    {
//      outValue = ((inputValue*1.8)+32)+ " "+ selectedRadioValue;
//    }
  }

    public double getNewRadioValue() {
        return newRadioValue;
    }

    public void setNewRadioValue(double newRadioValue) {
        this.newRadioValue = newRadioValue;
    }
   
   
   
   
   
   
   
   
    public TempManagedBean() {
    }

    public double getInputValue() {
        return inputValue;
    }

    public void setInputValue(double inputValue) {
        this.inputValue = inputValue;
    }

    public String getOutValue() {
        return outValue;
    }

    public void setOutValue(String outValue) {
        this.outValue = outValue;
    }

    public String getSelectedRadioValue() {
        return selectedRadioValue;
    }

    public void setSelectedRadioValue(String selectedRadioValue) {
        this.selectedRadioValue = selectedRadioValue;
    }
   
}
