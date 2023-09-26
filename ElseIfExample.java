//java program to find the average and display the class of the student
//23.08.23
//suma
//ElseIfExample
import java.io.*;
import java.util.*;
public class ElseIfExample{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks of 3 subjects ");
        float s1=sc.nextFloat();
        float s2=sc.nextFloat();
        float s3=sc.nextFloat();
        float total=s1+s2+s3;
        float Avg = (total)/3;
        System.out.println("The total marks of the student is "+total);
        if(Avg>=75){
            System.out.println("student average is "+Avg+"student passed with disteriction");
        }
        else if(Avg>=60&&Avg<=75){
            System.out.println("student average is "+Avg+"student passed in first class");
        }
        else if(Avg>=50&&Avg<=60){
            System.out.println("student average is "+Avg+"student passed in second class");
        }
        else if(Avg>=40&&Avg<=50){
            System.out.println("student failed");
        }
    }
}
