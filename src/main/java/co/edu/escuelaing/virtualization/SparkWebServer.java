package co.edu.escuelaing.virtualization;

import com.google.gson.Gson;

import static spark.Spark.*;

public class SparkWebServer {


    public static void main(String... args){
        Connection conexion = new Connection();
        staticFileLocation("/static");

        port(getPort());

        get("/", (req, res) -> {
            res.redirect("index.html");
            return null;
        });

        get("hello", (req,res) -> {
            res.status(200);
            res.type("application/json");
            return new Gson().toJson(conexion.getMensaje());
        });





        //Mensaje mensa = new Mensaje("Hola a todos");
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
