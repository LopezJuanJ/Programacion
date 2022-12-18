package Tema5.Tarea2;

public class Modulo {
    public String nombre;
    public int codigo;
    public int numerohoras;
    public int cursoasignado;
    
    public Modulo(String nombre, int codigo, int numerohoras, int cursoasignado) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.numerohoras = numerohoras;
        this.cursoasignado = cursoasignado;
    }

    public void cursosasig(int cursoasignado){
        if (cursoasignado < 1 || cursoasignado > 3 ){
            System.out.println("Error");
        } else {
            this.cursoasignado = cursoasignado;
        }
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getNumerohoras() {
        return numerohoras;
    }
    public void setNumerohoras(int numerohoras) {
        this.numerohoras = numerohoras;
    }
    public int getCursoasignado() {
        return cursoasignado;
    }
    public void setCursoasignado(int cursoasignado) {
        this.cursoasignado = cursoasignado;
    }
    @Override
    public String toString() {
        return "Modulo [nombre=" + nombre + ", codigo=" + codigo + ", numerohoras=" + numerohoras + ", cursoasignado="
                + cursoasignado + "]";
    }
}
