package describeofnumbers;

import java.util.Scanner;

public class DescribeNumbers {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num % 2 == 0 && num >= 1 && num < 10) {
            System.out.println("четное однозначное число");
        } else if (num % 2 != 0 && num >= 1 && num < 10) {
            System.out.println("нечетное однозначное число");
        } else if (num % 2 == 0 && num >= 10 && num < 100) {
            System.out.println("четное двузначное число");
        } else if (num % 2 != 0 && num >= 10 && num < 100) {
            System.out.println("нечетное двузначное число");
        } else if (num % 2 == 0 && num >= 100 && num < 1000) {
            System.out.println("четное трехзначное число");
        } else if (num % 2 != 0 && num >= 100 && num < 1000) {
            System.out.println("нечетное трехзначное число");
        }

    }
}
