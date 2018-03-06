
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;
import javax.swing.UIManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nalinka Heshan
 */
public class Login extends javax.swing.JFrame {

    //connection variable
    Connection con = null;
    Statement st = null;
    
    //Basic user parameters    
    public static String userName;
    String userPassword;
    public static int userID;
    
    
    //timer
    int a;
    Timer t;
    
    public Login() {
        initComponents();
        setResizable(false);
        try {
            con = DBConnection.getConnection();
             st = DBConnection.getStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        loginJpanel = new javax.swing.JPanel();
        loginshow = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        logpasswordlb = new javax.swing.JLabel();
        logusertxt = new javax.swing.JTextField();
        loguserlb = new javax.swing.JLabel();
        logpasswordtxt = new javax.swing.JPasswordField();
        logsignup = new javax.swing.JButton();
        loglogin = new javax.swing.JButton();
        logforgetlb = new javax.swing.JLabel();
        jerror = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loginJpanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 2, true));

        loginshow.setFont(new java.awt.Font("DinaminaUniWeb", 1, 24)); // NOI18N
        loginshow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/loginImage.jpg"))); // NOI18N

        javax.swing.GroupLayout loginJpanelLayout = new javax.swing.GroupLayout(loginJpanel);
        loginJpanel.setLayout(loginJpanelLayout);
        loginJpanelLayout.setHorizontalGroup(
            loginJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginJpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginshow, javax.swing.GroupLayout.PREFERRED_SIZE, 580, Short.MAX_VALUE)
                .addContainerGap())
        );
        loginJpanelLayout.setVerticalGroup(
            loginJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginJpanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginshow, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );

        logpasswordlb.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        logpasswordlb.setText("Password");

        logusertxt.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        loguserlb.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        loguserlb.setText("User Name");

        logpasswordtxt.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        logpasswordtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                logpasswordtxtKeyReleased(evt);
            }
        });

        logsignup.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        logsignup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/signup1.png"))); // NOI18N
        logsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logsignupActionPerformed(evt);
            }
        });

        loglogin.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        loglogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/login2.png"))); // NOI18N
        loglogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logloginActionPerformed(evt);
            }
        });
        loglogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                logloginKeyPressed(evt);
            }
        });

        logforgetlb.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        logforgetlb.setText("        Forget your password?");

        jerror.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jerror.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jerror, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(logpasswordlb, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(37, 37, 37)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(logsignup, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(loglogin, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(logusertxt)
                                    .addComponent(logpasswordtxt, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE))))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(168, 168, 168)
                            .addComponent(logforgetlb, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(125, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(loguserlb, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(458, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(logusertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logpasswordlb, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logpasswordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logsignup)
                    .addComponent(loglogin))
                .addGap(18, 18, 18)
                .addComponent(logforgetlb, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jerror, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(60, 60, 60)
                    .addComponent(loguserlb, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(344, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginJpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginJpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setBounds(600, 100, 628, 839);
    }// </editor-fold>//GEN-END:initComponents

    private void logsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logsignupActionPerformed
        _signUp sp = new _signUp();
        sp.main3();
        setVisible(false);
    }//GEN-LAST:event_logsignupActionPerformed

    private void logloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logloginActionPerformed
        jerror.setText("");
        String getname =logusertxt.getText().toLowerCase();
        String getpassword=logpasswordtxt.getText();
        
        DBConnection newcon = new DBConnection();
        try {
            String user = newcon.getPassword(getname);
            String[] get = user.split(",");
            userPassword=get[0];
            userID=Integer.parseInt(get[1]);
            
            if(userPassword.equalsIgnoreCase(getpassword)){
                System.out.println("you are in");
                userName=getname;
                setVisible(false);
                Loading ld = new Loading();
                ld.main();
                
                t = new Timer(10,new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        a++;       
                        if(a>100){
                               t.stop();
                               Home hm = new Home();
                               hm.main();
                        }
                    }
                            });
                t.start();
 
            }
            else{
                jerror.setText("   Loggin Error...!!!");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_logloginActionPerformed

    private void logloginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_logloginKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            jerror.setText("");
        String getname =logusertxt.getText().toLowerCase();
        String getpassword=logpasswordtxt.getText();
        
        DBConnection newcon = new DBConnection();
        try {
            String user = newcon.getPassword(getname);
            String[] get = user.split(",");
            userPassword=get[0];
            userID=Integer.parseInt(get[1]);
            
            if(userPassword.equalsIgnoreCase(getpassword)){
                System.out.println("you are in");
                setVisible(false);
                Loading ld = new Loading();
                ld.main();
                
                t = new Timer(10,new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        a++;       
                        if(a>100){
                               t.stop();
                               Home hm = new Home();
                               hm.main();
                        }
                    }
                            });
                t.start();
 
            }
            else{
                jerror.setText("   Loggin Error...!!!");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
    }//GEN-LAST:event_logloginKeyPressed

    private void logpasswordtxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_logpasswordtxtKeyReleased
if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            jerror.setText("");
        String getname =logusertxt.getText().toLowerCase();
        String getpassword=logpasswordtxt.getText();
        
        DBConnection newcon = new DBConnection();
        try {
            String user = newcon.getPassword(getname);
            String[] get = user.split(",");
            userPassword=get[0];
            userID=Integer.parseInt(get[1]);
            
            if(userPassword.equalsIgnoreCase(getpassword)){
                System.out.println("you are in");
                setVisible(false);
                Loading ld = new Loading();
                ld.main();
                
                t = new Timer(10,new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        a++;       
                        if(a>100){
                               t.stop();
                               Home hm = new Home();
                               hm.main();
                        }
                    }
                            });
                t.start();
 
            }
            else{
                jerror.setText("   Loggin Error...!!!");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }                        }//GEN-LAST:event_logpasswordtxtKeyReleased

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
                /*if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }*/ UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jerror;
    private javax.swing.JLabel logforgetlb;
    public javax.swing.JPanel loginJpanel;
    public javax.swing.JLabel loginshow;
    private javax.swing.JButton loglogin;
    private javax.swing.JLabel logpasswordlb;
    private javax.swing.JPasswordField logpasswordtxt;
    private javax.swing.JButton logsignup;
    private javax.swing.JLabel loguserlb;
    private javax.swing.JTextField logusertxt;
    // End of variables declaration//GEN-END:variables
}
