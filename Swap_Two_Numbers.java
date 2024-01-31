import java.util.*;
public class swap{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a,b,s;
        a=sc.nextInt();
        b=sc.nextInt();
        s=a;
        a=b;
        b=s;
        System.out.println(a);
        System.out.println(b);
    }
}