package Tema7.Tarea1;

import java.util.Iterator;

public class AbecedarioB implements Iterable<Character> {
    public char[] abecedario = {'a', 'b', 'c','d', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    public char[] vocales = {'a', 'e', 'i', 'o', 'u'};
   


    @Override
    public AbcIterator iterator() {
        return new AbcIterator();
    }

    class AbcIterator implements Iterator<Character> {
        public int indice = 0;

        @Override
        public boolean hasNext() { 
            return  indice < abecedario.length;
        }

        @Override
        public Character next() {
            return abecedario[indice++];
        }

        public boolean hasNextVocal() { 
            return  indice < vocales.length;
        }

        public Character nextVocal() {
            return vocales[indice++];
        }


       
    }


}
