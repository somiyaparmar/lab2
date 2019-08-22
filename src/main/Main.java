package main;

import java.util.Scanner;

/**
 * @author dell
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine().trim();
        System.out.println("welcome," + userName + "!");
        scanner.close();


    }
}
