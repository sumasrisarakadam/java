//java program to display the elements of the Array by using for each loop 
//suma
//5-10-23
//ArrayForEach.java
import java.io.*;
import java.lang.*;
public class ArrayForEach {
    public static void main(String args[]) {
        int a[]={11,22,33,44,55};
        System.out.println("The elements of the Array are: ");
        for(int i:a) {
            System.out.print(i+" ");
        }
    }
}
