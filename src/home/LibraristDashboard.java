package home;

import book.BookMain;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import employee.EmployeeMain;
import inventoryManagement.InventoryMenu;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Point;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import members.membersHome;

public class LibraristDashboard extends javax.swing.JFrame {

    private  Point framPosition;
    private  int framsize;
    
  public LibraristDashboard() {
        initComponents();
        components();
        
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jToggleButton2 = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1500, 800));
        setSize(new java.awt.Dimension(1500, 800));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowDeiconified(java.awt.event.WindowEvent evt) {
                formWindowDeiconified(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(157, 189, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        jPanel2.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(300, 646));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel6.setBackground(new java.awt.Color(157, 189, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 1, 1, 1));
        jPanel6.setPreferredSize(new java.awt.Dimension(65, 560));
        jPanel6.setLayout(new java.awt.GridLayout(8, 1, 5, 20));

        jButton1.setBackground(new java.awt.Color(94, 129, 251));
        jButton1.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 153, 153));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/home.png"))); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton1);

        jButton2.setBackground(new java.awt.Color(94, 129, 251));
        jButton2.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(153, 153, 153));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/book.png"))); // NOI18N
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton2);

        jButton3.setBackground(new java.awt.Color(94, 129, 251));
        jButton3.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(153, 153, 153));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/employee.png"))); // NOI18N
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton3);

        jButton4.setBackground(new java.awt.Color(94, 129, 251));
        jButton4.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(153, 153, 153));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/user.png"))); // NOI18N
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton4);

        jButton5.setBackground(new java.awt.Color(94, 129, 251));
        jButton5.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(153, 153, 153));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/stock.png "))); // NOI18N
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton5);

        jButton6.setBackground(new java.awt.Color(94, 129, 251));
        jButton6.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(153, 153, 153));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/payment.png"))); // NOI18N
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.add(jButton6);

        jButton7.setBackground(new java.awt.Color(94, 129, 251));
        jButton7.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(153, 153, 153));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/reports.png"))); // NOI18N
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.add(jButton7);

        jButton8.setBackground(new java.awt.Color(94, 129, 251));
        jButton8.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(153, 153, 153));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/backup.png"))); // NOI18N
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.add(jButton8);

        jPanel2.add(jPanel6, java.awt.BorderLayout.LINE_START);

        jPanel7.setBackground(new java.awt.Color(157, 189, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 1, 1, 1));
        jPanel7.setPreferredSize(new java.awt.Dimension(175, 560));
        jPanel7.setLayout(new java.awt.GridLayout(8, 1, 5, 20));

        jButton9.setBackground(new java.awt.Color(94, 129, 251));
        jButton9.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(153, 153, 153));
        jButton9.setText("Home");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton9);

        jButton10.setBackground(new java.awt.Color(94, 129, 251));
        jButton10.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jButton10.setForeground(new java.awt.Color(153, 153, 153));
        jButton10.setText("Book");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton10);

        jButton11.setBackground(new java.awt.Color(94, 129, 251));
        jButton11.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jButton11.setForeground(new java.awt.Color(153, 153, 153));
        jButton11.setText("Employee");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton11);

        jButton12.setBackground(new java.awt.Color(94, 129, 251));
        jButton12.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jButton12.setForeground(new java.awt.Color(153, 153, 153));
        jButton12.setText("Member");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton12);

        jButton13.setBackground(new java.awt.Color(94, 129, 251));
        jButton13.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jButton13.setForeground(new java.awt.Color(153, 153, 153));
        jButton13.setText("Inventory");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton13);

        jButton14.setBackground(new java.awt.Color(94, 129, 251));
        jButton14.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jButton14.setForeground(new java.awt.Color(153, 153, 153));
        jButton14.setText("Issuance/Return ");
        jPanel7.add(jButton14);

        jButton15.setBackground(new java.awt.Color(94, 129, 251));
        jButton15.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jButton15.setForeground(new java.awt.Color(153, 153, 153));
        jButton15.setText("Reports");
        jPanel7.add(jButton15);

        jButton16.setBackground(new java.awt.Color(94, 129, 251));
        jButton16.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jButton16.setForeground(new java.awt.Color(153, 153, 153));
        jButton16.setText("Backup");
        jPanel7.add(jButton16);

        jPanel2.add(jPanel7, java.awt.BorderLayout.CENTER);

        jPanel1.setBackground(new java.awt.Color(157, 189, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)));
        jPanel1.setPreferredSize(new java.awt.Dimension(225, 90));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/profilePic.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        jLabel6.setText("librarist fname");

        jLabel7.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        jLabel7.setText("librarist lname");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(jPanel2, java.awt.BorderLayout.LINE_START);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 2));
        jPanel3.setMinimumSize(new java.awt.Dimension(1500, 67));
        jPanel3.setPreferredSize(new java.awt.Dimension(1500, 84));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Librarist Dashboard");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 15, 290, 52));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 102));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Library Name ");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(564, 20, 312, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/all/cross.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1460, 10, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/all/window_minimize.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1430, 0, -1, 32));

        jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/lightMode.png"))); // NOI18N
        jToggleButton2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/nightMode.png"))); // NOI18N
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 0, 45, 45));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/menu (5).png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 49, 49));

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel4.setPreferredSize(new java.awt.Dimension(1240, 716));
        jPanel4.setLayout(new java.awt.BorderLayout());
        getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void switchButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_switchButton1MouseClicked
        
    }//GEN-LAST:event_switchButton1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
       System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        framsize = this.getExtendedState();
        framPosition = this.getLocation();
      
      this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void formWindowDeiconified(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowDeiconified
        this.setExtendedState(framsize);
        this.setLocation(framPosition);
    }//GEN-LAST:event_formWindowDeiconified

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
      
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        BookMain bookMain = new BookMain();
        jPanel4.removeAll();
        jPanel4.add(bookMain,BorderLayout.CENTER);
        SwingUtilities.updateComponentTreeUI(jPanel4);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        EmployeeMain em = new EmployeeMain();
    jPanel4.removeAll();
    jPanel4.add(em,BorderLayout.CENTER);
    SwingUtilities.updateComponentTreeUI(jPanel4);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        if (jToggleButton2.isSelected()) {
           darkMode();
        }else{
            lightMode();
        }
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        BookMain bookMain = new BookMain();
        jPanel4.removeAll();
        jPanel4.add(bookMain,BorderLayout.CENTER);
        SwingUtilities.updateComponentTreeUI(jPanel4);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        membersHome mm = new membersHome();
        jPanel4.removeAll();
        jPanel4.add(mm,BorderLayout.CENTER);
        SwingUtilities.updateComponentTreeUI(jPanel4);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        membersHome mm = new membersHome();
        jPanel4.removeAll();
        jPanel4.add(mm,BorderLayout.CENTER);
        SwingUtilities.updateComponentTreeUI(jPanel4);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    EmployeeMain em = new EmployeeMain();
    jPanel4.removeAll();
    jPanel4.add(em,BorderLayout.CENTER);
    SwingUtilities.updateComponentTreeUI(jPanel4);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        InventoryMenu im = new InventoryMenu();
       jPanel4.removeAll();
    jPanel4.add(im,BorderLayout.CENTER);
    SwingUtilities.updateComponentTreeUI(jPanel4);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        InventoryMenu im = new InventoryMenu();
       jPanel4.removeAll();
    jPanel4.add(im,BorderLayout.CENTER);
    SwingUtilities.updateComponentTreeUI(jPanel4);
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
                FlatMacLightLaf.setup();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
    new LibraristDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JToggleButton jToggleButton2;
    // End of variables declaration//GEN-END:variables

        private void  lightMode(){
            SwingUtilities.invokeLater(()->{
        try {
            UIManager.setLookAndFeel(new FlatMacLightLaf());
            SwingUtilities.updateComponentTreeUI(this);
            jPanel2.setBackground(new Color(157,189,255));
            jPanel6.setBackground(new Color(157,189,255));
            jPanel7.setBackground(new Color(157,189,255));
            jButton1.setBackground(new Color(94,129,251));
            jButton2.setBackground(new Color(94,129,251));
            jButton3.setBackground(new Color(94,129,251));
            jButton4.setBackground(new Color(94,129,251));
            jButton5.setBackground(new Color(94,129,251));
            jButton6.setBackground(new Color(94,129,251));
            jButton7.setBackground(new Color(94,129,251));
            jButton8.setBackground(new Color(94,129,251));
            jButton9.setBackground(new Color(94,129,251));
            jButton10.setBackground(new Color(94,129,251));
            jButton11.setBackground(new Color(94,129,251));
            jButton12.setBackground(new Color(94,129,251));
            jButton13.setBackground(new Color(94,129,251));
            jButton14.setBackground(new Color(94,129,251));
            jButton15.setBackground(new Color(94,129,251));
            jButton16.setBackground(new Color(94,129,251));
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(AdminDashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    });
    
    }
        
    private void darkMode(){
    
     SwingUtilities.invokeLater(()->{
        try {
            UIManager.setLookAndFeel(new FlatMacDarkLaf());
            SwingUtilities.updateComponentTreeUI(this);
            
            jPanel2.setBackground(new Color(97, 103, 122));
            jPanel6.setBackground(new Color(97, 103, 122));
            jPanel7.setBackground(new Color(97, 103, 122));
            jButton1.setBackground(new Color(181, 192, 208));
            jButton2.setBackground(new Color(181, 192, 208));
            jButton3.setBackground(new Color(181, 192, 208));
            jButton4.setBackground(new Color(181, 192, 208));
            jButton5.setBackground(new Color(181, 192, 208));
            jButton6.setBackground(new Color(181, 192, 208));
            jButton7.setBackground(new Color(181, 192, 208));
            jButton8.setBackground(new Color(181, 192, 208));
            jButton9.setBackground(new Color(181, 192, 208));
            jButton10.setBackground(new Color(181, 192, 208));
            jButton11.setBackground(new Color(181, 192, 208));
            jButton12.setBackground(new Color(181, 192, 208));
            jButton13.setBackground(new Color(181, 192, 208));
            jButton14.setBackground(new Color(181, 192, 208));
            jButton15.setBackground(new Color(181, 192, 208));
            jButton16.setBackground(new Color(181, 192, 208));
          
         
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(AdminDashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    });
    }
    
        private void components(){

        jButton13.setText("<html> Inventory<br>Manegment</html>");
        jToggleButton2.putClientProperty("JButton.buttonType", "roundRect");

    }
}
