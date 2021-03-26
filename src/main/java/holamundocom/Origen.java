package main.java.holamundocom;

import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mahak
 */
public class Origen extends javax.swing.JFrame {

    static ResultSet res;
    
    public Origen() {
        initComponents();
        CargarEntidades();
        this.setLocationRelativeTo(null);
    }
    
    public void CargarEntidades()
    {
        DefaultTableModel modelo = (DefaultTableModel)tbl_entidad.getModel();
        modelo.setRowCount(0);
        res = Conexion_2.Consulta("select * from entidad");
        try
        {
            while (res.next())
            {
                Vector v = new Vector();
                v.add(res.getInt(1));
                v.add(res.getString(2));
                v.add(res.getString(3));
                modelo.addRow(v);
                tbl_entidad.setModel(modelo);
            }
        }catch (SQLException e)
            {
            
            }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnl_infoEnt = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_entidad = new javax.swing.JTable();
        pnl_buscar = new javax.swing.JPanel();
        lbl_ciudad = new javax.swing.JLabel();
        txt_ciudad = new javax.swing.JTextField();
        lbl_estado = new javax.swing.JLabel();
        cmb_estado = new javax.swing.JComboBox<>();
        btn_buscar1 = new javax.swing.JButton();
        btn_modificar2 = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Catalogo de Entidades");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        pnl_infoEnt.setBackground(new java.awt.Color(255, 255, 255));
        pnl_infoEnt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        tbl_entidad.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tbl_entidad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Clave Entidad", "Ciudad", "Estado"
            }
        ));
        jScrollPane1.setViewportView(tbl_entidad);
        if (tbl_entidad.getColumnModel().getColumnCount() > 0) {
            tbl_entidad.getColumnModel().getColumn(0).setMinWidth(0);
            tbl_entidad.getColumnModel().getColumn(0).setPreferredWidth(0);
            tbl_entidad.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        javax.swing.GroupLayout pnl_infoEntLayout = new javax.swing.GroupLayout(pnl_infoEnt);
        pnl_infoEnt.setLayout(pnl_infoEntLayout);
        pnl_infoEntLayout.setHorizontalGroup(
            pnl_infoEntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_infoEntLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_infoEntLayout.setVerticalGroup(
            pnl_infoEntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_infoEntLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnl_buscar.setBackground(new java.awt.Color(255, 255, 255));
        pnl_buscar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        lbl_ciudad.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_ciudad.setText("Ciudad");

        txt_ciudad.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txt_ciudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ciudadKeyTyped(evt);
            }
        });

        lbl_estado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_estado.setText("Estado");

        cmb_estado.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cmb_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECCIONE--", "AGUASCALIENTES", "BAJA CALIFORNIA", "BAJA CALIFORNIA SUR", "CAMPECHE", "CHIAPAS", "CHIHUAHUA", "COAHUILA DE ZARAGOZA", "COLIMA", "DURANGO", "ESTADO DE MÉXICO", "EXTRANJERO", "GUANAJUATO", "GUERRERO", "HIDALGO", "JALISCO", "MICHOACÁN DE OCAMPO", "MORELOS", "NAYARIT", "NUEVO LEÓN", "OAXACA", "PUEBLA", "QUERÉTARO", "QUINTANA ROO", "SAN LUIS POTOSÍ", "SINALOA", "SONORA", "TABASCO", "TAMAULIPAS", "TLAXCALA", "VERACRUZ DE IGNACIO DE LA LLAVE", "YUCATÁN", "ZACATECAS" }));
        cmb_estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_estadoActionPerformed(evt);
            }
        });

        btn_buscar1.setIcon(new javax.swing.ImageIcon("C:\\Users\\mahak\\Desktop\\Archivos Generales\\Uni 5to\\Base de Datos\\3er_Parcial\\Proyecto\\iconos\\search (2).png")); // NOI18N
        btn_buscar1.setFocusable(false);
        btn_buscar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_buscar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_buscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_buscarLayout = new javax.swing.GroupLayout(pnl_buscar);
        pnl_buscar.setLayout(pnl_buscarLayout);
        pnl_buscarLayout.setHorizontalGroup(
            pnl_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_buscarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_ciudad)
                    .addComponent(lbl_estado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_ciudad, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                    .addComponent(cmb_estado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btn_buscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        pnl_buscarLayout.setVerticalGroup(
            pnl_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_buscarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_buscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_buscarLayout.createSequentialGroup()
                        .addGroup(pnl_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_ciudad)
                            .addComponent(txt_ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnl_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_estado)
                            .addComponent(cmb_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pnl_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(pnl_infoEnt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_infoEnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_modificar2.setIcon(new javax.swing.ImageIcon("C:\\Users\\mahak\\Desktop\\Archivos Generales\\Uni 5to\\Base de Datos\\3er_Parcial\\Proyecto\\iconos\\orden.png")); // NOI18N
        btn_modificar2.setFocusable(false);
        btn_modificar2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_modificar2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_modificar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificar2ActionPerformed(evt);
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

        btn_eliminar.setIcon(new javax.swing.ImageIcon("C:\\Users\\mahak\\Desktop\\Archivos Generales\\Uni 5to\\Base de Datos\\3er_Parcial\\Proyecto\\iconos\\borrar-usuario.png")); // NOI18N
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_modificar2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_guardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_modificar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmb_estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_estadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_estadoActionPerformed

    private void btn_modificar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_modificar2ActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        int row = tbl_entidad.getSelectedRow();
    int opt=JOptionPane.showConfirmDialog(this, "¿Desea eliminar el registro seleccionado?", "Verificación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
    
    if(opt==JOptionPane.YES_OPTION)
    {
        try {
            Procedimientos.EliminarEntidad(Integer.parseInt(tbl_entidad.getValueAt(row, 0).toString()));
            txt_ciudad.setText("");
            cmb_estado.setSelectedIndex(0);
            cmb_estado.requestFocus();
            CargarEntidades();
        } catch (SQLException e) {
        }
    }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void txt_ciudadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ciudadKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) 
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo letras");
        }
        if(txt_ciudad.getText().length() > 50)
        {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Límite de carácteres excedido");
        }
    }//GEN-LAST:event_txt_ciudadKeyTyped

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed

        if(txt_ciudad.getText().isEmpty() || cmb_estado.getSelectedIndex()==0)
        {
            JOptionPane.showMessageDialog(this, "Verifique que todos los datos sean capturados", "Observación", JOptionPane.INFORMATION_MESSAGE);
        }else
            {
                try 
                {
                    Procedimientos.GuardarEntidad(txt_ciudad.getText(), cmb_estado.getSelectedItem().toString());
                    txt_ciudad.setText("");
                    cmb_estado.setSelectedIndex(0);
                    CargarEntidades();
                    
                } catch (SQLException e) 
                    {
                        
                    }
            }
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_buscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar1ActionPerformed
        try {
            DefaultTableModel model_buscar = new DefaultTableModel();  
            model_buscar=(DefaultTableModel) tbl_entidad.getModel();
            TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(model_buscar);
            tbl_entidad.setRowSorter(tr);
            tr.setRowFilter(RowFilter.regexFilter(txt_ciudad.getText(), 1));
        } catch (Exception ex) {
            
        }
    }//GEN-LAST:event_btn_buscar1ActionPerformed

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
            java.util.logging.Logger.getLogger(Origen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Origen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Origen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Origen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Origen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar1;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_modificar2;
    private javax.swing.JButton btn_salir;
    private javax.swing.JComboBox<String> cmb_estado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_ciudad;
    private javax.swing.JLabel lbl_estado;
    private javax.swing.JPanel pnl_buscar;
    private javax.swing.JPanel pnl_infoEnt;
    private javax.swing.JTable tbl_entidad;
    private javax.swing.JTextField txt_ciudad;
    // End of variables declaration//GEN-END:variables
}
