//java program to illustrete how declare,instanciate,initize and traversing the elements
//suma
//5-10-23
//ArrayDemo1.java
import java.io.*;
public class ArrayDemo1 {
    public static void main(String args[]) {
        int a[];//a is an Array of type integer
        a=new int[5];//instanciation
        a[0]=11;
        a[1]=22;
        a[2]=33;
        a[4]=55;
        System.out.println("The array elements are");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
