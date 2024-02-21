import java.util.*;
public class frames{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++){
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int p=Math.max(Math.max(b,c),d);
        int sum=b+c+d;
        int z=sum-p;
        if(z<p)
        {
        System.out.println("YES");
        }
        else{
        System.out.println("NO");
        }
        }
    }
}