package com.ronincompany.proyectoads;


public class GUI extends javax.swing.JFrame {

    String cedulas[] = new String[10];
    String nombres[] = new String[10];
    String apellidos[] = new String[10];
    String direcciones[] = new String[10];
    String telefonos[] = new String[10];
    String fechasdenac[] = new String[10];
    
    public GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAdelante = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        cedulaTxt = new javax.swing.JLabel();
        nombreTxt = new javax.swing.JLabel();
        apellidoTxt = new javax.swing.JLabel();
        cedulaTextField = new javax.swing.JTextField();
        nombreTextField = new javax.swing.JTextField();
        apellidoTextField = new javax.swing.JTextField();
        direccionTxt = new javax.swing.JLabel();
        telefonoTxt = new javax.swing.JLabel();
        fnacTxt = new javax.swing.JLabel();
        direccionTextField = new javax.swing.JTextField();
        telefonoTextField = new javax.swing.JTextField();
        fnacTextField = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        numeroIndice = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agenda");

        jLabel1.setFont(new java.awt.Font("Lilex", 1, 36)); // NOI18N
        jLabel1.setText("Agenda Electronica");

        btnAdelante.setFont(new java.awt.Font("Lilex ExtraThick", 0, 20)); // NOI18N
        btnAdelante.setText(">>");
        btnAdelante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdelanteActionPerformed(evt);
            }
        });

        btnAtras.setFont(new java.awt.Font("Lilex ExtraThick", 0, 20)); // NOI18N
        btnAtras.setText("<<");
        btnAtras.setToolTipText("");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        cedulaTxt.setFont(new java.awt.Font("Lilex ExtraLight", 0, 18)); // NOI18N
        cedulaTxt.setText("Cedula   :");

        nombreTxt.setFont(new java.awt.Font("Lilex ExtraLight", 0, 18)); // NOI18N
        nombreTxt.setText("Nombre   :");

        apellidoTxt.setFont(new java.awt.Font("Lilex ExtraLight", 0, 18)); // NOI18N
        apellidoTxt.setText("Apellido :");

        cedulaTextField.setFont(new java.awt.Font("Lilex ExtraLight", 0, 18)); // NOI18N
        cedulaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulaTextFieldActionPerformed(evt);
            }
        });

        nombreTextField.setFont(new java.awt.Font("Lilex ExtraLight", 0, 18)); // NOI18N

        apellidoTextField.setFont(new java.awt.Font("Lilex ExtraLight", 0, 18)); // NOI18N

        direccionTxt.setFont(new java.awt.Font("Lilex ExtraLight", 0, 18)); // NOI18N
        direccionTxt.setText("Direccion :");

        telefonoTxt.setFont(new java.awt.Font("Lilex ExtraLight", 0, 18)); // NOI18N
        telefonoTxt.setText("Telefono  :");

        fnacTxt.setFont(new java.awt.Font("Lilex ExtraLight", 0, 18)); // NOI18N
        fnacTxt.setText("F. Nac    :");

        direccionTextField.setFont(new java.awt.Font("Lilex ExtraLight", 0, 18)); // NOI18N

        telefonoTextField.setFont(new java.awt.Font("Lilex ExtraLight", 0, 18)); // NOI18N

        fnacTextField.setFont(new java.awt.Font("Lilex ExtraLight", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreTxt)
                    .addComponent(apellidoTxt)
                    .addComponent(cedulaTxt))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombreTextField)
                            .addComponent(apellidoTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                        .addGap(103, 103, 103)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telefonoTxt)
                            .addComponent(fnacTxt))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telefonoTextField)
                            .addComponent(fnacTextField)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cedulaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addComponent(direccionTxt)
                        .addGap(6, 6, 6)
                        .addComponent(direccionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cedulaTxt)
                    .addComponent(cedulaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(direccionTxt)
                    .addComponent(direccionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreTxt)
                    .addComponent(nombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefonoTxt)
                    .addComponent(telefonoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellidoTxt)
                    .addComponent(apellidoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fnacTxt)
                    .addComponent(fnacTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        btnGuardar.setFont(new java.awt.Font("Lilex ExtraThick", 0, 20)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        numeroIndice.setEditable(false);
        numeroIndice.setFont(new java.awt.Font("Lilex ExtraThick", 0, 20)); // NOI18N
        numeroIndice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numeroIndice.setText("0");
        numeroIndice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroIndiceActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Lilex ExtraThick", 0, 20)); // NOI18N
        jLabel8.setText("Indice:");
        jLabel8.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(278, 278, 278)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAtras)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(numeroIndice)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnAdelante)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator3))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnAdelante)
                    .addComponent(btnAtras))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(numeroIndice, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cedulaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedulaTextFieldActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
      
        String indice = numeroIndice.getText();
        int indi = Integer.parseInt(indice);

        if (indi > 0) {
            
            indi = indi - 1;
            indice = String.valueOf(indi);
            numeroIndice.setText(indice);
            
            cedulaTextField.setText(cedulas[indi]);
            nombreTextField.setText(nombres[indi]);
            apellidoTextField.setText(apellidos[indi]);
            direccionTextField.setText(direcciones[indi]);
            telefonoTextField.setText(telefonos[indi]);
            fnacTextField.setText(fechasdenac[indi]);
            
        }
        
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void numeroIndiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroIndiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroIndiceActionPerformed

    private void btnAdelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdelanteActionPerformed

        String indice = numeroIndice.getText();
        int indi = Integer.parseInt(indice);

        if (indi < 9) {
            
            indi = indi + 1;
            indice = String.valueOf(indi);
            numeroIndice.setText(indice);
            
            cedulaTextField.setText(cedulas[indi]);
            nombreTextField.setText(nombres[indi]);
            apellidoTextField.setText(apellidos[indi]);
            direccionTextField.setText(direcciones[indi]);
            telefonoTextField.setText(telefonos[indi]);
            fnacTextField.setText(fechasdenac[indi]);
        }
    }//GEN-LAST:event_btnAdelanteActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
     
        String indice = numeroIndice.getText();
        int indi = Integer.parseInt(indice);
        
        cedulas[indi] = cedulaTextField.getText();
        nombres[indi] = nombreTextField.getText();
        apellidos[indi] = apellidoTextField.getText();
        direcciones[indi] = direccionTextField.getText();
        telefonos[indi] = telefonoTextField.getText();
        fechasdenac[indi] = fnacTextField.getText();
       
    }//GEN-LAST:event_btnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidoTextField;
    private javax.swing.JLabel apellidoTxt;
    private javax.swing.JButton btnAdelante;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JTextField cedulaTextField;
    private javax.swing.JLabel cedulaTxt;
    private javax.swing.JTextField direccionTextField;
    private javax.swing.JLabel direccionTxt;
    private javax.swing.JTextField fnacTextField;
    private javax.swing.JLabel fnacTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField nombreTextField;
    private javax.swing.JLabel nombreTxt;
    private javax.swing.JTextField numeroIndice;
    private javax.swing.JTextField telefonoTextField;
    private javax.swing.JLabel telefonoTxt;
    // End of variables declaration//GEN-END:variables
}
