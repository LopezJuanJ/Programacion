package Tema4;

import java.util.Arrays;

public class Numeros {

    // Propiedades
    private int[] valores;

    public Numeros(int[] valores ) {
        this.valores = valores;
    }

    public void asignaValores(int[] valores) {
        this.valores = valores;
    }
    public int[] dameValores() {
        return valores;
    }

    // Contructor
    public int mayor() {
        int mayor = valores[0];
        
        // Recorre los numeros hasta encontrar el numero mayor
        for (int i = 0; i < valores.length; i++) {
            if (mayor < valores[i]){
                mayor = valores[i]; 
            }
        }
        
        // Devuelve la variable una vez acabo
        return mayor;
    }
    
    // Contructor
    public int menor() {
        int menor = valores[0];
        
        // Recorre los numeros hasta encontrar el numero menor
        for (int i = 0; i < valores.length; i++) {
            if (menor > valores[i]){
                menor = valores[i]; 
            }
        }
        
        // Devuelve la variable una vez acabo
        return menor;
    }

    // Contructor
    public double media() {
        int total = 0;

        for (int valor : valores) {
            total = total + valor;
        }
        return total;
    }

    public double mediana() {
        if (valores.length % 2 != 0){ 
        // Caso 1 Long Impar
        // 1.Ordenar la lista
        Arrays.sort(valores); 
       int PosCentral = valores.length / 2;
       return valores[PosCentral];
    } else { 
       
       // Caso 2 Long Par
       // 1.Ordenar la lista
       Arrays.sort(valores); 
       int PosCentral = valores.length / 2;
       return (valores[PosCentral -1 ] + valores[PosCentral])/2; 
    }
    }
}
