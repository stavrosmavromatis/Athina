/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author User
 */
public class Stoixeia_Kathigiti extends javax.swing.JInternalFrame {

    /**
     * Creates new form Stoixeia_Kathigiti
     */
    public Stoixeia_Kathigiti() {
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
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
        Stoixeia_K = new javax.swing.JLabel();
        onoma = new javax.swing.JLabel();
        epwnumo = new javax.swing.JLabel();
        eidikothta = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        digital_signature = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(710, 490));

        Stoixeia_K.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Stoixeia_K.setText("Στοιχεία Καθηγητή:");

        onoma.setText("'Ονομα:");

        epwnumo.setText("Επώνυμο:");

        eidikothta.setText("Ειδικότητα:");

        email.setText("Email:");

        digital_signature.setText("Digital Signature:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Stoixeia_K)
                    .addComponent(onoma)
                    .addComponent(epwnumo)
                    .addComponent(eidikothta)
                    .addComponent(email)
                    .addComponent(digital_signature))
                .addContainerGap(565, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Stoixeia_K)
                .addGap(18, 18, 18)
                .addComponent(onoma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(epwnumo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eidikothta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(digital_signature)
                .addContainerGap(327, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Stoixeia_K;
    private javax.swing.JLabel digital_signature;
    private javax.swing.JLabel eidikothta;
    private javax.swing.JLabel email;
    private javax.swing.JLabel epwnumo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel onoma;
    // End of variables declaration//GEN-END:variables
}
