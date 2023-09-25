package com.code.dsa.stack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class StackMainTest {
    private static Logger logger = LoggerFactory.getLogger(StackMainTest.class);
    public static void main(String[] args){
        Stack stk = new Stack();
        int choice = 0;
        do {
            logger.info("================== MENU ==================");
            logger.info("1. Add Element To Stack.");
            logger.info("2. Remove Element From Stack.");
            logger.info("3. Show Element of Stack.");
            logger.info("4. Exit.");
            logger.info("==========================================");
            logger.info("Enter the choice : ");
            choice = new Scanner(System.in).nextInt();
            switch (choice){
                case 1:
                    logger.info("Enter the item to add in stack : ");
                    int iAdd = new Scanner(System.in).nextInt();
                    stk.push(iAdd);
                    break;
                case 2:
                    int iRemovedItem = stk.pop();
                    logger.info("Item : {} removed successfully" ,iRemovedItem);
                    break;
                case 3:
                    stk.show();
                    break;
                case 4:
                    logger.info("Exiting the Stack Operation Menus !!!");
                    break;
                default:
                    logger.info("Invalid choice, please provide valid choice.");
                    break;
            }
        }while (choice != 4);
    }
}
