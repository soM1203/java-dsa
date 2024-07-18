import java.util.*;
public class main{
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        do{
            System.out.print("enter the number:");
            int a=sc.nextInt();
            if(a%10==0){
                continue;
            }
            System.out.println(a);
        }while(true);
        
        
    }
    
    
}