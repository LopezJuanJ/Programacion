package Tema2;
import java.io.Console;
public class Ejer1 {
    public static void main(String[] args) {
        Console con = System.console();
        System.out.print("Dime una palabra: ");
        String palabra1 = con.readLine();
        System.out.print("Dime otra palabra: ");
        String palabra2 = con.readLine();

        if ( palabra1.equals(palabra2)) {
            System.out.println("Las palabras son iguales");
        } else {
            System.out.println("Las palabras son distintas");
        }
    }
}