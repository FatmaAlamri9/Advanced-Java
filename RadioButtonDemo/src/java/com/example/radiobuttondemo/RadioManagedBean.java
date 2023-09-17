package com.example.radiobuttondemo;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "radiobean")
@RequestScoped
public class RadioManagedBean {
    protected String selectedRadioButtonValue,outputValue;
    public RadioManagedBean() {
    }   
     public void displayResult(){
     outputValue = selectedRadioButtonValue;
     }
    
    
    
    
    
    
    public String getSelectedRadioButtonValue() {
        return selectedRadioButtonValue;
    }

    public void setSelectedRadioButtonValue(String selectedRadioButtonValue) {
        this.selectedRadioButtonValue = selectedRadioButtonValue;
    }

    public String getOutputValue() {
        return outputValue;
    }

    public void setOutputValue(String outputValue) {
        this.outputValue = outputValue;
    }
    
}
