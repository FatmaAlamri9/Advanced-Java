package com.example.tempconversion;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="paymentbean")
@RequestScoped
public class CourseManagedBean {
    protected int[] courseList;
    protected String courseName = " ";
    public CourseManagedBean() {
    }
  public String displayPayment(){
      int total =0;
      for(int i=0;i<courseList.length;i++)
      {
         total+=courseList[i];
         if(courseList[i]==15)
             courseName+=" Python ";
         if(courseList[i]==20)
             courseName+=" XML ";
         if(courseList[i]==10)
             courseName+=" Java ";
      }     
      return ("course name " + courseName + " payment = " + total );
  }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    
    
    
    
    public int[] getCourseList() {
        return courseList;
    }
    public void setCourseList(int[] courseList) {
        this.courseList = courseList;
    }
    
}
