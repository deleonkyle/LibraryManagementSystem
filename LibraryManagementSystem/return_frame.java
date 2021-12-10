/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication2;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author kris
 */
public class return_frame extends javax.swing.JFrame {
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    static String StudentID, BookID;
    
    public return_frame() {
        setIcon();
        initComponents();
        conn = DBConnect.ConnecrDb();
        StudentID = "";
        BookID = "";
        jlblDate.setText( new SimpleDateFormat("dd / MM / yyyy").format(new Date()) );
        setTitle("Return Book");
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxtStudentID = new javax.swing.JTextField();
        jtxtName = new javax.swing.JTextField();
        jtxtGuardian = new javax.swing.JTextField();
        jtxtCourse = new javax.swing.JTextField();
        jtxtCampus = new javax.swing.JTextField();
        jtxtSemester = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jtxtBookID = new javax.swing.JTextField();
        jtxtTitle = new javax.swing.JTextField();
        jtxtEdition = new javax.swing.JTextField();
        jtxtAuthor = new javax.swing.JTextField();
        jtxtBookYear = new javax.swing.JTextField();
        jtxtStock = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jtxtYear = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jlblDate = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(1, 30, 117));
        jPanel1.setForeground(new java.awt.Color(255, 204, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 209, 18));
        jLabel1.setText("Student ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 130, 25));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 2, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 209, 18));
        jLabel2.setText("Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 110, 25));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 2, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 209, 18));
        jLabel3.setText("Guardian");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 130, 25));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 2, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 209, 18));
        jLabel4.setText("Course");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 110, 25));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 2, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 209, 18));
        jLabel5.setText("Campus");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 150, 25));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 2, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 209, 18));
        jLabel6.setText("Year");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 100, 30));

        jtxtStudentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtStudentIDActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtStudentID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 170, 30));

        jtxtName.setEditable(false);
        jtxtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNameActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 170, 30));

        jtxtGuardian.setEditable(false);
        jtxtGuardian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtGuardianActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtGuardian, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 170, 30));

        jtxtCourse.setEditable(false);
        jtxtCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCourseActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 170, 30));

        jtxtCampus.setEditable(false);
        jtxtCampus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCampusActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtCampus, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 170, 30));

        jtxtSemester.setEditable(false);
        jtxtSemester.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtSemesterActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtSemester, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 170, 30));

        jButton1.setBackground(new java.awt.Color(255, 209, 18));
        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 204, 153));
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\kris\\Downloads\\icons8-search-bar-48.png")); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 51, 27));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 2, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 209, 18));
        jLabel7.setText("Book ID");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 110, 30));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 2, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 209, 18));
        jLabel8.setText("Title");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 110, 30));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 2, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 209, 18));
        jLabel9.setText("Edition");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 110, 30));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 2, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 209, 18));
        jLabel10.setText("Author");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 120, 30));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 2, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 209, 18));
        jLabel11.setText("Year");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 90, 25));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 2, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 209, 18));
        jLabel12.setText("Stock");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 90, 25));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 2, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 209, 18));
        jLabel14.setText("Return Date");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 150, 30));

        jtxtBookID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtBookIDActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtBookID, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 170, 30));

        jtxtTitle.setEditable(false);
        jtxtTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtTitleActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, 170, 30));

        jtxtEdition.setEditable(false);
        jtxtEdition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtEditionActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtEdition, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 170, 30));

        jtxtAuthor.setEditable(false);
        jtxtAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtAuthorActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 170, 30));

        jtxtBookYear.setEditable(false);
        jtxtBookYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtBookYearActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtBookYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, 170, 30));

        jtxtStock.setEditable(false);
        jtxtStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtStockActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, 170, 30));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 3, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 209, 18));
        jLabel15.setText("Return Book...");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 260, 40));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 2, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 209, 18));
        jLabel16.setText("Semester");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 120, 25));

        jtxtYear.setEditable(false);
        jtxtYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtYearActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 170, 30));

        jButton4.setBackground(new java.awt.Color(255, 209, 18));
        jButton4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 204, 153));
        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\kris\\Downloads\\icons8-search-bar-48.png")); // NOI18N
        jButton4.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 110, 51, 27));

        jlblDate.setFont(new java.awt.Font("Century Gothic", 2, 24)); // NOI18N
        jlblDate.setForeground(new java.awt.Color(255, 204, 153));
        jlblDate.setText("------------------------");
        jPanel1.add(jlblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 410, 250, 30));

        jButton3.setBackground(new java.awt.Color(255, 209, 18));
        jButton3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 4, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/5597034(1).png"))); // NOI18N
        jButton3.setText("Return Book");
        jButton3.setBorder(null);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setInheritsPopupMenu(true);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 230, 70));

        jButton5.setBackground(new java.awt.Color(255, 209, 18));
        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\kris\\Downloads\\back-black-square-interface-button-symbol.png")); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 38, 38));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 861, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtStudentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtStudentIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtStudentIDActionPerformed

    private void jtxtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtNameActionPerformed

    private void jtxtGuardianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtGuardianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtGuardianActionPerformed

    private void jtxtCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCourseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCourseActionPerformed

    private void jtxtCampusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCampusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCampusActionPerformed

    private void jtxtSemesterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtSemesterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtSemesterActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    if ( jtxtStudentID.getText().isEmpty() ){
            JOptionPane.showMessageDialog(null, "The fields cannot be left blank.", "Message" , JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            
            try{
                ResultSet rs;
                PreparedStatement ps = conn.prepareStatement("select * from student where StudentID = ?; ");
                ps.setString(1,jtxtStudentID.getText());
                rs = ps.executeQuery();
                
                while(true){
                    if (rs.next()){
                        StudentID = rs.getString("StudentID");
                        jtxtName.setText( rs.getString("Name") );
                        jtxtGuardian.setText( rs.getString("Guardian") );
                        jtxtCourse.setText( rs.getString("Course") );
                        jtxtCampus.setText( rs.getString("Campus") );
                        jtxtYear.setText( rs.getString("Year") );
                        jtxtSemester.setText( rs.getString("Semester") );
                        break;    
                    }
                    else{
                        jtxtName.setText("");
                        jtxtGuardian.setText( "" );
                        jtxtCourse.setText( "" );
                        jtxtCampus.setText( "" );
                        jtxtYear.setText( "" );
                        jtxtSemester.setText( "" );
                        JOptionPane.showMessageDialog(null, "StudentID does not Exist.", "Message" , JOptionPane.INFORMATION_MESSAGE);
                        jtxtStudentID.setText("");
                        break;
                    }
                }
           
            } catch(Exception e) {e.printStackTrace();}
            
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtxtBookIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtBookIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtBookIDActionPerformed

    private void jtxtTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtTitleActionPerformed

    private void jtxtEditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtEditionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtEditionActionPerformed

    private void jtxtAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtAuthorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtAuthorActionPerformed

    private void jtxtBookYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtBookYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtBookYearActionPerformed

    private void jtxtStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtStockActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         if ( jtxtStudentID.getText().isEmpty() || jtxtBookID.getText().isEmpty() ){
            JOptionPane.showMessageDialog(null, "The fields cannot be left blank.", "Message" , JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            try{
                String date = new SimpleDateFormat("yyMMdd").format(new Date());
                
                PreparedStatement ps = conn.prepareStatement("update record set ReturnDate=? where StudentID=? and BookID=?; ");
                ps.setString(1, date);
                ps.setString(2, StudentID);
                ps.setString(3, BookID);
                ps.execute();                
                ps = conn.prepareStatement("update book set Stock = Stock+1 where BookID = ?; ");
                ps.setString(1, BookID);
                ps.execute();
                
                JOptionPane.showMessageDialog(null, "Book Returned Successfully.", "Message" , JOptionPane.INFORMATION_MESSAGE); 
            }
            catch(Exception e) { 
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage(), "Message" , JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jtxtYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtYearActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         if ( jtxtBookID.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "The fields cannot be left blank.", "Message" , JOptionPane.INFORMATION_MESSAGE);
         }
        else{
             try{
                ResultSet rs;
                PreparedStatement ps = conn.prepareStatement("select * from book where BookID=?; ");
                ps.setString(1, jtxtBookID.getText());
                rs = ps.executeQuery();
                
                while(true){
                    if (rs.next()){
                        BookID = rs.getString("BookID");
                        jtxtTitle.setText( rs.getString("Title") );
                        jtxtEdition.setText( rs.getString("Edition") );
                        jtxtAuthor.setText( rs.getString("Author") );
                        jtxtBookYear.setText( rs.getString("Year") );
                        jtxtStock.setText( rs.getString("Stock") );
                        
                        break;    
                    }
                    else{
                        jtxtTitle.setText("");
                        jtxtEdition.setText("");
                        jtxtAuthor.setText("");
                        jtxtBookYear.setText("");
                        jtxtStock.setText("");
                        JOptionPane.showMessageDialog(null, "BookID does not Exist.", "Message" , JOptionPane.INFORMATION_MESSAGE);
                        jtxtBookID.setText("");
                        break;
                    }
                }
             
            } catch(Exception e) {e.printStackTrace();}
    }                 
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        main_frame ob = new main_frame();
        ob.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(return_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(return_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(return_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(return_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new return_frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlblDate;
    private javax.swing.JTextField jtxtAuthor;
    private javax.swing.JTextField jtxtBookID;
    private javax.swing.JTextField jtxtBookYear;
    private javax.swing.JTextField jtxtCampus;
    private javax.swing.JTextField jtxtCourse;
    private javax.swing.JTextField jtxtEdition;
    private javax.swing.JTextField jtxtGuardian;
    private javax.swing.JTextField jtxtName;
    private javax.swing.JTextField jtxtSemester;
    private javax.swing.JTextField jtxtStock;
    private javax.swing.JTextField jtxtStudentID;
    private javax.swing.JTextField jtxtTitle;
    private javax.swing.JTextField jtxtYear;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("return.png")));
    }
}
