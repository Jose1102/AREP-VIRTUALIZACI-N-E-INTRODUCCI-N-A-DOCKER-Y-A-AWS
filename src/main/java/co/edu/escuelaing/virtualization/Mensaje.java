package co.edu.escuelaing.virtualization;


import java.util.Date;

/**
 * Clase Mensaje que tiene como funcion guardar un mensaje y la fecha realizada
 * @author Jose Maria Castro Ortega
 */
public class Mensaje {
    private String mensaje;
    private Date fecha;

    /**
     * Constructor que inicializa las variables mensaje y fecha
     * @param mensaje que es el mensaje a almacenar
     * @param fecha que es la fecha en la que se creó el mensaje
     */
    public Mensaje(String mensaje, Date fecha) {
        this.mensaje = mensaje;
        this.fecha = fecha;
    }


    /**
     * Metodo get que retorna el mensaje que es de tipo string
     * @return mensaje que es de tipo String
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * La fecha en la que se creó el mensaje
     * @return fecha que es de tipo Date
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * Clase para modificar atributo mensaje
     * @param mensaje que es el nuevo atributo a cambiar de mensaje
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    /**
     * Clase para modificar atributo fecha
     * @param fecha que es la nueva fecha a cambiar
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
