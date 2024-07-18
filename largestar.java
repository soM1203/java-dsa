// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class largestar{
    public static void searchsort(int numbers[],int key){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i] ){
                largest=numbers[i];
            }
}    
        System.out.print("the largest value is "+largest);
    }
    public static void main(String args[]){
        int numbers[]={9,3,1,3,4,5,6,1};
        searchsort(numbers,4);
        
    }
}