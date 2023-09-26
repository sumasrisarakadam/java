import java.io.*;
public class CmdLineArgs extends Object {
//Object is the super class of all class in java
public static void main(String args[]) {
int x = Integer.parseInt(args[0]);
int y = Integer.parseInt(args[1]);
int z = x + y;
System.out.println("sum of "+x+" and "+y+" is "+z);
}
}
