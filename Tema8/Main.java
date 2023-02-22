package Tema8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    // En esta tarea eh decidido usar scanner para probar su uso, ya que siempre trabaco con console
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
    
        // Ejercicio 1: escribir texto a un fichero
        System.out.println("Ejercicio 1 - Escribir texto en un fichero");
        System.out.print("Introduce el nombre del fichero: ");
        String fileName1 = scanner.nextLine();
        System.out.print("Introduce el texto a escribir: ");
        String text1 = scanner.nextLine();
        LecturaEscritura.writeTextToFile(fileName1, text1);
        System.out.println("Contenido del fichero " + fileName1 + ":");
        System.out.println(LecturaEscritura.readLinesFromFile(fileName1));
    
        // Ejercicio 2: añadir texto a un fichero
        System.out.println("Ejercicio 2 - Añadir texto a un fichero");
        System.out.print("Introduce el nombre del fichero: ");
        String fileName2 = scanner.nextLine();
        System.out.print("Introduce el texto a añadir: ");
        String text2 = scanner.nextLine();
        LecturaEscritura.appendTextToFile(fileName2, text2);
        System.out.println("Contenido del fichero " + fileName2 + ":");
        System.out.println(LecturaEscritura.readLinesFromFile(fileName2));
    
        // Ejercicio 3: añadir varias líneas a un fichero
        System.out.println("Ejercicio 3 - Añadir varias líneas a un fichero");
        System.out.print("Introduce el nombre del fichero: ");
        String fileName3 = scanner.nextLine();
        System.out.print("Introduce el número de líneas a añadir: ");
        int numLines = scanner.nextInt();
        scanner.nextLine(); // consumir el salto de línea
        List<String> lines = new ArrayList<String>();
        for (int i = 1; i <= numLines; i++) {
            System.out.print("Introduce la línea " + i + ": ");
            String line = scanner.nextLine();
            lines.add(line);
        }
        LecturaEscritura.appendLinesToFile(fileName3, lines);
        System.out.println("Contenido del fichero " + fileName3 + ":");
        System.out.println(LecturaEscritura.readLinesFromFile(fileName3));
    
        scanner.close();
    }
    
}
