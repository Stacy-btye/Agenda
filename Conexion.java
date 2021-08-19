package config;

import java.sql.*;

public class Conexion {
    
    Connection con;
    
    public Conexion(){
        String url = "jdbc:mysql://localhost/agenda";        
        String user = "root";
        String password = "";

        try{
            con = DriverManager.getConnection(url, user, password);
        }catch(Exception e){
            System.out.println("Error");
        }
    }
    
    public Connection getConexion(){
        return con;
    }
}
