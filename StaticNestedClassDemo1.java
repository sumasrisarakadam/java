//java program to demonstrate the static nested classes
//4-10-23
//suma
//StaticNestedClassDemo1.java
import java.io.*;
class OuterClass {
    static int outer_x=10;//static variable
    int outer_y=10;//non-static variable
    private static int outer_z=30;//private static variable
    static class StaticNestedClass {
        void display() {
            System.out.println("outer_x value is "+outer_x);
            System.out.println("outer_z va;lue is "+outer_z);
            OuterClass out=new OuterClass();
            System.out.println("outer_y value is "+out.outer_y);
        }
    }
}
public class StaticNestedClassDemo1 {
    public static void main(String args[]) {
        OuterClass.StaticNestedClass snc=new OuterClass.StaticNestedClass();
        snc.display();
    }
}
