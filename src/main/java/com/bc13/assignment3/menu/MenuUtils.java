package com.bc13.assignment3.menu;

import com.bc13.assignment3.models.TShirt;
import com.bc13.assignment3.utils.Cart;
import com.bc13.assignment3.utils.Style;
import com.bc13.assignment3.utils.Validations;
import java.util.List;

public class MenuUtils {
    
    public static void menuOptions() {
        Style.line();
        Style.print(Style.YELLOW, "M E N U");
        Style.print(Style.YELLOW,"\n1) ");System.out.println("SHOW T-SHIRTS");
        Style.print(Style.YELLOW,"2) ");System.out.println("ADD T-SHIRT TO CART");
        Style.print(Style.YELLOW,"3) ");System.out.println("REMOVE T-SHIRT FROM CART");
        Style.print(Style.YELLOW,"4) ");System.out.println("SHOW CART");
        Style.print(Style.YELLOW,"5) ");System.out.println("CHOOSE PAYMENT METHOD\n");
        System.out.print("TO DISPLAY MENU TYPE ");Style.println(Style.YELLOW, "\"MENU\"");
        Style.println(Style.RED,"TO LEAVE APP TYPE \"EXIT\"");
        Style.line();
    }
    
    public static void exit() {
        Style.println(Style.PURPLE,"\n\n\n_____________________THANK YOU FOR USING OUR E-SHOP_____________________");
        System.exit(0);
    }
    
    public static void showAllTShirts(List<TShirt> allTShirts) {
        Style.println(Style.PURPLE, "ALL T-SHIRTS:\n");        
        Style.println(Style.PURPLE, "ID____COLOR____SIZE____FABRIC____PRICE");        
        for (TShirt allTShirt : allTShirts) {
            System.out.println(allTShirt);
        }
        Style.line();  
    }
    
    public static void addTShirtToCart(List<TShirt> allTShirts, Cart cart) {
        int id = Validations.positiveIntInput();
        if (cart.addItem(id, allTShirts)) {
            Style.println(Style.GREEN, "T-SHIRT WITH ID "+id+" ADDED TO CART");
        } else {
            Style.println(Style.RED, "T-SHIRT WITH ID "+id+" COULD NOT BE FOUND!!!");
        } 
        Style.line();
    }
    
    public static void removeTShirtFromCart(List<TShirt> allTShirts, Cart cart) {
        int id = Validations.positiveIntInput();
        if (cart.removeItem(id)) {
            Style.println(Style.GREEN, "T-SHIRT WITH ID "+id+" REMOVE FROM CART");
        } else {
            Style.println(Style.RED, "T-SHIRT WITH ID "+id+" COULD NOT BE FOUND IN THE CART!!!");
        } 
        Style.line();
    }
    
    public static Cart continueOrNot() {
        System.out.print("\nDO YOU WANNA MAKE ANOTHER ORDER?\nIF YOU DO SO TYPE ");
        Style.println(Style.GREEN, "\"YES\"");
        System.out.print("OTHERWISE TYPE ");Style.print(Style.RED, "\"EXIT\"");System.out.print(" TO LEAVE THE E-SHOP\n");
        String answer = Validations.yesOrNo();
        if (answer.equals("yes")){
            return new Cart();
        } else if (answer.equals("exit")){
            exit();
        }
        return null;
    }
    
    public static int showPaymentMethods() {
        System.out.println("CHOOSE ONE OF THE FOLLOWING METHODS TO CONTINUE...\n");
        Style.print(Style.YELLOW,"\n1) ");System.out.println("CASH (+2€)");
        Style.print(Style.YELLOW,"2) ");System.out.println("Credit / Debit Card (+1€)");
        Style.print(Style.YELLOW,"3) ");System.out.println("Money / Bank Transfer");
        return Validations.giveOnlyInteger(1, 3);
    }
    
    public static void showCart(Cart cart) {
        if (cart.getOrderedItems().isEmpty()) {
            Style.println(Style.RED, "CART IS EMPTY AT THE MOMENT");
        } else {
            Style.println(Style.PURPLE, "ALL CARTS T-SHIRTS:\n");        
            Style.println(Style.PURPLE, "ID____COLOR____SIZE____FABRIC____PRICE"); 
            for (TShirt tShirt : cart.getOrderedItems()) {
                System.out.println(tShirt);
            }
            Style.println(Style.PURPLE, "\nTOTAL CART AMOUNT " + cart.totalOrderCost());
            Style.line();
        }
    }
    
}
