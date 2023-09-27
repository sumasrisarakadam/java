//java program to demonstrate non static nested class
//suma
//27-09-23
class OuterClass {
    static int outer_x=10;
    int outer_y=15;
    private int outer_z=20;
    class InnerClass {
        void display() {
            System.out.println("outer_x value is "+outer_x);
            System.out.println("outer_y value is "+outer_y);
            System.out.println("outer_z value is "+outer_z);
        }
    }
}
public class InnerClassDemo {
    public static void main(String args[]) {
        OuterClass oc=new OuterClass();
        OuterClass.InnerClass ic=oc.new InnerClass();
        ic.display();
    }
}
