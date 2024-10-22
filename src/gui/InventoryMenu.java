package gui;

import java.awt.Image;
import javax.swing.ImageIcon;

public class InventoryMenu extends javax.swing.JPanel {

    public InventoryMenu() {
        initComponents();
        Components();
    }

    
     private void Components(){
      ImageIcon icon = new ImageIcon("src\\resources\\all\\wallpaper.jpg");
        Image img = icon.getImage();
        Image imageSet = img.getScaledInstance(1240, 716, Image.SCALE_SMOOTH);
        ImageIcon iSe1t = new ImageIcon(imageSet);
        jLabel3.setIcon(iSe1t);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1240, 716));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Inventory");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 58, -1, -1));

        jButton1.setFont(new java.awt.Font("Poppins SemiBold", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 153));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/inventory/add.jpg"))); // NOI18N
        jButton1.setText("Register");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(0, 0, 153), new java.awt.Color(0, 0, 102)));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 168, 175, -1));

        jButton2.setFont(new java.awt.Font("Poppins SemiBold", 1, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 153));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/inventory/update.jpg"))); // NOI18N
        jButton2.setText("Update");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(0, 0, 153), new java.awt.Color(0, 0, 102)));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(619, 168, 175, -1));

        jButton3.setFont(new java.awt.Font("Poppins SemiBold", 1, 16)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 153));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/inventory/view.jpg"))); // NOI18N
        jButton3.setText("Inventory View");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(0, 0, 153), new java.awt.Color(0, 0, 102)));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(891, 168, 175, -1));

        jButton4.setFont(new java.awt.Font("Poppins SemiBold", 1, 16)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 153));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/inventory/damaged.jpg"))); // NOI18N
        jButton4.setText("Damaged Books");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(0, 0, 153), new java.awt.Color(0, 0, 102)));
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 419, 175, -1));

        jButton5.setFont(new java.awt.Font("Poppins SemiBold", 1, 16)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 153));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/inventory/lost.jpg"))); // NOI18N
        jButton5.setText("Lost Books");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(0, 0, 153), new java.awt.Color(0, 0, 102)));
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 419, 175, -1));

        jButton6.setFont(new java.awt.Font("Poppins SemiBold", 1, 16)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 153));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/inventory/inuse.jpg"))); // NOI18N
        jButton6.setText("In Use");
        jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(0, 0, 153), new java.awt.Color(0, 0, 102)));
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(653, 419, 175, -1));

        jButton7.setFont(new java.awt.Font("Poppins SemiBold", 1, 16)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 0, 153));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/inventory/borrow.jpg"))); // NOI18N
        jButton7.setText("Borrowed");
        jButton7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(0, 0, 153), new java.awt.Color(0, 0, 102)));
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(891, 419, 175, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/inventory/history.png"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 64, 64));
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 716));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        InventoryRegistration inventoryRegistration = new InventoryRegistration();
        inventoryRegistration.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
