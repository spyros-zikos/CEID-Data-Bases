package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;


public class RevenueAndCost extends javax.swing.JFrame {

    public RevenueAndCost() {
        initComponents();
        this.setLocationRelativeTo(null);
        tableList();
    }

    
    private void tableList(){
   
        Connection con = (new GetConnection()).getConnection();
     
        String query = "select code1, sumofsalary, sumofcost*numofres as revenue\n" +
                        "from\n" +
                        "(select code1, sum(numof_tr_res) as numofres, sum(tr_cost) as sumofcost\n" +
                        " from\n" +
                        " (select br_code as code1, tr_id as id, count(*) as numof_tr_res, tr_cost\n" +
                        "  from trip inner join reservation on tr_id=res_tr_id\n" +
                        "	     inner join branch on br_code=tr_br_code\n" +
                        "  group by tr_id) as t1\n" +
                        " group by code1) as t3\n" +
                        "inner join\n" +
                        "(select br_code as code2, sum(wrk_salary) as sumofsalary\n" +
                        "from branch right join worker on br_code=wrk_br_code\n" +
                        "group by br_code) as t2\n" +
                        "\n" +
                        "on code1=code2\n" +
                        "order by code1;";

        Statement st;
        ResultSet rs;
        
        try{
            st = con.createStatement();
            rs = st.executeQuery(query);
          
            while(rs.next()){ 
                int data1 = rs.getInt("code1");
                float data2 = rs.getFloat("sumofsalary");
                float data3 = rs.getFloat("revenue");
             
                Object[] row1 = { data1, data2, data3};
                

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

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "br_code", "salaries", "revenue"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jButton1)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
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
                new RevenueAndCost().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
