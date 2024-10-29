package Ex;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một số tự nhiên: ");
        int number = Integer.parseInt(scanner.nextLine());
        if (number % 15 == 0) {
            System.out.printf("Số %d chia hết cho cả 3 và 5", number);
        } else if (number % 5 == 0) {
            System.out.printf("Số %d chia hết cho 5", number);
        } else if (number % 3 == 0) {
            System.out.printf("Số %d chia hết cho 3", number);
        } else {
            System.out.printf("Số %d không chia hết cho cả 3 và 5", number);
        }
    }
}
