public class z3 {
    public static void main(String[] args) {
        int a = 12000000;
        int rogd = a * 17 / 1000;
        int dead = a * 8 / 1000;
        for (int i = 1; i <= 10; i = i + 1) {
            a = a + rogd - dead;
            System.out.println("Год " + i + ", численность населения составляет " + a + " человек.");
        }


    }
}
