package oop_test5;

public class Student {
    private String name;
    private int age;
    private char gender;
    private double hight;
    public Student(){
    }
    public Student(String name,int age,char gender,double hight){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.hight=hight;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setGender(char gender){
        this.gender=gender;
    }
    public void setHight(double hight){
        this.hight=hight;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public char getGender(){
        return gender;
    }
    public double getHight(){
        return hight;
    }
}
