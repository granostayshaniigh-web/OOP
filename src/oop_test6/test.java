package oop_test6;

public class test {
    public static void main(String[] args) {
        Student.teacherName="Ms.wang";
        Student s1 =new Student();
        Student s2 =new Student();
        s1.name="zhangsan";
        s1.age=19;
//        两种方式访问静态变量：1.通过类名.变量名 2.通过对象名.变量名
//        Student.teacherName="Ms.wang";
//        s1.teacherName="Ms.wang";
        System.out.println(s1.name+",age:"+s1.age+",teacher:"+Student.teacherName);
        System.out.println("s2  "+Student.teacherName);
        s2.name="lisi";
        s2.age=20;
        Student.teacherName="Ms.li";
        System.out.println(s1.name+",age:"+s1.age+",teacher:"+Student.teacherName);

    }
}
