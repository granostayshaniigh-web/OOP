package oop_test5;

public class test {
    public static void main(String[] args){
        Student s1=new Student();
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s1.getGender());
        System.out.println(s1.getHight());
        Student s2=new Student("张三",18,'男',1.8);
        System.out.println(s2.getName());
        System.out.println(s2.getAge());
        System.out.println(s2.getGender());
        System.out.println(s2.getHight());
    }
}
