/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package railwayatttendencemanagementsystem;
import java.awt.HeadlessException;
import java.sql.*;
import java.util.Arrays;
import javax.swing.JOptionPane;


/**
 *
 * @author ROHANRAJ
 */
public class AttendencePage extends javax.swing.JFrame {
    java.sql.Connection con;
    java.sql.Statement st,st1,st3,st2,st4;
    java.sql.ResultSet result,result1,result2,result3;
    java.sql.ResultSetMetaData resmetadata;
    int waste=1,no;
    String s1,s2,s3,s4,s5,s6,s7,s8,root="",source,destination;
    boolean temp;
    char[]arr = new char[26];
    int a=65;
    MyDb ob1;
    char source1,destination1;
    

    /**
     * Creates new form AttendencePage
     * @param var
     */
    public AttendencePage(String var) {
        
        
       initComponents();
       seatno1.setVisible(false);
       seatno2.setVisible(false);
       seatno3.setVisible(false);
       seatno4.setVisible(false);
       seatno5.setVisible(false);
       seatno6.setVisible(false);
       
       try{
           Class.forName("com.mysql.jdbc.Driver");
           con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/pamsystem","root","root");
           st = con.createStatement();
           st1 =  con.createStatement();
           st2 = con.createStatement();
           result1 = st1.executeQuery("SELECT count(pnr) FROM cp12155 where pnr = '"+ var +"'");
           result = st.executeQuery("SELECT * FROM cp12155 where pnr='"+var+"' ");
           result2 = st2.executeQuery("SELECT * FROM cp12155 where pnr='"+var+"' ");
           result1.next();
           no = result1.getInt(1);
                      

                      
           //resmetadata = result.getMetaData();
           //int noofcoloum = resmetadata.;
          while(result.next())
           {
           
           s1 = result.getString(1);
           pnrno.setText(s1);
           pnrno.setVisible(true);
           s2=result.getString(6);
           s3=result.getString(2);
           s4=result.getString(3);
           s5=result.getString(4);
           
           s6= s2+" ,\n"+s3+" ,\n"+s4+" ,\n"+s5;
                   switch(no)
                   {
                       case 1:
                           seatno2.setText(s6);
                           seatno2.setVisible(true);
                           break;
                       case 2:
                           switch(waste)
                           {
                               case 1:
                                   seatno1.setText(s6);
                                   seatno1.setVisible(true);
                                   break;
                               case 2:
                                   seatno3.setText(s6);
                                   seatno3.setVisible(true);
                                   break;
                               default:
                                   break;
                           }
                            break;
                       case 3:
                           switch(waste)
                           {
                               case 1:
                                   seatno1.setText(s6);
                                   seatno1.setVisible(true);
                                   break;
                                   
                               case 2:
                                   seatno2.setText(s6);
                                   seatno2.setVisible(true);
                                   break;
                                   
                               case 3:
                                   seatno3.setText(s6);
                                   seatno3.setVisible(true);
                                   break;
                                   
                               default:
                                   break;
                                  
                           }
                           break;
                       case 4:
                           switch(waste)
                           {
                               case 1:
                                   seatno1.setText(s6);
                                   seatno1.setVisible(true);
                                   break;
                                   
                               case 2:
                                   seatno2.setText(s6);
                                   seatno2.setVisible(true);
                                   break;
                                   
                               case 3:
                                   seatno3.setText(s6);
                                   seatno3.setVisible(true);
                                   break;
                               case 4:
                                   seatno5.setText(s6);
                                   seatno5.setVisible(true);
                                   break;
                               default:
                                   break;
                                  
                           }
                           break;
                       case 5:
                           switch(waste)
                           {
                               case 1:
                                   seatno1.setText(s6);
                                   seatno1.setVisible(true);
                                   break;
                                   
                               case 2:
                                   seatno2.setText(s6);
                                   seatno2.setVisible(true);
                                   break;
                                   
                               case 3:
                                   seatno3.setText(s6);
                                   seatno3.setVisible(true);
                                   break;
                               case 4:
                                   seatno4.setText(s6);
                                   seatno4.setVisible(true);
                                   break;
                               case 5:
                                   seatno6.setText(s6);
                                   seatno6.setVisible(true);
                                   break;
                               default:
                                   break;
                                  
                           }
                           break;
                       case 6:
                           switch(waste)
                           {
                               case 1:
                                   seatno1.setText(s6);
                                   seatno1.setVisible(true);
                                   break;
                                   
                               case 2:
                                   seatno2.setText(s6);
                                   seatno2.setVisible(true);
                                   break;
                                   
                               case 3:
                                   seatno3.setText(s6);
                                   seatno3.setVisible(true);
                                   break;
                               case 4:
                                   seatno4.setText(s6);
                                   seatno4.setVisible(true);
                                   break;
                               case 5:
                                   seatno5.setText(s6);
                                   seatno5.setVisible(true);
                                   break;
                               case 6:
                                   seatno6.setText(s6);
                                   seatno6.setVisible(true);
                                   break;
                               default:
                                   break;
                                  
                           }
                           break;
                       default:
                           break;
                   }
                   waste = waste + 1;

           }
       }catch(ClassNotFoundException | SQLException ex)
       {
       JOptionPane.showMessageDialog(null,"conection is not set sucessfully "+ex);
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
        jLabel2 = new javax.swing.JLabel();
        trainno = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pnrno = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        submit = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        seatno1 = new javax.swing.JCheckBox();
        seatno2 = new javax.swing.JCheckBox();
        seatno3 = new javax.swing.JCheckBox();
        seatno4 = new javax.swing.JCheckBox();
        seatno5 = new javax.swing.JCheckBox();
        seatno6 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        selectall = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("   Railway Attendence System");

        jLabel2.setText("Train No:");

        trainno.setText("12155");

        jLabel4.setText("PNR No:");

        jButton1.setText("cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        submit.setText("submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        jButton3.setText("home");
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);

        seatno1.setText("jCheckBox1");
        seatno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatno1ActionPerformed(evt);
            }
        });

        seatno2.setText("jCheckBox2");
        seatno2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatno2ActionPerformed(evt);
            }
        });

        seatno3.setText("jCheckBox3");
        seatno3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatno3ActionPerformed(evt);
            }
        });

        seatno4.setText("jCheckBox4");
        seatno4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatno4ActionPerformed(evt);
            }
        });

        seatno5.setText("jCheckBox5");
        seatno5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatno5ActionPerformed(evt);
            }
        });

        seatno6.setText("jCheckBox6");
        seatno6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatno6ActionPerformed(evt);
            }
        });

        jLabel3.setText("Seat Display : ");

        selectall.setText("select all");
        selectall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectallActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(submit)
                                .addGap(26, 26, 26))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(trainno, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(pnrno, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                                .addComponent(jButton3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(seatno1)
                                    .addComponent(seatno4))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(seatno2)
                                        .addGap(28, 28, 28)
                                        .addComponent(seatno3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(seatno5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(seatno6))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(selectall)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trainno, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnrno, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectall))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seatno1)
                    .addComponent(seatno2)
                    .addComponent(seatno3))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seatno4)
                    .addComponent(seatno5)
                    .addComponent(seatno6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(submit))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectallActionPerformed
if(selectall.isSelected()==true){
        seatno1.setSelected(true);
seatno2.setSelected(true);
seatno3.setSelected(true);
seatno4.setSelected(true);
seatno5.setSelected(true);
seatno6.setSelected(true);
}
if(selectall.isSelected()==false)
{
seatno1.setSelected(false);
seatno2.setSelected(false);
seatno3.setSelected(false);
seatno4.setSelected(false);
seatno5.setSelected(false);
seatno6.setSelected(false);
}
    }//GEN-LAST:event_selectallActionPerformed

    private void seatno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatno1ActionPerformed
if(seatno1.isSelected()==false)
        selectall.setSelected(false);        // TODO add your handling code here:
    }//GEN-LAST:event_seatno1ActionPerformed

    private void seatno2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatno2ActionPerformed
if(seatno2.isSelected()==false)
        selectall.setSelected(false);        // TODO add your handling code here:
    }//GEN-LAST:event_seatno2ActionPerformed

    private void seatno3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatno3ActionPerformed
if(seatno3.isSelected()==false)
        selectall.setSelected(false);        // TODO add your handling code here:
    }//GEN-LAST:event_seatno3ActionPerformed

    private void seatno4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatno4ActionPerformed
if(seatno4.isSelected()==false)
        selectall.setSelected(false);        // TODO add your handling code here:
    }//GEN-LAST:event_seatno4ActionPerformed

    private void seatno5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatno5ActionPerformed
if(seatno5.isSelected()==false)
        selectall.setSelected(false);        // TODO add your handling code here:
    }//GEN-LAST:event_seatno5ActionPerformed

    private void seatno6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatno6ActionPerformed
if(seatno6.isSelected()==false)
        selectall.setSelected(false);        // TODO add your handling code here:
    }//GEN-LAST:event_seatno6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
try
{
    waste=1;
    
    while(result2.next())
           {
                s3=result2.getString(2);
                s4=result2.getString(3);
                
           
           
                   switch(no)
                   {
                       case 1:
                           if(seatno2.isSelected() == false )
                               temp=true;
                           
                           break;
                       case 2:
                           switch(waste)
                           {
                               case 1:
                                   if(seatno1.isSelected()== false)
                                   temp=true;
                                   break;
                               case 2:
                                   if(seatno3.isSelected()== false)
                                   temp=true;
                                   break;
                               default:
                                   break;
                           }
                            break;
                       case 3:
                           switch(waste)
                           {
                               case 1:
                                   if(seatno1.isSelected()== false)
                                   temp=true;
                                   break;
                                   
                               case 2:
                                   if(seatno2.isSelected() == false )
                                        temp=true;
                                   break;
                                   
                               case 3:
                                   if(seatno3.isSelected()== false)
                                   temp=true;
                                   break;
                                   
                               default:
                                   break;
                                  
                           }
                           break;
                       case 4:
                           switch(waste)
                           {
                               case 1:
                                   if(seatno1.isSelected()== false)
                                   temp=true;
                                   break;
                                   
                               case 2:
                                   if(seatno2.isSelected() == false )
                               temp=true;
                                   break;
                                   
                               case 3:
                                   if(seatno3.isSelected()== false)
                                   temp=true;
                                   break;
                               case 4:
                                  if(seatno5.isSelected()==false)
                                     temp=true; 
                                    break;
                               default:
                                   break;
                                  
                           }
                           break;
                       case 5:
                           switch(waste)
                           {
                               case 1:
                                   if(seatno1.isSelected()== false)
                                   temp=true;
                                   break;
                                   
                               case 2:
                                   if(seatno2.isSelected() == false )
                               temp=true;
                                   break;
                                   
                               case 3:
                                   if(seatno3.isSelected()== false)
                                   temp=true;
                                   break;
                               case 4:
                                   if(seatno4.isSelected()==false)
                                     temp=true; 
                                   break;
                               case 5:
                                   if(seatno6.isSelected()==false)
                                     temp=true;
                                   break;
                               default:
                                   break;
                                  
                           }
                           break;
                       case 6:
                           switch(waste)
                           {
                               case 1:
                                   if(seatno1.isSelected()== false)
                                   temp=true;
                                   break;
                                   
                               case 2:
                                   if(seatno2.isSelected() == false )
                               temp=true;
                                   break;
                                   
                               case 3:
                                   if(seatno3.isSelected()== false)
                                   temp=true;
                                   break;
                               case 4:
                                  if(seatno4.isSelected()==false)
                                     temp=true; 
                                   break;
                               case 5:
                                   if(seatno5.isSelected()==false)
                                     temp=true; 
                                   break;
                               case 6:
                                   if(seatno6.isSelected()==false)
                                     temp=true; 
                                   break;
                               default:
                                   break;
                                  
                           }
                           break;
                       default:
                           break;
                   }
                   
                   if(temp==true)
                   {
                   try{
                   st3 = con.createStatement();
                   st4 = con.createStatement();
                   String nayastatement="SELECT * FROM cpdetail12155 WHERE pnr='"+ pnrno.getText()+"'";
                   
                   result3 = st4.executeQuery(nayastatement);
                   result3.next();
                   String classtype;
                       classtype = result3.getString(9);
                       source = result3.getString(3);
                       destination = result3.getString(4);
                       ob1 =new MyDb();
                      // ob2= new MyDb();
                       ob1.result = ob1.st.executeQuery("select * from rootof12155");
                       while(ob1.result.next())
                       {
                       if(ob1.result.getString(2).equals(source))
                           source=ob1.result.getString(3);
                       if(ob1.result.getString(2).equals(destination))
                           destination = ob1.result.getString(3);
                       }
                       int c;
                       //System.out.println(source+" "+destination);
                       c = (int)destination.charAt(0);
                       int sou = (int)source.charAt(0);
                       //System.out.println(sou+" "+c);
                       int i = 0;
                       for(a=sou;a<=c;a++)
                       {
                           i=0;
                           arr[i]= (char)a;
                           //System.out.print(""+arr[i]);
                       root =  root + arr[i];
                           ++i;
                      
                       }
                       
                      // root =  String.valueOf(arr,0,i);
                      //root =  new String(arr); 
                       
                       //System.out.print(classtype+" "+root);
                   String dum = "INSERT INTO pa12155 (pnr,class,coach,seatno,root) VALUES ('"+pnrno.getText()+"','"+result3.getString(10)+"', '"+s3+"', '"+Integer.parseInt(s4)+"','"+root+"')";
                   st3.executeUpdate(dum);
                   
                   
                   JOptionPane.showMessageDialog(null,"attendence has been take sucessfully"+"your data is sucessfully updated");
//                   WatingChartClearence ob = new WatingChartClearence();
                   root="";
                   System.out.print("i am after j option pane");
                   
                   }catch(SQLException | NumberFormatException | HeadlessException ex)
                   {
                   JOptionPane.showMessageDialog(null,"Data couldn't be updated in table pa12155: "+ex);
                   }
                   }
                  
                   
                   
                   waste = waste + 1;
                   temp=false;

           }
    
//st.executeUpdate("INSERT INTO pa12155 (pnr, class, coach, seatno) VALUES ('"+pnrno.getText()+"','"++"')")
}catch(SQLException | HeadlessException ex)
{
JOptionPane.showMessageDialog(null,"conection with database could not bet set corectly " + ex);
}
    }//GEN-LAST:event_submitActionPerformed

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
            java.util.logging.Logger.getLogger(AttendencePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AttendencePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AttendencePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AttendencePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            // new AttendencePage().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel pnrno;
    private javax.swing.JCheckBox seatno1;
    private javax.swing.JCheckBox seatno2;
    private javax.swing.JCheckBox seatno3;
    private javax.swing.JCheckBox seatno4;
    private javax.swing.JCheckBox seatno5;
    private javax.swing.JCheckBox seatno6;
    private javax.swing.JCheckBox selectall;
    private javax.swing.JButton submit;
    private javax.swing.JLabel trainno;
    // End of variables declaration//GEN-END:variables
}
