package Tema5.Ejercicio1;

public class Animal extends SerVivo {
     private int peso;

     public Animal(String ncomun, String ncientifico, int altura, int peso) {
          super(ncomun, ncientifico, altura);
          this.peso= peso;
     }
     public int getPeso() {
          return peso;
      }


}
