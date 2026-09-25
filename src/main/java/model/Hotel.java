import java.util.ArrayList;
import java.util.List;
package model;

public class Hotel {
    private String nombreComercial, nit, direccion, telefono, paginaWeb;
    private List<Huesped> listaHuespedes;
    private List<Habitacion> listaHabitaciones;
    private List<Reserva> listaReservas;
    private List<ServicioAdicional> listaServicios;

    public Hotel(String nombreComercial, String NIT, String direccion, String telefono, String paginaWeb) {
        this.nombreComercial = nombreComercial;
        this.NIT = NIT;
        this.direccion = direccion;
        this.telefono = telefono;
        this.paginaWeb = paginaWeb;
        this.listaHuespedes = new ArrayList<>();
        this.listaHabitaciones = new ArrayList<>();
        this.listaReservas = new ArrayList<>();
        this.listaServicios = new ArrayList<>();
}
    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }
    public List<Huesped> getListaHuespedes() {
        return listaHuespedes;
    }

    public void setListaHuespedes(List<Huesped> listaHuespedes) {
        this.listaHuespedes = listaHuespedes;
    }

    public List<Habitacion> getListaHabitaciones() {
        return listaHabitaciones;
    }

    public void setListaHabitaciones(List<Habitacion> listaHabitaciones) {
        this.listaHabitaciones = listaHabitaciones;
    }

    public List<Reserva> getListaReservas() {
        return listaReservas;
    }

    public void setListaReservas(List<Reserva> listaReservas) {
        this.listaReservas = listaReservas;
    }

    public List<ServicioAdicional> getListaServicios() {
        return listaServicios;
    }

    public void setListaServicios(List<ServicioAdicional> listaServicios) {
        this.listaServicios = listaServicios;
    }

    // 6. Métodos auxiliares para agregar elementos a las listas
    public void agregarHuesped(Huesped huesped) {
        this.listaHuespedes.add(huesped);
    }

    public void agregarHabitacion(Habitacion habitacion) {
        this.listaHabitaciones.add(habitacion);
    }

    public void agregarReserva(Reserva reserva) {
        this.listaReservas.add(reserva);
    }

    public void agregarServicio(ServicioAdicional servicio) {
        this.listaServicios.add(servicio);
    }

    public boolean consultarTelefonoPerfecto(String telefono) {}

    public double calcularIngresosPorFecha(String fechaConsulta) {
        for (Reserva r : listaReservas) {
            if (r.getFechaRealizacion().equals(fechaConsulta)) {
                ingresosAcumulados += r.getValorTotal();
            }
        } return ingresosAcumulados;
    }
}