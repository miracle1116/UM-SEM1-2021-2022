/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author yiqua
 */
public class Student extends PersonProfil{
    private String [] CourseName, CourseCode;
    private String [] FileName,session;
    private int [] Semester, mark;

    public Student(String [] CourseName, String [] CourseCode, String [] session, int [] Semester, int[] mark, String name, char gender, String DOB) {
        super(name, gender, DOB);
        this.CourseName = CourseName;
        this.CourseCode = CourseCode;
        
        this.session = session;
        this.Semester = Semester;
        this.mark = mark;
    }

    public void setCourseName(String []CourseName) {
        this.CourseName = CourseName;
    }

    public void setCourseCode(String []CourseCode) {
        this.CourseCode = CourseCode;
    }

    public void setFileName(String []FileName) {
        this.FileName = FileName;
    }

    public void setSession(String[] session) {
        this.session = session;
    }

    public void setSemester(int []Semester) {
        this.Semester = Semester;
    }

    public void setMark(int []mark) {
        this.mark = mark;
    }

    public String[] getCourseName() {
        return CourseName;
    }

    public String[] getCourseCode() {
        return CourseCode;
    }

    public String[] getFileName() {
        return FileName;
    }

    public String[] getSession() {
        return session;
    }

    public int[] getSemester() {
        return Semester;
    }

    public int[] getMark() {
        return mark;
    }

    public String getGrade(int mark){
       if(mark>=85){
           return "A";
       }else if (mark>=75){
           return "A-";
       }else if (mark>=70){
           return "B+";
       }else if (mark>=65){
           return "B";
       }else if (mark>=60){
           return "B-";
       }else if (mark>=55){
           return "C+";
       }else if (mark>=50){
           return "C";
       }else if (mark>=45){
           return "D";
       }else if (mark>=35){
           return "E";
       }else 
           return "F";
    }
        

}
