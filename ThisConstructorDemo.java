class A{
    A(){//default constructor
        System.out.println("Inside Defaulit constructor");
    }
    A(int x){
        this();
        System.out.println(" parameterized constructor ");
        System.out.println("x value is " +x);
    }
}
public class ThisConstructorDemo{
    public static void main(String args[]){
        A a = new A(4250);
    }
}
