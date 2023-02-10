import java.util.LinkedList;

public class Pila<T> {
    private LinkedList<T> lista;
        
     public Pila() {
        lista = new LinkedList<>();
    }
        
    public void push(T elemento) {
        lista.addLast(elemento);
     }
        
    public T pop() {
        if (lista.isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
            return lista.removeLast();
        }
    }    

