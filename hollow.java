public class hollow{
    public static void printpattern(int rows,int coloumns){
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=coloumns;j++){
                if(i==1||i==rows||j==coloumns||j==1){
                    System.out.print("*");

                }else{
                    System.out.print("");
                }
            }
        }
    }
    public static void main(String args[]){
        printpattern(4, 5);
    }
}