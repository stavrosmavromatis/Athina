/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
    import static javax.swing.JOptionPane.*;
    import Controller.Controller_US_03;
    import java.awt.Color;
    import java.io.FileNotFoundException;
    import java.io.IOException;
    import java.util.logging.Level;
    import java.util.logging.Logger;
    import javax.swing.JPanel;
/**
 *
 * @author User
 */
public class Login_Form extends javax.swing.JFrame {
    Controller_US_03 con ;
   
    public Login_Form() {
        initComponents();
        con= new Controller_US_03();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Username = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        user_icon = new javax.swing.JLabel();
        password_icon = new javax.swing.JLabel();
        LogIn = new javax.swing.JButton();
        MovePanel = new javax.swing.JPanel();
        ButtonMinimize = new javax.swing.JPanel();
        Minimize = new javax.swing.JLabel();
        ButtonExit = new javax.swing.JPanel();
        Exit = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        ihu_icon = new javax.swing.JLabel();
        ATHINA = new javax.swing.JLabel();
        MovePanel_Left = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(60, 63, 65));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Username.setBackground(new java.awt.Color(60, 63, 65));
        Username.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Username.setForeground(new java.awt.Color(255, 255, 255));
        Username.setText("Username");
        Username.setBorder(null);
        Username.setCaretColor(new java.awt.Color(255, 255, 255));
        Username.setOpaque(false);
        Username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UsernameFocusGained(evt);
            }
        });
        Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameActionPerformed(evt);
            }
        });
        jPanel3.add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 105, 220, 30));

        Password.setBackground(new java.awt.Color(60, 63, 65));
        Password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Password.setForeground(new java.awt.Color(255, 255, 255));
        Password.setText("Password");
        Password.setBorder(null);
        Password.setCaretColor(new java.awt.Color(255, 255, 255));
        Password.setOpaque(false);
        Password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PasswordFocusGained(evt);
            }
        });
        jPanel3.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 153, 220, 30));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 142, 220, 10));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 192, 220, 10));

        user_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/user_30px.png"))); // NOI18N
        jPanel3.add(user_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 105, 30, 30));

        password_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/unlock_26px_1.png"))); // NOI18N
        jPanel3.add(password_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 153, -1, -1));

        LogIn.setBackground(new java.awt.Color(60, 63, 65));
        LogIn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LogIn.setText("Log In");
        LogIn.setToolTipText("");
        LogIn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        LogIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInActionPerformed(evt);
            }
        });
        jPanel3.add(LogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 100, 30));

        MovePanel.setBackground(new java.awt.Color(60, 63, 65));
        MovePanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MovePanelMouseDragged(evt);
            }
        });
        MovePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MovePanelMousePressed(evt);
            }
        });

        ButtonMinimize.setBackground(new java.awt.Color(60, 63, 65));
        ButtonMinimize.setForeground(new java.awt.Color(255, 51, 102));

        Minimize.setBackground(new java.awt.Color(255, 255, 255));
        Minimize.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        Minimize.setForeground(new java.awt.Color(255, 255, 255));
        Minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/minimize_window_50px.png"))); // NOI18N
        Minimize.setMaximumSize(new java.awt.Dimension(20, 20));
        Minimize.setMinimumSize(new java.awt.Dimension(20, 20));
        Minimize.setPreferredSize(new java.awt.Dimension(30, 30));
        Minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MinimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MinimizeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ButtonMinimizeLayout = new javax.swing.GroupLayout(ButtonMinimize);
        ButtonMinimize.setLayout(ButtonMinimizeLayout);
        ButtonMinimizeLayout.setHorizontalGroup(
            ButtonMinimizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonMinimizeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Minimize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ButtonMinimizeLayout.setVerticalGroup(
            ButtonMinimizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonMinimizeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Minimize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        ButtonExit.setBackground(new java.awt.Color(60, 63, 65));

        Exit.setBackground(new java.awt.Color(255, 255, 255));
        Exit.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        Exit.setForeground(new java.awt.Color(255, 255, 255));
        Exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/close_window_50px.png"))); // NOI18N
        Exit.setMaximumSize(new java.awt.Dimension(20, 20));
        Exit.setMinimumSize(new java.awt.Dimension(20, 20));
        Exit.setPreferredSize(new java.awt.Dimension(20, 20));
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ButtonExitLayout = new javax.swing.GroupLayout(ButtonExit);
        ButtonExit.setLayout(ButtonExitLayout);
        ButtonExitLayout.setHorizontalGroup(
            ButtonExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonExitLayout.createSequentialGroup()
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        ButtonExitLayout.setVerticalGroup(
            ButtonExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonExitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout MovePanelLayout = new javax.swing.GroupLayout(MovePanel);
        MovePanel.setLayout(MovePanelLayout);
        MovePanelLayout.setHorizontalGroup(
            MovePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MovePanelLayout.createSequentialGroup()
                .addContainerGap(629, Short.MAX_VALUE)
                .addComponent(ButtonMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        MovePanelLayout.setVerticalGroup(
            MovePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MovePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(MovePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonMinimize, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel3.add(MovePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-360, 0, 710, 30));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(900, 464));

        ihu_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ihu_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/ihu_logo.png__200x200_q75_background-#fff_subsampling-2.png"))); // NOI18N
        ihu_icon.setToolTipText("");

        ATHINA.setBackground(new java.awt.Color(0, 51, 102));
        ATHINA.setFont(new java.awt.Font("Engravers MT", 0, 24)); // NOI18N
        ATHINA.setForeground(new java.awt.Color(0, 51, 102));
        ATHINA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ATHINA.setText("ATHINA");
        ATHINA.setToolTipText("");

        MovePanel_Left.setBackground(new java.awt.Color(204, 204, 255));
        MovePanel_Left.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MovePanel_LeftMouseDragged(evt);
            }
        });
        MovePanel_Left.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MovePanel_LeftMousePressed(evt);
            }
        });

        javax.swing.GroupLayout MovePanel_LeftLayout = new javax.swing.GroupLayout(MovePanel_Left);
        MovePanel_Left.setLayout(MovePanel_LeftLayout);
        MovePanel_LeftLayout.setHorizontalGroup(
            MovePanel_LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        MovePanel_LeftLayout.setVerticalGroup(
            MovePanel_LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MovePanel_Left, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ATHINA, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ihu_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(MovePanel_Left, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(ihu_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ATHINA, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, -1));

        setSize(new java.awt.Dimension(690, 459));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameActionPerformed

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitMouseClicked

    private void UsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsernameFocusGained
        Username.setText("");
    }//GEN-LAST:event_UsernameFocusGained

    private void PasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordFocusGained
        Password.setText("");
    }//GEN-LAST:event_PasswordFocusGained

    private void LogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogInActionPerformed
        try {
            String jPassword = Password.getText();
            String jUsername = Username.getText();
            int status_code=con.verifyUser(jUsername, jPassword);
            if(status_code==-1)
            {
                showMessageDialog(null, "Not a registered user", "Error", ERROR_MESSAGE);
                Password.setText(null);
            }
            else
            {
                this.toBack();
                Username.setText(null);
                Password.setText(null);
            }
        } catch (FileNotFoundException ex) {        
           Logger.getLogger(Login_Form.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IOException ex) {
           Logger.getLogger(Login_Form.class.getName()).log(Level.SEVERE, null, ex);
       }        
    }//GEN-LAST:event_LogInActionPerformed

    private int xMouse, yMouse;
    private void MovePanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MovePanelMousePressed
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_MovePanelMousePressed

    private void MovePanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MovePanelMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_MovePanelMouseDragged

    private void MinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeMouseClicked
        this.setState(1);
    }//GEN-LAST:event_MinimizeMouseClicked

    private void MovePanel_LeftMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MovePanel_LeftMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_MovePanel_LeftMouseDragged
   
    private void MovePanel_LeftMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MovePanel_LeftMousePressed
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_MovePanel_LeftMousePressed
    
    public void changecolor(JPanel hover, Color rand){
        hover.setBackground(rand);
    }
    
    private void ExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseEntered
        changecolor(ButtonExit, new Color(25, 29, 74));
    }//GEN-LAST:event_ExitMouseEntered

    private void ExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseExited
        changecolor(ButtonExit, new Color(60,63,65));
    }//GEN-LAST:event_ExitMouseExited

    private void MinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeMouseEntered
        changecolor(ButtonMinimize, new Color(25, 29, 74));
    }//GEN-LAST:event_MinimizeMouseEntered

    private void MinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeMouseExited
        changecolor(ButtonMinimize, new Color(60,63,65));
    }//GEN-LAST:event_MinimizeMouseExited
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
            java.util.logging.Logger.getLogger(Login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ATHINA;
    private javax.swing.JPanel ButtonExit;
    private javax.swing.JPanel ButtonMinimize;
    private javax.swing.JLabel Exit;
    private javax.swing.JButton LogIn;
    private javax.swing.JLabel Minimize;
    private javax.swing.JPanel MovePanel;
    private javax.swing.JPanel MovePanel_Left;
    private javax.swing.JPasswordField Password;
    private javax.swing.JTextField Username;
    private javax.swing.JLabel ihu_icon;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel password_icon;
    private javax.swing.JLabel user_icon;
    // End of variables declaration//GEN-END:variables
    //private void systemExit()
    //{
    //    WindowEvent winCloseing = new WindowEvent (this,WindowEvent.WINDOW_CLOSING);
    //}
}
