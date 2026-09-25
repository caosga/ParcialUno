package model;

public class Habitacion {

public String numeroHabitacion, tipo, capacidadMaxima, precioPorNoche,estado;
private String  piso;
}
public Habitacion(String numeroHabitacion, int piso, String tipo, int capacidadMaxima, double precioPorNoche, String estado) {
    this.numeroHabitacion = numeroHabitacion;
    this.piso = piso;
    this.tipo = tipo;
    this.capacidadMaxima = capacidadMaxima;
    this.precioPorNoche = precioPorNoche;
    this.estado = estado;
}
public String getNumeroHabitacion() {
    return numeroHabitacion;
}

public void setNumeroHabitacion(String numeroHabitacion) {
    this.numeroHabitacion = numeroHabitacion;
}

public int getPiso() {
    return piso;
}

public void setPiso(int piso) {
    this.piso = piso;
}

public String getTipo() {
    return tipo;
}

public void setTipo(String tipo) {
    this.tipo = tipo;
}

public int getCapacidadMaxima() {
    return capacidadMaxima;
}

public void setCapacidadMaxima(int capacidadMaxima) {
    this.capacidadMaxima = capacidadMaxima;
}

public double getPrecioPorNoche() {
    return precioPorNoche;
}

public void setPrecioPorNoche(double precioPorNoche) {
    this.precioPorNoche = precioPorNoche;
}

public String getEstado() {
    return estado;
}

public void setEstado(String estado) {
    this.estado = estado;
}
}