
package com.mycompany.practica_intermodular_palomapalacioscampos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Conexionbbdd {

    // Configuración de la conexión a la base de datos MySQL
    String url = "jdbc:mysql://localhost:3306/practica_intermodular";
    String usuario = "root";
    String contraseña = "Med@c";

    // Sentencias SQL para pedir cosas a la BBDD
    //UNA OPCION ES QUE PODEMOS TRAER AQUÍ TODA LA BASE DE DATOS Y YA MANIPULARLA AQUÍ
    //GUARDAR CADA DATO EN UNA ESTRUCTURA DE DATOS QUE VEAMOS QUE PEGA
    //HACER UNA SENTENCIA SQL PARA CADA PLANETA QUE QUEREMOS CONSULTAR
    //SELECT * FROM PLANETAS WHERE NOMBRE = 'MARTE';
    //HACER SENTENCIAS CON JOIN PARA UNIR PLANETAS CON SATELITES
    String sqlMarte = "Select * from planeta where nombre = 'Marte'";
    //Métodos para poder ejecutar esto en la interfaz
    //HASHMAP? ARRAYLIST?
    // UN MÉTODO PARA CADA PLANTEA PORQUE HAREMOS UNA CONSULTA PARA CADA PLANETA
    //CONECTAR Y CONSULTAR MARTE (MÉTODO)()

    public String[] conectarConsultarMarte() {

        //crear el array
        String[] datosMarte = new String[7];

        try {
            //conectarme (conection statement)
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            // Crear una instancia de Statement para ejecutar la sentencia SQL
            Statement statement = conexion.createStatement();
            //lanzar la quiery (execute query)
            ResultSet resultados = statement.executeQuery(sqlMarte);
            //recoger datos y guardar en arraylist
            while (resultados.next()) {
                // Obtener los valores de las columnas
             
                datosMarte[0] = resultados.getString("radio_km");
                datosMarte[1] = resultados.getString("distancia_sol");
                datosMarte[2] = resultados.getString("periodo_orbital");
                datosMarte[3] = resultados.getString("temperatura_media");
                datosMarte[4] = resultados.getString("tipo");
                datosMarte[5] = resultados.getString("estrella_id");

            }
            resultados.close();
            statement.close();
            conexion.close();

        } catch (SQLException e) {
            e.printStackTrace();

        }

        //return estructura de datos
        return datosMarte;
    }
}
