package com.tts;


public class Main {
    public static void main(String[] args) {


        System.out.println("==== ADDITION ====");
        System.out.println(Calculator.add(10,20));

        System.out.println("==== SUBTRACTION ====");
        System.out.println(Calculator.subtract(20,10));

        System.out.println("==== MULTIPLICATION ====");
        System.out.println(Calculator.multiply(10,20));

        System.out.println("==== DIVISION ====");
        System.out.println(Calculator.divide(20,10));

        System.out.println("==== SQUARE ====");
        System.out.println(Calculator.square(10));

        System.out.println("==== SQUARE ROOT ====");
        System.out.println(MagicCalculator.sRoot(81));

        System.out.println("==== SINE ====");
        System.out.println(MagicCalculator.sin(35));

        System.out.println("==== COSINE ====");
        System.out.println(MagicCalculator.cos(35));

        System.out.println("==== TANGENT ====");
        System.out.println(MagicCalculator.tan(35));

        System.out.println("==== FACTORIAL ====");
        System.out.println(MagicCalculator.factorial(10));



    }
}
