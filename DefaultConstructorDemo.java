import java.io.*;
class Rectangle {
    int l,b,a;
    Rectangle()//default constructor
    {
        l=5;
        b=8;
        a=l*b;
    }//constructor end
}//class end
 public class DefaultConstructorDemo {
    public static void main(String args[]) {
        Rectangle R1=new Rectangle();//default constructor
        Rectangle R2=new Rectangle();
        System.out.println("Area of Rectangle 1 is "+R1.a);
        System.out.println("Area of Rectangle 2 is "+R2.a);
    }
}
