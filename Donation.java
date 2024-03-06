import java.util.Scanner;
public class donation{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(b>a)
        {
            int c=b-a;
            System.out.println(c);
        }
    }
}