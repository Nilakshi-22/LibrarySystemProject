package book;

import connection.MySQL;
import java.awt.Color;
import java.awt.Font;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class Publisher extends javax.swing.JDialog {

    BookRegistation br;
    
    public Publisher(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        loadPublisher();
        Components();
        br = (BookRegistation)parent;
    }

    private void loadPublisher() {

        try {

            ResultSet resultSet = MySQL.executeSearch("SELECT * FROM `publisher`");

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);

            while (resultSet.next()) {

                Vector<String> vector = new Vector<>();
                vector.add(resultSet.getString("id"));
                vector.add(resultSet.getString("publisher"));
                model.addRow(vector);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(157, 189, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/book/publisher.png"))); // NOI18N
        jLabel1.setText("jLabel8");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 64, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Publisher");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 131, 40));

        jLabel3.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel3.setText("Publisher : ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 80, 30));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 211, 30));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 153));
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 104, 31));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Publisher ID", "Publisher Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 570, 252));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/all/cross.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 20));

        jButton2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jButton2.setText("Clean");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 80, 31));

        jButton3.setBackground(new java.awt.Color(0, 0, 153));
        jButton3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Add");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 104, 31));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       clear();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    String publisher = jTextField1.getText();
    
        if (publisher.isBlank()) {
            jTextField1.putClientProperty("JComponent.outline", "error");
            JOptionPane.showMessageDialog(this, "Please enter publisher name.", "Warning", JOptionPane.WARNING_MESSAGE);
        }else {
        
            try {
                
                ResultSet resultSet = MySQL.executeSearch("SELECT * FROM `publisher` WHERE `publisher`= '" + publisher + "'");
                
                if (resultSet.next()) {
                    jTextField1.putClientProperty("JComponent.outline", "error");
                    JOptionPane.showMessageDialog(this, "This publisher name has already been registered.", "Warning", JOptionPane.WARNING_MESSAGE);
                    
                } else {
                    MySQL.executeINUPDE("INSERT INTO `publisher`(`publisher`) VALUES('" + publisher + "')");
                    loadPublisher();
                    clear();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.getSelectedRow();

        jButton3.setEnabled(false);
        jTextField1.setText(String.valueOf(jTable1.getValueAt(row, 1)));
       
        if (evt.getClickCount()==2) {
            
            String Publisher = String.valueOf(jTable1.getValueAt(row, 1));
            
            br.setPublisher(Publisher);
            this.dispose();
            br.setPublisherId(String.valueOf(jTable1.getValueAt(row, 0)));            
            
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       int row = jTable1.getSelectedRow();
       
       if (row == -1){
       JOptionPane.showMessageDialog(this, "Select a Publisher for updating.", "Warning", JOptionPane.WARNING_MESSAGE);
       } else {
       
           try {
             
               String selectedId = String.valueOf(jTable1.getValueAt(row, 0));
               String selectedPublisher = String.valueOf(jTable1.getValueAt(row, 1));
           
               String publisher = jTextField1.getText();
               
               if (publisher.isEmpty()) {
                   jTextField1.putClientProperty("JComponent.outline", "error");
                   JOptionPane.showMessageDialog(this, "Please enter publisher name.", "Warning", JOptionPane.WARNING_MESSAGE);
               }else if(selectedPublisher.equals(publisher)){
                   jTextField1.putClientProperty("JComponent.outline", "error");
                   JOptionPane.showMessageDialog(this, "This publisher name has already been registered..", "Warning", JOptionPane.WARNING_MESSAGE);
                   
               }else{
                       
                       ResultSet resultSet = MySQL.executeSearch("SELECT * FROM `publisher` WHERE (`publisher`= '"+publisher+"' AND `id`!= '"+selectedId+"') ");
                     
                       if (resultSet.next()) {
                         JOptionPane.showMessageDialog(this, "This publisher name has already been registered..", "Warning", JOptionPane.WARNING_MESSAGE);
                          
                       }else{
                       
                           MySQL.executeINUPDE("UPDATE `publisher` SET `publisher`='"+publisher+"' WHERE `id`='"+selectedId+"'");
                           loadPublisher();
                           clear();
                       
                   }
               }
               
           } catch (Exception e) {
          e.printStackTrace();
           }
           
           
       }
    }//GEN-LAST:event_jButton1ActionPerformed


    public static void main(String args[]) {
       
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Publisher dialog = new Publisher(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    private void clear() {
        jTable1.clearSelection();
        jTextField1.setText("");
        jTextField1.putClientProperty("JComponent.outline", "null");
        jButton3.setEnabled(true);        
    }
    
    private void Components(){
        
        JTableHeader header = jTable1.getTableHeader();
        header.setBackground(new Color(51,102,255));
        header.setForeground(Color.white);
        header.setFont(new Font("Poppins Medium",Font.CENTER_BASELINE,12));
        
    }
}
