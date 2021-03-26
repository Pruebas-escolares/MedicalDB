
package main.java.holamundocom;

import com.sun.jdi.connect.spi.Connection;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Exepediente2 extends javax.swing.JFrame {
    static ResultSet res;
    private Conexion_2 con = new Conexion_2();

    public Exepediente2() {
        initComponents();
        this.cmb_enfermedad.removeAllItems();
        this.setLocationRelativeTo(null);
        this.cmb_lug_nac.setModel(con.Cargar_Lug_Nac());
        this.cmb_lug_res.setModel(con.Cargar_Lug_Res());
        this.cmb_enfermedad.setModel(con.Cargar_Tipo_Enf());
        //this.cmb_lug_nac.removeAllItems();
        
       
    }
    
    public void CargarAntecedentesFam()
    {
        DefaultTableModel modelo = (DefaultTableModel)tbl_heredo_fam.getModel();
        modelo.setRowCount(0);
        res = Conexion_2.Consulta("select * from exp_enf_fam");
        try
        {
            while (res.next())
            {
                Vector v = new Vector();
                //v.add(res.getInt(1));
                //v.add(res.getInt(2));
                //v.add(res.getString(3));
                v.add(res.getString(4));
                v.add(res.getString(5));
                v.add(res.getString(6));
                v.add(res.getString(7));
                modelo.addRow(v);
                tbl_heredo_fam.setModel(modelo);
            }
        }catch (SQLException e)
            {
            
            }
    }

/*public void CargarEnfermedades()
    {
        DefaultTableModel modelo = (DefaultTableModel)cmb_enfermedad.getModel();
        modelo.setRowCount(0);
        res = Conexion_2.Consulta("select nombre_enf from exp_enf_fam inner join enfermedad on "
                + "exp_enf_fam.clave_enf = enfermedad.clave_enf");
        try
        {
            while (res.next())
            {
               this.cmb_enfermedad.addItem(res.getString("nombre_enf"));
            }
        }catch (SQLException e)
            {
            
            }
    }*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jLabel37 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        date_fecha_expe = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        rbtn_alumno = new javax.swing.JRadioButton();
        rbtn_trabajador = new javax.swing.JRadioButton();
        lbl_clave_exp = new javax.swing.JLabel();
        pnl_alumno = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        cmb_escuela = new javax.swing.JComboBox<>();
        jLabel48 = new javax.swing.JLabel();
        cmb_grupo = new javax.swing.JComboBox<>();
        jPanel15 = new javax.swing.JPanel();
        jLabel99 = new javax.swing.JLabel();
        txt_ape_pat_eme_1 = new javax.swing.JTextField();
        jLabel100 = new javax.swing.JLabel();
        txt_ape_mat_eme_1 = new javax.swing.JTextField();
        jLabel101 = new javax.swing.JLabel();
        txt_nombre_eme_1 = new javax.swing.JTextField();
        jLabel102 = new javax.swing.JLabel();
        txt_tel_fam_eme_1 = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        cmb_parentesco_fam_eme_1 = new javax.swing.JComboBox<>();
        txt_ape_pat_eme_2 = new javax.swing.JTextField();
        jLabel107 = new javax.swing.JLabel();
        txt_ape_mat_eme_2 = new javax.swing.JTextField();
        jLabel108 = new javax.swing.JLabel();
        txt_nombre_eme_2 = new javax.swing.JTextField();
        jLabel109 = new javax.swing.JLabel();
        txt_tel_fam_eme_2 = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        cmb_parentesco_fam_eme_2 = new javax.swing.JComboBox<>();
        jLabel110 = new javax.swing.JLabel();
        pnl_trabajador = new javax.swing.JPanel();
        cmb_area = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        cmb_turno = new javax.swing.JComboBox<>();
        cmb_puesto = new javax.swing.JComboBox<>();
        jPanel9 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        cmb_canti_alim = new javax.swing.JComboBox<>();
        cmb_cali_alim = new javax.swing.JComboBox<>();
        jPanel18 = new javax.swing.JPanel();
        jLabel80 = new javax.swing.JLabel();
        txt_ape_pat = new javax.swing.JTextField();
        jLabel81 = new javax.swing.JLabel();
        txt_ape_mat = new javax.swing.JTextField();
        jLabel82 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel83 = new javax.swing.JLabel();
        date_fecha_nac = new com.toedter.calendar.JDateChooser();
        jLabel84 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        txt_tel = new javax.swing.JTextField();
        jLabel86 = new javax.swing.JLabel();
        txt_cel = new javax.swing.JTextField();
        jLabel87 = new javax.swing.JLabel();
        cmb_edo_civil = new javax.swing.JComboBox<>();
        jLabel88 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jLabel92 = new javax.swing.JLabel();
        cmb_tipo_sangre = new javax.swing.JComboBox<>();
        jLabel91 = new javax.swing.JLabel();
        rbtn_masc = new javax.swing.JRadioButton();
        rbtn_fem = new javax.swing.JRadioButton();
        jLabel89 = new javax.swing.JLabel();
        rbtn_si = new javax.swing.JRadioButton();
        rbtn_no = new javax.swing.JRadioButton();
        jLabel90 = new javax.swing.JLabel();
        cmb_tipo_seguro = new javax.swing.JComboBox<>();
        cmb_lug_nac = new javax.swing.JComboBox<>();
        cmb_lug_res = new javax.swing.JComboBox<>();
        txt_clave_esc = new javax.swing.JTextField();
        txt_clave_enf = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel45 = new javax.swing.JLabel();
        jDateChooser5 = new com.toedter.calendar.JDateChooser();
        jComboBox15 = new javax.swing.JComboBox<>();
        jLabel50 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel28 = new javax.swing.JPanel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txt_tratamiento = new javax.swing.JTextArea();
        date_inicio = new com.toedter.calendar.JDateChooser();
        jLabel69 = new javax.swing.JLabel();
        cmb_familiar = new javax.swing.JComboBox<>();
        jLabel67 = new javax.swing.JLabel();
        cmb_enfermedad = new javax.swing.JComboBox<>();
        jLabel68 = new javax.swing.JLabel();
        txt_especificacion = new javax.swing.JTextField();
        btn_agregar_fam = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_heredo_fam = new javax.swing.JTable();
        btn_eliminar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();

        jTextField1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("NOMBRE:");

        jButton1.setText("jButton1");

        jToggleButton1.setText("jToggleButton1");

        jLabel37.setText("jLabel37");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Expediente");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Fecha");

        date_fecha_expe.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo de Persona", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        rbtn_alumno.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbtn_alumno);
        rbtn_alumno.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rbtn_alumno.setText("Alumno");
        rbtn_alumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_alumnoActionPerformed(evt);
            }
        });

        rbtn_trabajador.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbtn_trabajador);
        rbtn_trabajador.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rbtn_trabajador.setText("Trabajador");
        rbtn_trabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_trabajadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtn_alumno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(rbtn_trabajador)
                .addGap(16, 16, 16))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtn_alumno)
                    .addComponent(rbtn_trabajador))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbl_clave_exp.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_clave_exp.setText("Clave:");

        pnl_alumno.setBackground(new java.awt.Color(255, 255, 255));
        pnl_alumno.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alumno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        jLabel47.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel47.setText("Grupo");

        cmb_escuela.setBackground(new java.awt.Color(255, 255, 204));
        cmb_escuela.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECCIONE--" }));

        jLabel48.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel48.setText("Escuela");

        cmb_grupo.setBackground(new java.awt.Color(255, 255, 204));
        cmb_grupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECCIONE--" }));

        javax.swing.GroupLayout pnl_alumnoLayout = new javax.swing.GroupLayout(pnl_alumno);
        pnl_alumno.setLayout(pnl_alumnoLayout);
        pnl_alumnoLayout.setHorizontalGroup(
            pnl_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_alumnoLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jLabel48)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmb_escuela, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel47)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmb_grupo, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(206, Short.MAX_VALUE))
        );
        pnl_alumnoLayout.setVerticalGroup(
            pnl_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_alumnoLayout.createSequentialGroup()
                .addGroup(pnl_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmb_escuela, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addGroup(pnl_alumnoLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnl_alumnoLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(cmb_grupo))
                .addContainerGap())
        );

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contacto de Emergencia", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        jLabel99.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel99.setText("Apellido Paterno");

        txt_ape_pat_eme_1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txt_ape_pat_eme_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ape_pat_eme_1KeyTyped(evt);
            }
        });

        jLabel100.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel100.setText("Apellido Materno");

        txt_ape_mat_eme_1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txt_ape_mat_eme_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ape_mat_eme_1ActionPerformed(evt);
            }
        });
        txt_ape_mat_eme_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ape_mat_eme_1KeyTyped(evt);
            }
        });

        jLabel101.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel101.setText("Nombre");

        txt_nombre_eme_1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txt_nombre_eme_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombre_eme_1KeyTyped(evt);
            }
        });

        jLabel102.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel102.setText("Telefono");

        txt_tel_fam_eme_1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txt_tel_fam_eme_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_tel_fam_eme_1KeyTyped(evt);
            }
        });

        jLabel51.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel51.setText("Parentesco");

        cmb_parentesco_fam_eme_1.setBackground(new java.awt.Color(255, 255, 204));
        cmb_parentesco_fam_eme_1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECCIONE--", "Abuelo", "Padre", "Hermanos", "Tios", "Esposa", "Hijo" }));
        cmb_parentesco_fam_eme_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_parentesco_fam_eme_1ActionPerformed(evt);
            }
        });

        txt_ape_pat_eme_2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txt_ape_pat_eme_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ape_pat_eme_2KeyTyped(evt);
            }
        });

        jLabel107.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel107.setText("Apellido Materno");

        txt_ape_mat_eme_2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txt_ape_mat_eme_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ape_mat_eme_2KeyTyped(evt);
            }
        });

        jLabel108.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel108.setText("Nombre");

        txt_nombre_eme_2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txt_nombre_eme_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombre_eme_2KeyTyped(evt);
            }
        });

        jLabel109.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel109.setText("Telefono");

        txt_tel_fam_eme_2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txt_tel_fam_eme_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_tel_fam_eme_2KeyTyped(evt);
            }
        });

        jLabel53.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel53.setText("Parentesco");

        cmb_parentesco_fam_eme_2.setBackground(new java.awt.Color(255, 255, 204));
        cmb_parentesco_fam_eme_2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECCIONE--", "Abuelo", "Padre", "Hermanos", "Tios", "Esposa", "Hijo" }));
        cmb_parentesco_fam_eme_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_parentesco_fam_eme_2ActionPerformed(evt);
            }
        });

        jLabel110.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel110.setText("Apellido Paterno");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel110)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_ape_pat_eme_2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel107)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_ape_mat_eme_2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel99)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_ape_pat_eme_1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel100)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_ape_mat_eme_1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel108)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nombre_eme_2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel101)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nombre_eme_1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel109)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_tel_fam_eme_2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel102)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_tel_fam_eme_1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel53)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmb_parentesco_fam_eme_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel51)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmb_parentesco_fam_eme_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_ape_mat_eme_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_ape_pat_eme_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel99)))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel107, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_ape_pat_eme_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_ape_mat_eme_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel110))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel101)
                            .addComponent(txt_nombre_eme_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel102)
                            .addComponent(txt_tel_fam_eme_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel51)
                            .addComponent(cmb_parentesco_fam_eme_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel108)
                            .addComponent(txt_nombre_eme_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel109)
                            .addComponent(txt_tel_fam_eme_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel53)
                            .addComponent(cmb_parentesco_fam_eme_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))))
        );

        pnl_trabajador.setBackground(new java.awt.Color(255, 255, 255));
        pnl_trabajador.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Trabajadores", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        cmb_area.setBackground(new java.awt.Color(255, 255, 204));
        cmb_area.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECCIONE--" }));

        jLabel25.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel25.setText("Turno");

        jLabel26.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel26.setText("Puesto");

        jLabel27.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel27.setText("Área");

        cmb_turno.setBackground(new java.awt.Color(255, 255, 204));
        cmb_turno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECCIONE--", "MATUTINO", "VESPERTINO", "NOCTURNO" }));

        cmb_puesto.setBackground(new java.awt.Color(255, 255, 204));
        cmb_puesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECCIONE--" }));

        javax.swing.GroupLayout pnl_trabajadorLayout = new javax.swing.GroupLayout(pnl_trabajador);
        pnl_trabajador.setLayout(pnl_trabajadorLayout);
        pnl_trabajadorLayout.setHorizontalGroup(
            pnl_trabajadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_trabajadorLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmb_area, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmb_puesto, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel25)
                .addGap(18, 18, 18)
                .addComponent(cmb_turno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );
        pnl_trabajadorLayout.setVerticalGroup(
            pnl_trabajadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_trabajadorLayout.createSequentialGroup()
                .addGroup(pnl_trabajadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_trabajadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmb_puesto, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                        .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmb_turno)
                        .addComponent(jLabel26))
                    .addComponent(cmb_area)
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alimentación", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        jLabel36.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel36.setText("Cantidad");

        jLabel38.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel38.setText("Calidad");

        cmb_canti_alim.setBackground(new java.awt.Color(255, 255, 204));
        cmb_canti_alim.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cmb_canti_alim.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECCIONE--", "Buena", "Regular", "Deficiente" }));

        cmb_cali_alim.setBackground(new java.awt.Color(255, 255, 204));
        cmb_cali_alim.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cmb_cali_alim.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECCIONE--", "Buena", "Regular", "Deficiente" }));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmb_canti_alim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
                .addComponent(jLabel38)
                .addGap(18, 18, 18)
                .addComponent(cmb_cali_alim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(306, 306, 306))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(cmb_canti_alim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_cali_alim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Personales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N
        jPanel18.setToolTipText("");
        jPanel18.setName(""); // NOI18N

        jLabel80.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel80.setText("Apellido Paterno");

        txt_ape_pat.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txt_ape_pat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ape_patKeyTyped(evt);
            }
        });

        jLabel81.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel81.setText("Apellido Materno");

        txt_ape_mat.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txt_ape_mat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ape_matKeyTyped(evt);
            }
        });

        jLabel82.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel82.setText("Nombre");

        txt_nombre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreKeyTyped(evt);
            }
        });

        jLabel83.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel83.setText("Fecha de Nacimiento");
        jLabel83.setToolTipText("");

        date_fecha_nac.setBackground(new java.awt.Color(255, 255, 255));

        jLabel84.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel84.setText("Lugar de Nacimiento");

        jLabel49.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel49.setText("Lug de Residencia");

        jLabel85.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel85.setText("Telefono");

        txt_tel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txt_tel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_telKeyTyped(evt);
            }
        });

        jLabel86.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel86.setText("Celular");

        txt_cel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txt_cel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_celKeyTyped(evt);
            }
        });

        jLabel87.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel87.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel87.setText("Estado Civil");

        cmb_edo_civil.setBackground(new java.awt.Color(255, 255, 204));
        cmb_edo_civil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECCIONE--", "SOLTERO", "CASADO", "DIVORCIADO", "VIUDO" }));
        cmb_edo_civil.setToolTipText("");

        jLabel88.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel88.setText("Correo Electronico");

        txt_email.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });
        txt_email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_emailKeyTyped(evt);
            }
        });

        jLabel92.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel92.setText("Tipo de Sangre");

        cmb_tipo_sangre.setBackground(new java.awt.Color(255, 255, 204));
        cmb_tipo_sangre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECCIONE--", "O+", "O-", "A+", "A-", "B+", "B-", "AB+", "AB-" }));
        cmb_tipo_sangre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_tipo_sangreActionPerformed(evt);
            }
        });

        jLabel91.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel91.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel91.setText("Genero");

        rbtn_masc.setBackground(new java.awt.Color(255, 255, 255));
        rbtn_masc.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rbtn_masc.setText("M");
        rbtn_masc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_mascActionPerformed(evt);
            }
        });

        rbtn_fem.setBackground(new java.awt.Color(255, 255, 255));
        rbtn_fem.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rbtn_fem.setText("F");
        rbtn_fem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_femActionPerformed(evt);
            }
        });

        jLabel89.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel89.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel89.setText("Asegurado");

        rbtn_si.setBackground(new java.awt.Color(255, 255, 255));
        rbtn_si.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rbtn_si.setText("Si");

        rbtn_no.setBackground(new java.awt.Color(255, 255, 255));
        rbtn_no.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rbtn_no.setText("No");

        jLabel90.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel90.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel90.setText("Tipo");

        cmb_tipo_seguro.setBackground(new java.awt.Color(255, 255, 204));
        cmb_tipo_seguro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECCIONE--", "IMSS", "ISSTE", "PRIVADO" }));
        cmb_tipo_seguro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_tipo_seguroActionPerformed(evt);
            }
        });

        cmb_lug_nac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_lug_nacActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel89)
                    .addComponent(jLabel87)
                    .addComponent(jLabel84)
                    .addComponent(jLabel80))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_ape_pat)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                        .addComponent(rbtn_si)
                        .addGap(68, 68, 68)
                        .addComponent(rbtn_no))
                    .addComponent(cmb_edo_civil, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmb_lug_nac, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel81))
                    .addComponent(jLabel49)
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel88, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel90, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmb_tipo_seguro, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_ape_mat, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                            .addComponent(txt_email, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                            .addComponent(cmb_lug_res, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel85)
                            .addComponent(jLabel82))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_tel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_tipo_sangre, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel83)
                            .addComponent(jLabel86)
                            .addComponent(jLabel91))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addComponent(rbtn_masc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rbtn_fem))
                            .addComponent(date_fecha_nac, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_cel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(186, 186, 186))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(date_fecha_nac, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_ape_mat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_ape_pat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel80)
                        .addComponent(jLabel82)
                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel83)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel84)
                    .addComponent(jLabel49)
                    .addComponent(jLabel85)
                    .addComponent(txt_tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel86)
                    .addComponent(txt_cel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_lug_nac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_lug_res, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel87)
                    .addComponent(cmb_edo_civil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel88)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel92)
                    .addComponent(cmb_tipo_sangre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel91)
                    .addComponent(rbtn_masc)
                    .addComponent(rbtn_fem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel89)
                    .addComponent(rbtn_si)
                    .addComponent(rbtn_no)
                    .addComponent(jLabel90)
                    .addComponent(cmb_tipo_seguro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txt_clave_esc.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txt_clave_enf.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lbl_clave_exp, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_clave_esc, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_clave_enf, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(733, 733, 733)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(date_fecha_expe, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1195, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pnl_trabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pnl_alumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(0, 59, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_clave_exp, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_clave_esc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_clave_enf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(4, 4, 4))
                            .addComponent(date_fecha_expe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_alumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_trabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Datos Generales", jPanel1);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Antecedentes Personales Patologicos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        jLabel46.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel46.setText("Tratamiento Actual");

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane5.setViewportView(jTextArea3);

        jLabel45.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel45.setText("Fecha de Inicio");

        jDateChooser5.setBackground(new java.awt.Color(255, 255, 255));

        jComboBox15.setBackground(new java.awt.Color(255, 255, 204));
        jComboBox15.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jComboBox15.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECCIONE--", "Diabetes Mellitus", "Hipertensión", "Obesidad", "Tabaquismo", "Alcolismo", "Desordenes Alimenticios", "Alergias", "Otros" }));
        jComboBox15.setToolTipText("");

        jLabel50.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel50.setText("Especificacion");

        jTextField24.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel52.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel52.setText("Tipo de Enfermedad");

        jButton4.setText("Agregar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel52))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField24)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel50)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jDateChooser5, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel45)
                        .addGap(54, 54, 54)
                        .addComponent(jLabel46)
                        .addGap(294, 294, 294)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45)
                    .addComponent(jLabel50)
                    .addComponent(jLabel52))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 7, Short.MAX_VALUE))
        );

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));
        jPanel28.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Antecedentes Heredo Familiares", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        jLabel70.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel70.setText("Fecha de Inicio");

        jLabel71.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel71.setText("Tratamiento Actual");

        txt_tratamiento.setColumns(20);
        txt_tratamiento.setRows(5);
        jScrollPane6.setViewportView(txt_tratamiento);

        date_inicio.setBackground(new java.awt.Color(255, 255, 255));

        jLabel69.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel69.setText("Tipo de Enfermedad");

        cmb_familiar.setBackground(new java.awt.Color(255, 255, 204));
        cmb_familiar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECCIONE--", "Abuelos", "Padres", "Hermanos", "Tios", " " }));
        cmb_familiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_familiarActionPerformed(evt);
            }
        });

        jLabel67.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel67.setText("Familiar");

        cmb_enfermedad.setBackground(new java.awt.Color(255, 255, 204));
        cmb_enfermedad.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cmb_enfermedad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECCIONE--", "Diabetes Mellitus", "Hipertensión", "Obesidad", "Tabaquismo", "Alcolismo", "Desordenes Alimenticios", "Alergias", "Otros" }));
        cmb_enfermedad.setToolTipText("");

        jLabel68.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel68.setText("Especificacion");

        txt_especificacion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txt_especificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_especificacionKeyTyped(evt);
            }
        });

        btn_agregar_fam.setText("Agregar");
        btn_agregar_fam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregar_famActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel69)
                    .addComponent(cmb_enfermedad, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_familiar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel68)
                    .addComponent(txt_especificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(date_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel70))
                .addGap(18, 18, 18)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(jLabel71)
                        .addGap(183, 183, 183)
                        .addComponent(btn_agregar_fam, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_agregar_fam, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jLabel71)
                    .addComponent(jLabel68)
                    .addComponent(jLabel67)
                    .addComponent(jLabel69)
                    .addComponent(jLabel70))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(date_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmb_enfermedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmb_familiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_especificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jTable3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Enfermedad", "Especificación", "Fecha de Inicio", "Tramamiento"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        tbl_heredo_fam.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tbl_heredo_fam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Especificación", "Parentesco", "Fecha de Inicio", "Tramamiento", "Clave_expe", "Clave_enf", "Enfermedad"
            }
        ));
        jScrollPane4.setViewportView(tbl_heredo_fam);
        if (tbl_heredo_fam.getColumnModel().getColumnCount() > 0) {
            tbl_heredo_fam.getColumnModel().getColumn(4).setMinWidth(0);
            tbl_heredo_fam.getColumnModel().getColumn(4).setPreferredWidth(0);
            tbl_heredo_fam.getColumnModel().getColumn(4).setMaxWidth(0);
            tbl_heredo_fam.getColumnModel().getColumn(5).setMinWidth(0);
            tbl_heredo_fam.getColumnModel().getColumn(5).setPreferredWidth(0);
            tbl_heredo_fam.getColumnModel().getColumn(5).setMaxWidth(0);
            tbl_heredo_fam.getColumnModel().getColumn(6).setMinWidth(0);
            tbl_heredo_fam.getColumnModel().getColumn(6).setPreferredWidth(0);
            tbl_heredo_fam.getColumnModel().getColumn(6).setMaxWidth(0);
        }

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Antecedentes Patologicos", jPanel7);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1220, 580));

        btn_eliminar.setIcon(new javax.swing.ImageIcon("C:\\Users\\mahak\\Desktop\\Archivos Generales\\Uni 5to\\Base de Datos\\3er_Parcial\\Proyecto\\iconos\\borrar-usuario.png")); // NOI18N
        btn_eliminar.setFocusable(false);
        btn_eliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_eliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 600, 60, 60));

        btn_modificar.setIcon(new javax.swing.ImageIcon("C:\\Users\\mahak\\Desktop\\Archivos Generales\\Uni 5to\\Base de Datos\\3er_Parcial\\Proyecto\\iconos\\orden.png")); // NOI18N
        btn_modificar.setFocusable(false);
        btn_modificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_modificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 600, -1, 60));

        btn_actualizar.setIcon(new javax.swing.ImageIcon("C:\\Users\\mahak\\Desktop\\Archivos Generales\\Uni 5to\\Base de Datos\\3er_Parcial\\Proyecto\\iconos\\sincronizar.png")); // NOI18N
        btn_actualizar.setFocusable(false);
        btn_actualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_actualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 600, 60, 60));

        btn_guardar.setIcon(new javax.swing.ImageIcon("C:\\Users\\mahak\\Desktop\\Archivos Generales\\Uni 5to\\Base de Datos\\3er_Parcial\\Proyecto\\iconos\\disco-flexible.png")); // NOI18N
        btn_guardar.setFocusable(false);
        btn_guardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_guardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 600, -1, 60));

        btn_buscar.setIcon(new javax.swing.ImageIcon("C:\\Users\\mahak\\Desktop\\Archivos Generales\\Uni 5to\\Base de Datos\\3er_Parcial\\Proyecto\\iconos\\search (2).png")); // NOI18N
        btn_buscar.setFocusable(false);
        btn_buscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_buscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 600, -1, 60));

        btn_salir.setIcon(new javax.swing.ImageIcon("C:\\Users\\mahak\\Desktop\\Archivos Generales\\Uni 5to\\Base de Datos\\3er_Parcial\\Proyecto\\iconos\\home.png")); // NOI18N
        btn_salir.setFocusable(false);
        btn_salir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_salir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, 60, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        pnl_trabajador.setVisible(false);
        pnl_alumno.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void cmb_familiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_familiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_familiarActionPerformed

    private void cmb_parentesco_fam_eme_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_parentesco_fam_eme_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_parentesco_fam_eme_2ActionPerformed

    private void cmb_parentesco_fam_eme_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_parentesco_fam_eme_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_parentesco_fam_eme_1ActionPerformed

    private void rbtn_trabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_trabajadorActionPerformed
        pnl_alumno.setVisible(false);
        pnl_trabajador.setVisible(true);
        pnl_trabajador.setLocation(270,225);
    }//GEN-LAST:event_rbtn_trabajadorActionPerformed

    private void rbtn_alumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_alumnoActionPerformed
        pnl_alumno.setVisible(true);
        pnl_trabajador.setVisible(false);
    }//GEN-LAST:event_rbtn_alumnoActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed

    private void cmb_tipo_sangreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_tipo_sangreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_tipo_sangreActionPerformed

    private void rbtn_mascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_mascActionPerformed
        rbtn_masc.setText("M");
    }//GEN-LAST:event_rbtn_mascActionPerformed

    private void rbtn_femActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_femActionPerformed
        rbtn_fem.setText("F");
    }//GEN-LAST:event_rbtn_femActionPerformed

    private void cmb_tipo_seguroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_tipo_seguroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_tipo_seguroActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void txt_especificacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_especificacionKeyTyped
      
    }//GEN-LAST:event_txt_especificacionKeyTyped

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
       
        if(txt_ape_pat.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Verifique que todos los datos sean capturados", "Observación", JOptionPane.INFORMATION_MESSAGE);
        }else
            try {
            Procedimientos.GuardarExpe_Prueba(date_fecha_expe.getDateFormatString(),txt_ape_pat.getText(), 
            txt_ape_mat.getText(),txt_nombre.getText(),date_fecha_nac.getDateFormatString(),txt_tel.getText(),
            txt_cel.getText(),cmb_edo_civil.getSelectedItem().toString(),txt_email.getText(),
            cmb_tipo_sangre.getSelectedItem().toString(),txt_ape_pat_eme_1.getText(),txt_ape_mat_eme_1.getText(),
            txt_nombre_eme_1.getText(),txt_tel_fam_eme_1.getText(),cmb_parentesco_fam_eme_1.getSelectedItem().toString(),
            txt_ape_pat_eme_2.getText(),txt_ape_mat_eme_2.getText(),txt_nombre_eme_2.getText(),txt_tel_fam_eme_2.getText(),
            cmb_parentesco_fam_eme_2.getSelectedItem().toString(),cmb_canti_alim.getSelectedItem().toString(),
            cmb_cali_alim.getSelectedItem().toString());
            
                txt_ape_pat.setText("");
                txt_ape_mat.setText("");
                txt_nombre.setText("");
                date_fecha_expe.setDate(null);
                date_fecha_nac.setDate(null);
                txt_tel.setText("");
                txt_cel.setText("");
                cmb_edo_civil.setSelectedIndex(0);
                txt_email.setText("");
                cmb_tipo_sangre.setSelectedIndex(0);
                txt_ape_pat_eme_1.setText("");
                txt_ape_mat_eme_1.setText("");
                txt_nombre_eme_1.setText("");
                txt_tel_fam_eme_1.setText("");
                cmb_parentesco_fam_eme_1.setSelectedIndex(0);
                txt_ape_pat_eme_2.setText("");
                txt_ape_mat_eme_2.setText("");
                txt_nombre_eme_2.setText("");
                txt_tel_fam_eme_2.setText("");
                cmb_parentesco_fam_eme_2.setSelectedIndex(0);
                cmb_canti_alim.setSelectedIndex(0);
                cmb_cali_alim.setSelectedIndex(0);
                
        } catch (SQLException e) {
        }
        
        
       /*Date fecha_expe = date_fecha_expe.getDate();
       String ape_pat = txt_ape_pat.getText();
       String ape_mat = txt_ape_mat.getText();
       String nombre = txt_nombre.getText();
       Date fecha_nac = date_fecha_nac.getDate();
       String lugar_nac = txt_lugar_nac.getText();
       String lugar_rec = txt_lugar_reci.getText();
       String telefono = txt_tel.getText();
       String celular = txt_cel.getText();
       String edo_civil = (String) cmb_edo_civil.getSelectedItem();
       String email = txt_email.getText();
       String tipo_sangre = (String) cmb_tipo_sangre.getSelectedItem();
       String genero;
        if (rbtn_masc.isSelected()) 
        {
            genero="M";
        }else
            {
                genero="F";
            }
        String seguro;
        if (rbtn_si.isSelected()) 
        {
            seguro = "Si";
        }else
            {
                seguro = "No";
            }
        String tipo_seguro = (String) cmb_tipo_seguro.getSelectedItem();
        String persona;
        if (rbtn_alumno.isSelected()) 
        {
            persona = "Alumno";
            String grupo = (String) cmb_grupo.getSelectedItem();
        }else
            {
                persona = "Trabajador";
                String area = (String) cmb_area.getSelectedItem();
                String puesto = (String) cmb_puesto.getSelectedItem();
                String turno = (String) cmb_turno.getSelectedItem();
            }
        String ape_pat_eme_1 = txt_ape_pat_eme_1.getText();
        String ape_mat_eme_1 = txt_ape_mat_eme_1.getText();
        String nombre_eme_1 = txt_nombre_eme_1.getText();
        String telefono_eme_1 = txt_tel_fam_eme_1.getText();
        String parentesco_eme_1 = (String) cmb_parentesco_fam_eme_1.getSelectedItem();
        String ape_pat_eme_2 = txt_ape_pat_eme_2.getText();
        String ape_mat_eme_2 = txt_ape_mat_eme_2.getText();
        String nombre_eme_2 = txt_nombre_eme_2.getText();
        String telefono_eme_2 = txt_tel_fam_eme_2.getText();
        String parentesco_eme_2 = (String) cmb_parentesco_fam_eme_2.getSelectedItem();
        String cantidad_alim = (String) cmb_canti_alim.getSelectedItem();
        String calidad_alim = (String) cmb_cali_alim.getSelectedItem();
        
        try {
           Connection con = (Connection) Conexion_2.getConexion();
           PreparedStatement ps = con.prepareStatement("INSERT INTO expediente (fecha_expe, ape_pat, ape_mat, nombre, fecha_nac, lugar_nac"
                   + "lugar_rec, telefono, celular, edo_civil, email, tipo_sangre, genero, seguro, persona, ape_pat_eme_1,"
                   + "ape_mat_eme_1, nombre_eme_1, telefono_eme_1, parentesco_eme_1, ape_pat_eme_2, ape_mat_eme_2, nombre_eme_2,"
                   + "telefono_eme_2, parentesco_eme_2, cantidad_alim, calidad_alim) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"
                   + "?,?,?,?,?,?,?)");
            //ps.setDate(1, (java.sql.Date) fecha_expe);
            ps.setString(2, ape_pat);
            ps.setString(3, ape_mat);
            ps.setString(4, nombre);
            //ps.setDate(5, (java.sql.Date) fecha_nac);
            ps.setString(6, lugar_nac);
            ps.setString(7, lugar_rec);
            ps.setString(8, telefono);
            ps.setString(9, celular);
            ps.setString(10, edo_civil);
            ps.setString(11, email);
            ps.setString(12, tipo_sangre);
            ps.setString(13, genero);
            ps.setString(14, seguro);
            ps.setString(15, persona);
            ps.setString(16, ape_pat_eme_1);
            ps.setString(17, ape_mat_eme_1);
            ps.setString(18, nombre_eme_1);
            ps.setString(19, telefono_eme_1);
            ps.setString(20, parentesco_eme_1);
            ps.setString(21, ape_pat_eme_2);
            ps.setString(22, ape_mat_eme_2);
            ps.setString(23, nombre_eme_2);
            ps.setString(24, telefono_eme_2);
            ps.setString(25, parentesco_eme_2);
            ps.setString(26, cantidad_alim);
            ps.setString(27, calidad_alim);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Registro guardado");
            
        } catch (SQLException e) 
            {
                JOptionPane.showMessageDialog(null, e.toString());
            }*/
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
       
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_agregar_famActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregar_famActionPerformed
        /*DefaultTableModel modelo = (DefaultTableModel) tbl_heredo_fam.getModel();
        Object [] fila = new Object[8];
        
        fila [3] = txt_especificacion.getText();
        fila [4] = cmb_familiar.getSelectedItem().toString();
        fila [5] = date_inicio.getDateFormatString();
        fila [6] = txt_tratamiento.getText();
        
        modelo.addRow(fila);
        tbl_heredo_fam.setModel(modelo);*/
        

        DefaultTableModel modelo = (DefaultTableModel)tbl_heredo_fam.getModel();
        Object [] fila = new Object[5];
        modelo.setRowCount(0);
        //res = Conexion_2.Consulta("select * from exp_enf_fam");    
        
                Vector v = new Vector();
                //v.add(fila [5] = clave_expe.getText());
                //v.add(fila [6] = clave_enf.getText());
                //v.add(fila [0] = cmb_enfermedad.getSelectedItem().toString());
                v.add(fila [1] = txt_especificacion.getText());
                v.add(fila [2] = cmb_familiar.getSelectedItem().toString());
                v.add(fila [3] = date_inicio.getDateFormatString());
                v.add(fila [4] = txt_tratamiento.getText());
                modelo.addRow(v);
            
            tbl_heredo_fam.setModel(modelo);
        
        
                
        
    }//GEN-LAST:event_btn_agregar_famActionPerformed

    private void txt_ape_patKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ape_patKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) 
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo letras");
        }
        if(txt_ape_pat.getText().length() > 20)
        {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Límite de carácteres excedido");
        }
    }//GEN-LAST:event_txt_ape_patKeyTyped

    private void txt_ape_matKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ape_matKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) 
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo letras");
        }
        if(txt_ape_mat.getText().length() > 20)
        {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Límite de carácteres excedido");
        }
    }//GEN-LAST:event_txt_ape_matKeyTyped

    private void txt_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) 
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo letras");
        }
        if(txt_nombre.getText().length() > 50)
        {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Límite de carácteres excedido");
        }
    }//GEN-LAST:event_txt_nombreKeyTyped

    private void txt_telKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telKeyTyped
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar))
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo números");
        }
        if(txt_tel.getText().length() > 10)
        {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Límite de carácteres excedido");
        }
    }//GEN-LAST:event_txt_telKeyTyped

    private void txt_celKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_celKeyTyped
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar))
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo números");
        }
        if(txt_cel.getText().length() > 10)
        {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Límite de carácteres excedido");
        }
    }//GEN-LAST:event_txt_celKeyTyped

    private void txt_ape_pat_eme_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ape_pat_eme_1KeyTyped
         char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) 
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo letras");
        }
        if(txt_ape_pat_eme_1.getText().length() > 20)
        {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Límite de carácteres excedido");
        }
    }//GEN-LAST:event_txt_ape_pat_eme_1KeyTyped

    private void txt_ape_pat_eme_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ape_pat_eme_2KeyTyped
         char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) 
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo letras");
        }
        if(txt_ape_pat_eme_2.getText().length() > 20)
        {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Límite de carácteres excedido");
        }
    }//GEN-LAST:event_txt_ape_pat_eme_2KeyTyped

    private void txt_ape_mat_eme_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ape_mat_eme_1KeyTyped
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) 
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo letras");
        }
        if(txt_ape_mat_eme_1.getText().length() > 20)
        {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Límite de carácteres excedido");
        }
    }//GEN-LAST:event_txt_ape_mat_eme_1KeyTyped

    private void txt_ape_mat_eme_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ape_mat_eme_2KeyTyped
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) 
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo letras");
        }
        if(txt_ape_mat_eme_2.getText().length() > 20)
        {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Límite de carácteres excedido");
        }
    }//GEN-LAST:event_txt_ape_mat_eme_2KeyTyped

    private void txt_nombre_eme_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombre_eme_1KeyTyped
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) 
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo letras");
        }
        if(txt_nombre_eme_1.getText().length() > 50)
        {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Límite de carácteres excedido");
        }
    }//GEN-LAST:event_txt_nombre_eme_1KeyTyped

    private void txt_nombre_eme_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombre_eme_2KeyTyped
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) 
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo letras");
        }
        if(txt_nombre_eme_2.getText().length() > 50)
        {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Límite de carácteres excedido");
        }
    }//GEN-LAST:event_txt_nombre_eme_2KeyTyped

    private void txt_ape_mat_eme_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ape_mat_eme_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ape_mat_eme_1ActionPerformed

    private void txt_tel_fam_eme_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_tel_fam_eme_1KeyTyped
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar))
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo números");
        }
        if(txt_tel_fam_eme_1.getText().length() > 10)
        {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Límite de carácteres excedido");
        }
    }//GEN-LAST:event_txt_tel_fam_eme_1KeyTyped

    private void txt_tel_fam_eme_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_tel_fam_eme_2KeyTyped
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar))
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo números");
        }
        if(txt_tel_fam_eme_2.getText().length() > 10)
        {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Límite de carácteres excedido");
        }
    }//GEN-LAST:event_txt_tel_fam_eme_2KeyTyped

    private void txt_emailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_emailKeyTyped
        if(txt_email.getText().length() > 60)
        {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Límite de carácteres excedido");
        }
    }//GEN-LAST:event_txt_emailKeyTyped

    private void cmb_lug_nacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_lug_nacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_lug_nacActionPerformed

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
            java.util.logging.Logger.getLogger(Exepediente2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exepediente2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exepediente2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exepediente2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exepediente2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_agregar_fam;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_salir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cmb_area;
    private javax.swing.JComboBox<String> cmb_cali_alim;
    private javax.swing.JComboBox<String> cmb_canti_alim;
    private javax.swing.JComboBox<String> cmb_edo_civil;
    private javax.swing.JComboBox<String> cmb_enfermedad;
    private javax.swing.JComboBox<String> cmb_escuela;
    private javax.swing.JComboBox<String> cmb_familiar;
    private javax.swing.JComboBox<String> cmb_grupo;
    private javax.swing.JComboBox<String> cmb_lug_nac;
    private javax.swing.JComboBox<String> cmb_lug_res;
    private javax.swing.JComboBox<String> cmb_parentesco_fam_eme_1;
    private javax.swing.JComboBox<String> cmb_parentesco_fam_eme_2;
    private javax.swing.JComboBox<String> cmb_puesto;
    private javax.swing.JComboBox<String> cmb_tipo_sangre;
    private javax.swing.JComboBox<String> cmb_tipo_seguro;
    private javax.swing.JComboBox<String> cmb_turno;
    private com.toedter.calendar.JDateChooser date_fecha_expe;
    private com.toedter.calendar.JDateChooser date_fecha_nac;
    private com.toedter.calendar.JDateChooser date_inicio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JComboBox<String> jComboBox15;
    private com.toedter.calendar.JDateChooser jDateChooser5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lbl_clave_exp;
    private javax.swing.JPanel pnl_alumno;
    private javax.swing.JPanel pnl_trabajador;
    private javax.swing.JRadioButton rbtn_alumno;
    private javax.swing.JRadioButton rbtn_fem;
    private javax.swing.JRadioButton rbtn_masc;
    private javax.swing.JRadioButton rbtn_no;
    private javax.swing.JRadioButton rbtn_si;
    private javax.swing.JRadioButton rbtn_trabajador;
    private javax.swing.JTable tbl_heredo_fam;
    private javax.swing.JTextField txt_ape_mat;
    private javax.swing.JTextField txt_ape_mat_eme_1;
    private javax.swing.JTextField txt_ape_mat_eme_2;
    private javax.swing.JTextField txt_ape_pat;
    private javax.swing.JTextField txt_ape_pat_eme_1;
    private javax.swing.JTextField txt_ape_pat_eme_2;
    private javax.swing.JTextField txt_cel;
    private javax.swing.JTextField txt_clave_enf;
    private javax.swing.JTextField txt_clave_esc;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_especificacion;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_nombre_eme_1;
    private javax.swing.JTextField txt_nombre_eme_2;
    private javax.swing.JTextField txt_tel;
    private javax.swing.JTextField txt_tel_fam_eme_1;
    private javax.swing.JTextField txt_tel_fam_eme_2;
    private javax.swing.JTextArea txt_tratamiento;
    // End of variables declaration//GEN-END:variables
}
