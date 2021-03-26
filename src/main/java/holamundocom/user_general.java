package main.java.holamundocom;

import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;


//package holamundocom;

public class user_general extends javax.swing.JFrame {

    static ResultSet res;
    
    public user_general() {
        initComponents();
        CargarUsuarios();
        this.setLocationRelativeTo(null);
    }
    
    public void CargarUsuarios()
    {
        DefaultTableModel modelo = (DefaultTableModel)tbl_infoUs.getModel();
        modelo.setRowCount(0);
        res = Conexion_2.Consulta("select * from usuarios");
        try
        {
            while (res.next())
            {
                Vector v = new Vector();
                v.add(res.getInt(1));
                v.add(res.getString(2));
                v.add(res.getString(3));
                v.add(res.getString(5));
                modelo.addRow(v);
                tbl_infoUs.setModel(modelo);
            }
        }catch (SQLException e)
            {
            
            }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnl_infoUs = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_infoUs = new javax.swing.JTable();
        pnl_datosUs = new javax.swing.JPanel();
        lbl_usuario = new javax.swing.JLabel();
        lbl_nombre = new javax.swing.JLabel();
        lbl_contraseña = new javax.swing.JLabel();
        lbl_tipo = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_usuario = new javax.swing.JTextField();
        cmb_tipoUs = new javax.swing.JComboBox<>();
        txtPass_Contraseña = new javax.swing.JPasswordField();
        lbl_nombre1 = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Catalogo de Usuarios");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        pnl_infoUs.setBackground(new java.awt.Color(255, 255, 255));
        pnl_infoUs.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        tbl_infoUs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Clave Usuario", "Nombre", "Usuario", "Tipo"
            }
        ));
        jScrollPane1.setViewportView(tbl_infoUs);
        if (tbl_infoUs.getColumnModel().getColumnCount() > 0) {
            tbl_infoUs.getColumnModel().getColumn(0).setMinWidth(0);
            tbl_infoUs.getColumnModel().getColumn(0).setPreferredWidth(0);
            tbl_infoUs.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        javax.swing.GroupLayout pnl_infoUsLayout = new javax.swing.GroupLayout(pnl_infoUs);
        pnl_infoUs.setLayout(pnl_infoUsLayout);
        pnl_infoUsLayout.setHorizontalGroup(
            pnl_infoUsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_infoUsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        pnl_infoUsLayout.setVerticalGroup(
            pnl_infoUsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_infoUsLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnl_datosUs.setBackground(new java.awt.Color(255, 255, 255));
        pnl_datosUs.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        lbl_usuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_usuario.setText("Usuario");

        lbl_nombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_nombre.setText("Nombre");

        lbl_contraseña.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_contraseña.setText("Contraseña");

        lbl_tipo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_tipo.setText("Tipo");

        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreKeyTyped(evt);
            }
        });

        txt_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_usuarioKeyTyped(evt);
            }
        });

        cmb_tipoUs.setBackground(new java.awt.Color(255, 255, 204));
        cmb_tipoUs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- SELECCIONAR--", "Administrador", "Normal" }));
        cmb_tipoUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_tipoUsActionPerformed(evt);
            }
        });

        txtPass_Contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPass_ContraseñaActionPerformed(evt);
            }
        });
        txtPass_Contraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPass_ContraseñaKeyTyped(evt);
            }
        });

        lbl_nombre1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_nombre1.setText("Clave");

        btn_buscar.setIcon(new javax.swing.ImageIcon("C:\\Users\\mahak\\Desktop\\Archivos Generales\\Uni 5to\\Base de Datos\\3er_Parcial\\Proyecto\\iconos\\search (2).png")); // NOI18N
        btn_buscar.setFocusable(false);
        btn_buscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_buscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_datosUsLayout = new javax.swing.GroupLayout(pnl_datosUs);
        pnl_datosUs.setLayout(pnl_datosUsLayout);
        pnl_datosUsLayout.setHorizontalGroup(
            pnl_datosUsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_datosUsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_datosUsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_usuario, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_nombre1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_contraseña, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_nombre, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_datosUsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_datosUsLayout.createSequentialGroup()
                        .addComponent(txtPass_Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_tipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmb_tipoUs, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_datosUsLayout.setVerticalGroup(
            pnl_datosUsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_datosUsLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(pnl_datosUsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_datosUsLayout.createSequentialGroup()
                        .addGroup(pnl_datosUsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_nombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnl_datosUsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_usuario)))
                    .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_datosUsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnl_datosUsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_tipo)
                        .addComponent(cmb_tipoUs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_datosUsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPass_Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_contraseña)))
                .addGap(0, 18, Short.MAX_VALUE))
            .addGroup(pnl_datosUsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_nombre1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnl_datosUs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_infoUs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_datosUs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnl_infoUs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btn_modificar.setIcon(new javax.swing.ImageIcon("C:\\Users\\mahak\\Desktop\\Archivos Generales\\Uni 5to\\Base de Datos\\3er_Parcial\\Proyecto\\iconos\\orden.png")); // NOI18N
        btn_modificar.setFocusable(false);
        btn_modificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_modificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
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
                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btn_guardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmb_tipoUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_tipoUsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_tipoUsActionPerformed

    private void txtPass_ContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPass_ContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPass_ContraseñaActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
    int row = tbl_infoUs.getSelectedRow();
    int opt=JOptionPane.showConfirmDialog(this, "¿Desea eliminar el registro seleccionado?", "Verificación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
    
    if(opt==JOptionPane.YES_OPTION)
    {
        try {
            Procedimientos.EliminarUsuario(Integer.parseInt(tbl_infoUs.getValueAt(row, 0).toString()));
            txt_nombre.setText("");
            txt_usuario.setText("");
            txtPass_Contraseña.setText("");
            cmb_tipoUs.setSelectedIndex(0);
            txt_nombre.requestFocus();
                    CargarUsuarios();
        } catch (SQLException e) {
        }
    }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        if(txt_nombre.getText().isEmpty() || txt_usuario.getText().isEmpty() || txtPass_Contraseña.getText().isEmpty() || cmb_tipoUs.getSelectedIndex()==0)
        {
            JOptionPane.showMessageDialog(this, "Verifique que todos los datos sean capturados", "Observación", JOptionPane.INFORMATION_MESSAGE);
        }else
            {
                try 
                {
                    Procedimientos.GuardarUsuario(txt_nombre.getText(), txt_usuario.getText(), txtPass_Contraseña.getText(), cmb_tipoUs.getSelectedItem().toString());
                    txt_nombre.setText("");
                    txt_usuario.setText("");
                    txtPass_Contraseña.setText("");
                    cmb_tipoUs.setSelectedIndex(0);
                    txt_nombre.requestFocus();
                    CargarUsuarios();
                } catch (SQLException e) 
                    {
                        
                    }
            }
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void txt_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) 
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo letras");
        }
        
        if(txt_nombre.getText().length() > 80)
        {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Límite de carácteres excedido");
        }
        
    }//GEN-LAST:event_txt_nombreKeyTyped

    private void txt_usuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_usuarioKeyTyped
        if(txt_usuario.getText().length() > 30)
        {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Límite de carácteres excedido");
        }
    }//GEN-LAST:event_txt_usuarioKeyTyped

    private void txtPass_ContraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPass_ContraseñaKeyTyped
        if(txtPass_Contraseña.getText().length() > 10)
        {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Límite de carácteres excedido");
        }
    }//GEN-LAST:event_txtPass_ContraseñaKeyTyped

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        try {
        DefaultTableModel model_buscar = new DefaultTableModel();  
        model_buscar=(DefaultTableModel) tbl_infoUs.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(model_buscar);
        tbl_infoUs.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(txt_nombre.getText(), 1));
        } catch (Exception ex) {
            
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

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
            java.util.logging.Logger.getLogger(user_general.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(user_general.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(user_general.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(user_general.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new user_general().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JComboBox<String> cmb_tipoUs;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_contraseña;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_nombre1;
    private javax.swing.JLabel lbl_tipo;
    private javax.swing.JLabel lbl_usuario;
    private javax.swing.JPanel pnl_datosUs;
    private javax.swing.JPanel pnl_infoUs;
    private javax.swing.JTable tbl_infoUs;
    private javax.swing.JPasswordField txtPass_Contraseña;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
