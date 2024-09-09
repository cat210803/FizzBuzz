public class Reduce {
    public static void main(String[] args) {
        int i = 100;
        while (i > 0) {
            boolean iseven = i % 2 == 0;
            if (iseven) {
                System.out.println(i);
                i = i/2;
            }
            else {
                System.out.println(i);
                i--;
            }
        }
        System.out.println(i);
    }
}
