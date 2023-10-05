//java program to demonstrate returning an Array from a method find the maximum element in array
//suma
//5-10-23
//Arrayreturning.java
import java.io.*;
public class ArrayreturningDemo {
    static int[] max() {
        return new int[]{10,40,60,22,85};
    }//funtion end
    public static void main(String args[]) {
        int arr[]=max();
        int m=arr[0];
        for(int i=1;i<arr.length;i++) {
            if(m<arr[i]) {
                m=arr[i];
            }//if end
        }//for end
System.out.println("The largest element in the array is "+m);
}
}
