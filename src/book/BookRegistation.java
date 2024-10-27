package book;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.Image;
import javax.swing.ImageIcon;

public class BookRegistation extends javax.swing.JFrame {

    public BookRegistation() {
        initComponents();
        components();
    }
    
  private void components(){
    
        ImageIcon icon = new ImageIcon("src\\resources\\all\\wallpaper.jpg");
        Image img = icon.getImage();
        Image imageSet = img.getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon iSe1t = new ImageIcon(imageSet);
        jLabel7.setIcon(iSe1t);
   }
    public void setAuthorName(String name) {
        jTextField7.setText(name);
    }
    
     public void setCategoty(String name) {
        jTextField3.setText(name);
    }
    
    //........**Publisher**.................//
    
     private String PublisherId;

    public void setPublisherId(String PublisherId) {
        this.PublisherId = PublisherId;
    }     
     
    public void setPublisher(String Publisher) {
        jTextField4.setText(Publisher);
    } 
    
    //........**Publisher**.................//
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(795, 560));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0,80)
        );
        jPanel2.setPreferredSize(new java.awt.Dimension(795, 560));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Book Registation");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 320, 40));

        jLabel3.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel3.setText("1. Book ID  :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 100, 30));

        jLabel4.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel4.setText("2. Book Title :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 100, 30));

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Poppins Medium", 0, 13)); // NOI18N
        jTextField1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField1.setPreferredSize(new java.awt.Dimension(30, 22));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 204, 30));

        jTextField2.setFont(new java.awt.Font("Poppins Medium", 0, 13)); // NOI18N
        jTextField2.setPreferredSize(new java.awt.Dimension(30, 22));
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 204, 30));

        jLabel5.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel5.setText("3. Author :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 100, 30));

        jTextField3.setFont(new java.awt.Font("Poppins Medium", 0, 13)); // NOI18N
        jTextField3.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField3.setPreferredSize(new java.awt.Dimension(30, 22));
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, 204, 30));

        jLabel6.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel6.setText("6. ISBN :");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, 100, 30));

        jLabel10.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel10.setText("4. Publisher :");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, 110, 30));

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Poppins Medium", 0, 13)); // NOI18N
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, 204, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/book/reading-book.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 64, 64));

        jTextField7.setEditable(false);
        jTextField7.setFont(new java.awt.Font("Poppins Medium", 0, 13)); // NOI18N
        jTextField7.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField7.setPreferredSize(new java.awt.Dimension(30, 22));
        jPanel2.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 204, 30));

        jButton2.setText("Select");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 200, -1, 30));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 153));
        jButton3.setText("Add Book");
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, 150, 35));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 153));
        jButton4.setText("Clear");
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 470, 150, 35));

        jLabel1.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel1.setText("notification");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 640, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/all/cross.png"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jButton5.setText("Select");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, -1, 30));

        jButton6.setText("Select");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 290, -1, 30));

        jLabel9.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel9.setText("5. Category :");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 100, 30));

        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Poppins Medium", 0, 13)); // NOI18N
        jTextField5.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField5.setPreferredSize(new java.awt.Dimension(30, 22));
        jPanel2.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, 204, 30));

        jLabel7.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 795, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 795, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         AuthorView av = new AuthorView(this, true);
        av.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Publisher pb = new Publisher(this, true);
        pb.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         BookCategory bc = new BookCategory(this, true);
        bc.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
              FlatMacLightLaf.setup();
     java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookRegistation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
