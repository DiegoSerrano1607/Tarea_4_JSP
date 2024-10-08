/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.sql.Connection;
import java.sql.DriverManager; 
import java.sql.SQLException;
/**
 *
 * @author Diego Serrano
 */
public class conexion {
    //nombre del servidor de base de datos = localhost
    //puerto = 3306
    // url de conexion = jdbc:mysql:localhost:3306/db_empresa3
    //usuario = root
    //contraseña: Mamarubi12
    //driver de conexion (jdbc): com.mysql.jdbc
    private final String puerto = "3306";
    private final String db = "db_empresa2";
    private final String urlConexion = String.format("jdbc:mysql://localhost:%s/%s?serverTimezone=UTC",puerto,db);
    private final String usuario = "root";
    private final String contra = "Mamarubi12";
    private final String jdbc = "com.mysql.cj.jdbc.Driver";
    public Connection conexionBD;
    
    public void abrir_conexion (){
            try{
                //codigo aca
                Class.forName(jdbc);
                conexionBD = DriverManager.getConnection(urlConexion,usuario,contra);
                System.out.println("Conexion Exitosa...");
                
            }catch(ClassNotFoundException | SQLException ex){
                System.out.println("Algo salio mal :(" + ex.getMessage());
            }
    }
    public void cerrar_conexion (){
            try{
                //codigo aca
                conexionBD.close();
            }catch(SQLException ex){
                System.out.println("Algo salio mal :(" + ex.getMessage());
            }
    }
}    

