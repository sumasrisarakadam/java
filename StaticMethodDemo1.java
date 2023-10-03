//java program to demonstrate the usage static method
//3-10-23
//suma
//StaticMethodDemo1.java
import java.io.*;
class Student{
    int rollno;//instance variable
    String name;//instance variable
    static String college = "SITE";//static variable
    static void ChangeCollege() {
        college = "SASI";
    }
    Student(int r,String n) {//parameterized constructor
    rollno=r;
    name=n;
}//constructor end
void display()
{
    System.out.println(rollno+" "+name+" "+college);
}
}//class end
public class StaticMethodDemo1 {
    public static void main(String args[]) {
        Student s1=new Student(4250,"suma");
        s1.ChangeCollege();//classname.staticmethodname
         Student s2=new Student(4252,"rekha");
         System.out.println("Student details are ");
        s1.display();
        s2.display();
    }
}
