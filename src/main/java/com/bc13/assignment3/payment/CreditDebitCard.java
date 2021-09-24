package com.bc13.assignment3.payment;

import com.bc13.assignment3.utils.Style;

public class CreditDebitCard implements PaymentMethod {

    @Override
    public void pay(double amount) {
        Style.println(Style.GREEN,"Payment via Credit / Debit Card was made successfully!\nTotal price " + amount);
    }

}
