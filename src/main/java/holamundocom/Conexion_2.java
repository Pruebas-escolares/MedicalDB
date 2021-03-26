/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.holamundocom;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;



/**
 *
 * @author mahak
 */
public class Conexion_2 {
    static Connection contacto = null;
    
    public static Connection getConexion()
    {
        String url = "jdbc:sqlserver://LAPTOP-TFMK1F0K\\MEDICALDB:1433;databaseName=MedicalDB;";
        try 
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
        }catch (ClassNotFoundException e)
            {
                JOptionPane.showMessageDialog(null,"No se pudo establecer la conexión..." 
                        + e.getMessage(), 
                        "Error de conexión", JOptionPane.ERROR_MESSAGE);
            }
        try
        {
            contacto = (Connection) DriverManager.getConnection(url,"sa","123456");
        }catch (SQLException e)
            {
                JOptionPane.showMessageDialog(null, "Error" + e.getMessage(),"Error de conexión",
                        JOptionPane.ERROR_MESSAGE);
            }
        return contacto;
    }
    
    public static ResultSet Consulta (String consulta)
    {
        Connection con = getConexion();
        Statement declara;
        try
        {
            declara = con.createStatement();
            ResultSet respuesta = declara.executeQuery(consulta);
            return respuesta;
        }catch (SQLException e)
            {
               JOptionPane.showMessageDialog(null, "Error" + e.getMessage(), "Error conexión",
                       JOptionPane.ERROR_MESSAGE);
               return null;
            }
    }
    
   //Método para cargar el ComboBox "Lugar de Nacimiento" 
    public DefaultComboBoxModel Cargar_Lug_Nac()
    {
        DefaultComboBoxModel ListaOrigen = new DefaultComboBoxModel();
        ListaOrigen.addElement("--Seleccione--");
        ResultSet res = this.Consulta("SELECT * FROM entidad order by clave_ent");
        try {
            while(res.next())
            {
                ListaOrigen.addElement(res.getString("ciudad"));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return ListaOrigen;
    }
    
    //Método para cargar el ComboBox "Lugar de Nacimiento" 
    public DefaultComboBoxModel Cargar_Lug_Res()
    {
        DefaultComboBoxModel ListaOrigen = new DefaultComboBoxModel();
        ListaOrigen.addElement("--Seleccione--");
        ResultSet res = this.Consulta("SELECT * FROM entidad order by clave_ent");
        try {
            while(res.next())
            {
                ListaOrigen.addElement(res.getString("ciudad"));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return ListaOrigen;
    }
    
    //Método para cargar el ComboBox "Tipo de Enfermedad" 
    public DefaultComboBoxModel Cargar_Tipo_Enf()
    {
        DefaultComboBoxModel ListaOrigen = new DefaultComboBoxModel();
        ListaOrigen.addElement("--Seleccione--");
        ResultSet res = this.Consulta("SELECT * FROM enfermedad order by clave_enf");
        try {
            while(res.next())
            {
                ListaOrigen.addElement(res.getString("nombre_enf"));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return ListaOrigen;
    }

}
