import java.util.*;
public class tickets{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int c= x*5;
        if(c>=y)
        {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}