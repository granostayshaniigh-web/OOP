package oop_test3;

public class Student {
    private String name;
    private int age;
    private int hight;
    private double weight;
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        if(age>0&&age<30){
            this.age = age;
        }else{
            System.out.println("Invalid age");
        }
    }
    public void setHight(int hight){
        if(hight>150&&hight<230){
            this.hight = hight;
        }else{
            System.out.println("Invalid hight");
        }
    }
    public void setWeight(double weight){
        if(weight>30&&weight<150){
            this.weight = weight;
        }else{
            System.out.println("Invalid weight");
        }
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getHight(){
        return hight;
    }
    public double getWeight(){
        return weight;
    }
    public void study(){
        System.out.println(name+"Student study");
    }

}
