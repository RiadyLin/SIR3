/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumames.sir.ui.people;

import com.sumames.sir.Main;
import com.sumames.sir.entity.Customer;
import com.sumames.sir.helper.AppUtil;
import com.sumames.sir.helper.ComponentUtils;
import com.sumames.sir.helper.Support;
import java.awt.Color;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author My pc
 */
public class CustomerList extends javax.swing.JPanel {

    private List<Customer> customers;

    /**
     * Creates new form people
     */
    public CustomerList() {
        initComponents();
        refreshTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbCustomer = new javax.swing.JTable();
        tfSearch = new javax.swing.JTextField();
        btSearch = new javax.swing.JButton();
        btAdd = new javax.swing.JButton();
        btEdit = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        btRefresh = new javax.swing.JButton();
        chkDelete = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(255, 153, 0));
        setToolTipText("");
        setName(""); // NOI18N
        setOpaque(false);

        tbCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbCustomerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbCustomer);

        tfSearch.setPreferredSize(new java.awt.Dimension(6, 25));
        tfSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfSearchKeyReleased(evt);
            }
        });

        btSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sumames/sir/resources/image/buttons/1-01.png"))); // NOI18N
        btSearch.setBorderPainted(false);
        btSearch.setContentAreaFilled(false);

        btAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sumames/sir/resources/image/buttons/2-01.png"))); // NOI18N
        btAdd.setBorder(null);
        btAdd.setContentAreaFilled(false);
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });

        btEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sumames/sir/resources/image/buttons/3-01.png"))); // NOI18N
        btEdit.setBorder(null);
        btEdit.setContentAreaFilled(false);
        btEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditActionPerformed(evt);
            }
        });

        btDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sumames/sir/resources/image/buttons/4-01.png"))); // NOI18N
        btDelete.setBorder(null);
        btDelete.setContentAreaFilled(false);
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });

        btRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sumames/sir/resources/image/buttons/5-01.png"))); // NOI18N
        btRefresh.setBorderPainted(false);
        btRefresh.setContentAreaFilled(false);
        btRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRefreshActionPerformed(evt);
            }
        });

        chkDelete.setForeground(new java.awt.Color(255, 255, 255));
        chkDelete.setText("Show Deleted");
        chkDelete.setOpaque(false);
        chkDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 824, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkDelete))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btDelete)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(btSearch)
                        .addComponent(btRefresh)
                        .addComponent(btAdd)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkDelete)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        new Support().NewTab(Main.getFrame().getTab(), new CustomerData("NEW", 0), "Customer Input");
    }//GEN-LAST:event_btAddActionPerformed

    private void tbCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCustomerMouseClicked
        if (evt.getClickCount() == 2) {
            if (tbCustomer.getSelectedRow() >= 0) {
                CustomerData cd = new CustomerData("EDIT", Integer.valueOf(tbCustomer.getValueAt(tbCustomer.getSelectedRow(), 0).toString()));
                new Support().NewTab(Main.getFrame().getTab(), cd, "Customer Data - " + tbCustomer.getValueAt(tbCustomer.getSelectedRow(), 1).toString());

//            JOptionPane.showMessageDialog(null, tbCustomer.getValueAt(tbCustomer.getSelectedRow(), 0).toString());
            }
        }
    }//GEN-LAST:event_tbCustomerMouseClicked

    private void btEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditActionPerformed
        if (tbCustomer.getSelectedRow() >= 0) {
            CustomerData cd = new CustomerData("EDIT", Integer.valueOf(tbCustomer.getValueAt(tbCustomer.getSelectedRow(), 0).toString()));
            new Support().NewTab(Main.getFrame().getTab(), cd, "Customer Data - " + tbCustomer.getValueAt(tbCustomer.getSelectedRow(), 1).toString());

//            JOptionPane.showMessageDialog(null, tbCustomer.getValueAt(tbCustomer.getSelectedRow(), 0).toString());
        }
    }//GEN-LAST:event_btEditActionPerformed

    private void btRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRefreshActionPerformed
        refreshTable();
    }//GEN-LAST:event_btRefreshActionPerformed

    private void tfSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSearchKeyReleased
        for (int i = 0; i < tbCustomer.getRowCount(); i++) {
            if (tbCustomer.getValueAt(i, 1).toString().startsWith(tfSearch.getText())) {
                //select baris yang ditemukan
                tbCustomer.getSelectionModel().setSelectionInterval(i, i);
                //scroll ke baris tersebut kalau ada di bawah atau bagian atas 
                ComponentUtils.scrollToRect(tbCustomer, i);
                break;
            } else if (tbCustomer.getValueAt(i, 2).toString().startsWith(tfSearch.getText())) {
                //select baris yang ditemukan
                tbCustomer.getSelectionModel().setSelectionInterval(i, i);
                //scroll ke baris tersebut kalau ada di bawah atau bagian atas 
                ComponentUtils.scrollToRect(tbCustomer, i);
                break;
            }
        }
    }//GEN-LAST:event_tfSearchKeyReleased

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
        if (tbCustomer.getSelectedRow() >= 0) {
            Customer customer = AppUtil.getService().getCustomerById(Integer.valueOf(tbCustomer.getValueAt(tbCustomer.getSelectedRow(), 0).toString()));
            if (customer != null) {
                customer.setDeleteDatetime(new Date());
                customer.setDeletebyuserRecordid(Main.getFrame().getLogin().getEmployeeRecordId());
                if (AppUtil.getService().save(customer)) {
                    msg("Delete Done!");
                    refreshTable();
                } else {
                    msg("Delete Failed!");
                }

            }

        }
    }//GEN-LAST:event_btDeleteActionPerformed

    private void chkDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkDeleteActionPerformed
        refreshTable();
    }//GEN-LAST:event_chkDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btEdit;
    private javax.swing.JButton btRefresh;
    private javax.swing.JButton btSearch;
    private javax.swing.JCheckBox chkDelete;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbCustomer;
    private javax.swing.JTextField tfSearch;
    // End of variables declaration//GEN-END:variables
    private void refreshTable() {
        if (!chkDelete.isSelected()) {
            customers = AppUtil.getService().getCustomersDeleted();
            tbCustomer.setModel(new CustomerNotDeletedTableModel(customers));
            tbCustomer.getColumnModel().getColumn(0).setMinWidth(0);
            tbCustomer.getColumnModel().getColumn(0).setMaxWidth(0);
        } else {
            customers = AppUtil.getService().getCustomers();
            tbCustomer.setModel(new CustomerTableModel(customers));
            tbCustomer.getColumnModel().getColumn(0).setMinWidth(0);
            tbCustomer.getColumnModel().getColumn(0).setMaxWidth(0);
        }

    }

    private class CustomerNotDeletedTableModel extends AbstractTableModel {

        private List<Customer> listCustomers;
        private final String[] tableHeaders = {"Record Id", "No", "Name", "Address", "Telephone", "Email", "Gender", "Point"};

        public CustomerNotDeletedTableModel(List<Customer> listCustomers) {
            this.listCustomers = listCustomers;
        }

        public int getRowCount() {
            return listCustomers.size();
        }

        public int getColumnCount() {
            return 8;
        }

        @Override
        public String getColumnName(int columnIndex) {
            return tableHeaders[columnIndex];
        }

        public Object getValueAt(int rowIndex, int columnIndex) {
            Customer p = customers.get(rowIndex);
            tbCustomer.setBackground(Color.white);
            switch (columnIndex) {
                case 0:
                    return p.getRecordId();
                case 1:
                    return p.getNo();
                case 2:
                    return p.getName();
                case 3:
                    return p.getAddress();
                case 4:
                    return p.getTelephone();
                case 5:
                    return p.getEmail();
                case 6:
                    String gender = "";
                    if (p.getGender() == 0) {
                        gender = "Male";
                    } else {
                        gender = "Female";
                    }
                    return gender;
                case 7:
                    return p.getPoint();
                default:
                    return "";
            }
        }
    }

    private class CustomerTableModel extends AbstractTableModel {

        private List<Customer> listCustomers;
        private final String[] tableHeaders = {"Record Id", "No", "Name", "Address", "Telephone", "Email", "Gender", "Point", "Delete Datetime", "Delete by user id"};

        public CustomerTableModel(List<Customer> listCustomers) {
            this.listCustomers = listCustomers;
        }

        public int getRowCount() {
            return listCustomers.size();
        }

        public int getColumnCount() {
            return 10;
        }

        @Override
        public String getColumnName(int columnIndex) {
            return tableHeaders[columnIndex];
        }

        public Object getValueAt(int rowIndex, int columnIndex) {
            Customer p = customers.get(rowIndex);
            if (p.getDeleteDatetime() != null) {
                tbCustomer.setBackground(Color.red);
            } else {
                tbCustomer.setBackground(Color.white);
            }
            switch (columnIndex) {
                case 0:

                    return p.getRecordId();
                case 1:
                    return p.getNo();
                case 2:
                    return p.getName();
                case 3:
                    return p.getAddress();
                case 4:
                    return p.getTelephone();
                case 5:
                    return p.getEmail();
                case 6:
                    String gender = "";
                    if (p.getGender() == 0) {
                        gender = "Male";
                    } else {
                        gender = "Female";
                    }
                    return gender;
                case 7:
                    return p.getPoint();
                case 8:

                    return p.getDeleteDatetime();
                case 9:
                    return p.getDeletebyuserRecordid();
                default:
                    return "";
            }
        }
    }

    private void msg(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }

}
