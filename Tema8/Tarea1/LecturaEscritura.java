package Tema8.Tarea1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class LecturaEscritura {

    // Ejercicio 1: escribir texto a un fichero
    public static void writeTextToFile(String fileName, String text) {
        try {
            File file = new File(fileName);
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(text);
            bw.close();
            fw.close();
        } catch (IOException e) {
            System.out.println("Error al escribir en el fichero " + fileName + ": " + e.getMessage());
        }
    }

    // Ejercicio 2: añadir texto a un fichero
    public static void appendTextToFile(String fileName, String text) {
        try {
            File file = new File(fileName);
            FileWriter fw = new FileWriter(file, true); // true para añadir al final del fichero
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(text);
            bw.close();
            fw.close();
        } catch (IOException e) {
            System.out.println("Error al escribir en el fichero " + fileName + ": " + e.getMessage());
        }
    }

    // Ejercicio 3: añadir varias líneas a un fichero
    public static void appendLinesToFile(String fileName, List<String> lines) {
        try {
            File file = new File(fileName);
            FileWriter fw = new FileWriter(file, true); // true para añadir al final del fichero
            BufferedWriter bw = new BufferedWriter(fw);
            for (String line : lines) {
                bw.write(line);
                bw.newLine(); // añadir un salto de línea después de cada línea
            }
            bw.close();
            fw.close();
        } catch (IOException e) {
            System.out.println("Error al escribir en el fichero " + fileName + ": " + e.getMessage());
        }
    }

    // Ejercicio 4: leer texto de un fichero
    public static List<String> readLinesFromFile(String fileName) {
        List<String> lines = new ArrayList<String>();
        try {
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
            br.close();
            fr.close();
        } catch (IOException e) {
            System.out.println("Error al leer el fichero " + fileName + ": " + e.getMessage());
        }
        return lines;
    }

}
