/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.plaf.basic.BasicInternalFrameUI;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;
import Model.*;
import Controller.*;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class Diorthosi_Vathmologias extends javax.swing.JInternalFrame {

    DefaultListModel<String> model;
    DefaultListModel<String> model_math;
    DefaultListModel<String> model_eks;
    private Model.Kathigitis kathigitis=null;
    ArrayList<Model.Mathima> mathima= new ArrayList<>();
    ArrayList<Model.Eksetastiki> eksetastiki = new ArrayList<>();
    ArrayList<Model.Mathima> vathm = new ArrayList<>();
    Controller_US_06 con6= new Controller_US_06();
    String AM = null;
    int selected = 0;
    double vathmologia = 0.0;
    
    public Diorthosi_Vathmologias(Model.Kathigitis kathigitis) {
        initComponents();
        model= new DefaultListModel<String>();
        model_math = new DefaultListModel<>();
        model_eks = new DefaultListModel<>();
        this.kathigitis=kathigitis;
        mathima=con6.getMathimataOfKathigitis(kathigitis);
        for (int i = 0; i < mathima.size(); i++) {       
            model.addElement(mathima.get(i).getTitlos());
        }
        jList1.setModel(model);
        jList1.setSelectedIndex(0);
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }

    Diorthosi_Vathmologias() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        eksetastikes = new javax.swing.JList();
        AM_txt = new javax.swing.JTextField();
        next_btn = new javax.swing.JButton();
        vath = new javax.swing.JLabel();
        ins_vath = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        Message = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Τα μαθήματά μου :");

        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        eksetastikes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        eksetastikes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eksetastikesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(eksetastikes);

        next_btn.setText("ΕΠΟΜΕΝΟ");
        next_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next_btnActionPerformed(evt);
            }
        });

        ins_vath.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ins_vath.setEnabled(false);

        save.setText("ΥΠΟΒΟΛΗ");
        save.setEnabled(false);
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(vath)
                        .addGap(155, 155, 155)
                        .addComponent(ins_vath, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(AM_txt)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                                .addComponent(next_btn)
                                .addGap(97, 97, 97))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(save)
                        .addGap(56, 56, 56)
                        .addComponent(Message)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(AM_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(next_btn)))
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vath)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ins_vath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(save)
                        .addComponent(Message)))
                .addContainerGap(203, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        model_math.clear();
        selected = jList1.getSelectedIndex();
        if (selected != -1) {
            eksetastikes.setVisible(true);
            eksetastiki = con6.getEksetastikesOfMathima(mathima.get(selected));
            for (int i = 0; i<eksetastiki.size() ; i++) {
                model_math.addElement(eksetastiki.get(i).getKwdikos());
            }
            eksetastikes.setModel(model_math);
            eksetastikes.setSelectedIndex(0);
        }

    }//GEN-LAST:event_jList1MouseClicked

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        
    }//GEN-LAST:event_jList1ValueChanged

    private void eksetastikesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eksetastikesMouseClicked
        model_eks.clear();
        int selected = eksetastikes.getSelectedIndex();
        if (selected != -1) {
            AM_txt.setVisible(true);
            next_btn.setVisible(true);
        }
    }//GEN-LAST:event_eksetastikesMouseClicked

    private void next_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next_btnActionPerformed
        AM = AM_txt.getText();
        try { 
            if(con6.getVathmologia(AM, mathima.get(jList1.getSelectedIndex()), eksetastiki.get(eksetastikes.getSelectedIndex())) == -1)
            {
                vath.setText("ΔΕΝ ΕΧΕΙ ΚΑΤΑΧΩΡΗΘΕΙ");
            }
            else {
                vath.setText(""+con6.getVathmologia(AM, mathima.get(jList1.getSelectedIndex()), eksetastiki.get(eksetastikes.getSelectedIndex()))+"");
                ins_vath.setEnabled(true);
                save.setEnabled(true);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Diorthosi_Vathmologias.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_next_btnActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        con6.EisagogiDiorthosisVathmologias(kathigitis, mathima.get(jList1.getSelectedIndex()), null, Double.parseDouble(vath.getText()), Double.parseDouble(ins_vath.getText()), eksetastiki.get(eksetastikes.getSelectedIndex()));
        if (con6.SaveVathmologia()) {
            Message.setText("Η ΒΑΘΜΟΛΟΓΙΑ ΣΑΣ ΣΤΑΛΘΗΚΕ ΕΠΙΤΥΧΩΣ!");
        }
        else {
            Message.setText("ΑΠΟΤΥΧΙΑ!");
        }
    }//GEN-LAST:event_saveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AM_txt;
    private javax.swing.JLabel Message;
    private javax.swing.JList eksetastikes;
    private javax.swing.JTextField ins_vath;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton next_btn;
    private javax.swing.JButton save;
    private javax.swing.JLabel vath;
    // End of variables declaration//GEN-END:variables
}
