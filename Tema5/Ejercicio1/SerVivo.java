package Tema5.Ejercicio1;

public class SerVivo {
    private String ncomun;
    private String ncientifico;
    private int altura;
      
    public SerVivo(String ncomun, String ncientifico, int altura) {
        this.ncomun = ncomun;
        this.ncientifico = ncientifico;
        this.altura = altura;
    }
    
    public String getNcomun() {
        return ncomun;
    }

    public String getNcientifico() {
        return ncientifico;
    }
    public int getAltura() {
        return altura;
    }
}
