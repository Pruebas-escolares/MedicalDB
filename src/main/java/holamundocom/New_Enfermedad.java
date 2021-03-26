/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.holamundocom;

import com.sun.jdi.connect.spi.Connection;
import java.beans.Statement;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.sql.PreparedStatement;
import javax.swing.JFrame;



public class New_Enfermedad extends javax.swing.JFrame {
    
    static ResultSet res_consul;
    DefaultTableModel model = new DefaultTableModel();
    private ExportarExcel obj;
 
    
    public New_Enfermedad() {
        initComponents();
        CargarEnfermedad();
        this.setLocationRelativeTo(null);  
        txt_claveEnf.setVisible(false);
        btn_modificar.setEnabled(false);
        btn_eliminar.setEnabled(false);
    }
    
    /**Método para mandar llamar los registros de esta tabla y mostrarlos 
    en el JTable de este mismo formulario, esto realizado por medio de una 
    consulta general a la tabla "enfermedad" que se encuentra en la base de 
    datos con nombre "MedicalDB" la cual almacena esa consulta en la variable 
    "res_consul" y va colocando la información de cada campo en su casilla 
    correspondiente en el JTable por medio de "Vector"**/
    public void CargarEnfermedad()
    {
        //"Arreglo" que arroja los datos almacenados para visualizarlo en la tabla del formulario.
        DefaultTableModel cargar_tabla = (DefaultTableModel)tbl_infoEnf.getModel();
        cargar_tabla.setRowCount(0);
        
        res_consul = Conexion_2.Consulta("select * from enfermedad ");
        
        try
        {
            while (res_consul.next())
            {
                Vector v = new Vector();
                v.add(res_consul.getInt(1));
                v.add(res_consul.getString(2));
                v.add(res_consul.getString(3));
                cargar_tabla.addRow(v);
                tbl_infoEnf.setModel(cargar_tabla);
            }
        }catch (SQLException e){
            Logger.getLogger(Escuelas.class.getName()).log(Level.SEVERE, null, e);//Verificar
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_modificar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        pnl_info_esc = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_infoEnf = new javax.swing.JTable();
        pnl_datosEnt = new javax.swing.JPanel();
        lbl_enf = new javax.swing.JLabel();
        txt_enf = new javax.swing.JTextField();
        lbl_descrip = new javax.swing.JLabel();
        txt_descrip = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        lbl_eliminar = new javax.swing.JLabel();
        lbl_modificar = new javax.swing.JLabel();
        lbl_guardar = new javax.swing.JLabel();
        lbl_menu = new javax.swing.JLabel();
        txt_claveEnf = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Registro de Enfermedades");
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        btn_modificar.setIcon(new javax.swing.ImageIcon("C:\\Users\\mahak\\Desktop\\Archivos Generales\\Uni 5to\\Base de Datos\\3er_Parcial\\Proyecto\\iconos\\orden.png")); // NOI18N
        btn_modificar.setFocusable(false);
        btn_modificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_modificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        pnl_info_esc.setBackground(new java.awt.Color(255, 255, 255));
        pnl_info_esc.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        tbl_infoEnf = new javax.swing.JTable(){
            public boolean isCellEditable(int filas, int columnas){
                return false;
            }
        };
        tbl_infoEnf.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tbl_infoEnf.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Clave_enf", "Enfermedad", "Descripción"
            }
        ));
        tbl_infoEnf.setFocusable(false);
        tbl_infoEnf.getTableHeader().setResizingAllowed(false);
        tbl_infoEnf.getTableHeader().setReorderingAllowed(false);
        tbl_infoEnf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_infoEnfMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_infoEnf);
        if (tbl_infoEnf.getColumnModel().getColumnCount() > 0) {
            tbl_infoEnf.getColumnModel().getColumn(0).setMinWidth(0);
            tbl_infoEnf.getColumnModel().getColumn(0).setPreferredWidth(0);
            tbl_infoEnf.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        javax.swing.GroupLayout pnl_info_escLayout = new javax.swing.GroupLayout(pnl_info_esc);
        pnl_info_esc.setLayout(pnl_info_escLayout);
        pnl_info_escLayout.setHorizontalGroup(
            pnl_info_escLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_info_escLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        pnl_info_escLayout.setVerticalGroup(
            pnl_info_escLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_info_escLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnl_datosEnt.setBackground(new java.awt.Color(255, 255, 255));
        pnl_datosEnt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        lbl_enf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_enf.setText("Enfermedad");

        txt_enf.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txt_enf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_enfKeyTyped(evt);
            }
        });

        lbl_descrip.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_descrip.setText("Descripción");

        txt_descrip.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txt_descrip.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_descripKeyTyped(evt);
            }
        });

        btn_buscar.setIcon(new javax.swing.ImageIcon("C:\\Users\\mahak\\Desktop\\Archivos Generales\\Uni 5to\\Base de Datos\\3er_Parcial\\Proyecto\\iconos\\search (2).png")); // NOI18N
        btn_buscar.setToolTipText("Buscar");
        btn_buscar.setFocusable(false);
        btn_buscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_buscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        btn_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btn_buscarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pnl_datosEntLayout = new javax.swing.GroupLayout(pnl_datosEnt);
        pnl_datosEnt.setLayout(pnl_datosEntLayout);
        pnl_datosEntLayout.setHorizontalGroup(
            pnl_datosEntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_datosEntLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnl_datosEntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_descrip)
                    .addComponent(lbl_enf))
                .addGap(18, 18, 18)
                .addGroup(pnl_datosEntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_enf, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_descrip, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        pnl_datosEntLayout.setVerticalGroup(
            pnl_datosEntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_datosEntLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pnl_datosEntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_datosEntLayout.createSequentialGroup()
                        .addGroup(pnl_datosEntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_enf)
                            .addComponent(txt_enf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnl_datosEntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_descrip)
                            .addComponent(txt_descrip, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_datosEnt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_info_esc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_datosEnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnl_info_esc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_salir.setIcon(new javax.swing.ImageIcon("C:\\Users\\mahak\\Desktop\\Archivos Generales\\Uni 5to\\Base de Datos\\3er_Parcial\\Proyecto\\iconos\\home.png")); // NOI18N
        btn_salir.setFocusable(false);
        btn_salir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_salir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        btn_eliminar.setIcon(new javax.swing.ImageIcon("C:\\Users\\mahak\\Desktop\\6to Semestre\\Informática VI\\Proyecto\\iconos\\eliminar.png")); // NOI18N
        btn_eliminar.setFocusable(false);
        btn_eliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_eliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_guardar.setIcon(new javax.swing.ImageIcon("C:\\Users\\mahak\\Desktop\\Archivos Generales\\Uni 5to\\Base de Datos\\3er_Parcial\\Proyecto\\iconos\\disco-flexible.png")); // NOI18N
        btn_guardar.setFocusable(false);
        btn_guardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_guardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        lbl_eliminar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbl_eliminar.setText("Eliminar");

        lbl_modificar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbl_modificar.setText("Modificar");

        lbl_guardar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbl_guardar.setText("Guardar");

        lbl_menu.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbl_menu.setText("Menú Principal");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_menu)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(210, 210, 210)
                        .addComponent(txt_claveEnf, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_modificar))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_guardar)
                            .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_modificar, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                            .addComponent(btn_guardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(txt_claveEnf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_eliminar)
                    .addComponent(lbl_modificar)
                    .addComponent(lbl_guardar)
                    .addComponent(lbl_menu))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        try {
            btn_guardar.setEnabled(true);
            btn_eliminar.setEnabled(false);
            if(txt_enf.getText().isEmpty() || txt_descrip.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Verifique que todos los datos sean capturados", "Observación", 
                JOptionPane.INFORMATION_MESSAGE);
            }else
                {
                    PreparedStatement pps = Conexion_2.getConexion().prepareStatement("UPDATE enfermedad SET nombre_enf='"+
                    txt_enf.getText()+"',descripcion_enf='"+txt_descrip.getText()+"'WHERE clave_enf ='"+
                    txt_claveEnf.getText()+"'");
                    pps.executeUpdate();
                    CargarEnfermedad();
                    LimpiarEnfermedad(); 
                }//Fin de if/else        
        } catch (SQLException ex) {
            Logger.getLogger(Escuelas.class.getName()).log(Level.SEVERE, null, ex);
        }//Fin de try-catch
        btn_modificar.setEnabled(false);
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
    btn_guardar.setEnabled(false);
    btn_modificar.setEnabled(false);
    //Almacena la fila seleccionada a borrar.
    int row = tbl_infoEnf.getSelectedRow(); 
    
    //Variable que toma como valor la aceptación o negación de la eliminación de la fila.
    int opt=JOptionPane.showConfirmDialog(this, "¿Desea eliminar el registro seleccionado?", "Verificación", 
    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
    
    if(opt==JOptionPane.YES_OPTION)
    {
        try {
            Procedimientos.EliminarEnfermedad(Integer.parseInt(tbl_infoEnf.getValueAt(row, 0).toString()));
            LimpiarEnfermedad();
            CargarEnfermedad();
        } catch (SQLException e){
        }//Fin try-catch
    }else{
        LimpiarEnfermedad();
    }//Fin else
     btn_guardar.setEnabled(true);  
     btn_eliminar.setEnabled(false);
     btn_modificar.setEnabled(false);
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        if(txt_enf.getText().isEmpty() || txt_descrip.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Verifique que todos los datos sean capturados", "Observación", 
            JOptionPane.INFORMATION_MESSAGE);
        }else
            {
                try 
                {
                    Procedimientos.GuardarEnfermedad(txt_enf.getText(), txt_descrip.getText());
                    LimpiarEnfermedad();
                    CargarEnfermedad();
                } catch (SQLException e){

                }
        }
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void txt_enfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_enfKeyTyped
        if(txt_enf.getText().length() > 50)
        {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Límite de carácteres excedido");
        }
    }//GEN-LAST:event_txt_enfKeyTyped

    private void txt_descripKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_descripKeyTyped
        if(txt_descrip.getText().length() > 255)
        {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Límite de carácteres excedido");
        }
    }//GEN-LAST:event_txt_descripKeyTyped

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
     try {
        if(txt_enf.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Verifique que la enfermedad a consultar este capturada", "Observación", 
            JOptionPane.INFORMATION_MESSAGE);
        }else{
            /*int fila =tbl_infoEnf.getSelectedRow();
            int columna = tbl_infoEnf.getSelectedColumn();*/
            DefaultTableModel modelo_buscar = new DefaultTableModel();  
            modelo_buscar=(DefaultTableModel) tbl_infoEnf.getModel();
            TableRowSorter<DefaultTableModel> res_busqueda = new TableRowSorter<>(modelo_buscar);
            //Realiza los filtros para comparar el dato buscado con la información existente.
            tbl_infoEnf.setRowSorter(res_busqueda); 
            res_busqueda.setRowFilter(RowFilter.regexFilter(txt_enf.getText(), 1));
        }//Fin if/else
        } catch (Exception ex) {
            
        }//Fin try/catch
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_buscarKeyReleased
         
    }//GEN-LAST:event_btn_buscarKeyReleased

    private void tbl_infoEnfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_infoEnfMouseClicked
    btn_modificar.setEnabled(true);
    btn_eliminar.setEnabled(true);
    btn_guardar.setEnabled(false);
    int fila = tbl_infoEnf.getSelectedRow();
        txt_claveEnf.setText(tbl_infoEnf.getValueAt(fila, 0).toString());
        txt_enf.setText(tbl_infoEnf.getValueAt(fila, 1).toString());
        txt_descrip.setText(tbl_infoEnf.getValueAt(fila, 2).toString());
    }//GEN-LAST:event_tbl_infoEnfMouseClicked

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        btn_modificar.setEnabled(false);
        btn_eliminar.setEnabled(false);
        btn_guardar.setEnabled(true);
        tbl_infoEnf.clearSelection();
        LimpiarEnfermedad();
    }//GEN-LAST:event_jPanel3MouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked

    }//GEN-LAST:event_formMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(New_Enfermedad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(New_Enfermedad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(New_Enfermedad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(New_Enfermedad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new New_Enfermedad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_descrip;
    private javax.swing.JLabel lbl_eliminar;
    private javax.swing.JLabel lbl_enf;
    private javax.swing.JLabel lbl_guardar;
    private javax.swing.JLabel lbl_menu;
    private javax.swing.JLabel lbl_modificar;
    private javax.swing.JPanel pnl_datosEnt;
    private javax.swing.JPanel pnl_info_esc;
    private javax.swing.JTable tbl_infoEnf;
    private javax.swing.JTextField txt_claveEnf;
    private javax.swing.JTextField txt_descrip;
    private javax.swing.JTextField txt_enf;
    // End of variables declaration//GEN-END:variables

    public void LimpiarEnfermedad()
    {
        txt_enf.setText("");
        txt_descrip.setText("");
        txt_enf.requestFocus();
    }
}
