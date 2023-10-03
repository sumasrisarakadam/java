//java program to demonstrate static variable
//3-10-23
//suma
//StaticVariableDemo.java
import java.io.*;
class Student{
    int rollno;//instance variable
    String name;//instance variable
    static String college = "SITE";//static variable
    Student(int r,String n) {//parameterized constructor
    rollno=r;
    name=n;
}//constructor end
void display()
{
    System.out.println(rollno+" "+name+" "+college);
}
}//class end
public class StaticVariableDemo {
    public static void main(String args[]) {
        Student s1=new Student(4250,"suma");
         Student s2=new Student(4234,"sushma");
         System.out.println("Student details are ");
        s1.display();
        s2.display();
    }
}
