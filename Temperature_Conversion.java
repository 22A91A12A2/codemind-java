import java.util.Scanner;
public class convert{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        double b=32+(a*9/5.0);
        System.out.format("%.2f",b);
    }
}