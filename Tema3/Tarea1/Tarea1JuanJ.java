package Tema3.Tarea1;
import java.io.Console;
import java.util.Arrays;

public class Tarea1JuanJ {
    public static void main(String[] args) {
        Console c = System.console();
        int contador = 0;
        // Presentacion
        System.out.println("Bienvenido a la Tarea 1");

        // Recibir Palabras
        System.out.print("Dime unas palabras separadas por \",\": ");
        String recibido = c.readLine();
        // Dividir String
        String[] separado = recibido.split(", ");

        System.out.println("|--------------------|");
        System.out.println("| Lista de palabras: ");
        for (int i = 0; i < separado.length; i++) {
            System.out.println("| " + separado[i]);
        }
        System.out.println("|--------------------|");

        Arrays.sort(separado);

        // Elección de Opciones
        System.out.println("1. Filtrar");
        System.out.println("2. Dividir");

        System.out.print("Dime el numero de la opcion que escogiste: ");
        int eleccion = Integer.parseInt(c.readLine());

        if (eleccion == 1) {

            System.out.println("Has escogido 1. Filtrar");
            System.out.print("Dime alguna palabra o letra para filtrar: ");
            String flitrada = c.readLine();
            for (int i = 0; i < separado.length; i++) {

                if (separado[i].startsWith(flitrada)) {
                    contador++;

                }

            }
            String[] coincidentes = new String[contador];
            contador = 0;
            for (int i = 0; i < separado.length; i++) {

                if (separado[i].startsWith(flitrada)) {
                    coincidentes[contador] = separado[i];
                    contador++;

                }

            }
            System.out.println(Arrays.toString(coincidentes));

        } else if (eleccion == 2) {
            System.out.println("Has escogido 2. Dividir");
            System.out.print("Dime una palabra para dividir: ");
            String dividida = c.readLine();
            for (int i = 0; i < separado.length; i++) {
                if (separado[i].compareTo(dividida) >= 0) {
                    contador = i;
                    break;
                }
            }
            String[] lista1 = new String[contador];
            String[] lista2 = new String[separado.length - contador];

            for (int i = 0; i < separado.length; i++) {
                if (i < contador) {
                    lista1[i] = separado[i];

                } else {
                    lista2[i - contador] = separado[i];
                }
            }
            System.out.println("Lista Primera:");
            System.out.println(Arrays.toString(lista1));
            System.out.println("Segunda Lista:");
            System.out.println(Arrays.toString(lista2));
        } else {
            System.out.println("No es una opción correcta ");
        }

    }
}