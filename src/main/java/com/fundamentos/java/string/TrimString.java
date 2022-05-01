package com.fundamentos.java.string;

public class TrimString {

    public static void main(String[] args) {

        String text = "  Hello, World!";
        // String newText = text.trim();

        // Without Trim
        System.out.println(text + "    Fhrase");
        // With Trim
        System.out.println(text.trim() + "    Fhrase".trim());

    }
    
}
