package com.fundamentos.java.string;

public class ReplaceString {

    public static void main(String[] args) {

        // Replace OLD and NEW
        String text = "Trocando letras das palavras!";
        String textNew = text.replace("a", "_");

        System.out.println(textNew);

        //
        System.out.println(text.replace("a", "@"));
        System.out.println(text.replaceAll("s", "K"));
        System.out.println(text.replaceFirst("r", "R"));
    }
    
}
