package Tema5.Tarea2;

import java.util.Date;

public class Profesor {
    public Modulo[] modulos;
    public String nombre;
    public String apellido;
    public String dni;
    public Date fecha;
    public int telefono;
    public String mail;
    public String direccion;

    public Profesor(Modulo[] modulos, String nombre, String apellido, String dni, Date fecha, int telefono, String mail,
            String direccion) {
        this.modulos = modulos;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fecha = fecha;
        this.telefono = telefono;
        this.mail = mail;
        this.direccion = direccion;
    }
    
    public Modulo[] getModulos() {
        return modulos;
    }
    public void setModulos(Modulo[] modulos) {
        this.modulos = modulos;
    }
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
}
