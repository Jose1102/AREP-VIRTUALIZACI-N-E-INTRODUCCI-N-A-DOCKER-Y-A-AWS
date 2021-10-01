package co.edu.escuelaing.virtualization;

import com.mongodb.MongoClientURI;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import java.util.ArrayList;
import java.util.Date;

public class Connection {

    MongoClientURI uri;
    MongoClient mongoCliente;

    public Connection() {

        uri = new MongoClientURI("mongodb+srv://dbArepLab:dbArepLab@cluster0.v7bh7.mongodb.net/dbArepLab?retryWrites=true&w=majority");
        mongoCliente = new MongoClient(uri);
    }


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

    public int sizeArray(){
        return getMensaje().size();
    }


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