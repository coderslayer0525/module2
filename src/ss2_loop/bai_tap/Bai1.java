package ss2_loop.bai_tap;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        System.out.println("-------Menu--------");
        System.out.println("1.Print the rectangular");
        System.out.println("2.Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
        System.out.println("3.Print isosceles triangle");
        System.out.println("4.Exit");
        System.out.println("Enter your choice:");
        choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Print the rectangular");
                System.out.println("********");
                System.out.println("********");
                System.out.println("********");
                break;
            case 2:
                System.out.println("Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
                // public class Main {
                System.out.println("****");   // public static void triangle1(int height) {
                System.out.println("***");   // for (int i = height; i >= 1; i--) {
                System.out.println("**");   // for (int j = 1; j <= i; j++) {
                System.out.println("*");   // System.out.print("*");
                // }
                //System.out.println();
                // }
                // }
                //public static void triangle2(int height) {
                //for (int i = 1; i <= height; i++) {
                //for (int j = 1; j <= i; j++) {
                //System.out.print("*");
                //}
                //System.out.println();
                //}
                //}
                System.out.println("*");
                System.out.println("**");
                System.out.println("***");
                System.out.println("****");

//public static void triangle3(int height) {
//for (int i = height; i >= 1; i--) {
//for (int space = 0; space < height - i; space++) {
//System.out.print(" ");
//}
//for (int star = 1; star <= i; star++) {
//System.out.print("*");
//}
//System.out.println();
//}
//}
                System.out.println("****");
                System.out.println(" ***");
                System.out.println("  **");
                System.out.println("   *");
                //public static void triangle4(int height) {
                //for (int i = 1; i <= height; i++) {
                //for (int space = 1; space <= height - i; space++) {
                //System.out.print(" ");
                //}
                //for (int star = 1; star <= i; star++) {
                //System.out.print("*");
                //}
                //System.out.println();
                //}
                //}
                System.out.println("   *");
                System.out.println("  **");
                System.out.println(" ***");
                System.out.println("****");
                break;
            case 3:
                System.out.println("Print isosceles triangle");
                break;
            case 4:
                System.out.println("Exit");
                break;
            default:
                System.out.println("please enter a valid choice on menu");
        }
    }
}

