package com.example.mockbankapp1;

public class SimpleMath {
    public int IncreaseByTwo(int a) {
        return a + 2;
    }

    public int Modulo(int a, int b) {
        return a % b;
    }

    public int Squared(int a) {
        return a * a;
    }

    public double Pythagoras(int x, int y) {
        return Math.sqrt((x * x) + (y * y));
    }

    public String CombineStrings(String a, String b) {
        return a + b;
    }

}
