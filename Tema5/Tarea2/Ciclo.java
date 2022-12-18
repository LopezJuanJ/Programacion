package Tema5.Tarea2;

import java.util.Arrays;

public class Ciclo {
    public static final char TIPOMODULAR = 'm';
    public static final char TIPOORDINARIO = 'o';
    public static final char TIPODUAL = 'd';


    public String nombre;
    public int codigo;
    public String tipo;
    public Modulo[] modulos;
    public int cursos;
    public Alumno[] matriculados;



    public Alumno delegado;
    public Profesor tutor;
    public Ciclo(String nombre, int codigo, String tipo, Modulo[] modulos, int cursos, Alumno delegado,
            Profesor tutor) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.tipo = tipo;
        this.modulos = modulos;
        this.cursos = cursos;
        this.delegado = delegado;
        this.tutor = tutor;
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
    public String getTipo() {
        return tipo;
    }
    public void setTipo(char tipo) {
        if (tipo == TIPOMODULAR) {
            this.tipo = "modular";
        } else if (tipo == TIPOORDINARIO) {
            this.tipo = "ordinario";
        } else if (tipo == TIPODUAL) {
            this.tipo = "dual";
        } else {
            System.out.println("Error");
        }
    }

    public void numerocursos(int cursos){
        if (cursos < 2 || cursos > 3 ){
            System.out.println("Error");
        } else {
            this.cursos = cursos;
        }
    }

    public Modulo[] getModulos() {
        return modulos;
    }
    public void setModulos(Modulo[] modulos) {
        this.modulos = modulos;
    }
    public int getCursos() {
        return cursos;
    }
    public void setCursos(int cursos) {
        this.cursos = cursos;
    }
    public Alumno getDelegado() {
        return delegado;
    }
    public void setDelegado(Alumno delegado) {
        this.delegado = delegado;
    }
    public Profesor getTutor() {
        return tutor;
    }
    public void setTutor(Profesor tutor) {
        this.tutor = tutor;
    }

    public String muestraAM(){
        String alumnos = null;
        for (int i = 0; i < matriculados.length; i++){

            alumnos += matriculados[i].nombre + " " + matriculados[i].apellido + "\n";
        }
        return alumnos;
    }



    @Override
    public String toString() {
        return "Ciclo [nombre=" + nombre + ", codigo=" + codigo + ", tipo=" + tipo + ", modulos="
                + Arrays.toString(modulos) + ", cursos=" + cursos + ", matriculados=" + Arrays.toString(matriculados)
                + ", delegado=" + delegado + ", tutor=" + tutor + "]";
    }

}
