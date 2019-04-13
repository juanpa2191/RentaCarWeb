/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class Conexion {
    private Connection con;

    public Connection getCon() {
        ConexionBD();
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    
    
    static{
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();

        }catch(ClassNotFoundException e1){
             System.out.println("La Clase del driver no fue encontrada "+e1.getMessage());
        }catch(InstantiationException e2){
            System.out.println("No es posible crear la instancia "+e2.getMessage());
        }catch(IllegalAccessException e3){
            System.out.println("No se puede acceder a la clase "+e3.getMessage());
        }catch(Exception e4){
            System.out.println("Se ha presentado una falla en el driver "+e4.getMessage());
        }
    
    }
    public void ConexionBD(){
        try{
            setCon(DriverManager.getConnection("jdbc:mysql://localhost:88/db_rentaauto","root",""));
        
        }catch(SQLException e6){
            System.out.println("SQLException "+e6.getMessage());
        }catch(Exception e7 ){
            System.out.println("OTRA "+ e7.getMessage());
        }
    }
    
    public static void main (String[] x){
        Conexion c= new Conexion();
        try{
            ResultSet r= c.getCon().prepareStatement("Select * from usuarios").executeQuery();        
            if(r.next()){
                System.out.println("documento" + r.getString(1)+" Nombre "+r.getString(2));
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    } 
    
}
