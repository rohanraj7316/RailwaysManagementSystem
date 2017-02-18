/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package railwayatttendencemanagementsystem;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class StringEntryInDatabase extends javax.swing.JFrame {
    MyDb ob = new MyDb();
    MyDb ob2 = new MyDb();
    MyDb ob3 = new MyDb();
    int a= 65;
    String root="";
    char[] arr= new char[26];

    
    public StringEntryInDatabase() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(162, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String source,destination;
            String detail ="select * from cpdetail12155";
            ob.result = ob.st.executeQuery(detail);
            while(ob.result.next())
            {
            source = ob.result.getString("boarding");
            destination = ob.result.getString("destination");
            ob2.result = ob2.st.executeQuery("select * from rootof12155");
            while(ob2.result.next())
            {
                        if(ob2.result.getString(2).equals(source))
                           source=ob2.result.getString(3);
                       if(ob2.result.getString(2).equals(destination))
                           destination = ob2.result.getString(3);
            }
            int c;
                       //System.out.println(source+" "+destination);
                       c = (int)destination.charAt(0);
                       int sou = (int)source.charAt(0);
                       //System.out.println(sou+" "+c);
                       int i = 0;
                       for(a=sou;a<=c;a++)
                       {
                           
                           arr[i]= (char)a;
                           //System.out.print(""+arr[i]);
                       root =  root + arr[i];
                           ++i;
                      
                       }
            ob3.st.executeUpdate("UPDATE cpdetail12155 set root ='"+root+"' where pnr = '"+ob.result.getString(1)+"'");
            root="";
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(StringEntryInDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StringEntryInDatabase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
