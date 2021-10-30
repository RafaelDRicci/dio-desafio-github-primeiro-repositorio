package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b;

        System.out.println("Entre com A:");
        a = sc.nextInt();
        System.out.println("Entre com B:");
        b =sc.nextInt();

        int somar = somar(a, b);
        int subtrair = subtrair(a, b);
        int multiplicar = multiplicar(a, b);
        float dividir = dividir(a, b);

        System.out.println("Soma = " + somar);
        System.out.println("Subtração = " + subtrair);
        System.out.println("Multiplicação = " + multiplicar);
        System.out.println("Divisão = " + dividir);

    }

    public static int somar(int a, int b){
        return a + b;
    }
    public static int subtrair(int a, int b){
        return a - b;
    }
    public static int multiplicar(int a, int b){
        return a * b;
    }
    public static float dividir(int a, int b){
        return (float)a / b;
    }

}

