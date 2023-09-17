package com.example.tempconversion;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="mybean")
@RequestScoped
public class TempManagedBean {
    protected double inputValue;
   
    protected double newRadioVale;
    protected String[] myChoice;

    public String[] getMyChoice() {
        return myChoice;
    }

    public void setMyChoice(String[] myChoice) {
        this.myChoice = myChoice;
    }
    
      
    protected String outValue,selRadioValue;
    public TempManagedBean() {
    }

    public double getNewRadioVale() {
        return newRadioVale;
    }

    public void setNewRadioVale(double newRadioVale) {
        this.newRadioVale = newRadioVale;
    }

    
    
    public String displayResult()
    { 
        
        if(newRadioVale==1.8)
            outValue = (inputValue*newRadioVale + 32) + " Fahrenheit";
        else
            outValue = (inputValue+newRadioVale) + " Kelvin";
        
        return outValue;
        
//     if(selRadioValue.equals("Fahrenheit"))
//        {
//           outValue=((inputValue * 1.8)+32 )+ selRadioValue;
//        }
//      else+
        
//        {
//         outValue=(inputValue + 273.15)+ selRadioValue;
//        }      
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

    public String getSelRadioValue() {
        return selRadioValue;
    }

    public void setSelRadioValue(String selRadioValue) {
        this.selRadioValue = selRadioValue;
    }
    
    
}
