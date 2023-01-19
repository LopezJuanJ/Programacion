package Tema7.Tarea1;

public class Main {
    public static void main(String[] args) {
        Abecedario ob1 = new Abecedario();
        AbecedarioB ob2 = new AbecedarioB();
        AbecedarioB.AbcIterator iter = ob2.iterator();

        for (Character x : ob1) {
            System.out.println("Caracter: " + x);
        }


        // Funcionamiento Interno
        // Abecedario.AbcIterator it = ob1.iterator();
        // Character x;
        // while(it.hasNext()) {
        // x = it.next();

        // System.out.println(x);

        System.out.println("---------------------------------");

        while (iter.hasNextVocal()) {
            System.out.println("Vocal: " + iter.nextVocal());
        }


    }
}

