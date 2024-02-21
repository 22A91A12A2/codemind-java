import java.util.*;
public class frames{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        double bs=sc.nextDouble();
        double hra=sc.nextDouble();
        double da=sc.nextDouble();
        double pf=bs*0.12;
        double gs=bs+hra+da+pf;
        System.out.format("%.2f
",pf);
        System.out.format("%.2f",gs);
        }
    
}