package main.java.holamundocom;

import java.awt.event.ItemEvent;
import java.io.File;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
import java.sql.PreparedStatement;
import main.java.holamundocom.ExportarExcel;



public class Escuelas extends javax.swing.JFrame {
    
    static ResultSet res_consul;
    DefaultTableModel model = new DefaultTableModel();  
    private ExportarExcel obj;
   
    
    public Escuelas() {
        initComponents();
        CargarEscuela();
        this.setLocationRelativeTo(null);
        lbl_clave.setVisible(false);
        txt_claveEsc.setVisible(false);
        btn_modificar.setEnabled(false);
        btn_eliminar.setEnabled(false);
    }
    
    /**Método para mandar llamar los registros de esta tabla y mostrarlos 
    en el JTable de este mismo formulario, esto realizado por medio de una 
    consulta general a la tabla "escuela" que se encuentra en la base de 
    datos con nombre "MedicalDB" la cual almacena esa consulta en la variable 
    "res_consul" y va colocando la información de cada campo en su casilla 
    correspondiente en el JTable por medio de "Vector"**/
    public void CargarEscuela()
    {
        //"Arreglo" que arroja los datos almacenados para visualizarlo en la tabla del formulario.
        DefaultTableModel cargar_tabla = (DefaultTableModel)tbl_infoEsc.getModel();
        cargar_tabla.setRowCount(0);
        
        res_consul = Conexion_2.Consulta("select * from escuelas");
        try
        {
            while (res_consul.next())
            {
                Vector v = new Vector();
                v.add(res_consul.getInt(1));
                v.add(res_consul.getString(2));
                v.add(res_consul.getString(3));
                cargar_tabla.addRow(v);
                tbl_infoEsc.setModel(cargar_tabla);
            }
        }catch (SQLException e)
            {
            
            }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        pnl_info_esc = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_infoEsc = new javax.swing.JTable();
        pnl_buscar = new javax.swing.JPanel();
        lbl_escuela = new javax.swing.JLabel();
        lbl_nivel = new javax.swing.JLabel();
        cmb_nivel = new javax.swing.JComboBox<>();
        btn_buscar = new javax.swing.JButton();
        txt_escuela = new javax.swing.JTextField();
        btn_modificar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        lbl_clave = new javax.swing.JLabel();
        lbl_menu = new javax.swing.JLabel();
        lbl_eliminar = new javax.swing.JLabel();
        lbl_modificar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_guardar = new javax.swing.JLabel();
        txt_claveEsc = new javax.swing.JTextField();

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Información de Usuarios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro de Escuelas");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        pnl_info_esc.setBackground(new java.awt.Color(255, 255, 255));
        pnl_info_esc.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        tbl_infoEsc.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tbl_infoEsc.setModel(new javax.swing.table.DefaultTableModel(
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
                "Clave Escuela", "Nivel", "Escuela"
            }
        ));
        tbl_infoEsc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_infoEscMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_infoEsc);
        if (tbl_infoEsc.getColumnModel().getColumnCount() > 0) {
            tbl_infoEsc.getColumnModel().getColumn(0).setMinWidth(0);
            tbl_infoEsc.getColumnModel().getColumn(0).setPreferredWidth(0);
            tbl_infoEsc.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        javax.swing.GroupLayout pnl_info_escLayout = new javax.swing.GroupLayout(pnl_info_esc);
        pnl_info_esc.setLayout(pnl_info_escLayout);
        pnl_info_escLayout.setHorizontalGroup(
            pnl_info_escLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_info_escLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_info_escLayout.setVerticalGroup(
            pnl_info_escLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_info_escLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnl_buscar.setBackground(new java.awt.Color(255, 255, 255));
        pnl_buscar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        lbl_escuela.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_escuela.setText("Escuela");

        lbl_nivel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_nivel.setText("Nivel");

        cmb_nivel.setBackground(new java.awt.Color(255, 255, 204));
        cmb_nivel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cmb_nivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Selecciona--", "Preparatoria", "Licenciatura", "Maestría", "Doctorado", "Otro" }));
        cmb_nivel.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_nivelItemStateChanged(evt);
            }
        });
        cmb_nivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_nivelActionPerformed(evt);
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

        txt_escuela.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txt_escuela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_escuelaActionPerformed(evt);
            }
        });
        txt_escuela.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_escuelaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnl_buscarLayout = new javax.swing.GroupLayout(pnl_buscar);
        pnl_buscar.setLayout(pnl_buscarLayout);
        pnl_buscarLayout.setHorizontalGroup(
            pnl_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_buscarLayout.createSequentialGroup()
                .addGroup(pnl_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_buscarLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lbl_nivel))
                    .addGroup(pnl_buscarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_escuela)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmb_nivel, 0, 316, Short.MAX_VALUE)
                    .addComponent(txt_escuela))
                .addGap(18, 18, 18)
                .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnl_buscarLayout.setVerticalGroup(
            pnl_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_buscarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_buscarLayout.createSequentialGroup()
                        .addGroup(pnl_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_escuela, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_escuela))
                        .addGap(18, 18, 18)
                        .addGroup(pnl_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmb_nivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_nivel))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btn_buscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_info_esc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnl_info_esc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        lbl_clave.setBackground(new java.awt.Color(102, 102, 255));

        lbl_menu.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbl_menu.setText("Menú Principal");

        lbl_eliminar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbl_eliminar.setText("Eliminar");

        lbl_modificar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbl_modificar.setText("Modificar");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Guardar");

        lbl_guardar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbl_guardar.setText("Guardar");

        txt_claveEsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_claveEscActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_menu)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_clave, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_claveEsc, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_modificar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_guardar)
                            .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(240, 240, 240)
                    .addComponent(jLabel3)
                    .addContainerGap(241, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_claveEsc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_menu)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbl_eliminar)
                                .addComponent(lbl_modificar)
                                .addComponent(lbl_guardar)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(lbl_clave, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(254, 254, 254)
                    .addComponent(jLabel3)
                    .addContainerGap(239, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        try {
            btn_guardar.setEnabled(true);
            btn_eliminar.setEnabled(false);
            if(txt_escuela.getText().isEmpty() || cmb_nivel.getSelectedIndex()==0 )
            {
                JOptionPane.showMessageDialog(this, "Verifique que todos los datos sean capturados", "Observación", 
                JOptionPane.INFORMATION_MESSAGE);
            }else
            {
                PreparedStatement pps = Conexion_2.getConexion().prepareStatement("UPDATE escuelas SET nivel_esc='"+
                cmb_nivel.getSelectedItem()+"',nombre_esc='"+txt_escuela.getText()+"'WHERE clave_esc ='"+
                txt_claveEsc.getText()+"'");
                pps.executeUpdate();
                CargarEscuela();
                LimpiarEscuela();  
            }//Fin if-else
        } catch (SQLException ex) {
            Logger.getLogger(Escuelas.class.getName()).log(Level.SEVERE, null, ex);
        }//Fin try-catch
        
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
    btn_guardar.setEnabled(false);
    btn_modificar.setEnabled(false);
    //Almacena la fila seleccionada a borrar.
    int row = tbl_infoEsc.getSelectedRow();
    
    //Variable que toma como valor la aceptación o negación de la eliminación de la fila.
    int opt=JOptionPane.showConfirmDialog(this, "¿Desea eliminar el registro seleccionado?", "Verificación", 
    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
    
        if(opt==JOptionPane.YES_OPTION)
        {
            try {
                Procedimientos.EliminarEscuela(Integer.parseInt(tbl_infoEsc.getValueAt(row, 0).toString()));
                LimpiarEscuela();
                CargarEscuela();
            } catch (SQLException e) {
            }
        }else{
            LimpiarEscuela();
        }//Fin else
        btn_guardar.setEnabled(true);  
        btn_eliminar.setEnabled(false);
        btn_modificar.setEnabled(false);
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void cmb_nivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_nivelActionPerformed

    }//GEN-LAST:event_cmb_nivelActionPerformed

    private void cmb_nivelItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_nivelItemStateChanged
        
    }//GEN-LAST:event_cmb_nivelItemStateChanged

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        if(cmb_nivel.getSelectedIndex()==0 || txt_escuela.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Verifique que todos los datos sean capturados", "Observación", 
            JOptionPane.INFORMATION_MESSAGE);
        }else
            {
                try 
                {
                    Procedimientos.GuardarEscuela(cmb_nivel.getSelectedItem().toString(),txt_escuela.getText());
                    LimpiarEscuela();
                    CargarEscuela();  
                } catch (SQLException e) 
                    {
                        
                    }
            }
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void txt_escuelaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_escuelaKeyTyped
     char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) 
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo letras");
        }
        if(txt_escuela.getText().length() > 50)
        {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Límite de carácteres excedido");
        }
    }//GEN-LAST:event_txt_escuelaKeyTyped

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        try {
            if(txt_escuela.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Verifique que la escuela a consultar este capturada", "Observación", 
                JOptionPane.INFORMATION_MESSAGE);
            }else{
                DefaultTableModel model_buscar = new DefaultTableModel();  
                model_buscar=(DefaultTableModel) tbl_infoEsc.getModel();
                TableRowSorter<DefaultTableModel> res_busqueda = new TableRowSorter<>(model_buscar);
                //Realiza los filtros para comparar el dato buscado con la información existente.
                tbl_infoEsc.setRowSorter(res_busqueda);
                res_busqueda.setRowFilter(RowFilter.regexFilter(cmb_nivel.getSelectedItem().toString(), 1));
            }//Fin if-else
        } catch (Exception ex) {      
        }// Fin try-catch      
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void tbl_infoEscMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_infoEscMouseClicked
    btn_modificar.setEnabled(true);
    btn_eliminar.setEnabled(true);
    btn_guardar.setEnabled(false);
    int fila = tbl_infoEsc.getSelectedRow();
        txt_claveEsc.setText(tbl_infoEsc.getValueAt(fila, 0).toString());
        cmb_nivel.setSelectedItem(tbl_infoEsc.getValueAt(fila, 1));
        txt_escuela.setText(tbl_infoEsc.getValueAt(fila, 2).toString()); 
    }//GEN-LAST:event_tbl_infoEscMouseClicked

    private void btn_modificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_modificarMouseClicked
  
    }//GEN-LAST:event_btn_modificarMouseClicked

    private void txt_escuelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_escuelaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_escuelaActionPerformed

    private void txt_claveEscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_claveEscActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_claveEscActionPerformed

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        btn_modificar.setEnabled(false);
        btn_eliminar.setEnabled(false);
        btn_guardar.setEnabled(true);
        tbl_infoEsc.clearSelection();
        LimpiarEscuela();
    }//GEN-LAST:event_jPanel3MouseClicked
   
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
            java.util.logging.Logger.getLogger(Escuelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Escuelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Escuelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Escuelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Escuelas().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JComboBox<String> cmb_nivel;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbl_clave;
    private javax.swing.JLabel lbl_eliminar;
    private javax.swing.JLabel lbl_escuela;
    private javax.swing.JLabel lbl_guardar;
    private javax.swing.JLabel lbl_menu;
    private javax.swing.JLabel lbl_modificar;
    private javax.swing.JLabel lbl_nivel;
    private javax.swing.JPanel pnl_buscar;
    private javax.swing.JPanel pnl_info_esc;
    private javax.swing.JTable tbl_infoEsc;
    private javax.swing.JTextField txt_claveEsc;
    private javax.swing.JTextField txt_escuela;
    // End of variables declaration//GEN-END:variables

    private void executeUpdate(String query) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void LimpiarEscuela()
    {
        txt_escuela.setText("");
        cmb_nivel.setSelectedIndex(0);
        cmb_nivel.requestFocus();
    }
}
