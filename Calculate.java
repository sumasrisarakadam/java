//java program to demonstrate static method
//3-10-23
//suma
//Calculate.java
import java.io.*;
public class Calculate {
    static int cube(int x) {
        return x*x*x;
    }
    public static void main(String args[]) {
        int result=Calculate.cube(6);
        System.out.println("Cube of 6 is "+result);
    }
}
