package org.jdev.oo.deitel.arrays;

public class BarChart {

    public static void main(String[] args) {

       int[] elementos =  { 0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1 };

       System.out.println("Grafico de barras.");

       for (int contador = 0; contador < elementos.length; contador ++) {
           if (contador == 10) {
               System.out.printf("%5d: ", 100);
           } else {
               System.out.printf("%02d-%02d: ", contador * 10, contador * 10 + 9);
           }
           for(int asterisco = 0; asterisco < elementos[contador]; asterisco++)
               System.out.print("*");

           System.out.println();
       }
    }
}
