package org.example;

public class Calculadora {

    public int adicao(int a, int b) {
        return a + b;
    }

    public int subtracao(int a, int b) {
        return a - b;
    }

    public int multiplicacao(int a, int b) {
        return a * b;
    }

    public double divisao(double a, double b) {
        if (b == 0) {
            System.out.println("Divisão por zero não é permitida.");
        }
        return a / b;
    }
}
