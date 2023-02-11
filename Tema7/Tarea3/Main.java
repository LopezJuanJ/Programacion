package Tema7.Tarea3;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    static int ObtenerNumero(){
        String input = System.console().readLine();
        int CantElement = Integer.parseInt(input);
        return CantElement;
    }

    static ArrayList<Integer>CompleteArray(int CantElement, ArrayList<Integer> ArrayList) {
        for (int i = 0; i < CantElement; i++) {
            ArrayList.add(i);
        }
        return ArrayList;
    }

    static void recorrerArray(int CantElement, ArrayList<Integer> ArrayList) {
        for(int i = ArrayList.size(); i > 0; i--) {
        }
    }

    static ArrayList<Integer> comprobarArrayList(int CantElement, ArrayList<Integer> ArrayList) {
        for(int i = 0; i < CantElement; i++) {
            ArrayList.contains(i);
        }
        return ArrayList;
    }
    static ArrayList<Integer> BorrarPincipales(int CantElement, ArrayList<Integer> ArrayList) {
        for(int i = 0; i < ArrayList.size();) {
            ArrayList.remove(i);
        }
        return ArrayList;
    }

    static ArrayList<Integer> BorrarFinales(int CantElement, ArrayList<Integer> ArrayList) {
        for(int i = ArrayList.size(); i > 0; i--) {
            ArrayList.remove(i - 1);
        }
        return ArrayList;
    }

    static LinkedList<Integer> CompleteLinkedList(int CantElement, LinkedList<Integer> Linkedlista) {
        for(int i = 0; i < CantElement; i++) {
            Linkedlista.addFirst(i);
        }
        return Linkedlista;
    }

    static void RecorrerLinkedList(int CantElement, LinkedList<Integer> Linkedlista) {
        for(int i = Linkedlista.size(); i > 0; i--) {
        }
    }

    static LinkedList<Integer> ComprobarLinkedList(int CantElement, LinkedList<Integer> Linkedlista) {
        for(int i = 0; i < CantElement; i++) {
            Linkedlista.contains(i);
        }
        return Linkedlista;
    }

    static LinkedList<Integer> BorrarPrincipalesLinked(int CantElement, LinkedList<Integer> Linkedlista) {
        for(int i = 0; i < Linkedlista.size();) {
            Linkedlista.remove(i);
        }
        return Linkedlista;
    }

    static LinkedList<Integer>BorrarFinalesLinked(int CantElement, LinkedList<Integer> Linkedlista) {
        for(int i = Linkedlista.size(); i > 0; i--) {
            Linkedlista.remove(i - 1);
        }
        return Linkedlista;
    }

    public static void main(String[] args) {
        
        System.out.print("¿Cual Sera El Tamaño De La Lista?: ");
        int CantElement = ObtenerNumero();

        System.out.print("¿Cuantas veces probamos?: ");
        int numerorepeticions = ObtenerNumero() + 1;

        ArrayList<Integer> ArrayList = new ArrayList<Integer>();
        LinkedList<Integer> Linkedlista = new LinkedList<Integer>();

        long t0Lleno = System.nanoTime();

            for(int i = 0; i <numerorepeticions; i++) {
                CompleteArray(CantElement, ArrayList);
            }

        long t1Lleno = System.nanoTime();

        long t0recorrerArray = System.nanoTime();            
            for(int i = 0; i < numerorepeticions; i++) {
                recorrerArray(CantElement, ArrayList);
            }
        long t1recorrerArray = System.nanoTime();


        long t0comprobarArrayList = System.nanoTime();
            for(int i = 0; i < numerorepeticions; i++) {
                comprobarArrayList(CantElement, ArrayList);
            }
        long t1comprobarArrayList = System.nanoTime();

        long t0BorrarPincipales = System.nanoTime();
            for(int i =0; i < numerorepeticions; i++) {
                BorrarPincipales(CantElement, ArrayList);
            }
        long t1borrarElementPrincipioArrayList = System.nanoTime();

        CompleteArray(CantElement, ArrayList);

        long t0BorrarElemtFinalArrayList = System.nanoTime();

            for(int i = 0; i < numerorepeticions; i++) {
                BorrarFinales(CantElement, ArrayList);
            }

        long t1BorrarElemtFinalArrayList = System.nanoTime();

        long t0CompleteLinkedList = System.nanoTime();
            
            for(int i = 0; i < numerorepeticions; i++) {
                CompleteLinkedList(CantElement, Linkedlista);
            }

        long t1LlenarLinkeList = System.nanoTime();

        long t0RecorrerLinkedList = System.nanoTime();

            for(int i = 0; i < numerorepeticions; i++) {
                RecorrerLinkedList(CantElement, Linkedlista);
            }

        long t1RecorrerLinkedList = System.nanoTime();

        long t0ComprobarLinkedList = System.nanoTime();
            for(int i = 0; i < numerorepeticions; i++) {
                ComprobarLinkedList(CantElement, Linkedlista);
            }
        long t1ComprobarLinkedList = System.nanoTime();

        long t0BorrarPrincipalesLinked = System.nanoTime();
            for(int i = 0; i < numerorepeticions; i++) {
                BorrarPrincipalesLinked(CantElement, Linkedlista);
            }
        long t1BorrarPrincipalesLinked = System.nanoTime();

        CompleteLinkedList(CantElement, Linkedlista);

        long t0BorrarFinalesLinked = System.nanoTime();
            for(int i = 0; i < numerorepeticions; i++) {
                BorrarFinalesLinked(CantElement, Linkedlista);
            }
        long t1BorrarFinalesLinked = System.nanoTime();

        long diferenzaencher = (t1Lleno - t0Lleno) / numerorepeticions;
        long diferenzaCompleteLinkedList = (t1LlenarLinkeList - t0CompleteLinkedList) / numerorepeticions;

        long diferenzarecorrerArrayList = (t1recorrerArray - t0recorrerArray) / numerorepeticions;
        long diferenzarecorrerLinkedList = (t1RecorrerLinkedList - t0RecorrerLinkedList) / numerorepeticions;

        long diferenzacomprobarArrayList = (t1comprobarArrayList - t0comprobarArrayList) / numerorepeticions;
        long diferenzacomprobarLinkedList = (t1ComprobarLinkedList - t0ComprobarLinkedList) / numerorepeticions;

        long diferenzaborrarArrayList = (t1borrarElementPrincipioArrayList - t0BorrarPincipales) / numerorepeticions;
        long diferenzaborrarLinkedList = (t1BorrarPrincipalesLinked - t0BorrarPrincipalesLinked) / numerorepeticions;

        long diferenzaborrarfinalArrayLsit = (t1BorrarElemtFinalArrayList - t0BorrarElemtFinalArrayList) / numerorepeticions;
        long diferenzaborrarfinalLinkedList = (t1BorrarFinalesLinked - t0BorrarFinalesLinked) / numerorepeticions;

        System.out.println("Tiempo medio llenar ArrayList: " + diferenzaencher);
        System.out.println("Tiempo medio llenar LinkedList: " + diferenzaCompleteLinkedList);
        System.out.println("\n");
        System.out.println("Tiempo medio recorrer  ArrayList: " + diferenzarecorrerArrayList);
        System.out.println("Tiempo medio en recorrer o LinkedList: " + diferenzarecorrerLinkedList);
        System.out.println("\n");
        System.out.println("Tiempo medio comprobar ArrayList: " + diferenzacomprobarArrayList);
        System.out.println("Tiempo medio comprobar LinkedList: " + diferenzacomprobarLinkedList);
        System.out.println("\n");
        System.out.println("Tiempo medio en borrar principales ArrayList: " + diferenzaborrarArrayList);
        System.out.println("Tiempo medio en borrar principales LinkedList: " + diferenzaborrarLinkedList);
        System.out.println("\n");
        System.out.println("Tiempo medio en borrar finales ArrayList: " + diferenzaborrarfinalArrayLsit);
        System.out.println("Tiempo medio en borrar finales LinkedList: " + diferenzaborrarfinalLinkedList);
    }

}