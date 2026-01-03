package org.jdev.oo.deitel.arrays;

public class SumArray {
    public static void main(String[] args) {
        int[] elementos = {10, 20 ,30 ,40 ,50 ,60 ,70, 80, 90 ,120};
        int soma = 0;

        for (int i = 0; i < elementos.length; i++)
            soma += elementos[i];

        System.out.println("A soma dos valores é: " + soma);
    }

}
