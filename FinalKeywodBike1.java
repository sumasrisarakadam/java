//java program to demonstrate final keyword
//suma
//5-10-23
//
import java.io.*;
public class Bike1 {
    final int SpeedLimit = 80;
    void run() {
        SpeedLimit = 120;
    }
    public static void main(String args[]) {
        Bike b=new Bike();
        b.run();
    }
}
