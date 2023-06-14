package commons;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConfigBD {
    static public String Servidor="localhost";
    static public String BaseDatos="servicio_social";
    static public String Usuario="root";
    static public String Contrasenna="";
    static public String driver="com.mysql.jdbc.Driver";
    static public String URL="jdbc:mysql://localhost:3306/";
    Connection cx;

    public ConfigBD() {
    }
    
    public Connection conectar(){
        try {
            Class.forName(driver);
            cx=DriverManager.getConnection(URL+BaseDatos, Usuario, Contrasenna);
            System.out.println("se conecto a "+BaseDatos);
        } catch (ClassNotFoundException |SQLException ex) {
                System.out.println("no se conecto a "+BaseDatos);
                //Logger.getLogger(ConfigBD.class.getName()).log(Level.SEVERE, null, ex);     
        }
        return cx;                 
    }
    
    public void desaonectar(){
        try {  
            cx.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConfigBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args){
        ConfigBD conexion = new ConfigBD();
        conexion.conectar();
    }
    
    
}

