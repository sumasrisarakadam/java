//java program to demonstrate parameterized constructor
//s.suma
import java.io.*;
class Rectangle {
    int a;
    Rectangle(int l,int b) {
         a=l*b;
    }
}
public class ParameterizedConstructorDemo {
public static void main(String args[]) {
    Rectangle R=new Rectangle(6,10);
    System.out.println("Area of the Rectangle is "+R.a);
}
}
