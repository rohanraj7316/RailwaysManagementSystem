
package railwayatttendencemanagementsystem;

import java.sql.SQLException;
import javax.swing.JOptionPane;


public class WLChartAttendence extends javax.swing.JFrame 
{

MyDb dataouting = new MyDb();
MyDb wldetail = new MyDb();
MyDb count = new MyDb();
boolean valid = false;
int no=1;



public WLChartAttendence(String pnrno) {
        initComponents();
      
    try
    {
    try{   
    dataouting.result = dataouting.st.executeQuery("select * from cwaa where  pnr = '"+pnrno+"'");
        boolean next = dataouting.result.next();
    }catch(SQLException ob)
    {
    //JOptionPane.showMessageDialog(null,""+ob);
        valid = true;
    }
    wldetail.result = wldetail.st.executeQuery("select * from cp12155 where pnr ='"+pnrno+"'");
    
        count.result = count.st.executeQuery("SELECT count(pnr) FROM cp12155 where pnr = '"+pnrno+"'");
        count.result.next();
        no = count.result.getInt(1);
    String seat="seatno";
    for(int j=1;j<=no;j++)
    {
       
     
      
        while(wldetail.result.next() || dataouting.result.next())
        
        {
            String s1,s2,s3,s4,s5;
            s1=wldetail.result.getString("name");
            s2=wldetail.result.getString("pnr");
            if( dataouting.result.getString("cseatno") == null)
            {
                s3 = dataouting.result.getString("cseatno");
                s4 = dataouting.result.getString("ccoach");
                s5 = dataouting.result.getString("status");
            }
            else
            {
            s3="";
            s4="";
            s5="";
            }
           
        }
    }
    
    
    
    }catch(Exception ex)
    {
    JOptionPane.showMessageDialog(null," " +ex);
    }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        trainno = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        selectall = new javax.swing.JCheckBox();
        seatno1 = new javax.swing.JCheckBox();
        seatno4 = new javax.swing.JCheckBox();
        seatno5 = new javax.swing.JCheckBox();
        seatno2 = new javax.swing.JCheckBox();
        seatno3 = new javax.swing.JCheckBox();
        seatno6 = new javax.swing.JCheckBox();
        submit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("   Railway Attendence System");

        trainno.setText("12155");

        jLabel2.setText("Train No:");

        jLabel4.setText("PNR No:");

        jLabel3.setText("Seat Display : ");

        selectall.setText("select all");
        selectall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectallActionPerformed(evt);
            }
        });

        seatno1.setText("jCheckBox1");
        seatno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatno1ActionPerformed(evt);
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

        seatno6.setText("jCheckBox6");
        seatno6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatno6ActionPerformed(evt);
            }
        });

        submit.setText("submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        jButton1.setText("cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("home");
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(seatno6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(seatno1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(seatno4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(seatno5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(seatno2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(seatno3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(500, 500, 500))))
            .addGroup(layout.createSequentialGroup()
                .addGap(303, 303, 303)
                .addComponent(submit)
                .addGap(56, 56, 56)
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(235, 235, 235)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(trainno, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(92, 92, 92)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(selectall)))
                            .addGap(0, 119, Short.MAX_VALUE)))
                    .addGap(236, 236, 236)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(174, Short.MAX_VALUE)
                .addComponent(seatno1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(seatno4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(seatno3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(seatno2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(seatno5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(seatno6)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submit)
                    .addComponent(jButton1))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(trainno, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(selectall))
                    .addContainerGap(231, Short.MAX_VALUE)))
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
        selectall.setSelected(false);        
    }//GEN-LAST:event_seatno1ActionPerformed

    private void seatno4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatno4ActionPerformed
        if(seatno4.isSelected()==false)
        selectall.setSelected(false);        
    }//GEN-LAST:event_seatno4ActionPerformed

    private void seatno5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatno5ActionPerformed
        if(seatno5.isSelected()==false)
        selectall.setSelected(false);        
    }//GEN-LAST:event_seatno5ActionPerformed

    private void seatno2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatno2ActionPerformed
        if(seatno2.isSelected()==false)
        selectall.setSelected(false);        
    }//GEN-LAST:event_seatno2ActionPerformed

    private void seatno3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatno3ActionPerformed
        if(seatno3.isSelected()==false)
        selectall.setSelected(false);        
    }//GEN-LAST:event_seatno3ActionPerformed

    private void seatno6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatno6ActionPerformed
        if(seatno6.isSelected()==false)
        selectall.setSelected(false);        
    }//GEN-LAST:event_seatno6ActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        
    }//GEN-LAST:event_submitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed


    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(WLChartAttendence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WLChartAttendence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WLChartAttendence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WLChartAttendence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
