public class Multiples {
    public static void main(String[] args) {
        for (int i= 1; i < 100; i++) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            if (divisibleBy5 || divisibleBy3) {
                System.out.println(i);
            }

        }
    }
}
