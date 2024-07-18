public class conversion{

    public static void conver(int binnum){
        int pow=0;
        int dec=0;
        while(binnum>0){
            int ld=binnum%10;
            dec=dec+(ld*(int)Math.pow(2, pow));

            pow++;
            binnum=binnum/10;
        }
        System.out.println(dec);
        
    }
    public static void main(String args[]){
        conver(111);

    }
}