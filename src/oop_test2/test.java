package oop_test2;

public class test {
    public static void main(String[] args){
        Cook c = new Cook ();
        c.age=35;
        c.name="张三";
        c.cook_level='A';
        c.cook();
        System.out.println(c.name);
        System.out.println(c.age);
        System.out.println(c.cook_level);
    }
}
