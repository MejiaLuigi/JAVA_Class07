package Validaciones;

import org.example.Utilidades.Mensaje;
import org.example.Utilidades.Util;

import java.time.LocalDate;


public class ReservaValidacion {

    Util util = new Util();

    public Boolean validarFormatoFecha(LocalDate fecha) throws Exception {
        if (util.buscarCoincidencia(String.valueOf(fecha), "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$")){
            throw new Exception(Mensaje.FORMATO_FECHA.getMensaje());
        }
        return true;
    }
    public Boolean validarPersonas(Integer personas){
        return true;
    }

}
