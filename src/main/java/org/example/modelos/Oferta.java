package org.example.modelos;

import java.time.LocalDate;

public class Oferta {
    private Integer id;
    private String titulo;
    private String descripcion;

    private String formatoFecha;
    private LocalDate fecha_inicio;
    private LocalDate fecha_fin;
    private Integer costopersona;
    private Integer idlocal;

    public Oferta() {
    }

    public Oferta(Integer id, String titulo, String descripcion, String formatoFecha, LocalDate fecha_inicio, LocalDate fecha_fin, Integer costopersona, Integer idlocal) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.formatoFecha = formatoFecha;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.costopersona = costopersona;
        this.idlocal = idlocal;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Oferta{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", formatoFecha='" + formatoFecha + '\'' +
                ", fecha_inicio=" + fecha_inicio +
                ", fecha_fin=" + fecha_fin +
                ", costopersona=" + costopersona +
                ", idlocal=" + idlocal +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFormatoFecha() {
        return formatoFecha;
    }

    public void setFormatoFecha(String formatoFecha) {
        this.formatoFecha = formatoFecha;
    }

    public LocalDate getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(LocalDate fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public LocalDate getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(LocalDate fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public Integer getCostopersona() {
        return costopersona;
    }

    public void setCostopersona(Integer costopersona) {
        this.costopersona = costopersona;
    }

    public Integer getIdlocal() {
        return idlocal;
    }

    public void setIdlocal(Integer idlocal) {
        this.idlocal = idlocal;
    }
}
