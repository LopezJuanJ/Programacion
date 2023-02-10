public class Main {
    public static void main(String[] args) {
        Pila<Integer> pila = new Pila<>();
        
        pila.push(1);
        pila.push(2);
        pila.push(3);
        
        System.out.println(pila.pop());
        System.out.println(pila.pop()); 
        System.out.println(pila.pop()); 
        
    }
}
