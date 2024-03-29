package com.mycompany.feessystem;

import java.util.Date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;



public class FeesSystem extends javax.swing.JFrame {
    
    private static final String DB_URL = "jdbc:mysql://localhost:3306/fees_receipt_system";
    private static final String DB_USER = "chai";
    private static final String DB_PASSWORD = "chai@54";
    /**
     * Creates new form FeesSystem
     */
    public FeesSystem() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        rollno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        feeamt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cb = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        yearofstudy = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel1.setText("Fees Receipt System");

        rollno.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        rollno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rollnoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jLabel3.setText("Enter Father name :");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jLabel4.setText("Enter Student's Name : ");

        name.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jLabel5.setText("Enter Student's Roll no : ");

        feeamt.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        feeamt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feeamtActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jLabel6.setText("Enter Fee amount :");

        fname.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jLabel7.setText("Enter Course & Branch :");

        cb.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jLabel8.setText("Enter Year of Study :");

        yearofstudy.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        yearofstudy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearofstudyActionPerformed(evt);
            }
        });

        area.setColumns(20);
        area.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        area.setRows(5);
        jScrollPane1.setViewportView(area);

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton1.setText("Generate Receipt");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton3.setText("Print");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        
        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton4.setText("Transaction History");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(feeamt, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yearofstudy, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rollno, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(479, 479, 479))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(19, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(rollno, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(cb, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(yearofstudy, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(feeamt, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65))))
        );

        pack();
    }// </editor-fold>                        

    private void rollnoActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
    }                                    

    private void feeamtActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        validateAndSetFeeAmount();
    } 

    private void validateAndSetFeeAmount() {
    // Get the entered text from the feeamt JTextField
    String feeAmountText = feeamt.getText();

    // Validate if the entered text is a valid number
    if (isNumeric(feeAmountText)) {
        // Set the valid fee amount
        // You may also format or process the amount as needed
        feeamt.setText(feeAmountText);

        // Now you can save to the database since it's a valid number
        saveToDatabase();
    } else {
        // Display an error message and clear the JTextField
        JOptionPane.showMessageDialog(this, "Please enter a valid numeric amount.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
        feeamt.setText("");
    }
}

    private boolean isNumeric(String str) {
        // Check if the given string is a valid numeric value
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }   
    
    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void cbActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
    }                                  

    private void yearofstudyActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        area.setText("");
        name.setText("");
        rollno.setText("");
        fname.setText("");
        cb.setText("");
        yearofstudy.setText("");
        feeamt.setText("");
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        try{
            area.print();
        }
        catch(Exception e){
       
        }
    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        if (name.getText().isEmpty() || rollno.getText().isEmpty() || fname.getText().isEmpty() ||
        cb.getText().isEmpty() || yearofstudy.getText().isEmpty() || feeamt.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Missing information. Please fill in all the required fields.", "Missing Information", JOptionPane.ERROR_MESSAGE);
        return;
    }
        
        area.setText("************************************\n");
        area.setText(area.getText()+"*       Fees Receipt System        *\n");
        area.setText(area.getText()+"************************************\n");
       
        Date obj = new Date();
       
        String date = obj.toString();
       
        area.setText(area.getText()+"\n"+date+"\n\n");
        area.setText(area.getText()+"Student Name : "+name.getText()+"\n\n");
        area.setText(area.getText()+"Roll No. : "+rollno.getText()+"\n\n");
        area.setText(area.getText()+"Father's Name : "+fname.getText()+"\n\n");
        area.setText(area.getText()+"Course & Branch : "+cb.getText()+"\n\n");
        area.setText(area.getText()+"Student's Year of Study : "+yearofstudy.getText()+"\n\n");
        area.setText(area.getText()+"Fee Amount : "+feeamt.getText()+"\n\n");
        area.setText(area.getText()+"\n                        Signature");
        
        validateAndSetFeeAmount();
        //saveToDatabase();
    }                      
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        // New button for transaction history
        String rollNumber = JOptionPane.showInputDialog(this, "Enter Roll Number:");
        if (rollNumber != null) {
            displayTransactionHistory(rollNumber);
        }
    }
    

    private void saveToDatabase() {
    try {
        // Open a connection
        Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

        // Check if all required fields are null
        if (rollno.getText() == null && name.getText() == null && fname.getText() == null &&
            cb.getText() == null && yearofstudy.getText() == null && feeamt.getText() == null) {
            JOptionPane.showMessageDialog(this, "No data entered. Please fill in the required fields.", "No Data Entered", JOptionPane.WARNING_MESSAGE);
            return; // Stop further processing if no data is entered
        }

        // Create a prepared statement
        String query = "INSERT INTO transactions (roll_no, student_name, father_name, course_branch, year_of_study, fee_amount, transaction_date) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            // Set values for prepared statement
            preparedStatement.setString(1, rollno.getText());
            preparedStatement.setString(2, name.getText());
            preparedStatement.setString(3, fname.getText());
            preparedStatement.setString(4, cb.getText());
            preparedStatement.setString(5, yearofstudy.getText());
            preparedStatement.setString(6, feeamt.getText());

            // Set the current date and time
            java.sql.Timestamp timestamp = new java.sql.Timestamp(new Date().getTime());
            preparedStatement.setTimestamp(7, timestamp);

            // Execute the query
            preparedStatement.executeUpdate();
        }
        // Close the connection
        connection.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
}


    
    private void displayTransactionHistory(String rollNumber) {
        try {
            // Open a connection
            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            // Create a prepared statement
            String query = "SELECT * FROM transactions WHERE roll_no=?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, rollNumber);

                // Execute the query
                ResultSet resultSet = preparedStatement.executeQuery();

                // Display the transaction history
                StringBuilder history = new StringBuilder();
                while (resultSet.next()) {
                    history.append("Date: ").append(resultSet.getTimestamp("transaction_date")).append("\n");
                    history.append("Student Name: ").append(resultSet.getString("student_name")).append("\n");
                    history.append("Fee Amount: ").append(resultSet.getString("fee_amount")).append("\n");
                    history.append("--------------------------------------\n");
                }

                // Display the transaction history in a dialog or text area
                JTextArea historyTextArea = new JTextArea(history.toString());
                historyTextArea.setEditable(false);
                JOptionPane.showMessageDialog(this, new JScrollPane(historyTextArea), "Transaction History", JOptionPane.PLAIN_MESSAGE);
            }

            // Close the connection
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
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
            java.util.logging.Logger.getLogger(FeesSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FeesSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FeesSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FeesSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FeesSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextArea area;
    private javax.swing.JTextField cb;
    private javax.swing.JTextField feeamt;
    private javax.swing.JTextField fname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField rollno;
    private javax.swing.JTextField yearofstudy;
    // End of variables declaration                   
}
