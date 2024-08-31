public class z1 {
    public static void main(String[] args) {
        double a = 15000;
        double b = 0;
        int i = 0;
        while (b <= 2459000) {
             b = b + a + b * 0.1;
            int value1 = (int)Math.round(b);
            i++;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + value1 + " рублей.");
        }




    }
}
