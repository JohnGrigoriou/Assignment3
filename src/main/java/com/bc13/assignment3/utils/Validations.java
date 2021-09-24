package com.bc13.assignment3.utils;

import java.util.Scanner;

public class Validations {

    public static int positiveIntInput() {
        boolean flag;
        Scanner sc = new Scanner(System.in);
        String input;
        int number = -1;
        do{
            do {
                System.out.println("\nPLEASE GIVE AN ID NUMBER...\n");
                try {
                    input = sc.nextLine().trim();
                    number = Integer.parseInt(input);
                    flag = true;
                } catch (NumberFormatException e) {
                    Style.println(Style.RED, "WRONG INPUT!!!\n");
                    flag = false;
                }
            } while (!flag);
        }while(number<0);
        return number;
    }
    
    public static int giveOnlyInteger(){
        Scanner sc = new Scanner(System.in);
        int result;
        while(true){
            try{
                String inp = sc.nextLine().trim();
                int number = Integer.parseInt(inp);             
                result=number;
                break;}
            catch(NumberFormatException e){                                       
                Style.println(Style.RED, "YOU MUST BE TYPE AN INTEGER");
            }
        }
        return result;
    }
    
    public static int giveOnlyInteger(int min, int max){
        int number = giveOnlyInteger();
        while(number < min || number > max){
            Style.println(Style.RED, "INPUT MUST BE BETWEEN "+min+" AND "+max);
            number = giveOnlyInteger();
        }
        return number;
    }
    
    public static String yesOrNo() {
        Scanner sc = new Scanner(System.in);
        String str = null;
        boolean yn = true;
        while(yn) {
            str = sc.nextLine().trim().toLowerCase();
            switch(str) {
                case "yes":
                    yn = false;
                    break;
                case "exit":
                    yn = false;
                    break;
                default:
                    boolean repeat = true;
                    while (repeat) {
                        System.out.print("PLEASE TYPE ");
                        Style.print(Style.GREEN, "\"YES\"");System.out.print(" OR ");Style.print(Style.RED, "\"EXIT\"\n");
                        str = sc.nextLine().trim().toLowerCase();
                        switch (str) {
                            case "yes":
                                yn = false;
                                repeat = false;
                                break;
                            case "exit":
                                yn = repeat = false;
                                break;
                            default:
                                repeat = true;
                        }
                    }
                    break;
            }
        }
        return str;
    }
    
}
