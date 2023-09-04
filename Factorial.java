import java.io.*;
import java.util.*;
class Factorial{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int n=sc.nextInt();
		int fac=1;
		int i=n;
		while(i>0){
			fact=fact*i;
			i=i-1;
		}
		System.out.println("Factorial of the "+n+" is "+fact);
	}
}