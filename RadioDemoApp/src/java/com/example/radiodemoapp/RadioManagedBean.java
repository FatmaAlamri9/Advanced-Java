package com.example.radiodemoapp;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "radiobean")
@RequestScoped
public class RadioManagedBean {
    protected String selectedRadioValue, resultValue;

    public RadioManagedBean() {
    }

    public void displayResult()
    {
        resultValue = selectedRadioValue;
    }
    
    public String getSelectedRadioValue() {
        return selectedRadioValue;
    }

    public void setSelectedRadioValue(String selectedRadioValue) {
        this.selectedRadioValue = selectedRadioValue;
    }

    public String getResultValue() {
        return resultValue;
    }

    public void setResultValue(String resultValue) {
        this.resultValue = resultValue;
    }
    
}
