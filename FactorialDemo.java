import java.io.*;
import java.util.*;
public class FactorialDemo {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter an integer to find the factorial ");
        int n=sc.nextInt();
        int fact=1;
        for(int i=2;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("factorial of "+n+" is "+fact);
    }
}
