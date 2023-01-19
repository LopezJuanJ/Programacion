package Tema7.Tarea1;

import java.util.Iterator;

public class Vocales extends Abecedario {

    private char[] vocales = {'a', 'e', 'i', 'o', 'u'};


    public VocalesIterator iterator() {
        return new VocalesIterator();
    }

    class VocalesIterator implements Iterator<Character> {
        private int indice = 0;

        public boolean hasNext() {
            return indice < vocales.length;
        }

        public Character next() {
            return vocales[indice++];
        }
    }
}


