package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
    /* metodo constructor */
public class Database {
    private static String db="paginacion";
    private static String user="root";
    private static String pass="root1234";
    private static String host="localhost";
    private static String server="jdbc:mysql://"+host+"/"+db;
    
/* clase  Singleton JSP*/
    public static  Connection getConexion() {
        Connection cn=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection(server,user,pass);         
        }
        catch(Exception e){
         System.out.println(String.valueOf(e));}
        return cn;
    }
    /* esquema consulta con retorno*/
    public static ResultSet getTabla(String Consulta){
        Connection cn=getConexion();
        Statement st;
        ResultSet datos=null;
        try{
            st=cn.createStatement();
            datos=st.executeQuery(Consulta);            
        }
        catch(Exception e){ System.out.print(e.toString());}
        return datos;
    }    
}