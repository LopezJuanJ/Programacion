package Tema5.Tarea2;

import java.util.Date;

public class Alumno {
    public String nombre;
    public String apellido;
    public String dni;
    public Date fecha;
    public int telefono;
    public String mail;
    public String direccion;
    public Ciclo matriculado;

    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public Ciclo getMatriculado() {
        return matriculado;
    }
    public void setMatriculado(Ciclo matriculado) {
        this.matriculado = matriculado;
    }

    public String muestraCM() {
        return matriculado.nombre + matriculado.modulos.toString();
    }

    @Override
    public String toString() {
        return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", fecha=" + fecha
                + ", telefono=" + telefono + ", mail=" + mail + ", direccion=" + direccion + ", matriculado="
                + matriculado + "]";
    }

    
}
