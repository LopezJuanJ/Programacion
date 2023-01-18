package Tema7.Tarea1;

import java.util.Iterator;

public class Abecedario implements Iterable<Character> {
    private char[] abecedario = {'a', 'b', 'c','d', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    

    @Override
    public Iterator<Character> iterator() {
        return new AbcIterator();
    }

    class AbcIterator implements Iterator<Character> {

        @Override
        public boolean hasNext() {
            // TODO Auto-generated method stub
            return false;
        }

        @Override
        public Character next() {
            // TODO Auto-generated method stub
            return null;
        }

       
    }


}
