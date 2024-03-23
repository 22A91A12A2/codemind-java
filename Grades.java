import java.util.*;
public class grades{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
        int tot=a+b+c+d+e;
        int i=tot/5;
        if(i>=90)
        {
            System.out.println("Grade A");
        }
        else if(i>=80)
        {
             System.out.println("Grade B");
        }
        else if(i>=70)
        {
             System.out.println("Grade C");
        }
        else if(i>=60)
        {
             System.out.println("Grade D");
        }
        else if(i>=40)
        {
             System.out.println("Grade E");
        }
        else{
             System.out.println("Grade F");
        }
    }
}