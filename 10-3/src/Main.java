import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;

        for (int i = 0; i < 10; i++) {
            System.out.print("1부터 100 사이의 수를 입력하세요: ");
            input = scanner.nextInt();

            if (1 <= input && input <= 100) {
                System.out.println("입력 완료! 프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다. 다시 입력하세요.");
            }

            if (i == 9) {
                System.out.println("입력 기회를 모두 사용했습니다. 프로그램을 종료합니다.");
            }
        }

        scanner.close();
    }
}
