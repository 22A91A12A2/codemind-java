import java.util.*;
public class tickets{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for(int i=0;i<x;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=a+c;
            if(b>=c && d<=b)
            {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}