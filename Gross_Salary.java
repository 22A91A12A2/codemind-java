import java.util.Scanner;
public class salary{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        double da;
        double hra;
        double sal=0;
        if(a<=10000)
        {
            da=0.8*a;
            hra=0.2*a;
            sal=da+hra+a;
            System.out.format("%.2f",sal);
        }
        else if(a>10000 && a<=20000)
        {
            da=0.9*a;
            hra=0.25*a;
            sal=da+hra+a;
            System.out.format("%.2f",sal);
        }
        else if(a>20000){
            da=0.95*a;
            hra=0.3*a;
            sal=a+da+hra;
            System.out.format("%.2f",sal);
        }
    }
}