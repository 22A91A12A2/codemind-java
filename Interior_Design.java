import java.util.*;
public class frames{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        int x2=sc.nextInt();
        int y2=sc.nextInt();
        int p=x1+y1;
        int z=x2+y2;
        if(p<z)
        System.out.println(p);
        else
          System.out.println(z);
    }
}