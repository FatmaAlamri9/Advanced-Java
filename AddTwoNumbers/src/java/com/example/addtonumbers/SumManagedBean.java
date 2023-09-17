package com.example.addtonumbers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="mybean")
@RequestScoped
public class SumManagedBean {
    protected int numberOne,numberTwo,outputResult;
    public SumManagedBean() {
    }

    public void calculateSum()
    {
       outputResult = numberOne + numberTwo;
    }
    
    
    
    
    
    
    public int getNumberOne() {
        return numberOne;
    }

    public void setNumberOne(int numberOne) {
        this.numberOne = numberOne;
    }

    public int getNumberTwo() {
        return numberTwo;
    }

    public void setNumberTwo(int numberTwo) {
        this.numberTwo = numberTwo;
    }

    public int getOutputResult() {
        return outputResult;
    }

    public void setOutputResult(int outputResult) {
        this.outputResult = outputResult;
    }

       
}
