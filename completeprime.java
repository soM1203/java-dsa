public class completeprime {
    public static boolean isprime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;

    }
    public static void rangeprime(int number){
        for(int i=2;i<number;i++){
            if(isprime(i)){
                System.out.println(i);

            }

        }


    }
    public static void main(String args[]){
        System.out.println("the number is "+isprime(2));
        rangeprime(20);
    }
    
}
