import java.util.*;
public class frames{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        int rem=a%3600;
        int hr=a/3600;
        int min=rem/60;
        int sec=rem%60;
        System.out.println("H:M:S-"+hr+":"+min+":"+sec);
    }
}