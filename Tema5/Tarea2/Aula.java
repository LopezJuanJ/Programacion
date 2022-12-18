package Tema5.Tarea2;

public class Aula {
    public String nombre;
    public int numero;
    public int capaalumnos;
    public String[] materiales;
    public Aula(String nombre, int numero, int capaalumnos, String[] materiales) {
        this.nombre = nombre;
        this.numero = numero;
        this.capaalumnos = capaalumnos;
        this.materiales = materiales;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getCapaalumnos() {
        return capaalumnos;
    }
    public void setCapaalumnos(int capaalumnos) {
        this.capaalumnos = capaalumnos;
    }
    public String[] getMateriales() {
        return materiales;
    }
    public void setMateriales(String[] materiales) {
        this.materiales = materiales;
    }
}
