//java program to demonstarte constuctor overloading
//s.suma
import java.io.*;
class Square {
    int s;
    Square() {
        s=5;
    }
    Square(int x) {
        s=x;
    }
    void area() {
        System.out.println("Area of the square is "+s*s);
    }
}
public class ConstructorOverloadingDemo1{
    public static void main(String args[]) {
        Square s1=new Square();//default constructor in invoks
        Square s2=new Square(8);//parameterized in invoks
        s1.area();
        s2.area();
    }
}
