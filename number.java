import java.util.*;

public class number{
    public static void main(String args[]){

    int evensum=0;
    Scanner sc=new Scanner(System.in);
    int number=sc.nextInt();
    if(number%2==0){

        
        evensum+=number;
        System.out.println("the following is an even number"+evensum);

    }


    }
}
