package com.bc13.assignment3.utils;

public enum Style {
    
    RED("\033[0;31m"),
    GREEN("\033[0;32m"),
    YELLOW("\033[0;33m"),
    PURPLE("\033[0;35m"),
    CYAN("\033[0;36m"),
    PURPLE_BACK("\033[45m");    

    private final String code;

    private Style(String code) {
        this.code = code;
    }
    
    public static void println(Style color, String txt){
        System.out.println(color+txt+"\033[0m");
    }  
    
    public static void print(Style color, String txt){
        System.out.print(color+txt+"\033[0m");
    }  
    
    public static void line(){
        System.out.println("------------------------------------------------------------------------");
    }
    
    @Override
    public String toString() {
        return code;
    }

}
