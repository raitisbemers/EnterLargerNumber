package EnterLargerNumber;

import java.util.Scanner;

public class EnterLargerNumber {
    public static void main(String[] args) {

        int firstNum;
        int nextNum;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number!");
        firstNum = scanner.nextInt();
        do {
            System.out.println("Enter a new value!");
            nextNum = scanner.nextInt();
        } while (nextNum <= firstNum);
        System.out.printf("Value %d is larger than value %d.", nextNum, firstNum);
    }
}


