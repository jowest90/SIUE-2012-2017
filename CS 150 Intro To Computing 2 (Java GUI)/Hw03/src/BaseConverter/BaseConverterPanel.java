/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseConverter;

import java.util.Scanner;

/**
 *
 * @author Johnny
 */
public class BaseConverterPanel extends javax.swing.JPanel {

    private BaseNumber bn;

    /**
     * Creates new form BaseConverterPanel
     */
    public BaseConverterPanel() {
        initComponents();
        bn = new BaseNumber();
        fromLabel.setText("From: Dec");
        toLabel1.setText("To: Bin");
        toLabel2.setText("To: Hex");
        fromTextField.setText("0");
        toTextField1.setText("0");
        toTextField2.setText("0");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fromLabel = new javax.swing.JLabel();
        fromPanel = new javax.swing.JPanel();
        fromDecRadioButton = new javax.swing.JRadioButton();
        fromBinRadioButton = new javax.swing.JRadioButton();
        fromHexRadioButton = new javax.swing.JRadioButton();
        fromTextField = new javax.swing.JTextField();
        toLabel1 = new javax.swing.JLabel();
        toPanel1 = new javax.swing.JPanel();
        toDecRadioButton1 = new javax.swing.JRadioButton();
        toBinRadioButton1 = new javax.swing.JRadioButton();
        toHexRadioButton1 = new javax.swing.JRadioButton();
        toTextField1 = new javax.swing.JTextField();
        toLabel2 = new javax.swing.JLabel();
        toPanel2 = new javax.swing.JPanel();
        toDecRadioButton2 = new javax.swing.JRadioButton();
        toBinRadioButton2 = new javax.swing.JRadioButton();
        toHexRadioButton2 = new javax.swing.JRadioButton();
        toTextField2 = new javax.swing.JTextField();
        convertButton = new javax.swing.JButton();

        fromLabel.setText("From:");

        fromPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        fromDecRadioButton.setSelected(true);
        fromDecRadioButton.setText("Dec");
        fromDecRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromBaseRadioActionPerformed(evt);
            }
        });

        fromBinRadioButton.setText("Bin");
        fromBinRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromBaseRadioActionPerformed(evt);
            }
        });

        fromHexRadioButton.setText("Hex");
        fromHexRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromBaseRadioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fromPanelLayout = new javax.swing.GroupLayout(fromPanel);
        fromPanel.setLayout(fromPanelLayout);
        fromPanelLayout.setHorizontalGroup(
            fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fromPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fromTextField)
                    .addGroup(fromPanelLayout.createSequentialGroup()
                        .addComponent(fromDecRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fromBinRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fromHexRadioButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        fromPanelLayout.setVerticalGroup(
            fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fromPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fromDecRadioButton)
                    .addComponent(fromBinRadioButton)
                    .addComponent(fromHexRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fromTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        toLabel1.setText("To:");

        toPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        toDecRadioButton1.setText("Dec");
        toDecRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toBaseRadio1ActionPerformed(evt);
            }
        });

        toBinRadioButton1.setSelected(true);
        toBinRadioButton1.setText("Bin");
        toBinRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toBaseRadio1ActionPerformed(evt);
            }
        });

        toHexRadioButton1.setText("Hex");
        toHexRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toBaseRadio1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout toPanel1Layout = new javax.swing.GroupLayout(toPanel1);
        toPanel1.setLayout(toPanel1Layout);
        toPanel1Layout.setHorizontalGroup(
            toPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(toPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(toTextField1)
                    .addGroup(toPanel1Layout.createSequentialGroup()
                        .addComponent(toDecRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(toBinRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(toHexRadioButton1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        toPanel1Layout.setVerticalGroup(
            toPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(toPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toDecRadioButton1)
                    .addComponent(toBinRadioButton1)
                    .addComponent(toHexRadioButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(toTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        toLabel2.setText("To:");

        toPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        toDecRadioButton2.setText("Dec");
        toDecRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toBaseRadio2ActionPerformed(evt);
            }
        });

        toBinRadioButton2.setText("Bin");
        toBinRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toBaseRadio2ActionPerformed(evt);
            }
        });

        toHexRadioButton2.setSelected(true);
        toHexRadioButton2.setText("Hex");
        toHexRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toBaseRadio2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout toPanel2Layout = new javax.swing.GroupLayout(toPanel2);
        toPanel2.setLayout(toPanel2Layout);
        toPanel2Layout.setHorizontalGroup(
            toPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(toPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(toTextField2)
                    .addGroup(toPanel2Layout.createSequentialGroup()
                        .addComponent(toDecRadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(toBinRadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(toHexRadioButton2)
                        .addGap(0, 63, Short.MAX_VALUE)))
                .addContainerGap())
        );
        toPanel2Layout.setVerticalGroup(
            toPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(toPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toDecRadioButton2)
                    .addComponent(toBinRadioButton2)
                    .addComponent(toHexRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(toTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        convertButton.setText("Convert");
        convertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(convertButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(toPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fromLabel)
                    .addComponent(toLabel1)
                    .addComponent(toLabel2)
                    .addComponent(fromPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(toPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fromLabel)
                .addGap(1, 1, 1)
                .addComponent(fromPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(toLabel1)
                .addGap(1, 1, 1)
                .addComponent(toPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(toLabel2)
                .addGap(1, 1, 1)
                .addComponent(toPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(convertButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fromBaseRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fromBaseRadioActionPerformed
        // TODO add your handling code here:
        if (evt.getSource() == fromDecRadioButton) {
            fromDecRadioButton.setSelected(true);
            fromBinRadioButton.setSelected(false);
            fromHexRadioButton.setSelected(false);
            fromLabel.setText("From: Dec");
            fromTextField.setText("0");
            toTextField1.setText("0");
            toTextField2.setText("0");
            bn.setBase10Value(0);
        } else if (evt.getSource() == fromBinRadioButton) {
            fromDecRadioButton.setSelected(false);
            fromBinRadioButton.setSelected(true);
            fromHexRadioButton.setSelected(false);
            fromLabel.setText("From: Bin");
            fromTextField.setText("0");
            toTextField1.setText("0");
            toTextField2.setText("0");
            bn.setBase10Value(0);
        } else if (evt.getSource() == fromHexRadioButton) {
            fromDecRadioButton.setSelected(false);
            fromBinRadioButton.setSelected(false);
            fromHexRadioButton.setSelected(true);
            fromLabel.setText("From: Hex");
            fromTextField.setText("0");
            toTextField1.setText("0");
            toTextField2.setText("0");
            bn.setBase10Value(0);
        }
    }//GEN-LAST:event_fromBaseRadioActionPerformed

    private void toBaseRadio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toBaseRadio1ActionPerformed
        // TODO add your handling code here:
        if (evt.getSource() == toDecRadioButton1) {
            toDecRadioButton1.setSelected(true);
            toBinRadioButton1.setSelected(false);
            toHexRadioButton1.setSelected(false);
            toLabel1.setText("To: Dec");
            toTextField1.setText(Integer.toString(bn.getBase10Value()));
        } else if (evt.getSource() == toBinRadioButton1) {
            toDecRadioButton1.setSelected(false);
            toBinRadioButton1.setSelected(true);
            toHexRadioButton1.setSelected(false);
            toLabel1.setText("To: Bin");
            toTextField1.setText(bn.getBase2Value());
        } else if (evt.getSource() == toHexRadioButton1) {
            toDecRadioButton1.setSelected(false);
            toBinRadioButton1.setSelected(false);
            toHexRadioButton1.setSelected(true);
            toLabel1.setText("To: Hex");
            toTextField1.setText(bn.getBase16Value());
        }
    }//GEN-LAST:event_toBaseRadio1ActionPerformed

    private void toBaseRadio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toBaseRadio2ActionPerformed
        // TODO add your handling code here:
        if (evt.getSource() == toDecRadioButton2) {
            toDecRadioButton2.setSelected(true);
            toBinRadioButton2.setSelected(false);
            toHexRadioButton2.setSelected(false);
            toLabel2.setText("To: Dec");
            toTextField2.setText(Integer.toString(bn.getBase10Value()));
        } else if (evt.getSource() == toBinRadioButton2) {
            toDecRadioButton2.setSelected(false);
            toBinRadioButton2.setSelected(true);
            toHexRadioButton2.setSelected(false);
            toLabel2.setText("To: Bin");
            toTextField2.setText(bn.getBase2Value());
        } else if (evt.getSource() == toHexRadioButton2) {
            toDecRadioButton2.setSelected(false);
            toBinRadioButton2.setSelected(false);
            toHexRadioButton2.setSelected(true);
            toLabel2.setText("To: Hex");
            toTextField2.setText(bn.getBase16Value());
        }
    }//GEN-LAST:event_toBaseRadio2ActionPerformed

    private void convertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertButtonActionPerformed
        // TODO add your handling code here:
        Scanner keyboard = new Scanner(fromTextField.getText());
        int num = keyboard.nextInt();
        bn.setBase10Value(num);
        if (evt.getSource() == convertButton) {
            fromTextField.setText(Integer.toString(bn.getBase10Value()));
            toTextField1.setText(bn.getBase2Value());
            toTextField2.setText(bn.getBase16Value());
        }
    }//GEN-LAST:event_convertButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton convertButton;
    private javax.swing.JRadioButton fromBinRadioButton;
    private javax.swing.JRadioButton fromDecRadioButton;
    private javax.swing.JRadioButton fromHexRadioButton;
    private javax.swing.JLabel fromLabel;
    private javax.swing.JPanel fromPanel;
    private javax.swing.JTextField fromTextField;
    private javax.swing.JRadioButton toBinRadioButton1;
    private javax.swing.JRadioButton toBinRadioButton2;
    private javax.swing.JRadioButton toDecRadioButton1;
    private javax.swing.JRadioButton toDecRadioButton2;
    private javax.swing.JRadioButton toHexRadioButton1;
    private javax.swing.JRadioButton toHexRadioButton2;
    private javax.swing.JLabel toLabel1;
    private javax.swing.JLabel toLabel2;
    private javax.swing.JPanel toPanel1;
    private javax.swing.JPanel toPanel2;
    private javax.swing.JTextField toTextField1;
    private javax.swing.JTextField toTextField2;
    // End of variables declaration//GEN-END:variables
}