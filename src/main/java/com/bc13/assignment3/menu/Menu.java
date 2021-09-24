package com.bc13.assignment3.menu;

import com.bc13.assignment3.models.TShirt;
import com.bc13.assignment3.payment.Cash;
import com.bc13.assignment3.payment.CreditDebitCard;
import com.bc13.assignment3.payment.MoneyBankTransfer;
import com.bc13.assignment3.utils.Cart;
import com.bc13.assignment3.utils.Generator;
import com.bc13.assignment3.utils.Style;
import java.util.List;
import java.util.Scanner;

public class Menu {
    
    public static void menu() {
        Style.print(Style.PURPLE,"_________________________WELCOME TO OUR E-SHOP__________________________\n\n\n");
        Scanner sc = new Scanner(System.in); 
        Cart cart = new Cart();
        Generator generator = new Generator();
        List<TShirt> allTShirts = generator.generateTShirts();
        MenuUtils.menuOptions();
        while (true) {
            Style.println(Style.YELLOW, "TYPE ONE OF THE MENU'S CHOICES TO CONTINUE...");
            String str = sc.nextLine();
            String choice = str.trim().toUpperCase();
            switch (choice) {
                case "1":
                    MenuUtils.showAllTShirts(allTShirts);
                    break;
                case "2":
                    MenuUtils.addTShirtToCart(allTShirts, cart);
                    break;
                case "3":
                    MenuUtils.removeTShirtFromCart(allTShirts, cart);
                    break;
                case "4":
                    MenuUtils.showCart(cart);
                    break;
                case "5":
                    if (cart.getOrderedItems().isEmpty()) {
                        Style.println(Style.RED, "CART IS EMPTY AT THE MOMENT");
                        break;
                    }
                    int option = MenuUtils.showPaymentMethods();
                    switch (option) {
                        case 1:
                            cart.executePayment(new Cash());
                            cart = MenuUtils.continueOrNot();
                            break;
                        case 2:
                            cart.executePayment(new CreditDebitCard());
                            cart = MenuUtils.continueOrNot();
                            break;
                        case 3:
                            cart.executePayment(new MoneyBankTransfer());
                            cart = MenuUtils.continueOrNot();
                            break;
                        default:
                            break;
                    }
                    break;
                case "MENU":
                    MenuUtils.menuOptions(); 
                    break;
                case "EXIT":
                    MenuUtils.exit();
                default:
                    Style.println(Style.RED,"WRONG INPUT!!!\n");
                    break;
            }
        }
    }
 
}
