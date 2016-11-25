/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FrmProveedor.java
 *
 * Created on 24/11/2016, 12:06:49 AM
 */
package VISTA;

import MODELO.Proveedor;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import DATOS.*;
import javax.swing.UIManager;

/**
 *
 * @author DANY
 */
public class frmProveedor extends javax.swing.JFrame {
    private frmUsuario user;

    /** Creates new form FrmProveedor */
    public frmProveedor() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        initComponents();
        frmUsuario user = new frmUsuario();
    }

    public void buscarProveedor() {
        Proveedor p = null;
        try {
            p = datosProveedor.buscarProveedor(jtfId.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR:" + e.getMessage());
        }
        if (p != null) {
            txtRazonSPrv.setText(p.getRazonSocial());
            txtEmailPrv.setText(p.getEmail());
            txtCelularPrv.setText(Integer.toString(p.getCelular()));
            txtLugarPrv.setText(p.getLugar());
            txtTelefonoPrv.setText(Integer.toString(p.getTelefono()));
            txtDireccionPrv.setText(p.getDireccion());
            cboTipoPrv.setSelectedItem(p.getGiro());
            jtfId.setText(p.getId());
            jtfNombre.setText(p.getNombre());
            jtfRfc.setText(p.getRfc());
        } else {
            JOptionPane.showMessageDialog(null, "No exite");
        }
    }

    public void activarTextos(boolean b) {
        txtRazonSPrv.setEditable(b);
        txtEmailPrv.setEditable(b);
        txtCelularPrv.setEditable(b);
        txtLugarPrv.setEditable(b);
        txtTelefonoPrv.setEditable(b);
        txtDireccionPrv.setEditable(b);
        jtfId.setEditable(b);
        cboTipoPrv.setEnabled(b);
        jtfNombre.setEditable(b);
        jtfRfc.setEditable(b);
    }

    public void limpiarTextos() {
        jtfId.setText("");
        txtRazonSPrv.setText("");
        txtEmailPrv.setText("");
        txtCelularPrv.setText("");
        txtLugarPrv.setText("");
        txtTelefonoPrv.setText("");
        txtDireccionPrv.setText("");
        jtfNombre.setText("");
        jtfRfc.setText("");
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCelularPrv = new javax.swing.JFormattedTextField();
        txtEmailPrv = new javax.swing.JFormattedTextField();
        txtLugarPrv = new javax.swing.JTextField();
        txtRazonSPrv = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDireccionPrv = new javax.swing.JTextField();
        cboTipoPrv = new javax.swing.JComboBox();
        txtTelefonoPrv = new javax.swing.JFormattedTextField();
        btnBuscarPrv = new javax.swing.JButton();
        btnAgregarPrv = new javax.swing.JButton();
        btnSalirPrv = new javax.swing.JButton();
        btnMostrarPrv = new javax.swing.JButton();
        btnNuevoProv = new javax.swing.JButton();
        btnEliminarPrv = new javax.swing.JButton();
        btnEditarPrv = new javax.swing.JButton();
        btnCancelarPrv = new javax.swing.JButton();
        jtfId = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jtfRfc = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(81, 105, 138));

        jPanel2.setBackground(new java.awt.Color(247, 254, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Razon Social:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Email:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("ID");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Lugar:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Direccion:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Celular:");

        txtCelularPrv.setEditable(false);
        try {
            txtCelularPrv.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(###)-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtEmailPrv.setEditable(false);

        txtLugarPrv.setEditable(false);

        txtRazonSPrv.setEditable(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Giro");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Telefono:");

        txtDireccionPrv.setEditable(false);

        cboTipoPrv.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Eliga Proveedor", "Distribuidores", "Fabricante", "Proveedor Directos e Indirectos", "Proveedor Local", " " }));
        cboTipoPrv.setEnabled(false);
        cboTipoPrv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTipoPrvActionPerformed(evt);
            }
        });

        txtTelefonoPrv.setEditable(false);
        try {
            txtTelefonoPrv.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(###)-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btnBuscarPrv.setText(".....");
        btnBuscarPrv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPrvActionPerformed(evt);
            }
        });

        btnAgregarPrv.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnAgregarPrv.setText("Agregar");
        btnAgregarPrv.setEnabled(false);
        btnAgregarPrv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPrvActionPerformed(evt);
            }
        });

        btnSalirPrv.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSalirPrv.setText("Salir");
        btnSalirPrv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirPrvActionPerformed(evt);
            }
        });

        btnMostrarPrv.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnMostrarPrv.setText("Mostar");
        btnMostrarPrv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarPrvActionPerformed(evt);
            }
        });

        btnNuevoProv.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnNuevoProv.setText("nuevo");
        btnNuevoProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoProvActionPerformed(evt);
            }
        });

        btnEliminarPrv.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnEliminarPrv.setText("Eliminar");
        btnEliminarPrv.setEnabled(false);
        btnEliminarPrv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPrvActionPerformed(evt);
            }
        });

        btnEditarPrv.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnEditarPrv.setText("Editar");
        btnEditarPrv.setEnabled(false);
        btnEditarPrv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPrvActionPerformed(evt);
            }
        });

        btnCancelarPrv.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCancelarPrv.setText("Cancelar");
        btnCancelarPrv.setEnabled(false);
        btnCancelarPrv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarPrvActionPerformed(evt);
            }
        });

        jtfId.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###########"))));

        jLabel10.setText("Nombre");

        jLabel11.setText("RFC");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(btnBuscarPrv))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtRazonSPrv))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel10))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtDireccionPrv, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                                        .addComponent(txtLugarPrv, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtEmailPrv, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                                        .addComponent(jtfNombre))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel8)
                                                .addComponent(jLabel11))
                                            .addGap(2, 2, 2))))))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboTipoPrv, 0, 1, Short.MAX_VALUE)
                            .addComponent(txtCelularPrv)
                            .addComponent(txtTelefonoPrv, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                            .addComponent(jtfRfc)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnSalirPrv, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(btnNuevoProv, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnAgregarPrv, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnEditarPrv, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnEliminarPrv, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnMostrarPrv, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnCancelarPrv, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(37, 37, 37))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnBuscarPrv)
                    .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtRazonSPrv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmailPrv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCelularPrv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTelefonoPrv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLugarPrv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtDireccionPrv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboTipoPrv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jtfRfc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCancelarPrv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminarPrv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditarPrv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAgregarPrv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuevoProv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMostrarPrv, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalirPrv, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("REGISTRO DE PROVEEDOR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarPrvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPrvActionPerformed
        // TODO add your handling code here:
        if (jtfId.getText().compareTo("") != 0) {
            int result = JOptionPane.showConfirmDialog(
                    this, "Deseas Buscar al Proveedor para Modificarlo?",
                    "Mensaje..!!",
                    JOptionPane.YES_NO_OPTION);

            if (result == JOptionPane.YES_OPTION) {
                buscarProveedor();
                btnNuevoProv.setEnabled(false);
                btnMostrarPrv.setEnabled(false);
                btnCancelarPrv.setEnabled(true);
                btnEditarPrv.setEnabled(true);
                activarTextos(true);
                jtfId.setEnabled(true);
                jtfNombre.setEnabled(true);
                jtfRfc.setEnabled(true);
            }
            if (result == JOptionPane.NO_OPTION) {
                buscarProveedor();
                btnEliminarPrv.setEnabled(true);
                btnNuevoProv.setEnabled(false);
                btnCancelarPrv.setEnabled(true);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese ID que Desea Buscar");
        }

    }//GEN-LAST:event_btnBuscarPrvActionPerformed

    private void btnAgregarPrvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPrvActionPerformed
        // TODO add your handling code here:
        if (jtfId.getText().compareTo("") != 0 && txtRazonSPrv.getText().compareTo("") != 0 && txtEmailPrv.getText().compareTo("") != 0
                && txtCelularPrv.getText().compareTo("") != 0 && txtLugarPrv.getText().compareTo("") != 0 && txtTelefonoPrv.getText().compareTo("") != 0
                && txtDireccionPrv.getText().compareTo("") != 0) {
            Proveedor p = new Proveedor() {
            };
            p.setId(jtfId.getText());
            p.setRazonSocial(txtRazonSPrv.getText());
            p.setEmail(txtEmailPrv.getText());
            p.setCelular(Integer.parseInt(txtCelularPrv.getText()));
            p.setLugar(txtLugarPrv.getText());
            p.setTelefono(Integer.parseInt(txtTelefonoPrv.getText()));
            p.setDireccion(txtDireccionPrv.getText());
            p.setGiro(cboTipoPrv.getSelectedItem().toString());
            p.setNombre(jtfNombre.getText());
            p.setRfc(jtfRfc.getText());
            try {
                datosProveedor.insertarProveedor(p);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error BD: " + e.getMessage());
            }
            JOptionPane.showMessageDialog(null, "[ Datos Agregados ]");

        } else {
            JOptionPane.showMessageDialog(null, "Llene todo los Campos");
        }
    }//GEN-LAST:event_btnAgregarPrvActionPerformed

    private void btnEditarPrvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPrvActionPerformed
        // TODO add your handling code here:
        Proveedor p;
        try {
            p = datosProveedor.buscarProveedor(jtfId.getText());
            p.setRazonSocial(txtRazonSPrv.getText());
            p.setEmail(txtEmailPrv.getText());
            p.setCelular(Integer.parseInt(txtCelularPrv.getText()));
            p.setLugar(txtLugarPrv.getText());
            p.setTelefono(Integer.parseInt(txtTelefonoPrv.getText()));
            p.setDireccion(txtDireccionPrv.getText());
            p.setGiro(cboTipoPrv.getSelectedItem().toString());
            datosProveedor.actualizarProveedor(p);
            JOptionPane.showMessageDialog(null, " [ Datos Actualizados ]");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error BD: " + e.getMessage());
        }
        limpiarTextos();
    }//GEN-LAST:event_btnEditarPrvActionPerformed

    private void btnEliminarPrvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPrvActionPerformed
        // TODO add your handling code here:
        try {
            Proveedor p = datosProveedor.buscarProveedor(jtfId.getText());
            if (p == null) {
                JOptionPane.showMessageDialog(null, "No existe");
            } else {
                datosProveedor.eliminarProveedor(p.getId());
                JOptionPane.showMessageDialog(null, "Se Elimino Exitosamente..OKz!!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage());
        }
        limpiarTextos();
    }//GEN-LAST:event_btnEliminarPrvActionPerformed

    private void btnMostrarPrvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarPrvActionPerformed
        // TODO add your handling code here:
        JDListaProveedores LP = new JDListaProveedores(this, true);
        LP.setVisible(true);
    }//GEN-LAST:event_btnMostrarPrvActionPerformed

    private void btnSalirPrvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirPrvActionPerformed
        // TODO add your handling code here:
       
        frmMainMenu menu = new frmMainMenu(user);
        this.dispose();
                menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSalirPrvActionPerformed

    private void cboTipoPrvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTipoPrvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboTipoPrvActionPerformed

    private void btnNuevoProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoProvActionPerformed
        // TODO add your handling code here:
        limpiarTextos();
        activarTextos(true);
        btnAgregarPrv.setEnabled(true);
        btnCancelarPrv.setEnabled(true);
        btnMostrarPrv.setEnabled(false);
        btnBuscarPrv.setEnabled(false);
    }//GEN-LAST:event_btnNuevoProvActionPerformed

    private void btnCancelarPrvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarPrvActionPerformed
        // TODO add your handling code here:
        limpiarTextos();
        activarTextos(false);
        jtfId.setEditable(true);
        btnCancelarPrv.setEnabled(false);
        btnEliminarPrv.setEnabled(false);
        btnNuevoProv.setEnabled(true);
        btnMostrarPrv.setEnabled(true);
        btnBuscarPrv.setEnabled(true);
        btnAgregarPrv.setEnabled(false);
        btnEditarPrv.setEnabled(false);
    }//GEN-LAST:event_btnCancelarPrvActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new frmProveedor().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarPrv;
    private javax.swing.JButton btnBuscarPrv;
    private javax.swing.JButton btnCancelarPrv;
    private javax.swing.JButton btnEditarPrv;
    private javax.swing.JButton btnEliminarPrv;
    private javax.swing.JButton btnMostrarPrv;
    private javax.swing.JButton btnNuevoProv;
    private javax.swing.JButton btnSalirPrv;
    private javax.swing.JComboBox cboTipoPrv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JFormattedTextField jtfId;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfRfc;
    private javax.swing.JFormattedTextField txtCelularPrv;
    private javax.swing.JTextField txtDireccionPrv;
    private javax.swing.JFormattedTextField txtEmailPrv;
    private javax.swing.JTextField txtLugarPrv;
    private javax.swing.JTextField txtRazonSPrv;
    private javax.swing.JFormattedTextField txtTelefonoPrv;
    // End of variables declaration//GEN-END:variables
}
