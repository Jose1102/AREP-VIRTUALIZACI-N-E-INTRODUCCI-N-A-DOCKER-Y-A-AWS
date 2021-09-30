package co.edu.escuelaing.virtualization;

import java.util.Date;

import static spark.Spark.port;
import static spark.Spark.get;

public class SparkWebServer {


    public static void main(String... args){

        /*
        port(getPort());
        get("hello", (req,res) -> "Hello Docker!");


         */

        Connection conexion = new Connection();
        Mensaje mensa = new Mensaje("Hola a todos");
        //conexion.insertarMensaje(mensa);
        System.out.println(conexion.getMensaje().get(0).getMensaje());
    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}
