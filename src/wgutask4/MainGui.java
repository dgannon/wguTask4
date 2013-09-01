/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wgutask4;

/**
 *
 * @author DuGannon
 */
public class MainGui extends javax.swing.JFrame {

    /**
     * Creates new form MainGui
     */
    public MainGui() {
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

        buttonGroupPartUnderGradFlag = new javax.swing.ButtonGroup();
        jLabelTitle = new javax.swing.JLabel();
        jLabelStudentID = new javax.swing.JLabel();
        jLabelFirstName = new javax.swing.JLabel();
        jLabelLastName = new javax.swing.JLabel();
        jLabelGpa = new javax.swing.JLabel();
        jLabelStatus = new javax.swing.JLabel();
        jTextFieldStudentId = new javax.swing.JTextField();
        jTextFieldFirstName = new javax.swing.JTextField();
        jLabelMentor = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTextFieldGpa = new javax.swing.JTextField();
        jTextFieldLastName = new javax.swing.JTextField();
        jComboBoxStatus = new javax.swing.JComboBox();
        jTextFieldMentor = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jTextFieldCompany = new javax.swing.JTextField();
        jLabelCompany = new javax.swing.JLabel();
        jLabelLevel = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabelThesisTitle = new javax.swing.JLabel();
        jLabelThesisAdvisor = new javax.swing.JLabel();
        jTextFieldThesisTitle = new javax.swing.JTextField();
        jTextFieldThesisAdvisor = new javax.swing.JTextField();
        jButtonCreate = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonLookup = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jButtonClearAllFields = new javax.swing.JButton();
        jComboBoxLevel = new javax.swing.JComboBox();
        jRadioButtonPartTime = new javax.swing.JRadioButton();
        jRadioButtonUndergraduate = new javax.swing.JRadioButton();
        jRadioButtonGraduate = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelTitle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelTitle.setText("Dustin Gannon Student Records GUI");

        jLabelStudentID.setText("Student ID:");

        jLabelFirstName.setText("First Name:");

        jLabelLastName.setText("Last Name:");

        jLabelGpa.setText("GPA:");

        jLabelStatus.setText("Status:");

        jTextFieldStudentId.setToolTipText("Enter Student ID");

        jLabelMentor.setText("Mentor:");

        jComboBoxStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Resident", "Non Resident"  }));

        jLabelCompany.setText("Company:");

        jLabelLevel.setText("Level:");

        jLabelThesisTitle.setText("Thesis Title:");

        jLabelThesisAdvisor.setText("Thesis Advisor:");

        jButtonCreate.setText("Create");
        jButtonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateActionPerformed(evt);
            }
        });

        jButtonUpdate.setText("Update");

        jButtonLookup.setText("Lookup");
        jButtonLookup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLookupActionPerformed(evt);
            }
        });

        jButtonDelete.setText("Delete");

        jButtonClearAllFields.setText("Clear All Fields");
        jButtonClearAllFields.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearAllFieldsActionPerformed(evt);
            }
        });

        jComboBoxLevel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Freshman", "Sophmore", "Junior", "Senior" }));

        jRadioButtonPartTime.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButtonPartTime.setText("Part Time Student:");

        jRadioButtonUndergraduate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButtonUndergraduate.setText("Undergraduate Student:");

        jRadioButtonGraduate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButtonGraduate.setText("Graduate Student:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelStudentID)
                            .addComponent(jLabelFirstName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldFirstName)
                            .addComponent(jTextFieldStudentId)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelLastName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldLastName))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelGpa)
                        .addGap(40, 40, 40)
                        .addComponent(jTextFieldGpa))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelStatus)
                        .addGap(29, 29, 29)
                        .addComponent(jComboBoxStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelMentor)
                        .addGap(26, 26, 26)
                        .addComponent(jTextFieldMentor))
                    .addComponent(jSeparator2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonLookup)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCreate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDelete))
                    .addComponent(jSeparator4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonClearAllFields))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelThesisAdvisor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldThesisAdvisor))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelThesisTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldThesisTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelLevel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxLevel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jRadioButtonGraduate)
                    .addComponent(jRadioButtonPartTime)
                    .addComponent(jRadioButtonUndergraduate)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelCompany)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTitle)
                    .addComponent(jButtonClearAllFields))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelStudentID)
                    .addComponent(jTextFieldStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFirstName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLastName)
                    .addComponent(jTextFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGpa)
                    .addComponent(jTextFieldGpa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelStatus)
                    .addComponent(jComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMentor)
                    .addComponent(jTextFieldMentor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonPartTime)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCompany)
                    .addComponent(jTextFieldCompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonUndergraduate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLevel)
                    .addComponent(jComboBoxLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonGraduate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelThesisTitle)
                    .addComponent(jTextFieldThesisTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelThesisAdvisor)
                    .addComponent(jTextFieldThesisAdvisor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCreate)
                    .addComponent(jButtonUpdate)
                    .addComponent(jButtonLookup)
                    .addComponent(jButtonDelete))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonClearAllFieldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearAllFieldsActionPerformed
        this.clearFormValues();
    }//GEN-LAST:event_jButtonClearAllFieldsActionPerformed

    private void jButtonLookupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLookupActionPerformed
        
        // Clear Form from any previous data
        this.clearFormValues();
        
        // Create Modal Window to Prompt for Student ID
        LookupDialog studentLookupDialog = new LookupDialog(this, true);
        studentLookupDialog.setVisible(rootPaneCheckingEnabled);
        
        jTextFieldStudentId.setText(studentLookupDialog.getStudentIDEntered());
        
        // Create object from SQL Database Call
        Student studentRecord = new Parttime();
        studentRecord.query(Integer.parseInt(jTextFieldStudentId.getText()));
        
        this.setFormValues(studentRecord);
    }//GEN-LAST:event_jButtonLookupActionPerformed

    private void jButtonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateActionPerformed
        Student studentRecord = new Parttime();
    }//GEN-LAST:event_jButtonCreateActionPerformed

    private void setFormValues(Student s) {
        jTextFieldStudentId.setText(Integer.toString(s.getStudentId()));
        jTextFieldFirstName.setText(s.getFirstName());
        jTextFieldLastName.setText(s.getLastName());
        jTextFieldGpa.setText(Double.toString(s.getGpa()));
        jTextFieldMentor.setText(s.getMentor());
        jTextFieldCompany.setText("");
        jTextFieldThesisTitle.setText("");
        jTextFieldThesisAdvisor.setText("");
    }
    
    private void clearFormValues(){
        jTextFieldStudentId.setText("");
        jTextFieldFirstName.setText("");
        jTextFieldLastName.setText("");
        jTextFieldGpa.setText("");
        jTextFieldMentor.setText("");
        jTextFieldCompany.setText("");
        jTextFieldThesisTitle.setText("");
        jTextFieldThesisAdvisor.setText("");
        
        
        
        // TODO Add the code to blank the drop down boxes.
    }
    
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
            java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGui().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupPartUnderGradFlag;
    private javax.swing.JButton jButtonClearAllFields;
    private javax.swing.JButton jButtonCreate;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonLookup;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JComboBox jComboBoxLevel;
    private javax.swing.JComboBox jComboBoxStatus;
    private javax.swing.JLabel jLabelCompany;
    private javax.swing.JLabel jLabelFirstName;
    private javax.swing.JLabel jLabelGpa;
    private javax.swing.JLabel jLabelLastName;
    private javax.swing.JLabel jLabelLevel;
    private javax.swing.JLabel jLabelMentor;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JLabel jLabelStudentID;
    private javax.swing.JLabel jLabelThesisAdvisor;
    private javax.swing.JLabel jLabelThesisTitle;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JRadioButton jRadioButtonGraduate;
    private javax.swing.JRadioButton jRadioButtonPartTime;
    private javax.swing.JRadioButton jRadioButtonUndergraduate;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTextFieldCompany;
    private javax.swing.JTextField jTextFieldFirstName;
    private javax.swing.JTextField jTextFieldGpa;
    private javax.swing.JTextField jTextFieldLastName;
    private javax.swing.JTextField jTextFieldMentor;
    private javax.swing.JTextField jTextFieldStudentId;
    private javax.swing.JTextField jTextFieldThesisAdvisor;
    private javax.swing.JTextField jTextFieldThesisTitle;
    // End of variables declaration//GEN-END:variables
}
