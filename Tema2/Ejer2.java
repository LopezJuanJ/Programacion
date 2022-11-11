package Tema2;

// Importo la consola
import java.io.Console;

public class Ejer2 {
    public static void main(String[] args) {
        // Defino una variable para usar la consola
        Console con = System.console();
        // Obtengo palabras
        System.out.print("Dime una palabra: ");
        String palabra1 = con.readLine();
        System.out.print("Dime otra palabra: ");
        String palabra2 = con.readLine();
        // Comparo
        // Con CompareTo si comaparo 2 palabrases:
        // La primera palabra seria -1
        // Luego esta 0
        // La Segunda seria 1
        // Por eso uso <>=0
        if (palabra1.compareTo(palabra2) > 0) {
            System.out.println("La palabra " + palabra1 + " es mayor lexicograficamente");
        } else if (palabra1.compareTo(palabra2) < 0) {
            System.out.println("La palabra " + palabra1 + " es menor lexicograficamente");
        } else {
            System.out.println("Las palabras son iguales lexicograficamente");
        }
    }
}
