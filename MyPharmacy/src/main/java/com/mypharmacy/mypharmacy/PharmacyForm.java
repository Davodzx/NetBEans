
package com.mypharmacy.mypharmacy;

import javax.swing.JOptionPane;


public class PharmacyForm extends javax.swing.JFrame {

    public PharmacyForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GroupDistribuidor = new javax.swing.ButtonGroup();
        GroupSucursal = new javax.swing.ButtonGroup();
        Body = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        TitleForm = new javax.swing.JLabel();
        ImageTitleForm = new javax.swing.JLabel();
        LabelCantidadProducto = new javax.swing.JLabel();
        NombreMedicamento = new javax.swing.JTextField();
        LabelSucursal = new javax.swing.JLabel();
        TipoMedicamento = new javax.swing.JComboBox<>();
        LabelTipoMedicamento = new javax.swing.JLabel();
        CantidadProducto = new javax.swing.JTextField();
        LabelNombreMedicamento = new javax.swing.JLabel();
        OptionCofarma = new javax.swing.JRadioButton();
        OptionEmpesephar = new javax.swing.JRadioButton();
        OptionCemefar = new javax.swing.JRadioButton();
        LabelDistribuidor = new javax.swing.JLabel();
        OptionPrincipal = new javax.swing.JCheckBox();
        OptionSecundaria = new javax.swing.JCheckBox();
        BtnBorrar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        BtnPedido = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FormPharmacy");

        Body.setBackground(new java.awt.Color(214, 234, 248));
        Body.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Body.setPreferredSize(new java.awt.Dimension(550, 500));
        Body.setLayout(null);

        Header.setBackground(new java.awt.Color(255, 255, 255));
        Header.setForeground(new java.awt.Color(51, 135, 196));
        Header.setPreferredSize(new java.awt.Dimension(800, 100));

        TitleForm.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        TitleForm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleForm.setLabelFor(Header);
        TitleForm.setText("PharmacyService");
        TitleForm.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        TitleForm.setPreferredSize(new java.awt.Dimension(250, 24));

        ImageTitleForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pharmacy.png"))); // NOI18N

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(ImageTitleForm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TitleForm, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(306, Short.MAX_VALUE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ImageTitleForm, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TitleForm, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        Body.add(Header);
        Header.setBounds(0, 0, 800, 100);

        LabelCantidadProducto.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        LabelCantidadProducto.setText("Cantidad de Producto");
        Body.add(LabelCantidadProducto);
        LabelCantidadProducto.setBounds(20, 290, 180, 30);

        NombreMedicamento.setBackground(new java.awt.Color(214, 234, 248));
        NombreMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreMedicamentoActionPerformed(evt);
            }
        });
        Body.add(NombreMedicamento);
        NombreMedicamento.setBounds(20, 140, 180, 30);

        LabelSucursal.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        LabelSucursal.setText("Sucursal Farmacia");
        Body.add(LabelSucursal);
        LabelSucursal.setBounds(280, 250, 180, 30);

        TipoMedicamento.setBackground(new java.awt.Color(214, 234, 248));
        TipoMedicamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion", "Analgesico", "Analeptico", "Anestesico", "Antiacido", "Antidepresivo", "Antibioticos" }));
        TipoMedicamento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TipoMedicamento.setFocusable(false);
        TipoMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoMedicamentoActionPerformed(evt);
            }
        });
        Body.add(TipoMedicamento);
        TipoMedicamento.setBounds(20, 220, 180, 40);

        LabelTipoMedicamento.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        LabelTipoMedicamento.setText("Tipo de Medicamento");
        Body.add(LabelTipoMedicamento);
        LabelTipoMedicamento.setBounds(20, 190, 180, 30);

        CantidadProducto.setBackground(new java.awt.Color(214, 234, 248));
        Body.add(CantidadProducto);
        CantidadProducto.setBounds(20, 320, 150, 30);

        LabelNombreMedicamento.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        LabelNombreMedicamento.setText("Nombre del medicamento");
        Body.add(LabelNombreMedicamento);
        LabelNombreMedicamento.setBounds(20, 110, 180, 30);

        OptionCofarma.setBackground(new java.awt.Color(214, 234, 248));
        GroupDistribuidor.add(OptionCofarma);
        OptionCofarma.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        OptionCofarma.setText("Cofarma");
        OptionCofarma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OptionCofarmaActionPerformed(evt);
            }
        });
        Body.add(OptionCofarma);
        OptionCofarma.setBounds(280, 140, 90, 24);

        OptionEmpesephar.setBackground(new java.awt.Color(214, 234, 248));
        GroupDistribuidor.add(OptionEmpesephar);
        OptionEmpesephar.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        OptionEmpesephar.setText("Empsephar");
        OptionEmpesephar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OptionEmpesepharActionPerformed(evt);
            }
        });
        Body.add(OptionEmpesephar);
        OptionEmpesephar.setBounds(280, 160, 98, 24);

        OptionCemefar.setBackground(new java.awt.Color(214, 234, 248));
        GroupDistribuidor.add(OptionCemefar);
        OptionCemefar.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        OptionCemefar.setText("Cemefar");
        OptionCemefar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OptionCemefarActionPerformed(evt);
            }
        });
        Body.add(OptionCemefar);
        OptionCemefar.setBounds(280, 180, 160, 24);

        LabelDistribuidor.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        LabelDistribuidor.setText("Distribuidor Farmaceutico");
        Body.add(LabelDistribuidor);
        LabelDistribuidor.setBounds(280, 110, 180, 30);

        OptionPrincipal.setBackground(new java.awt.Color(214, 234, 248));
        OptionPrincipal.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        OptionPrincipal.setText("Principal");
        OptionPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OptionPrincipalActionPerformed(evt);
            }
        });
        Body.add(OptionPrincipal);
        OptionPrincipal.setBounds(280, 280, 160, 23);

        OptionSecundaria.setBackground(new java.awt.Color(214, 234, 248));
        OptionSecundaria.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        OptionSecundaria.setText("Secundaria");
        OptionSecundaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OptionSecundariaActionPerformed(evt);
            }
        });
        Body.add(OptionSecundaria);
        OptionSecundaria.setBounds(280, 310, 100, 23);

        BtnBorrar.setBackground(new java.awt.Color(214, 234, 248));
        BtnBorrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-delete-50.png"))); // NOI18N
        BtnBorrar.setText("Borrar");
        BtnBorrar.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        BtnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBorrarActionPerformed(evt);
            }
        });
        Body.add(BtnBorrar);
        BtnBorrar.setBounds(310, 420, 120, 40);

        jPanel1.setBackground(new java.awt.Color(214, 234, 248));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 308, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );

        Body.add(jPanel1);
        jPanel1.setBounds(240, 100, 310, 300);

        jPanel2.setBackground(new java.awt.Color(214, 234, 248));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 238, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );

        Body.add(jPanel2);
        jPanel2.setBounds(0, 100, 240, 300);

        BtnPedido.setBackground(new java.awt.Color(214, 234, 248));
        BtnPedido.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-delivery-40.png"))); // NOI18N
        BtnPedido.setText("Hacer Pedido");
        BtnPedido.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        BtnPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPedidoActionPerformed(evt);
            }
        });
        Body.add(BtnPedido);
        BtnPedido.setBounds(40, 420, 170, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Body, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Body, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        Body.getAccessibleContext().setAccessibleName("");
        Body.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NombreMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreMedicamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreMedicamentoActionPerformed

    private void TipoMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoMedicamentoActionPerformed
   
    }//GEN-LAST:event_TipoMedicamentoActionPerformed

    private void OptionCofarmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OptionCofarmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OptionCofarmaActionPerformed

    private void OptionEmpesepharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OptionEmpesepharActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OptionEmpesepharActionPerformed

    private void OptionPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OptionPrincipalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OptionPrincipalActionPerformed

    private void OptionSecundariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OptionSecundariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OptionSecundariaActionPerformed

    private void BtnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBorrarActionPerformed
        Validations validations = new Validations();
        ResetForm();
        
    }//GEN-LAST:event_BtnBorrarActionPerformed

    private void BtnPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPedidoActionPerformed
        // TODO add your handling code here:
        String nombreMedicamento = NombreMedicamento.getText();
        String tipoMedicamento = (String) TipoMedicamento.getSelectedItem();
        int indexMedicamento = TipoMedicamento.getSelectedIndex();
        String cantidad = CantidadProducto.getText();
        String distribuidor = "";
        
        if (OptionCofarma.isSelected()){
           distribuidor = "Cofarma";
        }
        else if (OptionEmpesephar.isSelected()){
            distribuidor = "Empsephar";
        }
        else if (OptionCemefar.isSelected()){
            distribuidor = "Cemefar";
        }
        
        String sucursal = "";
        if (OptionPrincipal.isSelected() && OptionSecundaria.isSelected()){
            sucursal = "<html>Para la farmacia situada en Calle de la Rosa n. 28<br>" +
               "y para la situada en Calle Alcazabilla n.3</html>";
           
        }
        else if (OptionPrincipal.isSelected()) {
            sucursal = "Para la farmacia situada en Calle de la Rosa n. 28";
        } 
        else if (OptionSecundaria.isSelected()) {
            System.out.println("Prueba secundaria!");
            sucursal = "Para la farmacia situada en Calle Alcazabilla n.3";
        }
       
        
         String FormularioCheck = Validations.Validador(nombreMedicamento, tipoMedicamento, cantidad, distribuidor, sucursal, indexMedicamento);
        
        if(!FormularioCheck.isEmpty()) {
            JOptionPane.showMessageDialog(this, FormularioCheck, "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            
            ResumenPedido resumen = new ResumenPedido(this, nombreMedicamento, tipoMedicamento, Integer.parseInt(cantidad), distribuidor, sucursal);
            resumen.setVisible(true);
        }
    }//GEN-LAST:event_BtnPedidoActionPerformed
    public void ResetForm(){
        NombreMedicamento.setText("");
        TipoMedicamento.setSelectedIndex(0);
        CantidadProducto.setText("");
        GroupDistribuidor.clearSelection();
        OptionPrincipal.setSelected(false);
        OptionSecundaria.setSelected(false);
    }
    
    public String texto (String texto){
        return "<html>" + texto.replace("\n", "<br>") + "</html>";
    }
 
    
    private void OptionCemefarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OptionCemefarActionPerformed
    
    }//GEN-LAST:event_OptionCemefarActionPerformed

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
            java.util.logging.Logger.getLogger(PharmacyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PharmacyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PharmacyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PharmacyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PharmacyForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Body;
    private javax.swing.JButton BtnBorrar;
    private javax.swing.JButton BtnPedido;
    private javax.swing.JTextField CantidadProducto;
    private javax.swing.ButtonGroup GroupDistribuidor;
    private javax.swing.ButtonGroup GroupSucursal;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel ImageTitleForm;
    private javax.swing.JLabel LabelCantidadProducto;
    private javax.swing.JLabel LabelDistribuidor;
    private javax.swing.JLabel LabelNombreMedicamento;
    private javax.swing.JLabel LabelSucursal;
    private javax.swing.JLabel LabelTipoMedicamento;
    private javax.swing.JTextField NombreMedicamento;
    private javax.swing.JRadioButton OptionCemefar;
    private javax.swing.JRadioButton OptionCofarma;
    private javax.swing.JRadioButton OptionEmpesephar;
    private javax.swing.JCheckBox OptionPrincipal;
    private javax.swing.JCheckBox OptionSecundaria;
    private javax.swing.JComboBox<String> TipoMedicamento;
    private javax.swing.JLabel TitleForm;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
