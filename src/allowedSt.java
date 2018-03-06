
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nalinka Heshan
 */
public class allowedSt extends javax.swing.JFrame {

    public static ArrayList<String>myBookName=new ArrayList();
    public static ArrayList<Integer> myBookId=new ArrayList();
    public allowedSt() {
        initComponents();
        setResizable(false);
        allName.setText(Login.userName);
        settingTable2();
    }
    void settingTable2(){
        try {
            Connection conLib = DBConnection.getConnection();
            Statement stLib = DBConnection.getStatement();
            String sqlLib ="SELECT * FROM books";
            ResultSet rsLib= stLib.executeQuery(sqlLib);
            
             DefaultTableModel mdLib = (DefaultTableModel) showTb.getModel();
            while(rsLib.next()){
                String avl="yes";
                String bookID=Integer.toString(rsLib.getInt("ID_no"));
                if("yes".equalsIgnoreCase(rsLib.getString("Availability"))){
                    mdLib.addRow(new Object[]{bookID,rsLib.getString("Name"),avl});
                }
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Library.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }
    String checkBookByID(int Id){
        try {
            DBConnection conCheck = new DBConnection();
            String sqlcheck ="SELECT Name FROM books WHERE ID_no=?";
            PreparedStatement pr = conCheck.getPrStatement(sqlcheck);
            pr.setInt(1, Id);
            ResultSet r=pr.executeQuery();
            while(r.next()){
                return r.getString("Name");
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(allowedSt.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        return"";
    }
    void readTableValue(){
        for(int i =0 ;i<4;i++){
            
            int currentBookId=(int) getTb.getModel().getValueAt(i, 1);
            if(getTb.getModel().getValueAt(i, 1)==null){
                
            } 
            else {
                String n=checkBookByID(currentBookId);
                getTb.setValueAt((Object)n, i, 0);
                myBookName.add(n);
                myBookId.add(currentBookId);
               
            }
            
            
        }
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        allName = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        getlogout = new javax.swing.JButton();
        getHome = new javax.swing.JButton();
        getBooks = new javax.swing.JButton();
        checkSub = new javax.swing.JButton();
        getSubmit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        getTb = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        showTb = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/myaccount2.jpg"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 4));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user2.png"))); // NOI18N

        allName.setFont(new java.awt.Font("Cooper Black", 3, 18)); // NOI18N
        allName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        getlogout.setFont(new java.awt.Font("Cooper Black", 3, 18)); // NOI18N
        getlogout.setText("Logout");
        getlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getlogoutActionPerformed(evt);
            }
        });

        getHome.setFont(new java.awt.Font("Cooper Black", 3, 18)); // NOI18N
        getHome.setText("Home");
        getHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getHomeActionPerformed(evt);
            }
        });

        getBooks.setFont(new java.awt.Font("Cooper Black", 3, 18)); // NOI18N
        getBooks.setText("Get book");

        checkSub.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        checkSub.setText("Check");
        checkSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkSubActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(getHome, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(getlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(getBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(checkSub, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(getlogout, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                        .addComponent(getHome, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                    .addComponent(checkSub, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getBooks, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getSubmit.setFont(new java.awt.Font("Cooper Black", 3, 18)); // NOI18N
        getSubmit.setText("Submit");
        getSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getSubmitActionPerformed(evt);
            }
        });

        getTb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(getTb);

        showTb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Available"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(showTb);

        jLabel3.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        jLabel3.setText("Check the correctness before submission\n\n ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(allName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(42, 42, 42)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(getSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(allName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(getSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setBounds(600, 100, 893, 847);
    }// </editor-fold>//GEN-END:initComponents

    private void getHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getHomeActionPerformed
        Home h2 = new Home();
        h2.main();
        setVisible(false);
    }//GEN-LAST:event_getHomeActionPerformed

    private void getlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getlogoutActionPerformed
        Login l3 = new Login();
        l3.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_getlogoutActionPerformed

    private void checkSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkSubActionPerformed
        readTableValue();
    }//GEN-LAST:event_checkSubActionPerformed

    private void getSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getSubmitActionPerformed
        
        try {
            String sql1="UPDATE books SET Availability = ? WHERE ID_no = ?";
            String sql2="INSERT INTO borrow(St_ID,books,No_Of_Books,getDate,returnDate) VALUES(?,?,?,?,?)";
            String sql3="INSERT INTO gotbooks(BookID,STID,getDate,returnDate) VALUES(?,?,?,?)";
            
            DBConnection myCon = new DBConnection();
            
            int lenght = myBookId.size();
            
            DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
            Date dt = new Date();
            String gDate= df.format(dt);
            String rDate=addDate(14);
            
            String mybooks=String.join(",", myBookName);
            PreparedStatement pr2 = myCon.getPrStatement(sql2);
            pr2.setInt(1, Login.userID);
            pr2.setString(2, mybooks);
            pr2.setInt(3, lenght);
            pr2.setString(4, gDate);
            pr2.setString(5, rDate);
            
            pr2.executeUpdate();
            
            for(int i = 0; i<lenght;i++){
                PreparedStatement pr1 = myCon.getPrStatement(sql1);
                pr1.setString(1, "no");
                pr1.setInt(2, myBookId.get(i));
                
                pr1.executeUpdate();
                
                PreparedStatement pr3 = myCon.getPrStatement(sql3);
                pr3.setInt(1, myBookId.get(i));
                pr3.setInt(2, Login.userID);
                pr3.setString(3, gDate);
                pr3.setString(4, rDate);
                
                pr3.executeUpdate();
            }
            JOptionPane.showMessageDialog(null, "Your request has been updated.");
            Home hh = new Home();
            hh.main();
            dispose();
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(allowedSt.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_getSubmitActionPerformed
    String addDate(int n){
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        Calendar cl = Calendar.getInstance();
        cl.add(Calendar.DATE, n);
        
        return df.format(cl.getTime());
    }
    /**
     * @param args the command line arguments
     */
    public static void main4(){
         try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
               /* if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }*/UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(allowedSt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(allowedSt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(allowedSt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(allowedSt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new allowedSt().setVisible(true);
            }
        });
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
               /* if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }*/UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(allowedSt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(allowedSt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(allowedSt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(allowedSt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new allowedSt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel allName;
    private javax.swing.JButton checkSub;
    private javax.swing.JButton getBooks;
    private javax.swing.JButton getHome;
    private javax.swing.JButton getSubmit;
    private javax.swing.JTable getTb;
    private javax.swing.JButton getlogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable showTb;
    // End of variables declaration//GEN-END:variables
}