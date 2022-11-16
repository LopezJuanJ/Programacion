package Tema4;

import java.util.Arrays;


public class Numeros {

    // Propiedades
    private int[] valores;

    // public Numeros(int[] valores) {
    //     this.valores = valores;
    // }

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
            if (mayor < valores[i]) {
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
            if (menor > valores[i]) {
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
        if (valores.length % 2 != 0) {
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
            return (valores[PosCentral - 1] + valores[PosCentral]) / 2;
        }
    }

    public int[] dameLosPares() {
        // Contar pares
        int numeroDePares = 0;
        for (int valor : valores) {
            if (valor % 2 == 0)
                ;
            ++numeroDePares;
        }
        int[] pares = new int[numeroDePares];
        int posicionPares = 0;
        for (int valor : valores) {
            if (valor % 2 == 0) {
                pares[posicionPares] = valor;
                ++posicionPares;
            }
        }
        return pares;
    }

    public boolean saberSiEsPrimo(int numeroComprobar) {
    boolean res = true;
        if (numeroComprobar == 0 || numeroComprobar == 1){
            res = false;
        }else {
            for (int i=numeroComprobar-1; i > 1; i--){
                if(numeroComprobar % i ==0 ){
                    res = false;
                }
            }
        }
        return res;
    }

    public int numerodeprimos(){
        int contador= 0;
        for (int i=0; i< valores.length;i++){
            if (saberSiEsPrimo(i) == true){
                contador++;
            }
        }
        return contador;
    }

    public int[] guardarPrimos(){
        int[] primos = new int[numerodeprimos()];
        int contador = 0;
        for (int i=0; i< valores.length;i++){
            if (saberSiEsPrimo(i) == true){
                primos[contador] = valores[i];
                contador++;
            }
        }
        return primos;
    }
    public int[] insertarnumero(int numeroAInsertar){
        
        int tamañoinicial = valores.length;
        int tamañoNuevo = valores.length +1;
        int[] nuevoArray = new int[tamañoNuevo];
        for (int i = 0; i < valores.length; i++){
            nuevoArray[i] = valores[i];
        }
        nuevoArray[tamañoinicial] = numeroAInsertar;
        return nuevoArray;
    }
    
    public int[] insertarnumeroposicion(int numeroAInsertar, int posicion){
        
        int tamañoinicial = valores.length;
        int tamañoNuevo = valores.length +1;
        int[] nuevoArray = new int[tamañoNuevo];
        for (int i = 0; i < valores.length; i++){
            nuevoArray[i] = valores[i];
        }
        nuevoArray[tamañoinicial] = nuevoArray[posicion];
        nuevoArray[posicion]=numeroAInsertar;
        return nuevoArray;
    }
    public int[] insertarnumeroPrincipio(int numeroAInsertar){
        
        int tamañoinicial = valores.length;
        int tamañoNuevo = tamañoinicial +1;
        int[] nuevoArray = new int[tamañoNuevo];
        for (int i = 0; i < valores.length; i++){
            nuevoArray[i + 1] = valores[i];
        }
        nuevoArray[0]=numeroAInsertar;
        return nuevoArray;
    }
    public int[] insertarnumeroFinal(int numeroAInsertar){
        
        int tamañoinicial = valores.length;
        int tamañoNuevo = valores.length +1;
        int posicionfinal = tamañoinicial;
        int[] nuevoArray = new int[tamañoNuevo];
        for (int i = 0; i < valores.length; i++){
            nuevoArray[i] = valores[i];
        }
        nuevoArray[posicionfinal]=numeroAInsertar;
        return nuevoArray;
    }
       
    public boolean saberSiExiste(int numeroAComprobar){
        boolean res= false;
        for (int i = 0; i < valores.length;i++ ){
            if (valores[i] == numeroAComprobar){
                res = true;
            } 
            }
            return res;
        }

}
