package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        System.out.println("\n\u00A0\u00A0123");
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, " +
                    "top-right, botton-left, botton-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("1. Print the rectangle");
                    for(int i = 0; i < 3; i++){
                        for(int j = 0; j < 9; j++){
                            System.out.print("x");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 2:
                    System.out.println("Print the square triangle");
                    for(int row = 1; row <= 7; row++){
                        for(int col = 1; col <= row; col++){
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    System.out.print("\n\n");
                    for(int row = 1; row <= 7; row++){
                        for(int col = 1; col <= 8- row; col++){
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    System.out.println("\n\n");
                    for (int row = 0; row < 9; row++) {
                        for (int count = 0; count < row; count++) {
                            System.out.print(" ");
                        }

                        for (int count = 9 - row; count > 0; count--) {
                            System.out.print("*");
                        }

                        System.out.print("\n");
                    }
                    break;
                case 3:
                    System.out.println("3. Print isosceles triangle");
                    for(int row = 0; row < 4; row++){
                        for(int space = 3-row; space > 0; space-- ){
                            System.out.print(" ");
                        }
                        for(int col = 1; col <= row * 2 + 1; col ++){
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("No choice");
            }
        } while (choice != 0);
    }
}
