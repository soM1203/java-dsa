import java.util.*;
public class system {

        public static void Main(String[] args){
        int marks[]=new int[100];
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the marks in physics \n");
         marks[0]=sc.nextInt();
        System.out.print("the marks in physics are"+marks[0]);
        System.out.print("enter the marks in maths: \n");
         marks[1]=sc.nextInt();
        int average=(marks[1]+marks[0])/2;
        System.out.println("the average is "+average);
    }
        
    }
    
    

