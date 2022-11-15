package Tema4;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] temp = {3, 2, 1, 222, 11};
        
        Numeros num = new Numeros();
        num.asignaValores(temp);
        System.out.println(num.dameValores().length);
        System.out.println("El array es: " + Arrays.toString(num.dameValores()));
        System.out.println("La media es: " + num.media());
        System.out.println("La mediana es: " + num.mediana());
        System.out.println("Cuantos Primos Hay?: " + num.numerodeprimos());
        System.out.println(Arrays.toString(num.guardarPrimos()));
    }
}
