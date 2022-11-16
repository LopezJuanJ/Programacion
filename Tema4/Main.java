package Tema4;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] temp = {3, 2, 1};
        
        Numeros num = new Numeros();
        num.asignaValores(temp);
        System.out.println(num.dameValores().length);
        System.out.println("El array es: " + Arrays.toString(num.dameValores()));
        System.out.println("La media es: " + num.media());
        System.out.println("La mediana es: " + num.mediana());
        System.out.println("Cuantos Primos Hay?: " + num.numerodeprimos());
        System.out.println("Primos de la lista: "+ Arrays.toString(num.guardarPrimos()));
        System.out.println("Nuevo Array de inicio: " + Arrays.toString(num.insertarnumeroPrincio(24,2)));
        System.out.println("Nuevo Array de final: " + Arrays.toString(num.insertarnumeroFinal(24,2)));
    }
}
