package com.bc13.assignment3.payment;

import com.bc13.assignment3.utils.Style;

public class Cash implements PaymentMethod {

    @Override
    public void pay(double amount) {
        Style.println(Style.GREEN,"You will receive the order between 1-3 days at your home!\nTotal price " + amount);
    }

}
