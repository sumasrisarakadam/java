//java program to demonstarte copy constuctor
//s.suma
import java.io.*;
class Rectangle {
    int l,b,a;
    Rectangle()
    {
        l=0;
        b=0;
        a=l*b;
    }
    Rectangle(int x,int y){//parameterized consructor
        l=x;
        b=y;
        a=l*b;
    }
    Rectangle(Rectangle r)//copy constructor
    {
        this.l=r.l;
        this.b=r.b;
        this.a=l*b;
    }
}
public class ConstructorOverloadingDemo{
    public static void main(String args[]){
        Rectangle R1=new Rectangle();
        Rectangle R2=new Rectangle(5,10);
        Rectangle R3=new Rectangle(R2);
        System.out.println("Area of rectangle 1 is "+R1.a);
         System.out.println("Area of rectangle 2 is "+R2.a);
          System.out.println("Area of rectangle 3 is "+R3.a);
    }
