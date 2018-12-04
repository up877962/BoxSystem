/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Dimension;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import type.Order;

/**
 *
 * @author up859036, up878976, up877962, up912872
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    Utils utils = new Utils();
    Order order = new Order();

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

        DialogWarning = new javax.swing.JDialog();
        lblTitle = new javax.swing.JLabel();
        lblContent = new javax.swing.JLabel();
        btnOk = new javax.swing.JButton();
        frameComplete = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ftxtOrder = new javax.swing.JTextArea();
        btnComplete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrders = new javax.swing.JTable();
        lblSize = new javax.swing.JLabel();
        txtHeight = new javax.swing.JTextField();
        txtWidth = new javax.swing.JTextField();
        txtDepth = new javax.swing.JTextField();
        lblHeight = new javax.swing.JLabel();
        lblWidth = new javax.swing.JLabel();
        lblDepth = new javax.swing.JLabel();
        lblGrade = new javax.swing.JLabel();
        cboxGrade = new javax.swing.JComboBox<>();
        lblColors = new javax.swing.JLabel();
        cboxColors = new javax.swing.JComboBox<>();
        txtQuantity = new javax.swing.JTextField();
        lblQuantity = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        lblPrice = new javax.swing.JLabel();
        btnCompleteOrder = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        chbxReinBot = new javax.swing.JCheckBox();
        chbxReinCor = new javax.swing.JCheckBox();
        chbxSealTop = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();

        lblTitle.setText("Warning");

        lblContent.setText("Message");

        btnOk.setText("Ok");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DialogWarningLayout = new javax.swing.GroupLayout(DialogWarning.getContentPane());
        DialogWarning.getContentPane().setLayout(DialogWarningLayout);
        DialogWarningLayout.setHorizontalGroup(
            DialogWarningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogWarningLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DialogWarningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle)
                    .addComponent(lblContent)
                    .addComponent(btnOk))
                .addContainerGap(370, Short.MAX_VALUE))
        );
        DialogWarningLayout.setVerticalGroup(
            DialogWarningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogWarningLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addComponent(lblContent)
                .addGap(18, 18, 18)
                .addComponent(btnOk)
                .addContainerGap(147, Short.MAX_VALUE))
        );

        frameComplete.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                frameCompleteWindowOpened(evt);
            }
        });

        jLabel1.setText("Completed Order");

        ftxtOrder.setColumns(20);
        ftxtOrder.setRows(5);
        ftxtOrder.setEnabled(false);
        jScrollPane2.setViewportView(ftxtOrder);

        btnComplete.setText("Complete");
        btnComplete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout frameCompleteLayout = new javax.swing.GroupLayout(frameComplete.getContentPane());
        frameComplete.getContentPane().setLayout(frameCompleteLayout);
        frameCompleteLayout.setHorizontalGroup(
            frameCompleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameCompleteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(frameCompleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(frameCompleteLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(frameCompleteLayout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(btnComplete)
                .addContainerGap(219, Short.MAX_VALUE))
        );
        frameCompleteLayout.setVerticalGroup(
            frameCompleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameCompleteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(btnComplete)
                .addGap(8, 8, 8))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Box System");

        tblOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Height", "Width", "Depth", "Grade", "Colors", "Reinforced Bottom", "Reinforced Corner", "Sealable Top", "Quantity", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOrders);

        lblSize.setText("Size (m)");

        txtHeight.setText("0.0");
        txtHeight.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtHeightFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtHeightFocusLost(evt);
            }
        });
        txtHeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHeightActionPerformed(evt);
            }
        });

        txtWidth.setText("0.0");
        txtWidth.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtWidthFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtWidthFocusLost(evt);
            }
        });

        txtDepth.setText("0.0");
        txtDepth.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDepthFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDepthFocusLost(evt);
            }
        });

        lblHeight.setText("Height");

        lblWidth.setText("Width");

        lblDepth.setText("Depth");

        lblGrade.setText("Grade");

        cboxGrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));

        lblColors.setText("Colors");

        cboxColors.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2" }));

        txtQuantity.setText("0");
        txtQuantity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtQuantityFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtQuantityFocusLost(evt);
            }
        });
        txtQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantityActionPerformed(evt);
            }
        });

        lblQuantity.setText("Quantity");

        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnAdd.setText("Add Order");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        lblPrice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPrice.setText("Total Price");

        btnCompleteOrder.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCompleteOrder.setText("Complete Orders");
        btnCompleteOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteOrderActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Current Orders");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Order");

        chbxReinBot.setText("Reinfoced Bottom");
        chbxReinBot.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        chbxReinBot.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        chbxReinCor.setText("Reinforced Corner");
        chbxReinCor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        chbxReinCor.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        chbxSealTop.setText("Sealable Top");
        chbxSealTop.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        chbxSealTop.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Add-ons");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblSize)
                                            .addComponent(lblGrade)
                                            .addComponent(lblColors))
                                        .addGap(36, 36, 36)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cboxGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblHeight)
                                            .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cboxColors, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(lblQuantity, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(chbxReinCor)
                                        .addComponent(chbxSealTop, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(chbxReinBot, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtWidth, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblWidth)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(22, 22, 22)))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDepth)
                            .addComponent(txtDepth, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCompleteOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(506, 506, 506))
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(326, 326, 326)
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRemove)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPrice)
                        .addGap(115, 115, 115))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRemove)
                            .addComponent(lblPrice)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblHeight)
                                    .addComponent(lblDepth))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblSize)
                                    .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDepth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblGrade)
                                    .addComponent(cboxGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblColors)
                                    .addComponent(cboxColors, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblWidth)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtWidth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chbxReinBot)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chbxReinCor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chbxSealTop)
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblQuantity))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addComponent(btnCompleteOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtHeightFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHeightFocusLost
        utils.addPlaceholderText((JTextField) evt.getSource(), "0.0");
        if (utils.checkFloatType((JTextField) evt.getSource())) {
            if (!utils.rangeLimit((JTextField) evt.getSource(), 0.01f, 6f)) {
                // TODO: Dialog box
                utils.warningMessage(DialogWarning, lblTitle, lblContent, "Warning", "Must be in the range of 0.01 to 6");
            }
        } else {
            utils.warningMessage(DialogWarning, lblTitle, lblContent, "Warning", "Height must be a float");
        }
    }//GEN-LAST:event_txtHeightFocusLost

    private void txtWidthFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtWidthFocusLost
        utils.addPlaceholderText((JTextField) evt.getSource(), "0.0");
        if (utils.checkFloatType((JTextField) evt.getSource())) {
            if (!utils.rangeLimit((JTextField) evt.getSource(), 0.01f, 6f)) {
                // TODO: Dialog box
                utils.warningMessage(DialogWarning, lblTitle, lblContent, "Warning", "Must be in the range of 0.01 to 6");
            }
        } else {
            utils.warningMessage(DialogWarning, lblTitle, lblContent, "Warning", "Width must be a float");
        }
    }//GEN-LAST:event_txtWidthFocusLost

    private void txtDepthFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDepthFocusLost
        utils.addPlaceholderText((JTextField) evt.getSource(), "0.0");
        if (utils.checkFloatType((JTextField) evt.getSource())) {
        if (!utils.rangeLimit((JTextField) evt.getSource(), 0.01f, 6f)) {
            // TODO: Dialog box
            utils.warningMessage(DialogWarning, lblTitle, lblContent, "Warning", "Must be in the range of 0.01 to 6");
        }
        } else {
            utils.warningMessage(DialogWarning, lblTitle, lblContent, "Warning", "Depth must be a float");
        }
    }//GEN-LAST:event_txtDepthFocusLost

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        float height = Float.parseFloat(txtHeight.getText());
        float width = Float.parseFloat(txtWidth.getText());
        float depth = Float.parseFloat(txtDepth.getText());
        int grade = Integer.parseInt(cboxGrade.getSelectedItem().toString());
        int colors = Integer.parseInt(cboxColors.getSelectedItem().toString());
        boolean reinforcedBottom = chbxReinBot.isSelected();
        boolean reinforcedCorner = chbxReinCor.isSelected();
        boolean sealabletop = chbxSealTop.isSelected();
        int quantity = Integer.parseInt(txtQuantity.getText());
        boolean valid = false;
        if (!(depth == 0.0 || width == 0.0 || height == 0.0 || quantity == 0)) {
            System.out.println("quantity before object creation" + quantity);
            valid = order.addOrder(height, width, depth, grade, colors, reinforcedBottom, reinforcedCorner, sealabletop, quantity);
        }
        System.out.println(valid);
        if (valid) {
            String priceStr = String.format("%.2f", order.getPrice(tblOrders.getModel().getRowCount()));
            Object[] row = {height, width, depth, grade, colors, reinforcedBottom, reinforcedCorner, sealabletop, quantity, priceStr};
            DefaultTableModel model = (DefaultTableModel) tblOrders.getModel();
            model.addRow(row);
            String price = String.format("£%.2f", order.calculateTotalPrice());
            lblPrice.setText("Total Price: " + price);
            this.setTitle("Box System - Orders " + order.getTotalOrders() + " - Price " + price);
            
            txtWidth.setText("0.0");
            txtHeight.setText("0.0");
            txtWidth.setText("0.0");
            cboxGrade.setSelectedIndex(0);
            cboxColors.setSelectedIndex(0);
            chbxReinBot.setSelected(false);
            chbxReinCor.setSelected(false);
            chbxSealTop.setSelected(false);
            txtQuantity.setText("0");
        } else {
            // TODO: Calculate why its not valid
            utils.warningMessage(DialogWarning, lblTitle, lblContent, "Warning", "Not a valid box");
        }

    }//GEN-LAST:event_btnAddActionPerformed

    private void txtQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantityActionPerformed
        utils.checkFloatType((JTextField) evt.getSource());
    }//GEN-LAST:event_txtQuantityActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        if (tblOrders.getModel().getRowCount() == 0) {
            utils.warningMessage(DialogWarning, lblTitle, lblContent, "Warning", "You can't remove nothing");
            return;
        }
        try{
        int index = tblOrders.getSelectedRow();
        System.out.println(index);
        DefaultTableModel model = (DefaultTableModel) tblOrders.getModel();
        model.removeRow(index);
        order.removeOrder(index);
        String price = String.format("£%.2f", order.calculateTotalPrice());
        lblPrice.setText("Total Price: " + price);
        this.setTitle("Box System - Orders " + order.getTotalOrders() + " - Price " + price);
        } catch(ArrayIndexOutOfBoundsException err) {
            utils.warningMessage(DialogWarning, lblTitle, lblContent, "Warning", "You can't remove nothing");
        }

    }//GEN-LAST:event_btnRemoveActionPerformed

    private void txtHeightFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHeightFocusGained
        utils.removePlaceholderText((JTextField) evt.getSource(), "0.0");
    }//GEN-LAST:event_txtHeightFocusGained

    private void txtWidthFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtWidthFocusGained
        utils.removePlaceholderText((JTextField) evt.getSource(), "0.0");
    }//GEN-LAST:event_txtWidthFocusGained

    private void txtDepthFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDepthFocusGained
        utils.removePlaceholderText((JTextField) evt.getSource(), "0.0");
    }//GEN-LAST:event_txtDepthFocusGained

    private void txtQuantityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQuantityFocusLost
        utils.addPlaceholderText((JTextField) evt.getSource(), "0");
        if (utils.checkIntType((JTextField) evt.getSource())) {
        if (!utils.rangeLimit((JTextField) evt.getSource(), 1, 1000)) {
            utils.warningMessage(DialogWarning, lblTitle, lblContent, "Warning", "Can't order less than one box");
        };
        } else {
            utils.warningMessage(DialogWarning, lblTitle, lblContent, "Warning", "Quantity must be an Integer");
        }
    }//GEN-LAST:event_txtQuantityFocusLost

    private void txtQuantityFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQuantityFocusGained
        utils.removePlaceholderText((JTextField) evt.getSource(), "0");
    }//GEN-LAST:event_txtQuantityFocusGained

    private void btnCompleteOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompleteOrderActionPerformed
        
        if (tblOrders.getModel().getRowCount() == 0) {
            utils.warningMessage(DialogWarning, lblTitle, lblContent, "Warning", "You have ordered nothing");
        } else {
            String string = "You order has been completed.\nYour total price is " + lblPrice.getText();
            utils.warningMessage(DialogWarning, lblTitle, lblContent, "Order Complete", string);
            frameComplete.setEnabled(true);
            frameComplete.setVisible(true);
            frameComplete.setSize(new Dimension(500, 500));
        }
    }//GEN-LAST:event_btnCompleteOrderActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        DialogWarning.dispose();
    }//GEN-LAST:event_btnOkActionPerformed

    private void frameCompleteWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_frameCompleteWindowOpened
        ftxtOrder.setText(order.getInvoice());
    }//GEN-LAST:event_frameCompleteWindowOpened

    private void txtHeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHeightActionPerformed

    private void btnCompleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompleteActionPerformed
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_btnCompleteActionPerformed

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
    private javax.swing.JDialog DialogWarning;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnComplete;
    private javax.swing.JButton btnCompleteOrder;
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnRemove;
    private javax.swing.JComboBox<String> cboxColors;
    private javax.swing.JComboBox<String> cboxGrade;
    private javax.swing.JCheckBox chbxReinBot;
    private javax.swing.JCheckBox chbxReinCor;
    private javax.swing.JCheckBox chbxSealTop;
    private javax.swing.JFrame frameComplete;
    private javax.swing.JTextArea ftxtOrder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblColors;
    private javax.swing.JLabel lblContent;
    private javax.swing.JLabel lblDepth;
    private javax.swing.JLabel lblGrade;
    private javax.swing.JLabel lblHeight;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblSize;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblWidth;
    private javax.swing.JTable tblOrders;
    private javax.swing.JTextField txtDepth;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtWidth;
    // End of variables declaration//GEN-END:variables
}
