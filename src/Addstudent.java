
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prajwal
 */
public class Addstudent extends javax.swing.JFrame {

    /**
     * Creates new form Addstudent
     */
    public Addstudent() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size =  toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2, size.height/2-getHeight()/2);
    }
    
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public void fillcombobox(){
        try
        {
        Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testattendance","root","");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"No Connection");
        }
        String sql = "select * from subject";
        
        try{
            
            pst = (PreparedStatement) conn.prepareStatement(sql);
            rs = (ResultSet) pst.executeQuery();
            while(rs.next())
            {
                String sub = rs.getString("subjectname");
                jComboBox11.addItem(sub);
                jComboBox55.addItem(sub);
                jComboBox22.addItem(sub);
                jComboBox44.addItem(sub);
                jComboBox33.addItem(sub);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
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

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBox11 = new javax.swing.JComboBox();
        jComboBox55 = new javax.swing.JComboBox();
        jComboBox22 = new javax.swing.JComboBox();
        jComboBox44 = new javax.swing.JComboBox();
        jComboBox33 = new javax.swing.JComboBox();
        l2 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Name");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setEditable(false);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Roll No.");

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Add Student Info");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel5.setText("Semester");

        jComboBox11.setMinimumSize(new java.awt.Dimension(30, 20));
        jComboBox11.setPreferredSize(new java.awt.Dimension(30, 20));
        jComboBox11.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox11PopupMenuWillBecomeInvisible(evt);
            }
        });

        jComboBox55.setMinimumSize(new java.awt.Dimension(30, 20));
        jComboBox55.setPreferredSize(new java.awt.Dimension(30, 20));
        jComboBox55.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox55PopupMenuWillBecomeInvisible(evt);
            }
        });

        jComboBox22.setMinimumSize(new java.awt.Dimension(30, 20));
        jComboBox22.setPreferredSize(new java.awt.Dimension(30, 20));
        jComboBox22.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox22PopupMenuWillBecomeInvisible(evt);
            }
        });

        jComboBox44.setMinimumSize(new java.awt.Dimension(30, 20));
        jComboBox44.setPreferredSize(new java.awt.Dimension(30, 20));
        jComboBox44.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox44PopupMenuWillBecomeInvisible(evt);
            }
        });

        jComboBox33.setMinimumSize(new java.awt.Dimension(30, 20));
        jComboBox33.setPreferredSize(new java.awt.Dimension(30, 20));
        jComboBox33.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox33PopupMenuWillBecomeInvisible(evt);
            }
        });

        l2.setText("subject2");

        l1.setText("subject1");

        l3.setText("subject3");

        l4.setText("subject4");

        l5.setText("subject5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(205, 205, 205)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(231, 231, 231)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(125, 125, 125)
                                .addComponent(jButton2))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(232, 232, 232)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(l1)
                                .addGap(18, 18, 18)
                                .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(jComboBox22, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox33, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox44, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox55, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l5))
                .addGap(48, 48, 48))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jComboBox11, jComboBox22, jComboBox33, jComboBox44, jComboBox55, l1, l2, l3, l4, l5});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l5)
                    .addComponent(l4)
                    .addComponent(l3)
                    .addComponent(l1))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(35, 35, 35))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jComboBox11, jComboBox22, jComboBox33, jComboBox44, jComboBox55, l1, l2, l3, l4, l5});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        fillcombobox();
        try
        {
        Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testattendance","root","");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"No Connection");
        }
        String sql = "select max(idstudent)+1 from student";
        
        try{
            
            pst = (PreparedStatement) conn.prepareStatement(sql);
            rs = (ResultSet) pst.executeQuery();
            while(rs.next())
            {
                String sub = rs.getString(1);
                jTextField2.setText(sub);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e+"oho");
        }
        
        
    }//GEN-LAST:event_formWindowOpened

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Addinfoform f2 = new Addinfoform();
        f2.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox11PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox11PopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        
        String tmp = (String)jComboBox11.getSelectedItem();
        String sql = "select * from subject where subjectname = ?";
        
        try{
            
            pst = (PreparedStatement) conn.prepareStatement(sql);
            pst.setString(1, tmp);
            rs = (ResultSet) pst.executeQuery();
            if(rs.next())
            {
                String id = rs.getString("subjectid");
                l1.setText(id);
            }
        }catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_jComboBox11PopupMenuWillBecomeInvisible

    private void jComboBox22PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox22PopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        
        String tmp = (String)jComboBox22.getSelectedItem();
        String sql = "select * from subject where subjectname = ?";
        
        try{
            
            pst = (PreparedStatement) conn.prepareStatement(sql);
            pst.setString(1, tmp);
            rs = (ResultSet) pst.executeQuery();
            if(rs.next())
            {
                String id = rs.getString("subjectid");
                l2.setText(id);
            }
        }catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_jComboBox22PopupMenuWillBecomeInvisible

    private void jComboBox33PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox33PopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        
        String tmp = (String)jComboBox33.getSelectedItem();
        String sql = "select * from subject where subjectname = ?";
        
        try{
            
            pst = (PreparedStatement) conn.prepareStatement(sql);
            pst.setString(1, tmp);
            rs = (ResultSet) pst.executeQuery();
            if(rs.next())
            {
                String id = rs.getString("subjectid");
                l3.setText(id);
            }
        }catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_jComboBox33PopupMenuWillBecomeInvisible

    private void jComboBox44PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox44PopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        
        String tmp = (String)jComboBox44.getSelectedItem();
        String sql = "select * from subject where subjectname = ?";
        
        try{
            
            pst = (PreparedStatement) conn.prepareStatement(sql);
            pst.setString(1, tmp);
            rs = (ResultSet) pst.executeQuery();
            if(rs.next())
            {
                String id = rs.getString("subjectid");
                l4.setText(id);
            }
        }catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_jComboBox44PopupMenuWillBecomeInvisible

    private void jComboBox55PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox55PopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        
        String tmp = (String)jComboBox55.getSelectedItem();
        String sql = "select * from subject where subjectname = ?";
        
        try{
            
            pst = (PreparedStatement) conn.prepareStatement(sql);
            pst.setString(1, tmp);
            rs = (ResultSet) pst.executeQuery();
            if(rs.next())
            {
                String id = rs.getString("subjectid");
                l5.setText(id);
            }
        }catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_jComboBox55PopupMenuWillBecomeInvisible

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
         try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testattendance","root","");
            String sql = "insert into student (idstudent,studentname, dept,semester, subject_subjectid) values(?,?,?,?,?)";
            pst = (PreparedStatement) conn.prepareStatement(sql);
            pst.setString(1,jTextField2.getText());
            pst.setString(2, jTextField1.getText());
            pst.setString(4,jTextField3.getText());
            pst.setString(3,"Computer");
            pst.setString(5,l1.getText());
           // System.out.println(l1.getText());
            pst.execute();
            //JOptionPane.showMessageDialog(null, "Saved");

        } catch (Exception e ) {
            System.out.println("no");
            JOptionPane.showMessageDialog(null, e);
        }
         
         try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testattendance","root","");
            String sql = "insert into student (idstudent,studentname, dept,semester, subject_subjectid) values(?,?,?,?,?)";
            pst = (PreparedStatement) conn.prepareStatement(sql);
            pst.setString(1,jTextField2.getText());
            pst.setString(2, jTextField1.getText());
            pst.setString(4,jTextField3.getText());
            pst.setString(3,"Computer");
            pst.setString(5,l2.getText());
            //System.out.println(l1.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Saved");

        } catch (Exception e ) {
            System.out.println("no");
            //JOptionPane.showMessageDialog(null, e);
        }
         
         
         try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testattendance","root","");
            String sql = "insert into student (idstudent,studentname, dept,semester, subject_subjectid) values(?,?,?,?,?)";
            pst = (PreparedStatement) conn.prepareStatement(sql);
            pst.setString(1,jTextField2.getText());
            pst.setString(2, jTextField1.getText());
            pst.setString(4,jTextField3.getText());
            pst.setString(3,"Computer");
            pst.setString(5,l3.getText());
            //System.out.println(l1.getText());
            pst.execute();
            //JOptionPane.showMessageDialog(null, "Saved");

        } catch (Exception e ) {
            System.out.println("no");
            JOptionPane.showMessageDialog(null, e);
        }
         
         
         
         try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testattendance","root","");
            String sql = "insert into student (idstudent,studentname, dept,semester, subject_subjectid) values(?,?,?,?,?)";
            pst = (PreparedStatement) conn.prepareStatement(sql);
            pst.setString(1,jTextField2.getText());
            pst.setString(2, jTextField1.getText());
            pst.setString(4,jTextField3.getText());
            pst.setString(3,"Computer");
            pst.setString(5,l4.getText());
            //System.out.println(l1.getText());
            pst.execute();
            //JOptionPane.showMessageDialog(null, "Saved");

        } catch (Exception e ) {
            System.out.println("no");
            JOptionPane.showMessageDialog(null, e);
        }
         
         
         
         try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testattendance","root","");
            String sql = "insert into student (idstudent,studentname, dept,semester, subject_subjectid) values(?,?,?,?,?)";
            pst = (PreparedStatement) conn.prepareStatement(sql);
            pst.setString(1,jTextField2.getText());
            pst.setString(2, jTextField1.getText());
            pst.setString(4,jTextField3.getText());
            pst.setString(3,"Computer");
            pst.setString(5,l5.getText());
            //System.out.println(l1.getText());
            pst.execute();
            int op = JOptionPane.showConfirmDialog(null,"Student entry done. Next Student","Saved",0);
            if(op==0){
                Addstudent f3 = new Addstudent();
                f3.setVisible(true);
                dispose();
            }
            else
                if(op==0){
                Addinfoform f3 = new Addinfoform();
                f3.setVisible(true);
                dispose();
            }
                
        } catch (Exception e ) {
            System.out.println("no");
            JOptionPane.showMessageDialog(null, e);
        }
         
         
         
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Addstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Addstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Addstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Addstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Addstudent().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox11;
    private javax.swing.JComboBox jComboBox22;
    private javax.swing.JComboBox jComboBox33;
    private javax.swing.JComboBox jComboBox44;
    private javax.swing.JComboBox jComboBox55;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    // End of variables declaration//GEN-END:variables
}
