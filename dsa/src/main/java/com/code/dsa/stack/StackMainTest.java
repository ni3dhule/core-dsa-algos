package com.code.dsa.stack;

import java.util.Scanner;

public class StackMainTest {
    public static void main(String[] args){
        Stack stk = new Stack();
        int choice = 0;
        do {
            System.out.println("================== MENU ==================");
            System.out.println("1. Add Element To Stack.");
            System.out.println("2. Remove Element From Stack.");
            System.out.println("3. Show Element of Stack.");
            System.out.println("4. Exit.");
            System.out.println("==========================================");
            System.out.println("Enter the choice : ");
            choice = new Scanner(System.in).nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter the item to add in stack : ");
                    int iAdd = new Scanner(System.in).nextInt();
                    stk.push(iAdd);
                    break;
                case 2:
                    int iRemovedItem = stk.pop();
                    System.out.println("Item :"+iRemovedItem+" removed successfully");
                    break;
                case 3:
                    stk.show();
                    break;
                case 4:
                    System.out.println("Exiting the Stack Operation Menus !!!");
                    break;
                default:
                    System.out.println("Invalid choice, please provide valid choice.");
                    break;
            }
        }while (choice != 4);
    }
}
