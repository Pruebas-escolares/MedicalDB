/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.holamundocom;

import com.sun.jdi.connect.spi.Connection;
import java.sql.SQLException;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author mahak
 */
public class Procedimientos {
    
    //Conexion_2 connc = new Conexion_2();
    //DefaultTableModel ModeloTabla;
        
    public static void GuardarUsuario(String nombre, String cuenta, String contra, String tipo) throws SQLException
    {
        //Mandar llamar el procedimiento almacenado para guardar usuarios.
        CallableStatement guardar = Conexion_2.getConexion().prepareCall("{call GuardarUsuario(?,?,?,?)}");
        guardar.setString(1, nombre);
        guardar.setString(2, cuenta);
        guardar.setString(3, contra);
        guardar.setString(4, tipo);
        guardar.execute();
    }
    
    public static void GuardarEnfermedad(String nombre, String descripcion) throws SQLException
    {
        //Mandar llamar el procedimiento almacenado para guardar usuarios.
        CallableStatement guardar = Conexion_2.getConexion().prepareCall("{call GuardarEnfermedad(?,?)}");
        guardar.setString(1, nombre);
        guardar.setString(2, descripcion);
        guardar.execute();
    }
    
    public static void GuardarEscuela(String nivel, String escuela) throws SQLException
    {
        //Mandar llamar el procedimiento almacenado para guardar usuarios.
        CallableStatement guardar = Conexion_2.getConexion().prepareCall("{call GuardarEscuela(?,?)}");
        guardar.setString(1, nivel);
        guardar.setString(2, escuela);
        guardar.execute();
    }
    
    public static void GuardarEntidad(String ciudad, String estado) throws SQLException
    {
        //Mandar llamar el procedimiento almacenado para guardar usuarios.
        CallableStatement guardar = Conexion_2.getConexion().prepareCall("{call GuardarEntidades(?,?)}");
        guardar.setString(1, ciudad);
        guardar.setString(2, estado);
        guardar.execute();
    }
    
    public static void GuardarEmpleado(String area, String puesto, String turno) throws SQLException
    {
        //Mandar llamar el procedimiento almacenado para guardar usuarios.
        CallableStatement guardar = Conexion_2.getConexion().prepareCall("{call GuardarEmpleado(?,?,?)}");
        guardar.setString(1, area);
        guardar.setString(2, puesto);
        guardar.setString(3, turno);
        guardar.execute();
    }
    
    public static void GuardarExpe_Prueba (String fecha,String apellido_pat, String apellido_mat, String nombre,
            String fecha_nacimiento, String telefono, String celular, String edo_civil, String correo_electronico,
            String tipo_sangre,String ape_pat_eme_1, String ape_mat_eme_1, String nombre_eme_1, 
            String tel_fam_eme_1, String parentesco_fam_eme_1, String ape_pat_eme_2, String ape_mat_eme_2,
            String nombre_eme_2, String tel_fam_eme_2, String parentesco_fam_eme_2, String canti_alim,
            String cali_alim) throws SQLException
    {
        CallableStatement guardar = Conexion_2.getConexion().prepareCall("{call GuardarExpe_Prueba(?,?,?,?,?,?,?,?,?,"
                + "?,?,?,?,?,?,?,?,?,?,?,?,?)}"); //22
        
        guardar.setString(1, fecha);
        guardar.setString(2, apellido_pat);
        guardar.setString(3, apellido_mat);
        guardar.setString(4, nombre);
        guardar.setString(5, fecha_nacimiento);
        guardar.setString(6, telefono);
        guardar.setString(7, celular);
        guardar.setString(8, edo_civil);
        guardar.setString(9, correo_electronico);
        guardar.setString(10, tipo_sangre);
        guardar.setString(11, ape_pat_eme_1);
        guardar.setString(12, ape_mat_eme_1);
        guardar.setString(13, nombre_eme_1);
        guardar.setString(14, tel_fam_eme_1);
        guardar.setString(15,parentesco_fam_eme_1);
        guardar.setString(16, ape_pat_eme_2);
        guardar.setString(17, ape_mat_eme_2);
        guardar.setString(18, nombre_eme_2);
        guardar.setString(19, tel_fam_eme_2);
        guardar.setString(20,parentesco_fam_eme_2);
        guardar.setString(21, canti_alim);
        guardar.setString(22, cali_alim);
        guardar.execute();
    }
    
    public static void GuardarAnte_Heredo_Fam(String familiar, String especificacion, String fecha_inicio, 
            String tratamiento_actual /*,int clave_expe, int clave_enf*/) throws SQLException
    {
        //Mandar llamar el procedimiento almacenado para guardar usuarios.
        CallableStatement guardar = Conexion_2.getConexion().prepareCall("{call GuardarAnte_Heredo_Fam(?,?,?,?)}");
        guardar.setString(1, familiar);
        guardar.setString(2, especificacion);
        guardar.setString(3, fecha_inicio);
        guardar.setString(4, tratamiento_actual);
        //guardar.setInt(5, clave_expe);
        //guardar.setInt(6, clave_enf);
        guardar.execute();
    }
    
    public static void GuardarRevision (String fecha,String ape_pat,String ape_mat,String nombre, String motivo, String campaña,
            String peso, String estatura,String pulso, String glucosa, String fr, String temperatura, 
            String oxigenacion, String estres,String diagnostico) throws SQLException
    {
        CallableStatement guardar = Conexion_2.getConexion().prepareCall("{call GuardarRevision(?,?,?,?,?,?,?,?,?,?,?,?,?,"
                + "?,?)}"); //15
        guardar.setString(1, fecha);
        guardar.setString(2, ape_pat);
        guardar.setString(3, ape_mat);
        guardar.setString(4, nombre);
        guardar.setString(5, motivo);
        guardar.setString(6, campaña);        
        guardar.setString(7, peso);
        guardar.setString(8, estatura);
        guardar.setString(9, pulso);
        guardar.setString(10, glucosa);
        guardar.setString(11, fr);
        guardar.setString(12, temperatura);
        guardar.setString(13, oxigenacion);
        guardar.setString(14, estres);
        guardar.setString(15, diagnostico);
        guardar.execute();
    }
    ////////////////////////////////////////// ELIMINACIÓN //////////////////////////////////////////////////////
    
    public static void EliminarEnfermedad (int clave_enf) throws SQLException
    {
        CallableStatement entrada = Conexion_2.getConexion().prepareCall("{call EliminarEnfermedad(?)}");
        entrada.setInt(1, clave_enf);
        entrada.execute();
    }
    
    public static void EliminarEscuela (int clave_esc) throws SQLException
    {
        CallableStatement entrada = Conexion_2.getConexion().prepareCall("{call EliminarEscuela(?)}");
        entrada.setInt(1, clave_esc);
        entrada.execute();
    }
    
    public static void EliminarEntidad (int clave_ent) throws SQLException
    {
        CallableStatement entrada = Conexion_2.getConexion().prepareCall("{call EliminarEntidad(?)}");
        entrada.setInt(1, clave_ent);
        entrada.execute();
    }
    
    public static void EliminarUsuario (int clave_usr) throws SQLException
    {
        CallableStatement entrada = Conexion_2.getConexion().prepareCall("{call EliminarUsuario(?)}");
        entrada.setInt(1, clave_usr);
        entrada.execute();
    }
    
     public static void EliminarEmpleado (int clave_empl) throws SQLException
    {
        CallableStatement entrada = Conexion_2.getConexion().prepareCall("{call EliminarEmpleado(?)}");
        entrada.setInt(1, clave_empl);
        entrada.execute();
    }
    
    public static void EliminarRevision (int clave_revis) throws SQLException
    {
        CallableStatement entrada = Conexion_2.getConexion().prepareCall("{call EliminarRevision(?)}");//15
        entrada.setInt(1, clave_revis);
        entrada.execute();
    }
}

        


