package jdbcgui;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.*;

public class ViewLog extends javax.swing.JFrame {

    myDBCon dbCon;
    ResultSet rs;

    JTextField[] txtUserID;
    JTextField[] txtUsername;
    JTextField[] txtAction;
    JTextField[] txtTime;

    int pageNumber = 1;
    /**
     * Creates new form ViewLog
     */
    public ViewLog() {
        initComponents();

        // center form in screen 
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new java.awt.Color(238,242,243));

        txtUserID = new JTextField[]{txtUserID1, txtUserID2, txtUserID3, txtUserID4, txtUserID5};
        txtUsername = new JTextField[]{txtUsername1, txtUsername2, txtUsername3, txtUsername4, txtUsername5};
        txtAction = new JTextField[]{txtAction1, txtAction2, txtAction3, txtAction4, txtAction5};
        txtTime = new JTextField[]{txtTime1, txtTime2, txtTime3, txtTime4, txtTime5};

        dbCon = new myDBCon();
        getNewData();
    }

    private void getNewData() {

        try {

            rs = dbCon.executeStatement("SELECT * FROM log ORDER BY time ASC");

            int i = 0;
            
            while (i < 5 && rs.next()) {
                populateFields(i);
                i++;
            }
            
            txtPageNumber.setText(Integer.toString(pageNumber));
            
            EnableDisableButtons();

        } catch (SQLException e) {
            javax.swing.JLabel label = new javax.swing.JLabel("SQL Error - Display selected logs.");
            label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
            JOptionPane.showMessageDialog(null, label, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated bactiony the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtAction1 = new javax.swing.JTextField();
        txtUsername1 = new javax.swing.JTextField();
        btnNext = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtTime1 = new javax.swing.JTextField();
        txtUserID1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtUserID2 = new javax.swing.JTextField();
        txtUserID3 = new javax.swing.JTextField();
        txtUserID4 = new javax.swing.JTextField();
        txtUserID5 = new javax.swing.JTextField();
        txtUsername2 = new javax.swing.JTextField();
        txtUsername3 = new javax.swing.JTextField();
        txtUsername4 = new javax.swing.JTextField();
        txtUsername5 = new javax.swing.JTextField();
        txtAction2 = new javax.swing.JTextField();
        txtAction3 = new javax.swing.JTextField();
        txtAction4 = new javax.swing.JTextField();
        txtAction5 = new javax.swing.JTextField();
        txtTime2 = new javax.swing.JTextField();
        txtTime3 = new javax.swing.JTextField();
        txtTime4 = new javax.swing.JTextField();
        txtTime5 = new javax.swing.JTextField();
        txtPageNumber = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Logs");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Logs");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("USERNAME");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("ACTION");

        txtAction1.setEditable(false);
        txtAction1.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N

        txtUsername1.setEditable(false);
        txtUsername1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnNext.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        btnNext.setText("Next >>");
        btnNext.setFocusPainted(false);
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnPrevious.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        btnPrevious.setText("<< Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Time");

        txtTime1.setEditable(false);
        txtTime1.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N

        txtUserID1.setEditable(false);
        txtUserID1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("USERID");

        txtUserID2.setEditable(false);
        txtUserID2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtUserID3.setEditable(false);
        txtUserID3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtUserID4.setEditable(false);
        txtUserID4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtUserID5.setEditable(false);
        txtUserID5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtUsername2.setEditable(false);
        txtUsername2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtUsername3.setEditable(false);
        txtUsername3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtUsername4.setEditable(false);
        txtUsername4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtUsername5.setEditable(false);
        txtUsername5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtAction2.setEditable(false);
        txtAction2.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N

        txtAction3.setEditable(false);
        txtAction3.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N

        txtAction4.setEditable(false);
        txtAction4.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N

        txtAction5.setEditable(false);
        txtAction5.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N

        txtTime2.setEditable(false);
        txtTime2.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N

        txtTime3.setEditable(false);
        txtTime3.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N

        txtTime4.setEditable(false);
        txtTime4.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N

        txtTime5.setEditable(false);
        txtTime5.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N

        txtPageNumber.setEditable(false);
        txtPageNumber.setBackground(new java.awt.Color(238, 242, 243));
        txtPageNumber.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPageNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPageNumber.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnPrevious)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPageNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(322, 322, 322)
                                .addComponent(btnNext))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtUserID1)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtUserID2)
                                    .addComponent(txtUserID3)
                                    .addComponent(txtUserID4)
                                    .addComponent(txtUserID5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtUsername3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtAction3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtUsername2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtAction2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtUsername5, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtAction5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtUsername4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtAction4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtUsername1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(txtAction1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(txtTime1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTime2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTime3, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTime4, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTime5, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(48, 48, 48))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsername1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAction1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTime1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUserID1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserID2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAction2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTime2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserID3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAction3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTime3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserID4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAction4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTime4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserID5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAction5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTime5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrevious)
                    .addComponent(btnNext)
                    .addComponent(txtPageNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void populateFields(int i) {
        try {

            txtUserID[i].setText(rs.getString("userid"));
            txtUsername[i].setText(rs.getString("username"));
            txtAction[i].setText(rs.getString("action"));
            txtTime[i].setText(rs.getString("time"));

        } catch (SQLException ex) {
            Logger.getLogger(ViewLog.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void MoveNext() {
        try {
            pageNumber += 1;
            clearTextFields();
            int i = 0;
            
            rs.absolute(pageNumber * 5 - 5);
            
            while (i < 5 && rs.next()) {
                populateFields(i);
                i++;
            }
            
            txtPageNumber.setText(Integer.toString(pageNumber));
            
            EnableDisableButtons();
        } catch (SQLException ex) {
            Logger.getLogger(ViewLog.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        MoveNext();
    }//GEN-LAST:event_btnNextActionPerformed

    private void MovePrevious() {
        try {
            pageNumber -= 1;
            clearTextFields();
            int i = 0;
            
            rs.absolute(pageNumber * 5 - 5);

            while (i < 5 && rs.next()) {
                populateFields(i);
                i++;
            }
            
            txtPageNumber.setText(Integer.toString(pageNumber));
            
            EnableDisableButtons();
        } catch (SQLException ex) {
            Logger.getLogger(ViewLog.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void EnableDisableButtons() {
        try {
            if (rs.isBeforeFirst() || pageNumber == 1) {
                btnPrevious.setEnabled(false);
            } else {
                btnPrevious.setEnabled(true);
            }

            if (!rs.next()) {
                btnNext.setEnabled(false);
            } else {
                btnNext.setEnabled(true);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ViewLog.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void clearTextFields() {
        for (int i = 0; i < 5; i++) {
            txtUserID[i].setText("");
            txtUsername[i].setText("");
            txtAction[i].setText("");
            txtTime[i].setText("");
        }
    }

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        MovePrevious();
    }//GEN-LAST:event_btnPreviousActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtAction1;
    private javax.swing.JTextField txtAction2;
    private javax.swing.JTextField txtAction3;
    private javax.swing.JTextField txtAction4;
    private javax.swing.JTextField txtAction5;
    private javax.swing.JTextField txtPageNumber;
    private javax.swing.JTextField txtTime1;
    private javax.swing.JTextField txtTime2;
    private javax.swing.JTextField txtTime3;
    private javax.swing.JTextField txtTime4;
    private javax.swing.JTextField txtTime5;
    private javax.swing.JTextField txtUserID1;
    private javax.swing.JTextField txtUserID2;
    private javax.swing.JTextField txtUserID3;
    private javax.swing.JTextField txtUserID4;
    private javax.swing.JTextField txtUserID5;
    private javax.swing.JTextField txtUsername1;
    private javax.swing.JTextField txtUsername2;
    private javax.swing.JTextField txtUsername3;
    private javax.swing.JTextField txtUsername4;
    private javax.swing.JTextField txtUsername5;
    // End of variables declaration//GEN-END:variables
}
