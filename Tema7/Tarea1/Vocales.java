package Tema7.Tarea1;


public class Vocales extends AbecedarioB {

    @Override
    public AbcIterator iterator() {
        return new VocalesIterator();
    }

    class VocalesIterator extends AbcIterator {
        private int indice = 0;

        public boolean hasNext() {
            return indice < AbecedarioB.getVocales().length;
        }


        public Character next() {
            return AbecedarioB.getVocales()[indice++];
        }
    }
}


