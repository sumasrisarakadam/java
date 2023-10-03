//java program to demonstrate static variable by using count
                    //(or)
//count the no.of objects
//3-10-23
//suma
//StaticVariableDemo2.java
import java.io.*;
class CounterDemo {
    static int count=0;
    CounterDemo() //default constructor
    {
        count++;
        System.out.println("count = "+count);
    }//constuctor end
}//class end
public class StaticVariableDemo2 {
    public static void main(String args[]) {
        CounterDemo cd=new CounterDemo();
         CounterDemo cd1=new CounterDemo();
          CounterDemo cd2=new CounterDemo();
    }
}
