package Tema4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Numeros numeros = new Numeros(new int[] { 1, 2, 3, 4, 15, 3, 1, 8, 3});
        System.out.println(numeros.dameValores().length);
        System.out.println("El array es: " + Arrays.toString(numeros.dameValores()));
        System.out.println("La media es: " + numeros.media());
        System.out.println("La mediana es: " + numeros.mediana());
    }
}
