/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package box;

import java.awt.Dimension;
import java.awt.event.ItemListener;

/**
 *
 * @author up878976
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialogTypeErr = new javax.swing.JDialog();
        lblTitle = new javax.swing.JLabel();
        lblErrorMessage = new javax.swing.JLabel();
        btnOk = new javax.swing.JButton();
        lblDimensions = new javax.swing.JLabel();
        txtHeight = new javax.swing.JTextField();
        lblHeight = new javax.swing.JLabel();
        lblWidth = new javax.swing.JLabel();
        lblDepth = new javax.swing.JLabel();
        txtWidth = new javax.swing.JTextField();
        txtDepth = new javax.swing.JTextField();
        lblGrade = new javax.swing.JLabel();
        cmbGrade = new javax.swing.JComboBox<>();
        lblColours = new javax.swing.JLabel();
        cmbColours = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        tbtnReBo = new javax.swing.JToggleButton();
        lblReCo = new javax.swing.JLabel();
        tbtnReCo = new javax.swing.JToggleButton();
        lblSealable = new javax.swing.JLabel();
        tbtnSealable = new javax.swing.JToggleButton();
        lblQuantity = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        btnATC = new javax.swing.JButton();
        btnCheckout = new javax.swing.JButton();

        jDialogTypeErr.setTitle("Error");

        lblTitle.setText("Error");

        lblErrorMessage.setText("jLabel2");

        btnOk.setText("Ok");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialogTypeErrLayout = new javax.swing.GroupLayout(jDialogTypeErr.getContentPane());
        jDialogTypeErr.getContentPane().setLayout(jDialogTypeErrLayout);
        jDialogTypeErrLayout.setHorizontalGroup(
            jDialogTypeErrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogTypeErrLayout.createSequentialGroup()
                .addGroup(jDialogTypeErrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialogTypeErrLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jDialogTypeErrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitle)
                            .addComponent(lblErrorMessage)))
                    .addGroup(jDialogTypeErrLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(btnOk)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jDialogTypeErrLayout.setVerticalGroup(
            jDialogTypeErrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogTypeErrLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblErrorMessage)
                .addGap(18, 18, 18)
                .addComponent(btnOk)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Box System");

        lblDimensions.setText("Dimensions (m)");

        txtHeight.setText("0.0");
        txtHeight.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtHeightFocusLost(evt);
            }
        });

        lblHeight.setText("Height");

        lblWidth.setText("Width");

        lblDepth.setText("Depth");

        txtWidth.setText("0.0");
        txtWidth.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtWidthFocusLost(evt);
            }
        });

        txtDepth.setText("0.0");
        txtDepth.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDepthFocusLost(evt);
            }
        });

        lblGrade.setText("Grade");

        cmbGrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));

        lblColours.setText("Colours");

        cmbColours.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2" }));

        jLabel1.setText("Reinforced Bottom");

        tbtnReBo.setText("No");
        tbtnReBo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbtnReBoMouseClicked(evt);
            }
        });
        tbtnReBo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtnReBoActionPerformed(evt);
            }
        });

        lblReCo.setText("Reinforced Corners");

        tbtnReCo.setText("No");
        tbtnReCo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtnReCoActionPerformed(evt);
            }
        });

        lblSealable.setText("Sealable Top");

        tbtnSealable.setText("No");
        tbtnSealable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtnSealableActionPerformed(evt);
            }
        });

        lblQuantity.setText("Quantity");

        txtQuantity.setText("0");
        txtQuantity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtQuantityFocusLost(evt);
            }
        });

        btnATC.setText("Add to Cart");
        btnATC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnATCActionPerformed(evt);
            }
        });

        btnCheckout.setText("Checkout");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblQuantity)
                    .addComponent(lblSealable)
                    .addComponent(lblReCo)
                    .addComponent(jLabel1)
                    .addComponent(lblColours)
                    .addComponent(lblDimensions)
                    .addComponent(lblGrade))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnATC))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblHeight)
                                        .addGap(30, 30, 30))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblWidth)
                                    .addComponent(txtWidth, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtDepth, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDepth))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(btnCheckout))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbColours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tbtnReBo)
                            .addComponent(tbtnReCo)
                            .addComponent(tbtnSealable))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeight)
                    .addComponent(lblWidth)
                    .addComponent(lblDepth))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDimensions)
                    .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWidth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDepth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGrade)
                            .addComponent(cmbGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblColours)
                            .addComponent(cmbColours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tbtnReBo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblReCo)
                            .addComponent(tbtnReCo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSealable)
                            .addComponent(tbtnSealable))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblQuantity)
                            .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(42, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnATC)
                            .addComponent(btnCheckout))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbtnReBoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtnReBoActionPerformed
        toggleYesNo(tbtnReBo);
        
    }//GEN-LAST:event_tbtnReBoActionPerformed
    private void toggleYesNo(javax.swing.JToggleButton button ){
        button.setText(button.getText() == "No" ? "Yes" : "No");
    }
    private void tbtnReBoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbtnReBoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbtnReBoMouseClicked

    private void tbtnReCoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtnReCoActionPerformed
        toggleYesNo(tbtnReCo);
    }//GEN-LAST:event_tbtnReCoActionPerformed

    private void tbtnSealableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtnSealableActionPerformed
        toggleYesNo(tbtnSealable);
    }//GEN-LAST:event_tbtnSealableActionPerformed

    private void btnATCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnATCActionPerformed
        int grade = Integer.parseInt(cmbGrade.getSelectedItem().toString());
        int colours = Integer.parseInt(cmbColours.getSelectedItem().toString());
        boolean reinforcedBottom = tbtnReBo.getText() == "No" ? false : true;
        boolean reinforcedCorner = tbtnReCo.getText() == "No" ? false : true;
        boolean sealableTop = tbtnSealable.getText() == "No" ? true : false;
        int quantity = Integer.parseInt(txtQuantity.getText());
        float height = Float.parseFloat(txtHeight.getText());
        float depth = Float.parseFloat(txtDepth.getText());
        float width = Float.parseFloat(txtWidth.getText());
        
        
    }//GEN-LAST:event_btnATCActionPerformed
    
    private void txtHeightFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHeightFocusLost
        checkDataType(txtHeight);
    }//GEN-LAST:event_txtHeightFocusLost

    private void txtWidthFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtWidthFocusLost
        checkDataType(txtWidth);
    }//GEN-LAST:event_txtWidthFocusLost

    private void txtDepthFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDepthFocusLost
        checkDataType(txtDepth);
    }//GEN-LAST:event_txtDepthFocusLost

    private void txtQuantityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQuantityFocusLost
        checkDataType(txtQuantity);
    }//GEN-LAST:event_txtQuantityFocusLost

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        jDialogTypeErr.dispose();
    }//GEN-LAST:event_btnOkActionPerformed

    private void checkDataType(javax.swing.JTextField txtBox){
        try{
            Float.parseFloat(txtBox.getText());
            
        }
        catch(NumberFormatException err){
//            javax.swing.JDialog error = new javax.swing.JDialog(Frame GUI, String "Error", boolean false);
            System.out.println("skfh");
            jDialogTypeErr.setVisible(true);
            jDialogTypeErr.setEnabled(true);
            jDialogTypeErr.setResizable(false);
            lblErrorMessage.setText("Invalid type, please enter a number");
            lblTitle.setText("Error: " + "NumberFormatException");
            jDialogTypeErr.setSize(300, 200);
            
            
          
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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnATC;
    private javax.swing.JButton btnCheckout;
    private javax.swing.JButton btnOk;
    private javax.swing.JComboBox<String> cmbColours;
    private javax.swing.JComboBox<String> cmbGrade;
    private javax.swing.JDialog jDialogTypeErr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblColours;
    private javax.swing.JLabel lblDepth;
    private javax.swing.JLabel lblDimensions;
    private javax.swing.JLabel lblErrorMessage;
    private javax.swing.JLabel lblGrade;
    private javax.swing.JLabel lblHeight;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblReCo;
    private javax.swing.JLabel lblSealable;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblWidth;
    private javax.swing.JToggleButton tbtnReBo;
    private javax.swing.JToggleButton tbtnReCo;
    private javax.swing.JToggleButton tbtnSealable;
    private javax.swing.JTextField txtDepth;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtWidth;
    // End of variables declaration//GEN-END:variables
}
