package oop_test3;

public class test {
    static Student s = new Student();
    public static void main(String[] args){
        s.setName("张三");
        s.setName("zhangsan");
        System.out.println("大一");
        enterInfo(18,183,60.0);
        s.study();
        System.out.println(s.getName()+","+s.getAge()+","+s.getHight()+","+s.getWeight());
        System.out.println("大二");
        enterInfo(19,183,s.getWeight()+10.0);
        System.out.println(s.getName()+","+s.getAge()+","+s.getHight()+","+s.getWeight());
        System.out.println("大三");
        enterInfo(20,s.getHight()+2,s.getWeight()-3.0);
        System.out.println(s.getName()+","+s.getAge()+","+s.getHight()+","+s.getWeight());
        System.out.println("大四");
        enterInfo(21,s.getHight(),s.getWeight());
        System.out.println(s.getName()+","+s.getAge()+","+s.getHight()+","+s.getWeight());
    }
    public static void enterInfo(int age, int hight, double weight){
        s.setAge(age);
        s.setHight(hight);
        s.setWeight(weight);
    }
}
