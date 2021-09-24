package com.bc13.assignment3.models;

public enum Size {

    XS, S, M, L, XL, XXL, XXXL;

    public static double getSizePrice(int ordinal) {
        double result = 0;
        switch (ordinal) {
            case 0:
                result = 0.3;
                break;
            case 1:
                result = 0.3;
                break;
            case 2:
                result = 0.4;
                break;
            case 3:
                result = 0.5;
                break;
            case 4:
                result = 0.5;
                break;
            case 5:
                result = 0.5;
                break;
            case 6:
                result = 0.6;
                break;
        }

        return result;
    }

}
