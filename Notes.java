/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GestionScolarite;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fanambinantsoa
 */
public class Notes extends javax.swing.JFrame {
    

    /**
     * Creates new form Notes
     */
    public Notes() {
        this.Rs = null;
        initComponents();
        Recuperer();
        Matiere();
        Selectional();
    }
    
    Connection con = null;
    Statement st = null; 
    PreparedStatement ps = null;
    
    ResultSet Rs;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Ajouter = new javax.swing.JButton();
        Supprimer = new javax.swing.JButton();
        Modifer = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        NotMatricule = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        NotMatiere = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Not1 = new javax.swing.JTextField();
        Note2 = new javax.swing.JTextField();
        Note3 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        NotTable = new javax.swing.JTable();
        vide = new javax.swing.JButton();
        NotNom = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel2.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("GESTION DE SCOLARITE");

        jLabel8.setText("jLabel3");

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("PAGE ETUDIANT");
        jLabel9.setAutoscrolls(true);

        Ajouter.setBackground(new java.awt.Color(51, 255, 0));
        Ajouter.setText("Ajouter");
        Ajouter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AjouterMouseClicked(evt);
            }
        });

        Supprimer.setBackground(new java.awt.Color(255, 0, 0));
        Supprimer.setForeground(new java.awt.Color(255, 255, 255));
        Supprimer.setText("Suprimer");
        Supprimer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SupprimerMouseClicked(evt);
            }
        });

        Modifer.setBackground(new java.awt.Color(153, 204, 255));
        Modifer.setText("Modifier");
        Modifer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ModiferMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Modifer, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Modifer, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel1.setText("Note 2");

        NotMatricule.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                NotMatriculeItemStateChanged(evt);
            }
        });
        NotMatricule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NotMatriculeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel3.setText("Matiere");

        jLabel4.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel4.setText("Nom");

        jLabel5.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel5.setText("Matricule");

        jLabel6.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel6.setText("Note 1");

        jLabel7.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel7.setText("Note Examen");

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Listes Notes des Etudiants");

        NotTable.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        NotTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Matricule", "Nom", "Prenom", "Note1", "Note2", "Examen"
            }
        ));
        NotTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        NotTable.setGridColor(new java.awt.Color(242, 242, 242));
        NotTable.setRowHeight(32);
        NotTable.setSelectionBackground(new java.awt.Color(153, 153, 153));
        NotTable.setShowGrid(false);
        NotTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NotTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(NotTable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        vide.setBackground(new java.awt.Color(255, 51, 51));
        vide.setForeground(new java.awt.Color(242, 242, 242));
        vide.setText("Vider");
        vide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                videMouseClicked(evt);
            }
        });

        NotNom.setBackground(new java.awt.Color(204, 255, 204));
        NotNom.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NotNom.setEnabled(false);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GestionScolarite/quit1-removebg-preview.png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Not1)
                    .addComponent(NotMatricule, 0, 115, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NotNom, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(NotMatiere, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(108, 108, 108))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Note2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Note3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(102, 102, 102)
                                .addComponent(vide, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(56, 56, 56)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(575, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(NotMatricule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NotMatiere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(NotNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Not1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Note2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Note3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vide, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(142, 142, 142)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(300, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Matiere(){
        String sql = "Select Matiere from matiere";
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionscolarite?useSSL=false","root","");
            st = con.createStatement();
            ps=con.prepareStatement(sql);
            Rs=ps.executeQuery();
            while(Rs.next()){
                NotMatiere.addItem(Rs.getString("Matiere"));   
            }
        } catch (SQLException ex) {
            Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void RetourZero(){
        NotMatricule.setSelectedItem("");
        NotNom.setSelectedItem("");
        NotMatiere.setSelectedItem("");
        Not1.setText("");
        Note2.setText("");
        Note3.setText("");
    }
    
    private void Recuperer(){
           String sql = "Select Matricule , Nom from etudiant";
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionscolarite?useSSL=false","root","");
            st = con.createStatement();
            ps=con.prepareStatement(sql);
            Rs=ps.executeQuery();
            while(Rs.next()){
                NotMatricule.addItem(Rs.getString("Matricule"));
                NotNom.addItem(Rs.getString("Nom"));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void Selectional(){
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionscolarite?useSSL=false","root","");
                st = con.createStatement();
                Rs = st.executeQuery("select Matricule, Nom, Matiere, Note1, Note2 , Note3 from gestionscolarite.Noty");

                DefaultTableModel model = new DefaultTableModel();
                ResultSetMetaData metaData = Rs.getMetaData();
                int columnCount = metaData.getColumnCount();

                for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                    model.addColumn(metaData.getColumnLabel(columnIndex));
                }

                while (Rs.next()) {
                    Object[] row = new Object[columnCount];
                    for (int i = 0; i < columnCount; i++) {
                        row[i] = Rs.getObject(i + 1);
                    }
                model.addRow(row);
                }

                NotTable.setModel(model);
            } catch (SQLException e) {
                e.getStackTrace();
            }
    }
    
    private void NotTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NotTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)NotTable.getModel();
        int Myindex = NotTable.getSelectedRow();
        NotMatricule.setSelectedItem(model.getValueAt(Myindex, 0).toString());
        NotNom.setSelectedItem(model.getValueAt(Myindex,1 ).toString());
        NotMatiere.setSelectedItem(model.getValueAt(Myindex, 2).toString());
        Not1.setText(model.getValueAt(Myindex, 3).toString());
        Note2.setText(model.getValueAt(Myindex, 4).toString());
        Note3.setText(model.getValueAt(Myindex, 5).toString());
    }//GEN-LAST:event_NotTableMouseClicked

    private void AjouterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AjouterMouseClicked

        if (NotMatricule.getSelectedItem() == null || NotNom.getSelectedItem().toString().isEmpty() || NotMatiere.getSelectedItem() == null || Not1.getText().isEmpty() || Note2.getText().isEmpty() || Note3.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Veuillez remplir tous les champs.");
        } else {
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionscolarite?useSSL=false", "root", "");
                PreparedStatement Add = con.prepareStatement("insert into noty values(?,?,?,?,?,?)");
                int note1 = Integer.parseInt(Not1.getText());
                int note2 = Integer.parseInt(Note2.getText());
                int note3 = Integer.parseInt(Note3.getText());

                if (note1 < 0 || note1 > 20 || note2 < 0 || note2 > 20 || note3 < 0 || note3 > 20) {
                    JOptionPane.showMessageDialog(this, "Les notes doivent être comprises entre 0 et 20.");
                } else {
                    Add.setString(1, (String) NotMatricule.getSelectedItem());
                    Add.setString(2, (String) NotNom.getSelectedItem());
                    Add.setString(3, (String) NotMatiere.getSelectedItem());
                    Add.setInt(4, note1);
                    Add.setInt(5, note2);
                    Add.setInt(6, note3);

                    int row = Add.executeUpdate();

                    JOptionPane.showMessageDialog(this, "La note de " + NotNom.getSelectedItem() + " pour la matière " + NotMatiere.getSelectedItem() + " a été ajoutée avec succès !");
                }
                Selectional();
                RetourZero();

            } catch (HeadlessException | NumberFormatException | SQLException e) {
                JOptionPane.showMessageDialog(this, "Échec de l'enregistrement " + e.getMessage());
            }
        }
    }//GEN-LAST:event_AjouterMouseClicked

    private void SupprimerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SupprimerMouseClicked
        // TODO add your handling code here:
       if (NotMatricule.getSelectedItem() == null || NotNom.getSelectedItem().toString().isEmpty() || NotMatiere.getSelectedItem() == null || Not1.getText().isEmpty() || Note2.getText().isEmpty() || Note3.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Veuillez remplir tous les champs.");
        } else {
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionscolarite?useSSL=false","root","");
                String idd = NotMatricule.getSelectedItem().toString();
                String Query = "Delete from gestionscolarite.noty where Matricule="+idd;
                Statement Add = con.createStatement();
                Add.executeUpdate(Query);
                Selectional();
                JOptionPane.showMessageDialog(this," La note de " +NotNom.getSelectedItem()+" suprimé avec success");

                RetourZero();

            } catch (HeadlessException | SQLException e) {
                e.getStackTrace();
            }

        }
    }//GEN-LAST:event_SupprimerMouseClicked

    private void ModiferMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModiferMouseClicked
       if (NotMatricule.getSelectedItem() == null || NotNom.getSelectedItem().toString().isEmpty() || NotMatiere.getSelectedItem() == null || Not1.getText().isEmpty() || Note2.getText().isEmpty() || Note3.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Veuillez remplir tous les champs.");
        } else {
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionscolarite?useSSL=false","root","");
                String Query = "UPDATE gestionscolarite.noty SET Nom='" + NotNom.getSelectedItem()+ "',Matiere='" + NotMatiere.getSelectedItem()+ "', Note1='" + Not1.getText() + "', Note2='" + Note2.getText() + "', Note3='" + Note3.getText() + "' WHERE Matricule='" + NotMatricule.getSelectedItem()+ "'";
                Statement Add = con.createStatement();
                Add.executeUpdate(Query); 
                JOptionPane.showMessageDialog(this," La note de  "+NotNom.getSelectedItem()+ " a été modifié avec success");
                Selectional();
                RetourZero();
            } catch (HeadlessException | SQLException e) {
                e.getStackTrace();
            }
        }
    }//GEN-LAST:event_ModiferMouseClicked

    private void videMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_videMouseClicked
        // TODO add your handling code here:
        RetourZero();
    }//GEN-LAST:event_videMouseClicked

    private void NotMatriculeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_NotMatriculeItemStateChanged
        // TODO add your handling code here:
        String s = NotMatricule.getSelectedItem().toString();
        String sql = "Select Nom , Matricule from etudiant where Matricule='"+s+"'";

        try {
            // Créer une nouvelle PreparedStatement
            PreparedStatement ps=con.prepareStatement(sql);
            // Exécuter la requête
            ResultSet Rs=ps.executeQuery();

            while( Rs.next()){
                NotNom.setSelectedItem(Rs.getString("Nom"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_NotMatriculeItemStateChanged

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void NotMatriculeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NotMatriculeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NotMatriculeActionPerformed

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
            java.util.logging.Logger.getLogger(Notes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Notes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Notes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Notes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Notes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ajouter;
    private javax.swing.JButton Modifer;
    private javax.swing.JTextField Not1;
    private javax.swing.JComboBox<String> NotMatiere;
    private javax.swing.JComboBox<String> NotMatricule;
    private javax.swing.JComboBox<String> NotNom;
    private javax.swing.JTable NotTable;
    private javax.swing.JTextField Note2;
    private javax.swing.JTextField Note3;
    private javax.swing.JButton Supprimer;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton vide;
    // End of variables declaration//GEN-END:variables
}
