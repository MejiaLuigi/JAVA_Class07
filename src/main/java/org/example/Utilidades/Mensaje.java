package org.example.Utilidades;

public enum Mensaje {

    //El enum sirve para enumerar atributos, en este caso los mensajes de las exceptions.
    // Sirve para optimizar el codigo, esto va a sustituir cambios en donde los tenga que hacer
    FORMATO_NOMBRE("Revise el formato del Nombre ingresado"),
    LONGITUD_NOMBRE("Revise Longitud del nombre es muy corta"),

    FORMATO_LOCAL("Revise el Nit"),
    FORMTO_LONGITUDLOCAL("Revise Cantidad Digitos"),
    FORMATO_lONGNOMBRE("REVISE TOTAL DE CARACTERES"),

    FORMATO_FECHA("Formato Invalido");
    private String mensaje;

    Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
