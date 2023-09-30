//java program to demonstrate MethodOverridding 
//30-09-23
//suma
// MethodOveriddingDemo1
import java.io.*;
class Bank {
    int getRateOfInterest()
    {
        return 0;
    }//method end
}//class end
class SBI extends Bank {
    int getRateOfInterest()
    {
        return 8;
    }
}
class HDFC extends Bank {
    int getRateOfInterest()
    {
        return 9;
    }
}
class UNIONBank extends Bank {
    int getRateOfInterest()
    {
        return 10;
    }
}
public class  MethodOveriddingDemo1 {
    public static void main(String args[]) {
        SBI S=new SBI();
        HDFC H=new HDFC();
        UNIONBank U=new UNIONBank();
        System.out.println("SBI rate of interest is "+S.getRateOfInterest());
        System.out.println("HDFC rate of interest is "+H.getRateOfInterest());
        System.out.println("UNIONBank rate of interest is "+U.getRateOfInterest());
    }
}
