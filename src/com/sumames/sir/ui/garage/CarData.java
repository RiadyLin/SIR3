/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumames.sir.ui.garage;

import com.sumames.sir.Main;
import com.sumames.sir.entity.Car;
import com.sumames.sir.helper.AppUtil;
import com.sumames.sir.helper.TextComponentUtils;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public class CarData extends javax.swing.JPanel {

    private GarageData garage;
    private String option;
    private int recordId;
    private Car car;

    /**
     * Creates new form CarData
     */
    public CarData(String option, int recordId, GarageData garage) {
        this.garage = garage;
        this.recordId = recordId;
        this.option = option;
        System.out.println(option);
        System.out.println(garage.getOption());
        initComponents();
        LoadingData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CarPanel = new javax.swing.JPanel() {
            @Override
            public void paintComponent(Graphics g){
                super.paintComponent(g);
                GradientPaint paint = new GradientPaint(0, 0, new Color(250, 174, 66, 255), getWidth(), getHeight(), new Color(247, 90, 43, 255));
                Graphics2D g2 = (Graphics2D) g.create();

                g2.setPaint(paint);
                g2.fillRect(0, 0, getWidth(), getHeight());
                g2.setComposite(AlphaComposite.SrcOver.derive(1.0F));
                g2.dispose();
            }
        };
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfCarName = new javax.swing.JTextField();
        tfPlateNumber = new javax.swing.JTextField();
        tfPrice = new javax.swing.JTextField();
        btSaveCarData = new javax.swing.JButton();
        btCancel = new javax.swing.JButton();

        jLabel1.setText("Name");

        jLabel2.setText("Plate Number");

        jLabel3.setText("Price");

        tfCarName.setPreferredSize(new java.awt.Dimension(150, 30));

        tfPlateNumber.setPreferredSize(new java.awt.Dimension(150, 30));

        tfPrice.setPreferredSize(new java.awt.Dimension(150, 30));
        TextComponentUtils.setNumericTextOnly(tfPrice);

        btSaveCarData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sumames/sir/resources/image/buttons/6-01.png"))); // NOI18N
        btSaveCarData.setBorderPainted(false);
        btSaveCarData.setContentAreaFilled(false);
        btSaveCarData.setPreferredSize(new java.awt.Dimension(65, 23));
        btSaveCarData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveCarDataActionPerformed(evt);
            }
        });

        btCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sumames/sir/resources/image/buttons/6-01.png"))); // NOI18N
        btCancel.setBorderPainted(false);
        btCancel.setContentAreaFilled(false);
        btCancel.setPreferredSize(new java.awt.Dimension(65, 23));
        btCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CarPanelLayout = new javax.swing.GroupLayout(CarPanel);
        CarPanel.setLayout(CarPanelLayout);
        CarPanelLayout.setHorizontalGroup(
            CarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CarPanelLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(CarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(CarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfCarName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPlateNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(86, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CarPanelLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(btSaveCarData, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        CarPanelLayout.setVerticalGroup(
            CarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CarPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(CarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfCarName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfPlateNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btSaveCarData, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btSaveCarDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveCarDataActionPerformed
        saveCarData();
    }//GEN-LAST:event_btSaveCarDataActionPerformed

    private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelActionPerformed
        Main.getFrame().getGlasspane().setVisible(false);
    }//GEN-LAST:event_btCancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CarPanel;
    private javax.swing.JButton btCancel;
    private javax.swing.JButton btSaveCarData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField tfCarName;
    private javax.swing.JTextField tfPlateNumber;
    private javax.swing.JTextField tfPrice;
    // End of variables declaration//GEN-END:variables
    public void saveCarData() {
//        Car carData = new Car();
//        carData.setName(tfCarName.getText());
//        carData.setPlateNumber(tfPlateNumber.getText());
//        carData.setPrice(Double.parseDouble(tfPrice.getText()));
        if (garage.getOption().equals("NEW")) {
            DefaultTableModel dtm = (DefaultTableModel) garage.getTbCar().getModel();
            dtm.addRow(new Object[]{0, tfCarName.getText(), tfPlateNumber.getText(), tfPrice.getText(), Boolean.TRUE});
            Main.getFrame().getGlasspane().setVisible(false);
        } else if (garage.getOption().equals("EDIT")) {
            if (option.equals("NEW")) {
                formToObject();
                car.setAvailability(Boolean.TRUE);
                if (AppUtil.getService().save(car)) {
                    msg("Save Done!");
                    garage.refreshTable();
                    Main.getFrame().getGlasspane().setVisible(false);
                } else {
                    msg("Save Failed!");
                }
            } else if (option.equals("EDIT")) {
                formToObject();
                car.setRecordId(recordId);
                car.setEditByUserRecordId(Main.getFrame().getLogin().getEmployeeRecordId());
                car.setEditDatetime(new Date());
                if (AppUtil.getService().save(car)) {
                    msg("Save Done!");
                    garage.refreshTable();
                    Main.getFrame().getGlasspane().setVisible(false);
                } else {
                    msg("Save Failed!");
                }

            }

        }

    }

    public void LoadingData() {

        if (option.equals("NEW")) {
            tfCarName.setText("");
            tfPlateNumber.setText("");
            tfPrice.setText("");
        } else if (option.equals("EDIT")) {
            car = AppUtil.getService().getCarById(recordId);
            objectToForm();
        }
    }

    public void formToObject() {
        if (car == null) {
            car = new Car();
        }
        car.setCarGarageRecordId(garage.getRecordId());
        car.setName(tfCarName.getText());
        car.setPlateNumber(tfPlateNumber.getText());
        car.setPrice(Double.parseDouble(tfPrice.getText()));
    }

    public void objectToForm() {
        if (car != null) {
            tfCarName.setText(car.getName());
            tfPlateNumber.setText(car.getPlateNumber());
            tfPrice.setText(car.getPrice().toString());
        }
    }

    private void msg(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }
}
