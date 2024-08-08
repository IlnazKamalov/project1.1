package app;

import java.util.Scanner;

public class CliGreeting {

    public static void greeting() {

        System.out.println("Welcome to the game!");
        System.out.print("May I have your name? ");

        Scanner scName = new Scanner(System.in);
        String name = scName.nextLine();

        System.out.println("Hello " + name + "!");
        scName.close();
    }
}
