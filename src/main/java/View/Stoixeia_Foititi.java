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
public class Stoixeia_Foititi extends javax.swing.JInternalFrame {

    /**
     * Creates new form Stoixeia_Foititi
     */
    public Stoixeia_Foititi() {
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
        Stoixeia_F = new javax.swing.JLabel();
        onoma = new javax.swing.JLabel();
        epwnumo = new javax.swing.JLabel();
        ejamhno = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        thl = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        dm = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(710, 490));

        Stoixeia_F.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Stoixeia_F.setText("Στοιχεία Φοιτητή:");

        onoma.setText("'Ονομα:");

        epwnumo.setText("Επώνυμο:");

        ejamhno.setText("Εξάμηνο:");

        email.setText("Email:");

        thl.setText("Τηλέφωνο:");

        address.setText("Διεύθυνση:");

        dm.setText("Διδακτικές Μονάδες:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Stoixeia_F)
                    .addComponent(onoma)
                    .addComponent(epwnumo)
                    .addComponent(ejamhno)
                    .addComponent(email)
                    .addComponent(thl)
                    .addComponent(address)
                    .addComponent(dm))
                .addContainerGap(570, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Stoixeia_F)
                .addGap(18, 18, 18)
                .addComponent(onoma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(epwnumo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ejamhno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(thl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(address)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dm)
                .addContainerGap(277, Short.MAX_VALUE))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Stoixeia_F;
    private javax.swing.JLabel address;
    private javax.swing.JLabel dm;
    private javax.swing.JLabel ejamhno;
    private javax.swing.JLabel email;
    private javax.swing.JLabel epwnumo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel onoma;
    private javax.swing.JLabel thl;
    // End of variables declaration//GEN-END:variables
}
