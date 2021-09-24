package com.bc13.assignment3.models;

public enum Fabric {

    WOOL, POLYESTER, LINEN, RAYON, COTTON, CASHMERE, SILK;
    
    public static double getFabricPrice(int ordinal) {
        double result = 0;
        switch(ordinal) {
            case 0:
                result = 2.5;
                break;
            case 1:
                result = 4.5;
                break;
            case 2:
                result = 5;
                break;
            case 3:
                result = 7.5;
                break;
            case 4:
                result = 8.2;
                break;
            case 5:
                result = 9.3;
                break;
            case 6:
                result = 10;
                break;
        }
                
        return result;
    }
    
}
