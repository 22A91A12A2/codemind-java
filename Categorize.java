import java.util.*;
public class categorize{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double i=sc.nextDouble();
        if(i<150)
        {
            System.out.println("Person is Dwarf.");
        }
        else if(i>150 && i<=165)
        {
            System.out.println("Person is average heighted.");
        }
        else if(i>165 && i<=195)
        {
            System.out.println("Person is taller.");
        }
        else{
            System.out.println("Abnormal height.");
        }
    }
}