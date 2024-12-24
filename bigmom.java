import java.util.Scanner;

public class PrimeNumberCounter {

    // Hàm kiểm tra số nguyên tố
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false; // Số nhỏ hơn 2 không phải là số nguyên tố
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Nếu chia hết cho i, không phải số nguyên tố
            }
        }
        return true; // Nếu không chia hết cho số nào, là số nguyên tố
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        int primeCount = 0;

        System.out.println("Nhập vào 5 số nguyên:");

        // Nhập 5 số từ người dùng
        for (int i = 0; i < 5; i++) {
            System.out.print("Số thứ " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Kiểm tra từng số xem có phải số nguyên tố không
        for (int number : numbers) {
            if (isPrime(number)) {
                primeCount++;
            }
        }

        // In kết quả
        System.out.println("Số lượng số nguyên tố trong 5 số đã nhập: " + primeCount);
        scanner.close();
    }
}
