package com.company;

import acm.program.ConsoleProgram;

/***Console Program - takes a String in Input and
 * prints the string with first letter only uppercase .
 * implement method isEnglishConsonant*/

public class Main extends ConsoleProgram {

    public static void main(String[] args) {

        (new com.company.Main()).start();
    }

    public void run() {

        println(capitalize(readLine("Insert string here: ")));



    }

    private String capitalize(String input) {
        String result = "";
        result=result+input.charAt(0);
        result=result.toUpperCase();
        input=input.toLowerCase();
        return result+input.substring(1);

    }
}