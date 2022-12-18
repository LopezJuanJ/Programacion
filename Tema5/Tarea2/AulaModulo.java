package Tema5.Tarea2;

public class AulaModulo {
    public Aula aula;
    public Modulo modulo;
    public AulaModulo(Aula aula, Modulo modulo) {
        this.aula = aula;
        this.modulo = modulo;
    }
    public Aula getAula() {
        return aula;
    }
    public void setAula(Aula aula) {
        this.aula = aula;
    }
    public Modulo getModulo() {
        return modulo;
    }
    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }
}
