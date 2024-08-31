public class z5 {
    public static void main(String[] args) {
        double a = 15000;
        double b = 0;
        for  (int  i = 1; b <= 12000000; i++) {
            b = b + a + a * 0.7;
            int value1 = (int)Math.round(b);
            if (i % 6 == 0) {
                System.out.print(value1 + " Год " + i);
                System.out.println();
            }
        }
    }
}



