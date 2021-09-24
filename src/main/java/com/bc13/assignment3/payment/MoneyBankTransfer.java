package com.bc13.assignment3.payment;

import com.bc13.assignment3.utils.Style;

public class MoneyBankTransfer implements PaymentMethod {

    @Override
    public void pay(double amount) {
        Style.println(Style.GREEN,"Payment via Money / Bank Transfer was made successfully!\nTotal price " + amount);
    }

}
