package com.bc13.assignment3.utils;

import com.bc13.assignment3.models.TShirt;
import java.util.List;

public class Utils {

    public static TShirt getTShirtById(int id, List<TShirt> tShirts) {
        for (TShirt tShirt : tShirts) {
            if (tShirt.getId() == id) {
                return tShirt;
            }
        }
        return null;
    }

    public static double roundTo2DecimalPoints(double value) {
        long tmp = Math.round(value * 100);
        return (double) tmp / 100;
    }

}
