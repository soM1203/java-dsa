package loop;

public class reverse {
    
    public static void main(String args[]){
        int n=14;
        while(n>0){
            int lastdigit=n%10;
            System.out.print(lastdigit+"");
            n=n/10;
        }
    }
    
}
