/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APP;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author VIVEK
 */
public class AddItem extends javax.swing.JFrame {

    /**
     * Creates new form AddItem
     */
    public void showData()
    {
         DBconnect DBcon=new DBconnect();  
         Connection conn=DBcon.connect();
         if(conn==null)
         {
         // System.out.println("conn not estabish");
           JOptionPane.showMessageDialog(AddItem.this,"Data Base Connection Failed \n");
          //this.setVisible(false);
          this.dispose();
         }
         String query="SELECT * FROM items";
        try {
           
            PreparedStatement stm=conn.prepareStatement(query);
            ResultSet rs=stm.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs)); 
                conn.close();   
        } catch (SQLException ex) {
            
            System.out.println("query not prepare");
        }
        
        

    }
    public void cleartextfield()
    {
        tfgst.setText("");
        tfitemname.setText("");
        tfprice.setText("");
    }
    public AddItem() {
        initComponents();
          showData();

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
        jLabel2 = new javax.swing.JLabel();
        tfSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        tfitemname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfprice = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfgst = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        lblitemnamerrore = new javax.swing.JLabel();
        lblpriceerror = new javax.swing.JLabel();
        lblgsterror = new javax.swing.JLabel();
        btnrefresh = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ADD ITEM TO DATABASE");
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("DataBase");

        jLabel2.setText("Search Item Name :");

        tfSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfSearchKeyReleased(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "                        Item Name", "           Price", "           GST %"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setFillsViewportHeight(true);
        jTable1.getTableHeader().setResizingAllowed(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTable1KeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(400);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(150);
        }

        tfitemname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfitemnameActionPerformed(evt);
            }
        });
        tfitemname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfitemnameKeyReleased(evt);
            }
        });

        jLabel3.setText("Enter Item Name :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("ADD Item");

        jLabel5.setText("Price in Rupees : ");

        tfprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfpriceActionPerformed(evt);
            }
        });
        tfprice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfpriceKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfpriceKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfpriceKeyTyped(evt);
            }
        });

        jLabel6.setText("GST %");

        tfgst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfgstActionPerformed(evt);
            }
        });
        tfgst.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfgstKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfgstKeyReleased(evt);
            }
        });

        jButton1.setText("ADD  ITEM ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblitemnamerrore.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblitemnamerrore.setForeground(new java.awt.Color(255, 0, 0));

        lblpriceerror.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblpriceerror.setForeground(new java.awt.Color(255, 0, 0));

        lblgsterror.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblgsterror.setForeground(new java.awt.Color(255, 0, 0));

        btnrefresh.setText("Refresh");
        btnrefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrefreshActionPerformed(evt);
            }
        });

        btndelete.setText("DELETE");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(364, 364, 364)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btndelete))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfitemname, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblitemnamerrore, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfgst, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                                    .addComponent(tfprice))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblpriceerror, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblgsterror, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(50, 50, 50)
                                        .addComponent(jButton1))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnrefresh)
                                .addGap(10, 10, 10)))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnrefresh))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btndelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tfitemname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblitemnamerrore, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tfprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblpriceerror, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(tfgst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1))
                    .addComponent(lblgsterror, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfitemnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfitemnameActionPerformed
               
// TODO add your handling code here:
    }//GEN-LAST:event_tfitemnameActionPerformed

    private void tfpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfpriceActionPerformed
       
                    
// TODO add your handling code here:
    }//GEN-LAST:event_tfpriceActionPerformed

    private void tfgstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfgstActionPerformed
        
  
// TODO add your handling code here:
    }//GEN-LAST:event_tfgstActionPerformed
    public boolean checkItemExist(String name)
    {
         boolean result=false;
          DBconnect bd=new DBconnect();
            Connection rcon =bd.connect();
            if(rcon==null)
         {
         // System.out.println("conn not estabish");
           JOptionPane.showMessageDialog(AddItem.this,"Data Base Connection Failed \n");
          //this.setVisible(false);
          this.dispose();
         }
            
            String query="SELECT * FROM `items` WHERE 	itemname= ?";
            try {
               PreparedStatement pst=null;
               PreparedStatement preparedStmt = rcon.prepareStatement(query);
               preparedStmt.setString (1, name);

              ResultSet res=preparedStmt.executeQuery(); 
              if(res.next())
              {
                  result=true;
              }
               
               rcon.close();   
             } catch (SQLException ex) {
                 JOptionPane.showMessageDialog(AddItem.this, "Something Error");
                 
             }
              
            
     return result;
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(tfitemname.getText().trim().isEmpty())
         {
           lblitemnamerrore.setText("Enter Item Name");
            tfitemname.setText("");
            tfitemname.grabFocus();
            return;
         }
        else if(tfprice.getText().trim().isEmpty())
         {
            lblpriceerror.setText("Enter Price");
            tfprice.setText("");
            tfprice.grabFocus();
            return;
         }
        else if(tfgst.getText().trim().isEmpty())
         {
                        lblgsterror.setText("Enter GST");
         
            tfgst.setText("");
            tfgst.grabFocus();
            return;
         }
        else{
           lblgsterror.setText("");
           lblitemnamerrore.setText("");
           lblpriceerror.setText("");
           DBconnect DBcon=new DBconnect();  
           Connection rcon=DBcon.connect();
           if(rcon==null)
         {
         // System.out.println("conn not estabish");
           JOptionPane.showMessageDialog(AddItem.this,"Data Base Connection Failed \n");
          //this.setVisible(false);
          this.dispose();
         }
           
           String item=tfitemname.getText();
           String price=tfprice.getText();
           String gst=tfgst.getText();
           if(!checkItemExist(item)){
           
          String query="INSERT INTO `items`(`itemname`, `price`, `GST`) VALUES (?,?,?)";
           try {
               PreparedStatement pst=null;
               PreparedStatement preparedStmt = rcon.prepareStatement(query);
              //preparedStmt.setInt (1, 112);
              preparedStmt.setString (1, item);
              preparedStmt.setString (2, price);
              preparedStmt.setString (3, gst);
              preparedStmt.execute(); 
              rcon.close();   
   
             } catch (SQLException ex) {
                 JOptionPane.showMessageDialog(AddItem.this, "Data not inserted");
               return;
             }
                 JOptionPane.showMessageDialog(AddItem.this, "Data  inserted");
                 cleartextfield();
                showData();
        } 
           else{
               JOptionPane.showMessageDialog(AddItem.this, "This Item is already exist in database");
           }
        }
               
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void tfpriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfpriceKeyPressed
      if(tfitemname.getText().trim().isEmpty())
         {
           lblitemnamerrore.setText("Enter Item Name");
            tfitemname.setText("");
            tfitemname.grabFocus();
            return;
         }
      lblitemnamerrore.setText("");
            
                 
// TODO add your handling code here:
    }//GEN-LAST:event_tfpriceKeyPressed

    private void tfgstKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfgstKeyPressed
     // TODO add your handling code here:
    }//GEN-LAST:event_tfgstKeyPressed

    private void tfpriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfpriceKeyTyped
     
        // TODO add your handling code here:
    }//GEN-LAST:event_tfpriceKeyTyped

    private void tfpriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfpriceKeyReleased
     String str = tfprice.getText();
            //check if int
       //check if float
    try{
        Float.parseFloat(str);
        lblpriceerror.setText("");
    }catch(NumberFormatException e){
      tfprice.setText("");        
          lblpriceerror.setText("Enter only price");   
//not float
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_tfpriceKeyReleased

    private void tfgstKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfgstKeyReleased
           String str=tfgst.getText();
        try{
        Float.parseFloat(str);
        lblgsterror.setText("");
    }catch(NumberFormatException e){
         tfgst.setText(""); 
         lblgsterror.setText("Enter only gst");
   //not float
    }    
      
        // TODO add your handling code here:
    }//GEN-LAST:event_tfgstKeyReleased

    private void tfitemnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfitemnameKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tfitemnameKeyReleased

    private void btnrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrefreshActionPerformed
         showData();        // TODO add your handling code here:
    }//GEN-LAST:event_btnrefreshActionPerformed

    private void jTable1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyTyped
         //showData();
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1KeyTyped

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
         
         
         // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
                 if(jTable1.getSelectedRow()==-1)
         {
             JOptionPane.showMessageDialog(AddItem.this,"Select any Row to delete...");
             return;
         }
                 else{
            DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
            int index=jTable1.getSelectedRow();
            String name=model.getValueAt(index, 0).toString();
            DBconnect bd=new DBconnect();
            Connection rcon =bd.connect();
            if(rcon==null)
         {
         // System.out.println("conn not estabish");
           JOptionPane.showMessageDialog(AddItem.this,"Data Base Connection Failed \n");
          //this.setVisible(false);
             this.dispose();
         }
            String query="DELETE FROM `items` WHERE itemname = ? ";
            int x=JOptionPane.showConfirmDialog(AddItem.this, "Are you sure to Delete Data of \n"+name,"Delete item "+name, JOptionPane.YES_NO_OPTION);  
             if(x ==0 ){
             
             try {
               PreparedStatement pst=null;
               PreparedStatement preparedStmt = rcon.prepareStatement(query);
              //preparedStmt.setInt (1, 112);
              preparedStmt.setString (1, name);
             
              preparedStmt.executeUpdate(); 
              rcon.close();   
   
             } catch (SQLException ex) {
                 JOptionPane.showMessageDialog(AddItem.this, "Data not Deleted");
               return;
             }
                             JOptionPane.showMessageDialog(AddItem.this, "Data about\n "+name +" \nDeleted ");  
                             showData();
                     
                 }
             
             
             }
            
     //    model.removeRow(jTable1.getSelectedRow());

           // TODO add your handling code here:
    }//GEN-LAST:event_btndeleteActionPerformed

    private void tfSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSearchKeyReleased
          String name=tfSearch.getText().trim();
          showDataofSearch(name);
          
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSearchKeyReleased

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
       jTable1.clearSelection();
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

     public void showDataofSearch(String name)
    {
         DBconnect DBcon=new DBconnect();  
         Connection conn=DBcon.connect();
         if(conn==null)
         {
         // System.out.println("conn not estabish");
           JOptionPane.showMessageDialog(AddItem.this,"Data Base Connection Failed \n");
          //this.setVisible(false);
          this.dispose();
         }
         String query="SELECT * FROM items where itemname like ?";
        try {
           
            PreparedStatement stm=conn.prepareStatement(query);
            stm.setString(1, name+"%");
            ResultSet rs=stm.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs)); 
                conn.close();   
        } catch (SQLException ex) {
            System.out.println("query not prepare");
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
            java.util.logging.Logger.getLogger(AddItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddItem().setVisible(true);
            }
        });
           
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnrefresh;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblgsterror;
    private javax.swing.JLabel lblitemnamerrore;
    private javax.swing.JLabel lblpriceerror;
    private javax.swing.JTextField tfSearch;
    private javax.swing.JTextField tfgst;
    private javax.swing.JTextField tfitemname;
    private javax.swing.JTextField tfprice;
    // End of variables declaration//GEN-END:variables
}