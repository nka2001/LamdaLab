
package com.mycompany.lamdalab;


public class Assignment {
    
    private String name;
    private int grade;
    
    public Assignment(){
        
        name = "";
        grade = -1;
        
        
    }
    
    public Assignment(String name, int grade){
        this.name = name;
        this.grade = grade;
    }
    public void setName(String s){
        this.name = s;
    }
    public void setGrade(int g){
        this.grade = g;
    }
    public int getGrade(){
        return grade;
    }
    public String getString(){
        return name;
    }
    
    @Override
    public String toString(){
        String str = name + " " + String.valueOf(grade);
        return str;
    } 
    
    
}
