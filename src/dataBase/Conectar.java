
package dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;


public class Conectar {
    private static Connection conn;
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String user="root";
    private static final String password="root1234";
    private static final String url="jdbc:mysql://localhost:3306/agendsmart";

    public Conectar() {
        conn=null;
        try{
            Class.forName(driver);
            conn=DriverManager.getConnection(url, user, password);
            if(conn!=null){
                System.out.println("Conección establecida!");
            }
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Error al conectar "+e);
        }
    }
    
    
    public Connection getConnection(){
        return conn;
    }
    
    public void desconectar(){
        try{
        conn.close();
        System.out.println("Conexión terminada...");
    }catch(SQLException ex){

    }
    
    }
    
    public int enviarLogIN(Conectar cc,String password,String usuario,String nombre,String apellido,String sql) throws SQLException{
        Connection cn=cc.getConnection();
        sql="INSERT INTO usuario (pass_usu, usu_usu, nom_usu, ape_usu) VALUES (?,?,?,?)";    
        PreparedStatement pst = cn.prepareStatement(sql);
        pst.setString(1, password);
        pst.setString(2, usuario);
        pst.setString(3, nombre);
        pst.setString(4, apellido);
        int n=pst.executeUpdate();
        return n;
    }
    
    public int enviarActividad(Conectar cc,String titulo,String descripcion,String categoria,Calendar fecha,String prioridad,String pass,String sql) throws SQLException{
        Connection cn=cc.getConnection();
        String date=Integer.toString(fecha.get(Calendar.DAY_OF_MONTH))+"/"+Integer.toString(fecha.get(Calendar.MONTH)+1)+"/"+Integer.toString(fecha.get(Calendar.YEAR))+"/"+Integer.toString(fecha.get(Calendar.HOUR_OF_DAY));
        System.out.println(date);
        PreparedStatement pst = cn.prepareStatement(sql);
        pst.setString(1, titulo);
        pst.setString(2, descripcion);
        pst.setString(3, categoria);
        pst.setString(4, date);
        pst.setString(5, prioridad);
        pst.setString(6, pass);
        int n=pst.executeUpdate();
        return n;
    }
    
    public String consultarUser(Conectar cc,String sql) throws SQLException{
        String consultaUsuario = "";
        Connection cn=cc.getConnection();
        Statement st=cn.createStatement();
        ResultSet rs=st.executeQuery(sql);
        while (rs.next()){
            consultaUsuario=rs.getString("usu_usu");
        }
        return consultaUsuario;
    }
    
    public String consultarActividad(Conectar cc, String sql) throws SQLException{
        String consultaTitulo = "",consultaCategoria="",consultaDes="";
        Connection cn=cc.getConnection();
        Statement st=cn.createStatement();
        ResultSet rs=st.executeQuery(sql);
        while (rs.next()){
            consultaTitulo=rs.getString("tit_act");
            consultaCategoria=rs.getString("tip_act");
            consultaDes=rs.getString("des_act");
        }
        return (consultaTitulo+"]"+consultaDes+"-"+consultaCategoria);
    }
    
    public String notificacionActividad(Conectar cc,String sql) throws SQLException{
        String consultaTitulo = "",consultaCat="",consultaDes="",consultaFec="",consultaPri="";
        Connection cn=cc.getConnection();
        Statement st=cn.createStatement();
        ResultSet rs=st.executeQuery(sql);
        while (rs.next()){
            consultaTitulo=rs.getString("tit_act");
            consultaDes=rs.getString("des_act");
            consultaCat=rs.getString("tip_act");
            consultaFec=rs.getString("fec_act");
            consultaPri=rs.getString("pri_act");
        }
        return (consultaTitulo+"]"+consultaDes+"]"+consultaCat+"]"+consultaFec+"]"+consultaPri);
    }
    
    public void eliminarActividad(Conectar cc,String sql) throws SQLException{
        Connection cn=cc.getConnection();
        Statement st=cn.createStatement();
        st.execute(sql);
    }
}
