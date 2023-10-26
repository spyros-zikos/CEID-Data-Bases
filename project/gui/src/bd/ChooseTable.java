package bd;


public class ChooseTable extends javax.swing.JFrame {

    public ChooseTable() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jRadioButtonBranch = new javax.swing.JRadioButton();
        jRadioButtonWorker = new javax.swing.JRadioButton();
        jRadioButtonAdmin = new javax.swing.JRadioButton();
        jRadioButtonManages = new javax.swing.JRadioButton();
        jRadioButtonPhones = new javax.swing.JRadioButton();
        jRadioButtonDriver = new javax.swing.JRadioButton();
        jRadioButtonGuide = new javax.swing.JRadioButton();
        jRadioButtonLanguage = new javax.swing.JRadioButton();
        jRadioButtonTrip = new javax.swing.JRadioButton();
        jRadioButtonEvent = new javax.swing.JRadioButton();
        jRadioButtonDestination = new javax.swing.JRadioButton();
        jRadioButtonTravel_to = new javax.swing.JRadioButton();
        jRadioButtonReservation = new javax.swing.JRadioButton();
        jRadioButtonIT = new javax.swing.JRadioButton();
        jRadioButtonOffers = new javax.swing.JRadioButton();
        jRadioButtonReservation_offers = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setAutoRequestFocus(false);

        buttonGroup1.add(jRadioButtonBranch);
        jRadioButtonBranch.setText("branch");
        jRadioButtonBranch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonBranchActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonWorker);
        jRadioButtonWorker.setText("worker");

        buttonGroup1.add(jRadioButtonAdmin);
        jRadioButtonAdmin.setText("admin");

        buttonGroup1.add(jRadioButtonManages);
        jRadioButtonManages.setText("manages");

        buttonGroup1.add(jRadioButtonPhones);
        jRadioButtonPhones.setText("phones");

        buttonGroup1.add(jRadioButtonDriver);
        jRadioButtonDriver.setText("driver");
        jRadioButtonDriver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonDriverActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonGuide);
        jRadioButtonGuide.setText("guide");

        buttonGroup1.add(jRadioButtonLanguage);
        jRadioButtonLanguage.setText("language");

        buttonGroup1.add(jRadioButtonTrip);
        jRadioButtonTrip.setText("trip");

        buttonGroup1.add(jRadioButtonEvent);
        jRadioButtonEvent.setText("event");
        jRadioButtonEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonEventActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonDestination);
        jRadioButtonDestination.setText("destination");

        buttonGroup1.add(jRadioButtonTravel_to);
        jRadioButtonTravel_to.setText("travel_to");

        buttonGroup1.add(jRadioButtonReservation);
        jRadioButtonReservation.setText("reservation");

        buttonGroup1.add(jRadioButtonIT);
        jRadioButtonIT.setText("IT");

        buttonGroup1.add(jRadioButtonOffers);
        jRadioButtonOffers.setText("offers");

        buttonGroup1.add(jRadioButtonReservation_offers);
        jRadioButtonReservation_offers.setText("reservation_offers");
        jRadioButtonReservation_offers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonReservation_offersActionPerformed(evt);
            }
        });

        jButton1.setText("SELECT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextPane2.setEditable(false);
        jTextPane2.setFont(new java.awt.Font("sansserif", 3, 14)); // NOI18N
        jTextPane2.setText("Select one of the following tables for insert/update/delete:");
        jScrollPane2.setViewportView(jTextPane2);

        jButton2.setText("Menu");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jRadioButtonManages, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButtonAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButtonWorker, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButtonBranch, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jRadioButtonEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jRadioButtonTrip, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jRadioButtonTravel_to, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jRadioButtonDestination, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(136, 136, 136)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonPhones, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jRadioButtonGuide, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jRadioButtonDriver, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jRadioButtonOffers, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButtonIT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButtonReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButtonReservation_offers)
                            .addComponent(jRadioButtonLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButtonBranch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonWorker)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonAdmin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonManages))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButtonPhones)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonDriver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonGuide)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonLanguage)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonTrip)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jRadioButtonEvent)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonDestination)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonTravel_to))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButtonReservation)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonOffers)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonReservation_offers)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonDriverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonDriverActionPerformed

    private void jRadioButtonBranchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonBranchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonBranchActionPerformed

    private void jRadioButtonEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonEventActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonEventActionPerformed

    private void jRadioButtonReservation_offersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonReservation_offersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonReservation_offersActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(jRadioButtonBranch.isSelected()==true){
            this.setVisible(false);
            new Branch().setVisible(true);
        }                      
        if(jRadioButtonWorker.isSelected()==true){
            this.setVisible(false);
            new Worker().setVisible(true);
        }
        if(jRadioButtonAdmin.isSelected()==true){
            this.setVisible(false);
            new Admin().setVisible(true);
        }
        if(jRadioButtonManages.isSelected()==true){
            this.setVisible(false);
            new Manages().setVisible(true);
        }
        if(jRadioButtonPhones.isSelected()==true){
            this.setVisible(false);
            new Phones().setVisible(true);
        }
        if(jRadioButtonDriver.isSelected()==true){
            this.setVisible(false);
            new Driver().setVisible(true);
        }
        if(jRadioButtonGuide.isSelected()==true){
            this.setVisible(false);
            new Guide().setVisible(true);
        }
        if(jRadioButtonLanguage.isSelected()==true){
            this.setVisible(false);
            new Language().setVisible(true);
        }
        if(jRadioButtonTrip.isSelected()==true){
            this.setVisible(false);
            new Trip().setVisible(true);
        }
        if(jRadioButtonEvent.isSelected()==true){
            this.setVisible(false);
            new Event().setVisible(true);
        }
        if(jRadioButtonDestination.isSelected()==true){
            this.setVisible(false);
            new Destination().setVisible(true);
        }
        if(jRadioButtonTravel_to.isSelected()==true){
            this.setVisible(false);
            new Travel_to().setVisible(true);
        }
        if(jRadioButtonReservation.isSelected()==true){
            this.setVisible(false);
            new Reservation().setVisible(true);
        }
        if(jRadioButtonIT.isSelected()==true){
            this.setVisible(false);
            new IT().setVisible(true);
        }
        if(jRadioButtonOffers.isSelected()==true){
            this.setVisible(false);
            new Offers().setVisible(true);
        }
        if(jRadioButtonReservation_offers.isSelected()==true){
            this.setVisible(false);
            new Reservation_offers().setVisible(true);
        }
        
   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        new Menu().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed
    

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChooseTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JRadioButton jRadioButtonAdmin;
    private javax.swing.JRadioButton jRadioButtonBranch;
    private javax.swing.JRadioButton jRadioButtonDestination;
    private javax.swing.JRadioButton jRadioButtonDriver;
    private javax.swing.JRadioButton jRadioButtonEvent;
    private javax.swing.JRadioButton jRadioButtonGuide;
    private javax.swing.JRadioButton jRadioButtonIT;
    private javax.swing.JRadioButton jRadioButtonLanguage;
    private javax.swing.JRadioButton jRadioButtonManages;
    private javax.swing.JRadioButton jRadioButtonOffers;
    private javax.swing.JRadioButton jRadioButtonPhones;
    private javax.swing.JRadioButton jRadioButtonReservation;
    private javax.swing.JRadioButton jRadioButtonReservation_offers;
    private javax.swing.JRadioButton jRadioButtonTravel_to;
    private javax.swing.JRadioButton jRadioButtonTrip;
    private javax.swing.JRadioButton jRadioButtonWorker;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane2;
    // End of variables declaration//GEN-END:variables
}
