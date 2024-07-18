package loop;
 public class continue {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 1) {
                continue;
            }
            System.out.print(i);
        }
    }
}

 