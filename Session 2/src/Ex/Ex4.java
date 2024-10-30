package Ex;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một số nguyên: ");
        int number = Integer.parseInt(scanner.nextLine());
        int total = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                total += i;
            }
        };
        System.out.printf("Tổng các số chẵn trong khoảng %d là %d", number, total);
    }
}
