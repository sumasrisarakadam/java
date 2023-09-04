import java.io.*;
import java.util.*;
class EvenOdd {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Entre an integer: ");
		int n=sc.nextInt();
		if (n%2==0)
			System.out.print(n+" is an even number.");
		else
			System.out.print(n+" is an odd number.");
 	}
}