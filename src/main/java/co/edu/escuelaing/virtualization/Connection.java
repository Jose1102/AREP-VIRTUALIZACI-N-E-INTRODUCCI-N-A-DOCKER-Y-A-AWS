package co.edu.escuelaing.virtualization;

import com.mongodb.MongoClientURI;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import java.util.ArrayList;
import java.util.Date;

/**
 * Clase que realiza la conexión con la base de datos de Mongo
 * @author Jose María Castro Ortega
 */
public class Connection {

    MongoClientURI uri;
    MongoClient mongoCliente;

    /**
     * Constructor de la clase Connection, inicializa la conexion  a la base de datos
     */
    public Connection() {

        uri = new MongoClientURI("mongodb+srv://dbArepLab:dbArepLab@cluster0.v7bh7.mongodb.net/dbArepLab?retryWrites=true&w=majority");
        mongoCliente = new MongoClient(uri);
    }


    /**
     * Metodo que retorna una lista de Mensajes
     * @return mensaje que es un ArrayList de mensajes, son todos los mensajes que se han creado en la base de datos
     */
    public ArrayList<Mensaje> getMensaje()
    {
        MongoDatabase database = mongoCliente.getDatabase("dbArepLab");
        MongoCollection<Document> coleccion = database.getCollection("mensajes");
        FindIterable findIterable = coleccion.find();
        ArrayList<Document> documento = new ArrayList<Document>();
        ArrayList<Mensaje> mensaje = new ArrayList<Mensaje>();
        findIterable.into(documento);
        for (Document doc : documento) {
            if (doc.get("mensajes") != null && doc.get("fecha") != null) {
                mensaje.add(new Mensaje((String) doc.get("mensajes"), (Date) doc.get("fecha")));
            }
        }
        return mensaje;
    }

    /**
     * Metodo que retorna el tamaño del array de mensajes
     * @return size que es un int
     */
    public int sizeArray(){
        return getMensaje().size();
    }


    /**
     * Metodo que inserta un nuevo Mensaje en la base de datos
     * @param mensaje que es el mensaje que el usuario quiere registrar
     */
    public void insertarMensaje(Mensaje mensaje)
    {
        mongoCliente = new MongoClient(uri);
        MongoDatabase database = mongoCliente.getDatabase("dbArepLab");
        MongoCollection<Document> coleccion =database.getCollection("mensajes");
        Document documento=new Document();
        documento.put("mensajes",mensaje.getMensaje());
        documento.put("fecha",mensaje.getFecha());
        coleccion.insertOne(documento);
    }

}