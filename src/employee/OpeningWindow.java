/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package employee;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Nilakshi
 */
public class OpeningWindow extends javax.swing.JFrame {

    /**
     * Creates new form OpeningWindow
     */
    public OpeningWindow() {
        initComponents();
        openingImg();
        loadingAnimation();
    }

     private void openingImg(){
    
        ImageIcon icon = new ImageIcon("src\\resources\\inventory\\openingWindow.png");
        Image img = icon.getImage();
        Image image = img.getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon imageSet = new ImageIcon(image);
        jLabel2.setIcon(imageSet);
    
    }
    
    private void loadingAnimation(){
    
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {

                for (int i = 0; i <= 30; i++) {
                    jProgressBar1.setValue(i);

                    if (i == 0) {
                        jLabel1.setText("Loading...");
                    } else if (i == 19) {
                        jLabel1.setText("Libraries loading...");
                    }

                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                for (int i = 31; i <= 35; i++) {
                    jProgressBar1.setValue(i);

                    if (i == 31) {
                        jLabel1.setText("loading DB fields...");
                    }

                    try {
                        Thread.sleep(400);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                for (int i = 36; i <= 70; i++) {
                    jProgressBar1.setValue(i);

                    if (i == 36) {
                        jLabel1.setText("loading DB fields...");
                    } else if (i == 47) {
                        jLabel1.setText("Creating DB connections...");
                    }

                    try {
                        Thread.sleep(90);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                for (int i = 71; i <= 73; i++) {
                    jProgressBar1.setValue(i);

                    if (i == 71) {
                        jLabel1.setText("Creating DB connections...");
                    }

                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                for (int i = 74; i <= 100; i++) {
                    jProgressBar1.setValue(i);

                    if (i == 74) {
                        jLabel1.setText("loading Resources...");
                    } else if (i == 91) {
                        jLabel1.setText("Generating UIs...");
                    }

                    try {
                        Thread.sleep(30);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

//                OpenWindow.dispose();
//                new login().setVisible(true);
            }
        });
        t.start();
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jProgressBar1.setBackground(new java.awt.Color(255, 255, 255));
        jProgressBar1.setForeground(new java.awt.Color(157, 189, 255));
        jProgressBar1.setValue(50);
        jPanel1.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 638, 12));

        jLabel1.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        jLabel1.setText("Loading...");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 450));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      FlatMacLightLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OpeningWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
