public class DemoPrimev4{
    public static void main(String args[]) {
        int flag=0,i,num=50;
        System.out.println("List of prime numbers  2 to "+num+" are: ");
         for(i = 2;i <= num; i++){
             flag=0;
             for(int j = 2; j <= i/2; j++){
            if(i % j == 0){
                flag=1;
                break;
            }
             }
             if(flag == 0)
             {
                 System.out.print(i+" ");
             }
         }
    }
}
           
