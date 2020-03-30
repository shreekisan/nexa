package Rough;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        String input = "";
        switch (input) {
            case "java":
                System.out.println("Java Current Version is 12.");
                break;
            case "python":
                System.out.println("Python Current Version is 3.7");
                break;
            case "rust":
                System.out.println("Rust Current Version is 1.34.1");
                break;
            default:
                System.out.println("We don't have information about this programming language");
        }
    }
}
