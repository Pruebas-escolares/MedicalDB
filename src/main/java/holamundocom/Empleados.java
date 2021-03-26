/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.holamundocom;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author mahak
 */
public class Empleados extends javax.swing.JFrame {
    
    static ResultSet res_consul;
    DefaultTableModel model = new DefaultTableModel();  
    private ExportarExcel obj;
    
    
    public Empleados() {
        initComponents();
        CargarEmpleado();
        this.setLocationRelativeTo(null);
        txt_claveEmpl.setVisible(false);
        btn_modificar.setEnabled(false);
        btn_eliminar.setEnabled(false);
    }

    /**Método para mandar llamar los registros de esta tabla y mostrarlos 
    en el JTable de este mismo formulario, esto realizado por medio de una 
    consulta general a la tabla "empleado" que se encuentra en la base de 
    datos con nombre "MedicalDB" la cual almacena esa consulta en la variable 
    "res_consul" y va colocando la información de cada campo en su casilla 
    correspondiente en el JTable por medio de "Vector"**/
    public void CargarEmpleado()
    {
        //"Arreglo" que arroja los datos almacenados para visualizarlo en la tabla del formulario.
        DefaultTableModel cargar_tabla = (DefaultTableModel)tbl_infoEmpl.getModel();
        cargar_tabla.setRowCount(0);
        
        res_consul = Conexion_2.Consulta("select * from empleado");
        try
        {
            while (res_consul.next())
            {
                Vector v = new Vector();
                v.add(res_consul.getInt(1));
                v.add(res_consul.getString(2));
                v.add(res_consul.getString(3));
                v.add(res_consul.getString(4));
                cargar_tabla.addRow(v);
                tbl_infoEmpl.setModel(cargar_tabla);
            }
        }catch (SQLException e)
            {
            
            }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnl_buscar = new javax.swing.JPanel();
        lbl_puesto = new javax.swing.JLabel();
        lbl_area = new javax.swing.JLabel();
        cmb_area = new javax.swing.JComboBox<>();
        btn_buscar = new javax.swing.JButton();
        cmb_puesto = new javax.swing.JComboBox<>();
        lbl_turno = new javax.swing.JLabel();
        cmb_turno = new javax.swing.JComboBox<>();
        pnl_info_esc = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_infoEmpl = new javax.swing.JTable();
        btn_salir = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        lbl_menu = new javax.swing.JLabel();
        lbl_eliminar = new javax.swing.JLabel();
        lbl_modificar = new javax.swing.JLabel();
        lbl_guardar = new javax.swing.JLabel();
        txt_claveEmpl = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro de Empleados");

        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        pnl_buscar.setBackground(new java.awt.Color(255, 255, 255));
        pnl_buscar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        lbl_puesto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_puesto.setText("Puesto");

        lbl_area.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_area.setText("Área");

        cmb_area.setBackground(new java.awt.Color(255, 255, 204));
        cmb_area.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cmb_area.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Selecciona--", "Administrativa", "Mantenimiento" }));
        cmb_area.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_areaItemStateChanged(evt);
            }
        });
        cmb_area.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_areaActionPerformed(evt);
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

        cmb_puesto.setBackground(new java.awt.Color(255, 255, 204));
        cmb_puesto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cmb_puesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--", "Secretaria", "Vigilante" }));
        cmb_puesto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_puestoItemStateChanged(evt);
            }
        });
        cmb_puesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_puestoActionPerformed(evt);
            }
        });

        lbl_turno.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_turno.setText("Turno");

        cmb_turno.setBackground(new java.awt.Color(255, 255, 204));
        cmb_turno.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cmb_turno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Selecciona--", "Matutino", "Vespertino" }));
        cmb_turno.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_turnoItemStateChanged(evt);
            }
        });
        cmb_turno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_turnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_buscarLayout = new javax.swing.GroupLayout(pnl_buscar);
        pnl_buscar.setLayout(pnl_buscarLayout);
        pnl_buscarLayout.setHorizontalGroup(
            pnl_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_buscarLayout.createSequentialGroup()
                .addGroup(pnl_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pnl_buscarLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lbl_area)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmb_area, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnl_buscarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_puesto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmb_puesto, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_turno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmb_turno, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_buscarLayout.setVerticalGroup(
            pnl_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_buscarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_buscarLayout.createSequentialGroup()
                        .addGroup(pnl_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_area)
                            .addComponent(cmb_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(pnl_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_puesto, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_puesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_turno)
                            .addComponent(cmb_turno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pnl_info_esc.setBackground(new java.awt.Color(255, 255, 255));
        pnl_info_esc.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        tbl_infoEmpl.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tbl_infoEmpl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Clave Empleado", "Área", "Puesto", "Turno"
            }
        ));
        tbl_infoEmpl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_infoEmplMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_infoEmpl);
        if (tbl_infoEmpl.getColumnModel().getColumnCount() > 0) {
            tbl_infoEmpl.getColumnModel().getColumn(0).setMinWidth(0);
            tbl_infoEmpl.getColumnModel().getColumn(0).setPreferredWidth(0);
            tbl_infoEmpl.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        javax.swing.GroupLayout pnl_info_escLayout = new javax.swing.GroupLayout(pnl_info_esc);
        pnl_info_esc.setLayout(pnl_info_escLayout);
        pnl_info_escLayout.setHorizontalGroup(
            pnl_info_escLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_info_escLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_info_escLayout.setVerticalGroup(
            pnl_info_escLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_info_escLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                .addContainerGap())
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

        btn_modificar.setIcon(new javax.swing.ImageIcon("C:\\Users\\mahak\\Desktop\\Archivos Generales\\Uni 5to\\Base de Datos\\3er_Parcial\\Proyecto\\iconos\\orden.png")); // NOI18N
        btn_modificar.setFocusable(false);
        btn_modificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_modificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_modificarMouseClicked(evt);
            }
        });
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
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

        lbl_menu.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbl_menu.setText("Menú Principal");

        lbl_eliminar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbl_eliminar.setText("Eliminar");

        lbl_modificar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbl_modificar.setText("Modificar");

        lbl_guardar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbl_guardar.setText("Guardar");

        txt_claveEmpl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_claveEmplActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_buscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_info_esc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_menu)
                                .addGap(184, 184, 184))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_claveEmpl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_modificar))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_guardar)
                            .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pnl_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnl_info_esc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txt_claveEmpl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_eliminar)
                    .addComponent(lbl_modificar)
                    .addComponent(lbl_guardar)
                    .addComponent(lbl_menu))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmb_areaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_areaItemStateChanged

    }//GEN-LAST:event_cmb_areaItemStateChanged

    private void cmb_areaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_areaActionPerformed

    }//GEN-LAST:event_cmb_areaActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        try {
            if(cmb_area.getSelectedIndex()==0)
            {
                JOptionPane.showMessageDialog(this, "Verifique que el área a consultar este capturada", "Observación", 
                JOptionPane.INFORMATION_MESSAGE);
            }else{
                DefaultTableModel model_buscar = new DefaultTableModel();
                model_buscar=(DefaultTableModel) tbl_infoEmpl.getModel();
                TableRowSorter<DefaultTableModel> res_busqueda = new TableRowSorter<>(model_buscar);
                //Realiza los filtros para comparar el dato buscado con la información existente.
                tbl_infoEmpl.setRowSorter(res_busqueda);
                res_busqueda.setRowFilter(RowFilter.regexFilter(cmb_area.getSelectedItem().toString(), 1));
            }
        } catch (Exception ex) {

        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void tbl_infoEmplMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_infoEmplMouseClicked
        btn_modificar.setEnabled(true);
        btn_eliminar.setEnabled(true);
        btn_guardar.setEnabled(false);
        
        int fila = tbl_infoEmpl.getSelectedRow();
        txt_claveEmpl.setText(tbl_infoEmpl.getValueAt(fila, 0).toString());    
        cmb_area.setSelectedItem(tbl_infoEmpl.getValueAt(fila, 1));
        cmb_puesto.setSelectedItem(tbl_infoEmpl.getValueAt(fila, 2));
        cmb_turno.setSelectedItem(tbl_infoEmpl.getValueAt(fila, 3));
    }//GEN-LAST:event_tbl_infoEmplMouseClicked

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        btn_guardar.setEnabled(false);
        btn_modificar.setEnabled(false);
        //Almacena la fila seleccionada a borrar.
        int row = tbl_infoEmpl.getSelectedRow();

        //Variable que toma como valor la aceptación o negación de la eliminación de la fila.
        int opt=JOptionPane.showConfirmDialog(this, "¿Desea eliminar el registro seleccionado?", "Verificación",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if(opt==JOptionPane.YES_OPTION)
        {
            try {
                Procedimientos.EliminarEmpleado(Integer.parseInt(tbl_infoEmpl.getValueAt(row, 0).toString()));
                LimpiarEmpleado();
                CargarEmpleado();
            } catch (SQLException e) {
            }
        }else{
            LimpiarEmpleado();
        }//Fin else
        btn_guardar.setEnabled(true);  
        btn_eliminar.setEnabled(false);
        btn_modificar.setEnabled(false);
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_modificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_modificarMouseClicked

    }//GEN-LAST:event_btn_modificarMouseClicked

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
    try {
            btn_guardar.setEnabled(true);
            btn_eliminar.setEnabled(false);
            if(cmb_area.getSelectedIndex()==0 || cmb_puesto.getSelectedIndex()==0 || cmb_turno.getSelectedIndex()==0 )
            {
                JOptionPane.showMessageDialog(this, "Verifique que todos los datos sean capturados", "Observación", 
                JOptionPane.INFORMATION_MESSAGE);
            }else
            {
                PreparedStatement pps = Conexion_2.getConexion().prepareStatement("UPDATE empleado SET area_empl='"+
                cmb_area.getSelectedItem()+"',puesto_empl='"+cmb_puesto.getSelectedItem()+"',turno_empl='"+
                cmb_turno.getSelectedItem()+"'WHERE clave_empl='"+ txt_claveEmpl.getText()+"'");
                pps.executeUpdate();
                CargarEmpleado();
                LimpiarEmpleado(); 
            }//Fin if-else
        } catch (SQLException ex) {
            Logger.getLogger(Escuelas.class.getName()).log(Level.SEVERE, null, ex);
        }//Fin try-catch
        
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        if(cmb_area.getSelectedIndex()==0 || cmb_puesto.getSelectedIndex()==0 || cmb_turno.getSelectedIndex()==0  )
        {
            JOptionPane.showMessageDialog(this, "Verifique que todos los datos sean capturados", "Observación",
                JOptionPane.INFORMATION_MESSAGE);
        }else
        {
            try
            {
                Procedimientos.GuardarEmpleado(cmb_area.getSelectedItem().toString(), cmb_puesto.getSelectedItem().toString(),
                cmb_turno.getSelectedItem().toString());
                LimpiarEmpleado();
                CargarEmpleado();
            } catch (SQLException e)
            {

            }
        }
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void cmb_puestoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_puestoItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_puestoItemStateChanged

    private void cmb_puestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_puestoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_puestoActionPerformed

    private void cmb_turnoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_turnoItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_turnoItemStateChanged

    private void cmb_turnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_turnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_turnoActionPerformed

    private void txt_claveEmplActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_claveEmplActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_claveEmplActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        btn_modificar.setEnabled(false);
        btn_eliminar.setEnabled(false);
        btn_guardar.setEnabled(true);
        tbl_infoEmpl.clearSelection();
        LimpiarEmpleado();
    }//GEN-LAST:event_jPanel1MouseClicked

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
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Empleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JComboBox<String> cmb_area;
    private javax.swing.JComboBox<String> cmb_puesto;
    private javax.swing.JComboBox<String> cmb_turno;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_area;
    private javax.swing.JLabel lbl_eliminar;
    private javax.swing.JLabel lbl_guardar;
    private javax.swing.JLabel lbl_menu;
    private javax.swing.JLabel lbl_modificar;
    private javax.swing.JLabel lbl_puesto;
    private javax.swing.JLabel lbl_turno;
    private javax.swing.JPanel pnl_buscar;
    private javax.swing.JPanel pnl_info_esc;
    private javax.swing.JTable tbl_infoEmpl;
    private javax.swing.JTextField txt_claveEmpl;
    // End of variables declaration//GEN-END:variables
    
    public void LimpiarEmpleado()
    {
        cmb_area.setSelectedIndex(0);
        cmb_puesto.setSelectedIndex(0);
        cmb_turno.setSelectedIndex(0);
        cmb_area.requestFocus();
    }
}
