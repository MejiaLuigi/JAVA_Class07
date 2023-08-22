package Validaciones;

import org.example.Utilidades.Mensaje;
import org.example.Utilidades.Util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsuarioValidacion {

    private Util util = new Util();

    // Metodos Ordinarios
                                //Parametros
    public Boolean validarNombre(String nombre) throws Exception{

        if (!util.buscarCoincidencia(nombre, "^[a-zA-Z]+$")){
            throw new Exception(Mensaje.FORMATO_NOMBRE.getMensaje());
        }

        if (nombre.length()<10){
            throw new Exception(Mensaje.LONGITUD_NOMBRE.getMensaje());
        }
        return true;

    }
    public Boolean validarUbicacion(Integer ubicacion) throws Exception {
        if(ubicacion==1 || ubicacion==2 || ubicacion==3 || ubicacion==4){
            return true;
        }else{
            throw new Exception("Revise Bien ubicación");
        }
    }
    public Boolean validarCorreo(String correo) throws Exception{

        if (!util.buscarCoincidencia(correo, "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")){
            throw new Exception("Revise el Correo");
        }
        return true;
    }

}
