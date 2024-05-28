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

    String sqlMercurio = "Select * from planeta where nombre = 'Mercurio'";

    public String[] conectarConsultarMercurio() {

        //crear el array
        String[] datosMercurio = new String[7];

        try {
            //conectarme (conection statement)
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            // Crear una instancia de Statement para ejecutar la sentencia SQL
            Statement statement = conexion.createStatement();
            //lanzar la quiery (execute query)
            ResultSet resultados = statement.executeQuery(sqlMercurio);
            //recoger datos y guardar en arraylist
            while (resultados.next()) {
                // Obtener los valores de las columnas

                datosMercurio[0] = resultados.getString("radio_km");
                datosMercurio[1] = resultados.getString("distancia_sol");
                datosMercurio[2] = resultados.getString("periodo_orbital");
                datosMercurio[3] = resultados.getString("temperatura_media");
                datosMercurio[4] = resultados.getString("tipo");
                datosMercurio[5] = resultados.getString("estrella_id");

            }
            resultados.close();
            statement.close();
            conexion.close();

        } catch (SQLException e) {
            e.printStackTrace();

        }

        //return estructura de datos
        return datosMercurio;
    }

    String sqlVenus = "Select * from planeta where nombre = 'Venus'";

    public String[] conectarConsultarVenus() {

        //crear el array
        String[] datosVenus = new String[7];

        try {
            //conectarme (conection statement)
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            // Crear una instancia de Statement para ejecutar la sentencia SQL
            Statement statement = conexion.createStatement();
            //lanzar la quiery (execute query)
            ResultSet resultados = statement.executeQuery(sqlVenus);
            //recoger datos y guardar en arraylist
            while (resultados.next()) {
                // Obtener los valores de las columnas

                datosVenus[0] = resultados.getString("radio_km");
                datosVenus[1] = resultados.getString("distancia_sol");
                datosVenus[2] = resultados.getString("periodo_orbital");
                datosVenus[3] = resultados.getString("temperatura_media");
                datosVenus[4] = resultados.getString("tipo");
                datosVenus[5] = resultados.getString("estrella_id");

            }
            resultados.close();
            statement.close();
            conexion.close();

        } catch (SQLException e) {
            e.printStackTrace();

        }

        //return estructura de datos
        return datosVenus;
    }

    String sqlJupiter = "Select * from planeta where nombre = 'Júpiter'";

    public String[] conectarConsultarJupiter() {

        //crear el array
        String[] datosJupiter = new String[7];

        try {
            //conectarme (conection statement)
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            // Crear una instancia de Statement para ejecutar la sentencia SQL
            Statement statement = conexion.createStatement();
            //lanzar la quiery (execute query)
            ResultSet resultados = statement.executeQuery(sqlJupiter);
            //recoger datos y guardar en arraylist
            while (resultados.next()) {
                // Obtener los valores de las columnas

                datosJupiter[0] = resultados.getString("radio_km");
                datosJupiter[1] = resultados.getString("distancia_sol");
                datosJupiter[2] = resultados.getString("periodo_orbital");
                datosJupiter[3] = resultados.getString("temperatura_media");
                datosJupiter[4] = resultados.getString("tipo");
                datosJupiter[5] = resultados.getString("estrella_id");

            }
            resultados.close();
            statement.close();
            conexion.close();

        } catch (SQLException e) {
            e.printStackTrace();

        }

        //return estructura de datos
        return datosJupiter;
    }

    String sqlTierra = "Select * from planeta where nombre = 'Tierra'";

    public String[] conectarConsultarTierra() {

        //crear el array
        String[] datosTierra = new String[7];

        try {
            //conectarme (conection statement)
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            // Crear una instancia de Statement para ejecutar la sentencia SQL
            Statement statement = conexion.createStatement();
            //lanzar la quiery (execute query)
            ResultSet resultados = statement.executeQuery(sqlTierra);
            //recoger datos y guardar en arraylist
            while (resultados.next()) {
                // Obtener los valores de las columnas

                datosTierra[0] = resultados.getString("radio_km");
                datosTierra[1] = resultados.getString("distancia_sol");
                datosTierra[2] = resultados.getString("periodo_orbital");
                datosTierra[3] = resultados.getString("temperatura_media");
                datosTierra[4] = resultados.getString("tipo");
                datosTierra[5] = resultados.getString("estrella_id");

            }
            resultados.close();
            statement.close();
            conexion.close();

        } catch (SQLException e) {
            e.printStackTrace();

        }

        //return estructura de datos
        return datosTierra;
    }

    String sqlSaturno = "Select * from planeta where nombre = 'Saturno'";

    public String[] conectarConsultarSaturno() {

        //crear el array
        String[] datosSaturno = new String[7];

        try {
            //conectarme (conection statement)
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            // Crear una instancia de Statement para ejecutar la sentencia SQL
            Statement statement = conexion.createStatement();
            //lanzar la quiery (execute query)
            ResultSet resultados = statement.executeQuery(sqlSaturno);
            //recoger datos y guardar en arraylist
            while (resultados.next()) {
                // Obtener los valores de las columnas

                datosSaturno[0] = resultados.getString("radio_km");
                datosSaturno[1] = resultados.getString("distancia_sol");
                datosSaturno[2] = resultados.getString("periodo_orbital");
                datosSaturno[3] = resultados.getString("temperatura_media");
                datosSaturno[4] = resultados.getString("tipo");
                datosSaturno[5] = resultados.getString("estrella_id");

            }
            resultados.close();
            statement.close();
            conexion.close();

        } catch (SQLException e) {
            e.printStackTrace();

        }

        //return estructura de datos
        return datosSaturno;
    }

    String sqlUrano = "Select * from planeta where nombre = 'Urano'";

    public String[] conectarConsultarUrano() {

        //crear el array
        String[] datosUrano = new String[7];

        try {
            //conectarme (conection statement)
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            // Crear una instancia de Statement para ejecutar la sentencia SQL
            Statement statement = conexion.createStatement();
            //lanzar la quiery (execute query)
            ResultSet resultados = statement.executeQuery(sqlUrano);
            //recoger datos y guardar en arraylist
            while (resultados.next()) {
                // Obtener los valores de las columnas

                datosUrano[0] = resultados.getString("radio_km");
                datosUrano[1] = resultados.getString("distancia_sol");
                datosUrano[2] = resultados.getString("periodo_orbital");
                datosUrano[3] = resultados.getString("temperatura_media");
                datosUrano[4] = resultados.getString("tipo");
                datosUrano[5] = resultados.getString("estrella_id");

            }
            resultados.close();
            statement.close();
            conexion.close();

        } catch (SQLException e) {
            e.printStackTrace();

        }

        //return estructura de datos
        return datosUrano;
    }
    
     String sqlNeptuno = "Select * from planeta where nombre = 'Neptuno'";

    public String[] conectarConsultarNeptuno() {

        //crear el array
        String[] datosNeptuno = new String[7];

        try {
            //conectarme (conection statement)
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            // Crear una instancia de Statement para ejecutar la sentencia SQL
            Statement statement = conexion.createStatement();
            //lanzar la quiery (execute query)
            ResultSet resultados = statement.executeQuery(sqlNeptuno);
            //recoger datos y guardar en arraylist
            while (resultados.next()) {
                // Obtener los valores de las columnas

               datosNeptuno[0] = resultados.getString("radio_km");
                datosNeptuno[1] = resultados.getString("distancia_sol");
                datosNeptuno[2] = resultados.getString("periodo_orbital");
                datosNeptuno[3] = resultados.getString("temperatura_media");
                datosNeptuno[4] = resultados.getString("tipo");
                datosNeptuno[5] = resultados.getString("estrella_id");

            }
            resultados.close();
            statement.close();
            conexion.close();

        } catch (SQLException e) {
            e.printStackTrace();

        }

        //return estructura de datos
        return datosNeptuno;
    }
    
    
    
    
    

}
