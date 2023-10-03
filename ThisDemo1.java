//java program to demonstrate the importance of using the keyword
//3-10-23
//s.suma
//ThisDemo1.java
import java.io.*;
class Student {
    int rollno;
    String name;
    float fee;//local variable
    Student(int rollno,String name,float fee)//parameterized contructor
    {
        rollno=rollno;//class instance variable
       name=name;//class instance variable
        fee=fee;//class instance variable
        //identification problem
    }
    void display() {
        System.out.println("Student details are ");
         System.out.println(rollno+" "+name+" "+fee);
    }
}
public class ThisDemo1{
    public static void main(String args[]) {
        Student s1 = new Student(4250,"suma",45700);
        Student s2 = new Student(4234,"sushma",45700);
        Student s3 = new Student(4252,"rekha",12000);
        Student s4 = new Student(4241,"padhu",130000);
        s1.display();
         s2.display();
          s3.display();
           s4.display();
}
}
