package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;


public class BranchInfo extends javax.swing.JFrame {

    public BranchInfo() {
        initComponents();
        this.setLocationRelativeTo(null);
        tableList();
    }

    
    private void tableList(){
   
        Connection con = (new GetConnection()).getConnection();
     
        String query = "select br_code, br_street, br_num, br_city, wrk_lname, wrk_name, sum(res) as numofreservations, sum(tr_cost)*sum(res) as revenue\n" +
                       "from (select br_code,br_street,	br_num, br_city, tr_id, tr_cost, count(*) as res\n" +
                       "from branch left join trip on br_code=tr_br_code\n" +
                                   "left join reservation on tr_id=res_tr_id\n" +
                                   "group by tr_id) as t1\n" +
                                   "left join manages on br_code=mng_br_code\n" +
                                   "left join worker on mng_adm_AT=wrk_AT\n" +
                                   "group by br_code;";

        Statement st;
        ResultSet rs;
        
        try{
            st = con.createStatement();
            rs = st.executeQuery(query);
          
            while(rs.next()){ 
                int data1 = rs.getInt("br_code");
                String data2 = rs.getString("br_street");
                int data3 = rs.getInt("br_num");
                String data4 = rs.getString("br_city");
                String data5 = rs.getString("wrk_lname");
                String data6 = rs.getString("wrk_name");               
                int data7 = rs.getInt("numofreservations");
                int data8 = rs.getInt("revenue");
             
                Object[] row1 = { data1, data2, data3, data4, data5, data6, data7, data8};
                

                DefaultTableModel model1 = (DefaultTableModel) jTable1.getModel();
              

                model1.addRow(row1);
            }
  
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "br_code", "br_street", "br_num", "br_city", "wrk_lname", "wrk_name", "numofreservations", "revenue"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Menu");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 855, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        new Menu().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BranchInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
