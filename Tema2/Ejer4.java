package Tema2;
import java.io.Console;
import java.util.Arrays;

public class Ejer4 {

    public static void main(String[] args) {
        // Defino el Array
        String[] lista = new String[10];
        int aux = 0;
        // Bucle para pedir palabras
        for (int i = 0; i < lista.length; i++) {

            Console con = System.console();
            System.out.print("Dame una palabra: ");
            lista[i] = con.readLine();
            // Digo que rompa si esta vacio
            if (lista[i].isEmpty()) {
                break;
            }

        }

        for (int i = 0; i < lista.length; i++) {
            if (lista[i].isEmpty()) {
                aux = i;
                break;
            }
        }

        String[] contenido = Arrays.copyOfRange(lista, 0, aux);
        // Pasar el array a String para escribir
        Arrays.sort(contenido);
        System.out.println(Arrays.toString(contenido));
    }
}