package com.bc13.assignment3.models;

public enum Color {

    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET;
    
    public double getColorPrice(int ordinal) {
        double result = 0;
        switch(ordinal) {
            case 0:
                result = 0.5;
                break;
            case 1:
                result = 0.3;
                break;
            case 2:
                result = 0.3;
                break;
            case 3:
                result = 0.25;
                break;
            case 4:
                result = 0.6;
                break;
            case 5:
                result = 0.2;
                break;
            case 6:
                result = 0.1;
                break;
        }
                
        return result;
    }
    
}
