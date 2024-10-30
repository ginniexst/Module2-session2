package Ex;

public class Ex3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.printf("Số %d chia hết cho cả 3 và 5\n", i);
            }
        }
    }
}
