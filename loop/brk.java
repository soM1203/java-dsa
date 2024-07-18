import java.util.*;

public class brk {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i=0;
        while(true){
            System.out.print("ENTER THE NUMBER:");
            int a=sc.nextInt();
            if(a%10==0){
                break;
            }
            System.out.println(a);
        }
    }
    
}
