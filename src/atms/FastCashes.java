/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package atms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class FastCashes extends javax.swing.JFrame {

    public FastCashes() {
        initComponents();
    }

    int MyAccNum;
        public FastCashes(int AccNum) {
        initComponents();
        MyAccNum = AccNum;
        //AccNumLbl.setText(""+ AccNum);
        GetBalance();
    }
        
    Connection Con = null; 
    PreparedStatement pst = null, pst1 = null;
    ResultSet Rs = null,Rs1=null;
    Statement St = null, St1= null;
    int OldBalance;
private void GetBalance()
    {
       
        String Query = "select * from accounttbl where AccNum = '"+MyAccNum+"' ";
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb" , "root","NiSa@826122");
            St1= Con.createStatement();
            Rs1=St1.executeQuery(Query);
            if(Rs1.next()){
              OldBalance = Rs1.getInt(9);
              BallLbl.setText("Rs"+OldBalance);
            }else{
                
            }
        }catch (Exception e ){
            JOptionPane.showMessageDialog(this, e); 
        }
    } 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Rs100BTN = new javax.swing.JButton();
        Rs500BTN = new javax.swing.JButton();
        Rs1000BTN = new javax.swing.JButton();
        Rs2000BTN = new javax.swing.JButton();
        Rs10000BTN = new javax.swing.JButton();
        Rs5000BTN = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        BallLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 51));

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setText("MY MONEY BANK");

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("X");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(226, 226, 226))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("MY MONEY BANK");

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 51));
        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nida Sarah\\Desktop\\ATM\\logout.png")); // NOI18N
        jLabel7.setText("LOGOUT");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        Rs100BTN.setBackground(new java.awt.Color(204, 204, 204));
        Rs100BTN.setFont(new java.awt.Font("MS UI Gothic", 0, 24)); // NOI18N
        Rs100BTN.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nida Sarah\\Desktop\\ATM\\coin.png")); // NOI18N
        Rs100BTN.setText("Rs 100");
        Rs100BTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Rs100BTNMouseClicked(evt);
            }
        });
        Rs100BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rs100BTNActionPerformed(evt);
            }
        });

        Rs500BTN.setBackground(new java.awt.Color(204, 204, 204));
        Rs500BTN.setFont(new java.awt.Font("MS UI Gothic", 0, 24)); // NOI18N
        Rs500BTN.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nida Sarah\\Desktop\\ATM\\coin.png")); // NOI18N
        Rs500BTN.setText("Rs 500");
        Rs500BTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Rs500BTNMouseClicked(evt);
            }
        });

        Rs1000BTN.setBackground(new java.awt.Color(204, 204, 204));
        Rs1000BTN.setFont(new java.awt.Font("MS UI Gothic", 0, 24)); // NOI18N
        Rs1000BTN.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nida Sarah\\Desktop\\ATM\\coin.png")); // NOI18N
        Rs1000BTN.setText("Rs 1000");
        Rs1000BTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Rs1000BTNMouseClicked(evt);
            }
        });
        Rs1000BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rs1000BTNActionPerformed(evt);
            }
        });

        Rs2000BTN.setBackground(new java.awt.Color(204, 204, 204));
        Rs2000BTN.setFont(new java.awt.Font("MS UI Gothic", 0, 24)); // NOI18N
        Rs2000BTN.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nida Sarah\\Desktop\\ATM\\coin.png")); // NOI18N
        Rs2000BTN.setText("Rs 2000");
        Rs2000BTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Rs2000BTNMouseClicked(evt);
            }
        });

        Rs10000BTN.setBackground(new java.awt.Color(204, 204, 204));
        Rs10000BTN.setFont(new java.awt.Font("MS UI Gothic", 0, 24)); // NOI18N
        Rs10000BTN.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nida Sarah\\Desktop\\ATM\\coin.png")); // NOI18N
        Rs10000BTN.setText("Rs 10000");
        Rs10000BTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Rs10000BTNMouseClicked(evt);
            }
        });

        Rs5000BTN.setBackground(new java.awt.Color(204, 204, 204));
        Rs5000BTN.setFont(new java.awt.Font("MS UI Gothic", 0, 24)); // NOI18N
        Rs5000BTN.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nida Sarah\\Desktop\\ATM\\coin.png")); // NOI18N
        Rs5000BTN.setText("Rs 5000");
        Rs5000BTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Rs5000BTNMouseClicked(evt);
            }
        });

        jLabel15.setBackground(new java.awt.Color(204, 204, 204));
        jLabel15.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 0, 51));
        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nida Sarah\\Desktop\\ATM\\fastcash.png")); // NOI18N
        jLabel15.setText("FAST CASH");

        BallLbl.setBackground(new java.awt.Color(204, 204, 204));
        BallLbl.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        BallLbl.setForeground(new java.awt.Color(51, 51, 51));
        BallLbl.setText("Balance");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Rs5000BTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Rs1000BTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Rs100BTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Rs2000BTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Rs500BTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Rs10000BTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(93, 93, 93))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(345, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BallLbl)
                        .addGap(48, 48, 48)))
                .addGap(290, 290, 290))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(323, 323, 323)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(180, 180, 180)))
                .addContainerGap(182, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Rs100BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Rs500BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Rs1000BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Rs2000BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BallLbl))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Rs10000BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Rs5000BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Rs1000BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rs1000BTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Rs1000BTNActionPerformed

    private void Rs100BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rs100BTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Rs100BTNActionPerformed

    private void Rs100BTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Rs100BTNMouseClicked
        if(OldBalance < 100)
                {
         JOptionPane.showMessageDialog(this, "Not Enough Balance");
    }
        else
        {
            try{
                String Query = "Update accounttbl set Balance = ? where AccNum=?";
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb" , "root","NiSa@826122");
                PreparedStatement ps = Con.prepareStatement(Query);
                ps.setInt(1, OldBalance - 100);
                 ps.setInt(2,MyAccNum);
                 if(ps.executeUpdate()== 1)
                 {
                   JOptionPane.showMessageDialog(this, "Balance Updated");
                   new MainMenu().setVisible(true);
                   this.dispose();
                 }else{
                     JOptionPane.showMessageDialog(this, "Missing Information");
                 }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,e);
            }
            
        }
    }//GEN-LAST:event_Rs100BTNMouseClicked

    private void Rs500BTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Rs500BTNMouseClicked
        if(OldBalance < 500)
                {
         JOptionPane.showMessageDialog(this, "Not Enough Balance");
    }
        else
        {
            try{
                String Query = "Update accounttbl set Balance = ? where AccNum=?";
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb" , "root","NiSa@826122");
                PreparedStatement ps = Con.prepareStatement(Query);
                ps.setInt(1, OldBalance - 500);
                 ps.setInt(2,MyAccNum);
                 if(ps.executeUpdate()== 1)
                 {
                   JOptionPane.showMessageDialog(this, "Balance Updated");
                   new MainMenu().setVisible(true);
                   this.dispose();
                 }else{
                     JOptionPane.showMessageDialog(this, "Missing Information");
                 }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,e);
            }
            
        }
    }//GEN-LAST:event_Rs500BTNMouseClicked

    private void Rs1000BTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Rs1000BTNMouseClicked
        if(OldBalance < 1000)
                {
         JOptionPane.showMessageDialog(this, "Not Enough Balance");
    }
        else
        {
            try{
                String Query = "Update accounttbl set Balance = ? where AccNum=?";
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb" , "root","NiSa@826122");
                PreparedStatement ps = Con.prepareStatement(Query);
                ps.setInt(1, OldBalance - 1000);
                 ps.setInt(2,MyAccNum);
                 if(ps.executeUpdate()== 1)
                 {
                   JOptionPane.showMessageDialog(this, "Balance Updated");
                   new MainMenu().setVisible(true);
                   this.dispose();
                 }else{
                     JOptionPane.showMessageDialog(this, "Missing Information");
                 }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,e);
            }
            
        }
    }//GEN-LAST:event_Rs1000BTNMouseClicked

    private void Rs2000BTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Rs2000BTNMouseClicked
        if(OldBalance < 2000)
                {
         JOptionPane.showMessageDialog(this, "Not Enough Balance");
    }
        else
        {
            try{
                String Query = "Update accounttbl set Balance = ? where AccNum=?";
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb" , "root","NiSa@826122");
                PreparedStatement ps = Con.prepareStatement(Query);
                ps.setInt(1, OldBalance - 2000);
                 ps.setInt(2,MyAccNum);
                 if(ps.executeUpdate()== 1)
                 {
                   JOptionPane.showMessageDialog(this, "Balance Updated");
                   new MainMenu().setVisible(true);
                   this.dispose();
                 }else{
                     JOptionPane.showMessageDialog(this, "Missing Information");
                 }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,e);
            }
            
        }
    }//GEN-LAST:event_Rs2000BTNMouseClicked

    private void Rs5000BTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Rs5000BTNMouseClicked
        if(OldBalance < 5000)
                {
         JOptionPane.showMessageDialog(this, "Not Enough Balance");
    }
        else
        {
            try{
                String Query = "Update accounttbl set Balance = ? where AccNum=?";
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb" , "root","NiSa@826122");
                PreparedStatement ps = Con.prepareStatement(Query);
                ps.setInt(1, OldBalance - 5000);
                 ps.setInt(2,MyAccNum);
                 if(ps.executeUpdate()== 1)
                 {
                   JOptionPane.showMessageDialog(this, "Balance Updated");
                   new MainMenu().setVisible(true);
                   this.dispose();
                 }else{
                     JOptionPane.showMessageDialog(this, "Missing Information");
                 }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,e);
            }
            
        }
    }//GEN-LAST:event_Rs5000BTNMouseClicked

    private void Rs10000BTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Rs10000BTNMouseClicked
        if(OldBalance < 10000)
                {
         JOptionPane.showMessageDialog(this, "Not Enough Balance");
    }
        else
        {
            try{
                String Query = "Update accounttbl set Balance = ? where AccNum=?";
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb" , "root","NiSa@826122");
                PreparedStatement ps = Con.prepareStatement(Query);
                ps.setInt(1, OldBalance - 10000);
                 ps.setInt(2,MyAccNum);
                 if(ps.executeUpdate()== 1)
                 {
                   JOptionPane.showMessageDialog(this, "Balance Updated");
                   new MainMenu().setVisible(true);
                   this.dispose();
                 }else{
                     JOptionPane.showMessageDialog(this, "Missing Information");
                 }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,e);
            }
            
        }
    }//GEN-LAST:event_Rs10000BTNMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        new MainMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        System.exit(1);
    }//GEN-LAST:event_jLabel5MouseClicked

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
            java.util.logging.Logger.getLogger(FastCashes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FastCashes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FastCashes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FastCashes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FastCashes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BallLbl;
    private javax.swing.JButton Rs10000BTN;
    private javax.swing.JButton Rs1000BTN;
    private javax.swing.JButton Rs100BTN;
    private javax.swing.JButton Rs2000BTN;
    private javax.swing.JButton Rs5000BTN;
    private javax.swing.JButton Rs500BTN;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
