package com.bc13.assignment3.utils;

import com.bc13.assignment3.models.TShirt;
import com.bc13.assignment3.payment.Cash;
import com.bc13.assignment3.payment.CreditDebitCard;
import com.bc13.assignment3.payment.MoneyBankTransfer;
import com.bc13.assignment3.payment.PaymentMethod;
import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<TShirt> orderedItems;

    public Cart() {
        orderedItems = new ArrayList<>();
    }

    public boolean addItem(int id, List<TShirt> tShirts) {
        TShirt tShirt = Utils.getTShirtById(id, tShirts);
        if (tShirt != null) {
            orderedItems.add(tShirt);
            return true;
        }
        return false;
    }

    public boolean removeItem(int id) {
        TShirt tShirt = Utils.getTShirtById(id, orderedItems);
        if (tShirt != null) {
            orderedItems.remove(tShirt);
            return true;
        }
        return false;
    }

    public double totalOrderCost() {
        double sum = 0;
        for (TShirt orderItem : orderedItems) {
            sum += orderItem.getPrice();
        }
        return Utils.roundTo2DecimalPoints(sum);
    }

    public void executePayment(PaymentMethod paymentMethod) {
        double sum = totalOrderCost();
        if (paymentMethod instanceof Cash) {
            paymentMethod.pay(sum + 2);
        } else if (paymentMethod instanceof CreditDebitCard) {
            paymentMethod.pay(sum + 1);
        } else if (paymentMethod instanceof MoneyBankTransfer) {
            paymentMethod.pay(sum);
        }       
    }

    public List<TShirt> getOrderedItems() {
        return orderedItems;
    }

}
