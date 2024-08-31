public class z4 {
    public static void main(String[] args) {
        double a = 15000;
        double b = 0;
        for  (int  i = 0; b <= 12000000; i++) {
            b = b + a + a * 0.7;
            int value1 = (int)Math.round(b);
            System.out.print(value1 + " Месяц " + i);
            System.out.println();

        }
    }
}
