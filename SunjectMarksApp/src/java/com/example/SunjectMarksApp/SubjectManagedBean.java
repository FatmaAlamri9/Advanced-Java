package com.example.SunjectMarksApp;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
@ManagedBean(name = "mybean")

@RequestScoped
public class SubjectManagedBean {

    protected double subject1Marks, subject2Marks,subject3Marks,outputResult;
    
    
    public SubjectManagedBean() {
    }

    public void calculateTotalMarks(){
    outputResult = subject1Marks + subject2Marks + subject3Marks;
    }
    
    public void calculateAverage()
    {
     outputResult = (subject1Marks + subject2Marks + subject3Marks) / 3;
    }
    
    
    
    public double getSubject1Marks() {
        return subject1Marks;
    }

    
    public void setSubject1Marks(double subject1Marks) {
        this.subject1Marks = subject1Marks;
    }

    public double getSubject2Marks() {
        return subject2Marks;
    }

    public void setSubject2Marks(double subject2Marks) {
        this.subject2Marks = subject2Marks;
    }

    public double getSubject3Marks() {
        return subject3Marks;
    }

    public void setSubject3Marks(double subject3Marks) {
        this.subject3Marks = subject3Marks;
    }

    public double getOutputResult() {
        return outputResult;
    }

    public void setOutputResult(double outputResult) {
        this.outputResult = outputResult;
    }

        
    
    
}
