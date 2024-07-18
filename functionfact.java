public class functionfact {
    public static int fact(int a){
        int sum=1;
        for(int i=1;i<=a;i++){
            sum=sum*i;
    }
    return sum;
}
    public static  void main(String args[]){

        int pro=fact(3);
        System.out.println(pro);


    }
    
}