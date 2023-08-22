package Validaciones;

import org.example.Utilidades.Mensaje;
import org.example.Utilidades.Util;

import java.time.LocalDate;

public class OfertaValidacion {
    Util util = new Util();


    public Boolean validarTitulo(String titulo){
        return true;
    }
    public Boolean validarFechaI_F(LocalDate fecha_inicio, LocalDate fecha_fin) throws Exception{
        if (fecha_inicio.isAfter(fecha_fin)){
            throw new Exception("Fecha Ingresa Invalida");
        }
        return true;
    }
    public Boolean validarFecha(LocalDate fecha) throws Exception{

        if (!util.buscarCoincidencia(String.valueOf(fecha),"^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$")){
            throw new Exception(Mensaje.FORMATO_FECHA.getMensaje());
        }return true;
    }
    public Boolean validarCosto(Integer costo){
        return true;
    }

}
