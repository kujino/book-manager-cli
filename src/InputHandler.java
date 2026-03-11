package src;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputHandler {

    private Scanner scanner;

    public InputHandler(Scanner scanner) {
        this.scanner = scanner;
    }

    public int inputInt(String message) {

        while (true) {

            System.out.print(message);

            try {
                int value = scanner.nextInt();
                scanner.nextLine();
                return value;

            } catch (InputMismatchException e) {
                System.out.println(" ");
                System.out.println("選択可能な数字を入力してください");
                System.out.println(" ");
                scanner.nextLine();
            }
        }
    }

    public String inputString(String message) {

        System.out.print(message);
        return scanner.nextLine();

    }
}
