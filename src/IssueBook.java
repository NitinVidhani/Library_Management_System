
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class IssueBook extends javax.swing.JFrame {

    /**
     * Creates new form IssueBook
     */
    public IssueBook() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnIssueBook = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblIssueBook = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblBookNo = new javax.swing.JLabel();
        lblScontact = new javax.swing.JLabel();
        lblSname = new javax.swing.JLabel();
        lblSid = new javax.swing.JLabel();
        txtBookNo = new javax.swing.JTextField();
        txtSid = new javax.swing.JTextField();
        txtSname = new javax.swing.JTextField();
        txtScontact = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnIssueBook.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnIssueBook.setText("Issue Book");
        btnIssueBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIssueBookActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblIssueBook.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        lblIssueBook.setText("Issue Book");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Note: Please check Student ID Carefully before issueing book!");

        lblBookNo.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblBookNo.setText("Book Call No:");

        lblScontact.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblScontact.setText("Student Contact:");

        lblSname.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblSname.setText("Student name:");

        lblSid.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblSid.setText("Student id:");

        txtBookNo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtBookNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBookNoActionPerformed(evt);
            }
        });

        txtSid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSidActionPerformed(evt);
            }
        });

        txtSname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSnameActionPerformed(evt);
            }
        });

        txtScontact.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtScontact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtScontactActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(lblIssueBook))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblSname, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblScontact)
                                    .addComponent(lblSid, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblBookNo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtBookNo, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSid, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSname, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtScontact, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnIssueBook)
                        .addGap(163, 163, 163))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblIssueBook)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBookNo)
                    .addComponent(txtBookNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSid)
                    .addComponent(txtSid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSname)
                    .addComponent(txtSname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblScontact)
                    .addComponent(txtScontact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(btnIssueBook, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIssueBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIssueBookActionPerformed
        String bookNo = txtBookNo.getText().toLowerCase().trim();
        String Sid = txtSid.getText().toLowerCase().trim();
        String Sname = txtSname.getText().trim().toLowerCase();
        String Scontact = txtScontact.getText().toLowerCase().trim();
        String date = new Date().toString().toLowerCase().trim();
        String sql = String.format("insert into issuedbooks values('%s','%s','%s','%s','%s')",bookNo,Sid,Sname,Scontact,date);
        String sql1 = String.format("select * from books where callNo = '%s'",bookNo);
        try
        {
            ResultSet rs = DB.executeQuery(sql1);

            int quantityUpdated = 0;
            int rowAffected = 0;
            int issuedUpdated;
            if(rs.next())
            {
                int quantity = rs.getInt("quantity");
                if(quantity > 0)
                {
                    rowAffected = DB.executeUpdate(sql);
                    quantityUpdated = DB.executeUpdate(String.format("update books set quantity = quantity-1 where callno = '%s'",bookNo));
                    issuedUpdated = DB.executeUpdate(String.format("update books set issued = issued+1 where callno = '%s'",bookNo));
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Quantity is not sufficient");
                }
                if(rowAffected > 0 && quantityUpdated >0)
                {
                    JOptionPane.showMessageDialog(null,"Book issued successfully!");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Book Not Found!");
            }
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage());
            ex.printStackTrace();
        }
        new LibrarianSection().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnIssueBookActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new LibrarianSection().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtBookNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBookNoActionPerformed
        txtSid.grabFocus();
    }//GEN-LAST:event_txtBookNoActionPerformed

    private void txtSidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSidActionPerformed
        txtSname.grabFocus();
    }//GEN-LAST:event_txtSidActionPerformed

    private void txtSnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSnameActionPerformed
        txtScontact.grabFocus();
    }//GEN-LAST:event_txtSnameActionPerformed

    private void txtScontactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtScontactActionPerformed
        btnIssueBookActionPerformed(evt);
    }//GEN-LAST:event_txtScontactActionPerformed

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
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IssueBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnIssueBook;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblBookNo;
    private javax.swing.JLabel lblIssueBook;
    private javax.swing.JLabel lblScontact;
    private javax.swing.JLabel lblSid;
    private javax.swing.JLabel lblSname;
    private javax.swing.JTextField txtBookNo;
    private javax.swing.JTextField txtScontact;
    private javax.swing.JTextField txtSid;
    private javax.swing.JTextField txtSname;
    // End of variables declaration//GEN-END:variables
}