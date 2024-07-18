import java.util.*;
public class average{
    public static void main(String args[]){
        int maths[]=new int[100];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the physics marks:");
        maths[0]=sc.nextInt();
        System.out.println("enter the maths marks:");
        maths[1]=sc.nextInt();
        int average=(maths[0]+maths[1])/2;
        System.out.print("th average is "+average);
    
        
    
}
}