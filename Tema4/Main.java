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
        System.out.println("Array insertando palabra: " + Arrays.toString(num.insertarnumero(24)));
        System.out.println("Insertar Numero posicion concreta: " + Arrays.toString(num.insertarnumeroposicion(24,2)));
        System.out.println("Insertar numero al Final: " + Arrays.toString(num.insertarnumeroFinal(24)));
        System.out.println("Insertar numero al Principio: " + Arrays.toString(num.insertarnumeroPrincipio(24)));
        System.out.println("Comprobar si existe: " + num.saberSiExiste(1));
        System.out.println("Comprobar si existe: " + num.saberSiExiste(0));
System.out.println(Arrays.toString(num.borrarPosicion(2)));
        


    }
}
