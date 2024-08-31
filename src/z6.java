public class z6 {
    public static void main(String[] args) {
        int a = 15000;
        double b = 0;
        for (int i = 1; i <= 108; i++) {
            b = b + a + a * 0.7;
            int value1 = (int) Math.round(b);
            if (i % 6 == 0) {
                System.out.print(value1 + " Месяц " + i);
                System.out.println();
            }
        }
    }
}