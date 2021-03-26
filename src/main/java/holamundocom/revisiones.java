package main.java.holamundocom;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class revisiones extends javax.swing.JFrame {
    
    static ResultSet res;
    DefaultTableModel model = new DefaultTableModel();
    TableRowSorter TRSFiltro; //Variable para "Busqueda Filtrada"
    
    public revisiones() {
        initComponents();
        CargarRevision();
        this.setLocationRelativeTo(null);
    }

    public void CargarRevision()
    {
        DefaultTableModel modelo = (DefaultTableModel)tbl_revision.getModel();
        modelo.setRowCount(0);
        res = Conexion_2.Consulta("select * from revision_prueba");
        try
        {
            while (res.next())
            {
                Vector v = new Vector();
                v.add(res.getInt(1));
                v.add(res.getString(2));
                v.add(res.getString(3));
                v.add(res.getString(4));
                v.add(res.getString(5));
                v.add(res.getString(6));
                v.add(res.getString(7));
                v.add(res.getString(8));
                v.add(res.getString(9));
                v.add(res.getString(10));
                v.add(res.getString(11));
                v.add(res.getString(12));
                v.add(res.getString(13));
                v.add(res.getString(14));
                v.add(res.getString(15));
                modelo.addRow(v);
                tbl_revision.setModel(modelo);
            }
        }catch (SQLException e)
            {
            
            }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendar1 = new com.toedter.calendar.JCalendar();
        lbl_pulsoX2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        pnl_diagnostico = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtA_diagnostico = new javax.swing.JTextArea();
        pnl_candEstr = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtA_estres = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        lbl_fecha = new javax.swing.JLabel();
        lbl_campaña = new javax.swing.JLabel();
        cmb_campaña = new javax.swing.JComboBox<>();
        lbl_apePat = new javax.swing.JLabel();
        txt_apePat = new javax.swing.JTextField();
        lbl_apeMat = new javax.swing.JLabel();
        txt_apeMat = new javax.swing.JTextField();
        lbl_nombre = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        date_revision = new com.toedter.calendar.JDateChooser();
        lbl_motivo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtA_motivo = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        lbl_peso = new javax.swing.JLabel();
        txt_peso = new javax.swing.JTextField();
        lbl_estatura = new javax.swing.JLabel();
        txt_estatura = new javax.swing.JTextField();
        lbl_pulso = new javax.swing.JLabel();
        txt_pulso = new javax.swing.JTextField();
        lbl_pulsoX = new javax.swing.JLabel();
        lbl_temperatura = new javax.swing.JLabel();
        txt_temperatura = new javax.swing.JTextField();
        lbl_glucosa = new javax.swing.JLabel();
        txt_Fr = new javax.swing.JTextField();
        lbl_FR = new javax.swing.JLabel();
        txt_glucosa = new javax.swing.JTextField();
        lbl_pulsoX1 = new javax.swing.JLabel();
        lbl_pulsoX3 = new javax.swing.JLabel();
        lbl_temperatura1 = new javax.swing.JLabel();
        txt_oxigenacion = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_revision = new javax.swing.JTable();
        btn_salir = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        lbl_menu = new javax.swing.JLabel();
        lbl_eliminar = new javax.swing.JLabel();
        lbl_modificar = new javax.swing.JLabel();
        lbl_guardar = new javax.swing.JLabel();

        lbl_pulsoX2.setText("X");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Revisiones");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        pnl_diagnostico.setBackground(new java.awt.Color(255, 255, 255));
        pnl_diagnostico.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Diagnóstico", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        txtA_diagnostico.setColumns(20);
        txtA_diagnostico.setRows(5);
        txtA_diagnostico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtA_diagnosticoKeyTyped(evt);
            }
        });
        jScrollPane3.setViewportView(txtA_diagnostico);

        javax.swing.GroupLayout pnl_diagnosticoLayout = new javax.swing.GroupLayout(pnl_diagnostico);
        pnl_diagnostico.setLayout(pnl_diagnosticoLayout);
        pnl_diagnosticoLayout.setHorizontalGroup(
            pnl_diagnosticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_diagnosticoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_diagnosticoLayout.setVerticalGroup(
            pnl_diagnosticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_diagnosticoLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnl_candEstr.setBackground(new java.awt.Color(255, 255, 255));
        pnl_candEstr.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Candidato \"Programa de Estrés\"", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        txtA_estres.setColumns(20);
        txtA_estres.setRows(5);
        txtA_estres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtA_estresKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(txtA_estres);

        javax.swing.GroupLayout pnl_candEstrLayout = new javax.swing.GroupLayout(pnl_candEstr);
        pnl_candEstr.setLayout(pnl_candEstrLayout);
        pnl_candEstrLayout.setHorizontalGroup(
            pnl_candEstrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_candEstrLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_candEstrLayout.setVerticalGroup(
            pnl_candEstrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_candEstrLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Generales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        lbl_fecha.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_fecha.setText("Fecha");

        lbl_campaña.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_campaña.setText("Campaña");

        cmb_campaña.setBackground(new java.awt.Color(255, 255, 204));
        cmb_campaña.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cmb_campaña.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Interna", "IMSS", "ISSSTE", "Privada" }));
        cmb_campaña.setToolTipText("");
        cmb_campaña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_campañaActionPerformed(evt);
            }
        });

        lbl_apePat.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_apePat.setText("Apellido Paterno");

        txt_apePat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_apePatKeyTyped(evt);
            }
        });

        lbl_apeMat.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_apeMat.setText("Apellido Materno");

        txt_apeMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apeMatActionPerformed(evt);
            }
        });
        txt_apeMat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_apeMatKeyTyped(evt);
            }
        });

        lbl_nombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_nombre.setText("Nombre");

        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreKeyTyped(evt);
            }
        });

        date_revision.setBackground(new java.awt.Color(255, 255, 255));

        lbl_motivo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_motivo.setText("Motivo de la Revisión");

        txtA_motivo.setColumns(20);
        txtA_motivo.setRows(5);
        jScrollPane1.setViewportView(txtA_motivo);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_motivo)
                            .addComponent(lbl_apePat))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(txt_apePat, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lbl_apeMat)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_apeMat, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lbl_nombre))))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(427, 427, 427)
                                .addComponent(lbl_fecha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txt_nombre)
                                    .addComponent(date_revision, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(lbl_campaña)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmb_campaña, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(date_revision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_fecha))
                .addGap(9, 9, 9)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_apePat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_apeMat)
                        .addComponent(lbl_apePat))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_apeMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_nombre)
                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_campaña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_campaña))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_motivo)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Exploración Física", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        lbl_peso.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbl_peso.setText("Peso");

        txt_peso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pesoActionPerformed(evt);
            }
        });
        txt_peso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_pesoKeyTyped(evt);
            }
        });

        lbl_estatura.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbl_estatura.setText("Estatura");

        txt_estatura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_estaturaKeyTyped(evt);
            }
        });

        lbl_pulso.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbl_pulso.setText("Pulso");

        txt_pulso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_pulsoKeyTyped(evt);
            }
        });

        lbl_pulsoX.setText("X");

        lbl_temperatura.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbl_temperatura.setText("Temperatura");

        txt_temperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_temperaturaActionPerformed(evt);
            }
        });
        txt_temperatura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_temperaturaKeyTyped(evt);
            }
        });

        lbl_glucosa.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbl_glucosa.setText("Glucosa");

        txt_Fr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_FrKeyTyped(evt);
            }
        });

        lbl_FR.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbl_FR.setText("FR");

        txt_glucosa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_glucosaKeyTyped(evt);
            }
        });

        lbl_pulsoX1.setText("X");

        lbl_pulsoX3.setText("°C");

        lbl_temperatura1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbl_temperatura1.setText("Oxigenación");

        txt_oxigenacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_oxigenacionActionPerformed(evt);
            }
        });
        txt_oxigenacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_oxigenacionKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lbl_peso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_peso, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(lbl_estatura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_estatura, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(lbl_pulso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_pulso, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(lbl_pulsoX, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_glucosa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_glucosa, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(lbl_pulsoX1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_FR)
                .addGap(2, 2, 2)
                .addComponent(txt_Fr, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(lbl_temperatura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_temperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(lbl_pulsoX3)
                .addGap(18, 18, 18)
                .addComponent(lbl_temperatura1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_oxigenacion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_peso)
                    .addComponent(txt_peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_estatura)
                    .addComponent(txt_estatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_pulso)
                    .addComponent(txt_pulso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_pulsoX)
                    .addComponent(lbl_glucosa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_glucosa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_pulsoX1)
                    .addComponent(lbl_FR)
                    .addComponent(txt_Fr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_temperatura)
                    .addComponent(txt_temperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_pulsoX3)
                    .addComponent(lbl_temperatura1)
                    .addComponent(txt_oxigenacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tbl_revision.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Clave_Revisión", "Fecha", "Ape_Pat", "Ape_Mat", "Nombre", "Motivo", "Campaña", "Peso", "Estatura", "Pulsol", "Glucosa", "FR", "Temperatura", "Oxigenación", "Diagnóstico"
            }
        ));
        jScrollPane4.setViewportView(tbl_revision);
        if (tbl_revision.getColumnModel().getColumnCount() > 0) {
            tbl_revision.getColumnModel().getColumn(0).setMinWidth(0);
            tbl_revision.getColumnModel().getColumn(0).setPreferredWidth(0);
            tbl_revision.getColumnModel().getColumn(0).setMaxWidth(0);
            tbl_revision.getColumnModel().getColumn(6).setMinWidth(0);
            tbl_revision.getColumnModel().getColumn(6).setPreferredWidth(0);
            tbl_revision.getColumnModel().getColumn(6).setMaxWidth(0);
            tbl_revision.getColumnModel().getColumn(7).setMinWidth(0);
            tbl_revision.getColumnModel().getColumn(7).setPreferredWidth(0);
            tbl_revision.getColumnModel().getColumn(7).setMaxWidth(0);
            tbl_revision.getColumnModel().getColumn(8).setMinWidth(0);
            tbl_revision.getColumnModel().getColumn(8).setPreferredWidth(0);
            tbl_revision.getColumnModel().getColumn(8).setMaxWidth(0);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane4)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(pnl_candEstr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnl_diagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnl_candEstr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_diagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
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

        btn_buscar.setIcon(new javax.swing.ImageIcon("C:\\Users\\mahak\\Desktop\\Archivos Generales\\Uni 5to\\Base de Datos\\3er_Parcial\\Proyecto\\iconos\\search (2).png")); // NOI18N
        btn_buscar.setFocusable(false);
        btn_buscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_buscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(btn_salir))
                            .addComponent(lbl_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_eliminar)
                            .addComponent(lbl_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_modificar)
                                .addGap(18, 18, 18)
                                .addComponent(btn_buscar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lbl_modificar)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_guardar)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lbl_guardar)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_menu)
                    .addComponent(lbl_eliminar)
                    .addComponent(lbl_modificar)
                    .addComponent(lbl_guardar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_temperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_temperaturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_temperaturaActionPerformed

    private void txt_pesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pesoActionPerformed

    private void cmb_campañaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_campañaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_campañaActionPerformed

    private void txt_apeMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apeMatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apeMatActionPerformed

    private void txt_oxigenacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_oxigenacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_oxigenacionActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        int row = tbl_revision.getSelectedRow();
        int opt=JOptionPane.showConfirmDialog(this, "¿Desea eliminar el registro seleccionado?", "Verificación", 
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
    
        if(opt==JOptionPane.YES_OPTION)
        {
            try {
                Procedimientos.EliminarRevision(Integer.parseInt(tbl_revision.getValueAt(row, 0).toString()));
                date_revision.setDate(null);
                txt_apePat.setText("");
                txt_apeMat.setText("");
                txt_nombre.setText("");
                cmb_campaña.setSelectedIndex(0);
                txtA_motivo.setText("");
                txt_peso.setText("");
                txt_estatura.setText("");
                txt_pulso.setText("");
                txt_glucosa.setText("");
                txt_Fr.setText("");
                txt_temperatura.setText("");
                txt_oxigenacion.setText("");
                txtA_estres.setText("");
                txtA_diagnostico.setText("");
                date_revision.requestFocus();
                CargarRevision();
            } catch (SQLException e) {
            }
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        if(txt_apePat.getText().isEmpty() || txt_apeMat.getText().isEmpty() || txt_nombre.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Verifique que todos los datos sean capturados", "Observación", 
            JOptionPane.INFORMATION_MESSAGE);
        }else
            {
                try 
                {
                    Procedimientos.GuardarRevision(date_revision.getDateFormatString(),txt_apePat.getText(), 
                    txt_apeMat.getText(), txt_nombre.getText(),txtA_motivo.getText(),cmb_campaña.getSelectedItem().toString(),
                    txt_peso.getText(), txt_estatura.getText(),txt_pulso.getText(), txt_glucosa.getText(),txt_Fr.getText(),
                    txt_temperatura.getText(), txt_oxigenacion.getText(),txtA_estres.getText(), txtA_diagnostico.getText());

                    date_revision.setDate(null);
                    txt_apePat.setText("");
                    txt_apeMat.setText("");
                    txt_nombre.setText("");
                    cmb_campaña.setSelectedIndex(0);
                    txtA_motivo.setText("");
                    txt_peso.setText("");
                    txt_estatura.setText("");
                    txt_pulso.setText("");
                    txt_glucosa.setText("");
                    txt_Fr.setText("");
                    txt_temperatura.setText("");
                    txt_oxigenacion.setText("");
                    txtA_estres.setText("");
                    txtA_diagnostico.setText("");
                    date_revision.requestFocus();
                    CargarRevision();
                } catch (SQLException e) 
                    {

                    }
            }
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void txt_apePatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apePatKeyTyped
        //Validación del campo "Apellido paterno".
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) 
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo letras");
        }
        
        //Validación del campo "Apellido Paterno" en cuanto a extención del campo.
        if(txt_apePat.getText().length() > 20)
        {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Límite de carácteres excedido");
        }
        
        //Método para realizar la busqueda filtrada por "Appellido Paterno".
        txt_apePat.addKeyListener(new KeyAdapter() 
        {
            @Override
            public void keyReleased(KeyEvent e)
            {
                TRSFiltro.setRowFilter(RowFilter.regexFilter("(?i)"+txt_apePat.getText(), 2));
            }
        });
        TRSFiltro = new TableRowSorter(tbl_revision.getModel());
        tbl_revision.setRowSorter(TRSFiltro);
    }//GEN-LAST:event_txt_apePatKeyTyped

    private void txt_apeMatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apeMatKeyTyped
        //Validación del campo "Apellido Materno".
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) 
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo letras");
        }
       
        //Validación del campo "Apellido Materno" en cuanto a extención del campo.
        if(txt_apeMat.getText().length() > 20)
        {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Límite de carácteres excedido");
        }
        
        //Método para realizar la busqueda filtrada por Apellido Materno.
        txt_apeMat.addKeyListener(new KeyAdapter() 
        {
            @Override
            public void keyReleased(KeyEvent e)
            {
                TRSFiltro.setRowFilter(RowFilter.regexFilter("(?i)"+txt_apeMat.getText(), 3));
            }
        });
        TRSFiltro = new TableRowSorter(tbl_revision.getModel());
        tbl_revision.setRowSorter(TRSFiltro);
    }//GEN-LAST:event_txt_apeMatKeyTyped

    private void txt_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyTyped
        //Validación del campo "Nombre".
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) 
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo letras");
        }
        
        //Validación del campo "Nombre" en cuanto a extención del campo.
        if(txt_nombre.getText().length() > 50)
        {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Límite de carácteres excedido");
        }
        
        //Método para realizar la busqueda filtrada por Nombre.
        txt_nombre.addKeyListener(new KeyAdapter() 
        {
            @Override
            public void keyReleased(KeyEvent e)
            {
                TRSFiltro.setRowFilter(RowFilter.regexFilter("(?i)"+txt_nombre.getText(), 4));
            }
        });
        TRSFiltro = new TableRowSorter(tbl_revision.getModel());
        tbl_revision.setRowSorter(TRSFiltro);
    }//GEN-LAST:event_txt_nombreKeyTyped

    private void txt_pesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pesoKeyTyped
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar))
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo números");
        }
        if(txt_peso.getText().length() > 5)
        {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Límite de carácteres excedido");
        }
    }//GEN-LAST:event_txt_pesoKeyTyped

    private void txt_estaturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_estaturaKeyTyped
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar))
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo números");
        }
        if(txt_estatura.getText().length() > 5)
        {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Límite de carácteres excedido");
        }
    }//GEN-LAST:event_txt_estaturaKeyTyped

    private void txt_pulsoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pulsoKeyTyped
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar))
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo números");
        }
        if(txt_pulso.getText().length() > 5)
        {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Límite de carácteres excedido");
        }
    }//GEN-LAST:event_txt_pulsoKeyTyped

    private void txt_glucosaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_glucosaKeyTyped
       char validar=evt.getKeyChar();
        if(Character.isLetter(validar))
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo números");
        }
        if(txt_glucosa.getText().length() > 5)
        {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Límite de carácteres excedido");
        }
    }//GEN-LAST:event_txt_glucosaKeyTyped

    private void txt_FrKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_FrKeyTyped
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar))
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo números");
        }
        if(txt_Fr.getText().length() > 5)
        {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Límite de carácteres excedido");
        }
    }//GEN-LAST:event_txt_FrKeyTyped

    private void txt_temperaturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_temperaturaKeyTyped
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar))
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo números");
        }
        if(txt_temperatura.getText().length() > 5)
        {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Límite de carácteres excedido");
        }
    }//GEN-LAST:event_txt_temperaturaKeyTyped

    private void txt_oxigenacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_oxigenacionKeyTyped
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar))
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo números");
        }
        if(txt_oxigenacion.getText().length() > 5)
        {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Límite de carácteres excedido");
        }
    }//GEN-LAST:event_txt_oxigenacionKeyTyped

    private void txtA_estresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtA_estresKeyTyped
       if(txtA_estres.getText().length() > 255)
        {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Límite de carácteres excedido");
        }
    }//GEN-LAST:event_txtA_estresKeyTyped

    private void txtA_diagnosticoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtA_diagnosticoKeyTyped
        if(txtA_diagnostico.getText().length() > 255)
        {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Límite de carácteres excedido");
        }
    }//GEN-LAST:event_txtA_diagnosticoKeyTyped

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        /*try {
            int fila =tbl_revision.getSelectedRow();
            int columna = tbl_revision.getSelectedColumn();

            DefaultTableModel model_buscar = new DefaultTableModel();  
            model_buscar=(DefaultTableModel) tbl_revision.getModel();
            TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(model_buscar);
            tbl_revision.setRowSorter(tr);
            tr.setRowFilter(RowFilter.regexFilter(txt_nombre.getText(), 4));
        } catch (Exception ex) {
            
        }*/
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
            java.util.logging.Logger.getLogger(revisiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(revisiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(revisiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(revisiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new revisiones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JComboBox<String> cmb_campaña;
    private com.toedter.calendar.JDateChooser date_revision;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lbl_FR;
    private javax.swing.JLabel lbl_apeMat;
    private javax.swing.JLabel lbl_apePat;
    private javax.swing.JLabel lbl_campaña;
    private javax.swing.JLabel lbl_eliminar;
    private javax.swing.JLabel lbl_estatura;
    private javax.swing.JLabel lbl_fecha;
    private javax.swing.JLabel lbl_glucosa;
    private javax.swing.JLabel lbl_guardar;
    private javax.swing.JLabel lbl_menu;
    private javax.swing.JLabel lbl_modificar;
    private javax.swing.JLabel lbl_motivo;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_peso;
    private javax.swing.JLabel lbl_pulso;
    private javax.swing.JLabel lbl_pulsoX;
    private javax.swing.JLabel lbl_pulsoX1;
    private javax.swing.JLabel lbl_pulsoX2;
    private javax.swing.JLabel lbl_pulsoX3;
    private javax.swing.JLabel lbl_temperatura;
    private javax.swing.JLabel lbl_temperatura1;
    private javax.swing.JPanel pnl_candEstr;
    private javax.swing.JPanel pnl_diagnostico;
    private javax.swing.JTable tbl_revision;
    private javax.swing.JTextArea txtA_diagnostico;
    private javax.swing.JTextArea txtA_estres;
    private javax.swing.JTextArea txtA_motivo;
    private javax.swing.JTextField txt_Fr;
    private javax.swing.JTextField txt_apeMat;
    private javax.swing.JTextField txt_apePat;
    private javax.swing.JTextField txt_estatura;
    private javax.swing.JTextField txt_glucosa;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_oxigenacion;
    private javax.swing.JTextField txt_peso;
    private javax.swing.JTextField txt_pulso;
    private javax.swing.JTextField txt_temperatura;
    // End of variables declaration//GEN-END:variables
}
