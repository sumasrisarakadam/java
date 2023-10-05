//java program to demonstrate passing an Array to a method find the minimum element in array
//suma
//5-10-23
//ArrayPassing.java
import java.io.*;
public class ArrayPassingDemo {
    static void min(int arr[]) {
        int m=arr[0];
        for(int i=1;i<arr.length;i++) {
            if(m > arr[i]) {
                m=arr[i];
            }//if end
        }//for end
        System.out.println("The smallest element is "+m);
    }//min function end
    public static void main(String args[]) {
        int a[]={11,43,52,66,2,32};
        min(a);//no need of object as it static method 
    }//main end
}//class end

