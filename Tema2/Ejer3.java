package Tema2;
import java.io.Console;
import java.util.Arrays;
public class Ejer3 {
    
    public static void main(String[] args) {
        // Defino el Array
        String[] lista = new String [11];
        int palabras = 11;
        // Bucle para pedir palabras
        for (int i = 0; i < palabras;i++){
            
        Console con = System.console();
        System.out.print("Dame una palabra: ");
        lista[i] = con.readLine();
        // Digo que rompa si esta vacio 
        if (lista[i].isEmpty()){
            break;
        }
        
        }
        // Pasar el array a String para escribir
        System.out.println(Arrays.toString(lista));
    }
}

