import java.util.Scanner;
public class rainfall{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a<40)
        {
            System.out.println("NO");
        }
        else
        {
            System.out.println("YES");
        }
    }
}