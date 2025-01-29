//// 29-01 commit
//// 28-01 commit
//// 27-01 commit
//// 26-01 commit
//// 25-01 commit
//// 22-01 commit
//// 21-01 commit
//// 20-01 commit
//// 19-01 commit
//// 18-01 commit
//// 17-01 commit
//// 16-01 commit
//// 15-01 commit
//// 144-01 commit
//// 14-01 commit
//// 12-01 commit
//// 11-01 commit
//// 10-01 commit
//// 09-01 commit
////08/01 commit
////push today
////push comment
////check first commit
////phase 3
////phase 2
////chekc list 24h
////commit 02/01
////commit test 1/1
////commit code 
////check 30/12
////check 29/12
//// todo list
//// committed
//// check again 26/12
//commit todo
//check comment
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
