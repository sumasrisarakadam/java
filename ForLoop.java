import java.io.*;
import java.util.*;
public class ForLoop{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter n value ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum = sum+i;
        }
        System.out.println("sum of first "+n+"natural numbers is "+sum);
    }
}
