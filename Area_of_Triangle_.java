import java.util.Scanner;
public class convert{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        double s=(a+b+c)/2.0;
        double d=s*(s-a)*(s-b)*(s-c);
        double area=Math.sqrt(d);
        System.out.format("%.2f",area);
    }
}