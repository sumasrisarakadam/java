//java program to demonstrate final keyword with method
//suma
//5-10-23
//
import java.io.*;
public class Bike2 {
    final void run() {
       System.out.println("Bike is running");
    }
}
class Honda extends Bike2 {
    void run() {
        System.out.println(" Honda runs at 120kmph");
    }
}
    public static void main(String args[]) {
        Honda h=new Honda();
        h.run();
    }
}
