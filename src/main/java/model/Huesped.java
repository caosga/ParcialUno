package model;

public class Huesped {

    public String nombreCompleto, documentoIdentidad, telefono, paisProcedencia;
    private String correoElectronico;
}
public Huesped(String nombreCompleto, String documentoIdentidad,String telefono, String correoElectronico, String paisProcedencia) {
    this.nombreCompleto = nombreCompleto;
    this.documentoIdentidad = documentoIdentidad;
    this.telefono = telefono;
    this.correoElectronico = correoElectronico;
    this.paisProcedencia = paisProcedencia;
}
public String getNombreCompleto() {
    return nombreCompleto;
}

public void setNombreCompleto(String nombreCompleto) {
    this.nombreCompleto = nombreCompleto;
}

public String getDocumentoIdentidad() {
    return documentoIdentidad;
}

public void setDocumentoIdentidad(String documentoIdentidad) {
    this.documentoIdentidad = documentoIdentidad;
}

public long getTelefono() {
    return telefono;
}

public void setTelefono(String telefono) {
    this.telefono = telefono;
}

public String getCorreoElectronico() {
    return correoElectronico;
}

public void setCorreoElectronico(String correoElectronico) {
    this.correoElectronico = correoElectronico;
}

public String getPaisProcedencia() {
    return paisProcedencia;
}

public void setPaisProcedencia(String paisProcedencia) {
    this.paisProcedencia = paisProcedencia;
}
}