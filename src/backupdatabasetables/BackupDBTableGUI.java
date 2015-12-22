
package backupdatabasetables;

/**
 * BackupDBTables
 * This project creates backup tables of the tables in a database.
 * 
 * @Author     Carlos Igreja
 * @CreatedOn  December 21, 2015
 */
public class BackupDBTableGUI extends javax.swing.JFrame {

    /**
     * Creates new form BackupDBTableGUI
     */
    public BackupDBTableGUI() {
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

        labelHost = new javax.swing.JLabel();
        labelDatabase = new javax.swing.JLabel();
        labelUsername = new javax.swing.JLabel();
        labelPassword = new javax.swing.JLabel();
        labelTablename = new javax.swing.JLabel();
        labelBackupTablename = new javax.swing.JLabel();
        textFieldBackupTablename = new javax.swing.JTextField();
        textFieldTablename = new javax.swing.JTextField();
        textFieldHost = new javax.swing.JTextField();
        textFieldPassword = new javax.swing.JTextField();
        textFieldUsername = new javax.swing.JTextField();
        textFieldDatabase = new javax.swing.JTextField();
        labelHeaderDatabaseTableBackupTool = new javax.swing.JLabel();
        BtnSubmit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelHost.setText("Host");

        labelDatabase.setText("Database");

        labelUsername.setText("Username");

        labelPassword.setText("Password");

        labelTablename.setText("Table name");

        labelBackupTablename.setText("Backup Table name");

        textFieldBackupTablename.setText("table name of backup copy");

        textFieldTablename.setText("table name in database");

        textFieldHost.setText("enter host");
        textFieldHost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldHostActionPerformed(evt);
            }
        });

        textFieldPassword.setText("enter password");

        textFieldUsername.setText("enter username");

        textFieldDatabase.setText("enter database name");

        labelHeaderDatabaseTableBackupTool.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelHeaderDatabaseTableBackupTool.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelHeaderDatabaseTableBackupTool.setText("Database Table Backup Tool");

        BtnSubmit.setText("Submit");
        BtnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelHeaderDatabaseTableBackupTool, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelBackupTablename)
                                    .addComponent(labelTablename)
                                    .addComponent(labelPassword)
                                    .addComponent(labelUsername)
                                    .addComponent(labelDatabase)
                                    .addComponent(labelHost))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textFieldUsername)
                                    .addComponent(textFieldPassword)
                                    .addComponent(textFieldTablename)
                                    .addComponent(textFieldBackupTablename)
                                    .addComponent(textFieldHost)
                                    .addComponent(textFieldDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(BtnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelHeaderDatabaseTableBackupTool, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelHost)
                    .addComponent(textFieldHost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDatabase)
                    .addComponent(textFieldDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUsername)
                    .addComponent(textFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPassword)
                    .addComponent(textFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTablename)
                    .addComponent(textFieldTablename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBackupTablename)
                    .addComponent(textFieldBackupTablename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(BtnSubmit)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSubmitActionPerformed
        
        // get user input
        String host = textFieldHost.getText();
        String database = textFieldDatabase.getText();
        String username = textFieldUsername.getText();
        String password = textFieldPassword.getText();
        String tableName = textFieldTablename.getText();
        String backupTableName = textFieldBackupTablename.getText();
        
        // create BackupDBTables object with parameters to create a connection
        BackupDBTables backupDBTables = new BackupDBTables(host, database, username, password, this);
        
        // test connection
        if(backupDBTables.getConnection() != null){
            backupDBTables.backupTable(tableName, backupTableName);
        }
    }//GEN-LAST:event_BtnSubmitActionPerformed

    private void textFieldHostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldHostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldHostActionPerformed

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
            java.util.logging.Logger.getLogger(BackupDBTableGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BackupDBTableGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BackupDBTableGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BackupDBTableGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BackupDBTableGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnSubmit;
    private javax.swing.JLabel labelBackupTablename;
    private javax.swing.JLabel labelDatabase;
    private javax.swing.JLabel labelHeaderDatabaseTableBackupTool;
    private javax.swing.JLabel labelHost;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelTablename;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JTextField textFieldBackupTablename;
    private javax.swing.JTextField textFieldDatabase;
    private javax.swing.JTextField textFieldHost;
    private javax.swing.JTextField textFieldPassword;
    private javax.swing.JTextField textFieldTablename;
    private javax.swing.JTextField textFieldUsername;
    // End of variables declaration//GEN-END:variables
}
