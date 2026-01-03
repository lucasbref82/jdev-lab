package org.jdev.oo.deitel.arrays;

public class InitArray {
    public static void main(String[] args) {

        int[] elementos = {10, 20 ,30, 40, 50, 60, 70}
                ;
        System.out.printf("%s%8s%n", "Index", "Value");

        for (int i = 0; i < elementos.length; i++) {

            System.out.printf("%s%8s%n", i, elementos[i]);

        }

    }
}
