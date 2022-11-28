package Tema5;

import Tema5.Ejercicio1.Animal;
import Tema5.Ejercicio1.SerVivo;

public class Main {
    public static void main(String[] args) {
   
    SerVivo seres = new SerVivo("pepe", "pepus", 12);
    Animal animales = new Animal(seres.getNcomun(), seres.getNcientifico(), seres.getAltura(), 110);


}
}
