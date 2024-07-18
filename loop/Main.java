import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        boolean value=true;
        if(number==2){
            System.out.println("the following number is prime");
        }
            else{
                for(int i=2;i<number-1;i++){
            if(number%i==0){
                value=false;
            }
            
        }
        if(value==false){
            System.out.println("the number is not prime ");
        }else{
            System.out.println("the number is  prime ");
        }
            
        }
        
        
        
        
    }
}
