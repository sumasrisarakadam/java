class Sample {
    protected String job;
}
public class ProtectedDemo extends Sample {
    public static void main(String args[]) {
        Sample s=new Sample();
        s.job="studying";
        System.out.println("job is "+s.job);
    }
}
