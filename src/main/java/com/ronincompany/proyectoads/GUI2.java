package com.ronincompany.proyectoads;

import java.text.Normalizer;

public class GUI2 extends javax.swing.JFrame {

    String cedulas[] = {"23.456.789", "18.234.567", "27.678.901", "19.345.678", "22.567.890", "21.234.567", "20.789.012", "25.890.123", "24.678.901", "26.345.678"};
    String nombres[] = {"María", "Juan", "Ana", "Carlos", "Luisa", "Pedro", "Laura", "José", "Carmen", "Miguel"};
    String apellidos[] = {"Pérez", "López", "Castillo", "Morales", "Torres", "Herrera", "Suárez", "Flores", "Gil", "Mendoza"};
    String direcciones[] = {"Av. Los Almendros, Caracas", "Calle Solano, Maracaibo", "Urb. La Trinidad, Valencia", "Av. Las Palmas, Barquisimeto", "Calle Los Próceres, Mérida", "Urb. El Bosque, Puerto Ordaz", "Av. Bolívar, Cumaná", "Calle Principal, Maturín", "Urb. El Hatillo, San Cristóbal", "Av. Libertador, Maracay"};
    String telefonos[] = {"0412-1234567", "0414-2345678", "0416-3456789", "0412-4567890", "0414-5678901", "0416-6789012", "0412-7890123", "0414-8901234", "0416-9012345", "0412-0123456"};
    String fechasdenac[] = {"15/03/1985", "22/07/1990", "30/11/1992", "10/01/1988", "05/05/1983", "12/09/1986", "18/02/1994", "25/06/1987", "09/12/1991", "03/08/1989"};

    private void llenarCampos(int indice) {
        cedulaTextField.setText(cedulas[indice]);
        nombreTextField.setText(nombres[indice]);
        apellidoTextField.setText(apellidos[indice]);
        direccionTextField.setText(direcciones[indice]);
        telefonoTextField.setText(telefonos[indice]);
        fnacTextField.setText(fechasdenac[indice]);
        numeroIndice.setText(String.valueOf(indice));

    }
    
    public static String normalize(String input) {
        String normalized = Normalizer.normalize(input, Normalizer.Form.NFD);
        return normalized.replaceAll("\\p{M}", "").toLowerCase();
    }
    
    public GUI2() {
        initComponents();
        llenarCampos(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        cedulaTxt = new javax.swing.JLabel();
        nombreTxt = new javax.swing.JLabel();
        apellidoTxt = new javax.swing.JLabel();
        apellidoTextField = new javax.swing.JTextField();
        direccionTxt = new javax.swing.JLabel();
        telefonoTxt = new javax.swing.JLabel();
        fnacTxt = new javax.swing.JLabel();
        direccionTextField = new javax.swing.JTextField();
        telefonoTextField = new javax.swing.JTextField();
        fnacTextField = new javax.swing.JTextField();
        cedulaTextField = new javax.swing.JTextField();
        nombreTextField = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        derechaBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        izquierdaBtn = new javax.swing.JButton();
        numeroIndice = new javax.swing.JTextField();
        buscarTextField = new javax.swing.JTextField();
        buscarBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agenda");

        jLabel1.setFont(new java.awt.Font("Lilex", 1, 36)); // NOI18N
        jLabel1.setText("Agenda Electronica");

        cedulaTxt.setFont(new java.awt.Font("Lilex ExtraLight", 0, 18)); // NOI18N
        cedulaTxt.setText("Cedula   :");

        nombreTxt.setFont(new java.awt.Font("Lilex ExtraLight", 0, 18)); // NOI18N
        nombreTxt.setText("Nombre   :");

        apellidoTxt.setFont(new java.awt.Font("Lilex ExtraLight", 0, 18)); // NOI18N
        apellidoTxt.setText("Apellido :");

        apellidoTextField.setFont(new java.awt.Font("Lilex ExtraLight", 0, 18)); // NOI18N
        apellidoTextField.setForeground(new java.awt.Color(0, 0, 0));
        apellidoTextField.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        apellidoTextField.setEnabled(false);

        direccionTxt.setFont(new java.awt.Font("Lilex ExtraLight", 0, 18)); // NOI18N
        direccionTxt.setText("Direccion :");

        telefonoTxt.setFont(new java.awt.Font("Lilex ExtraLight", 0, 18)); // NOI18N
        telefonoTxt.setText("Telefono  :");

        fnacTxt.setFont(new java.awt.Font("Lilex ExtraLight", 0, 18)); // NOI18N
        fnacTxt.setText("F. Nac    :");

        direccionTextField.setFont(new java.awt.Font("Lilex ExtraLight", 0, 18)); // NOI18N
        direccionTextField.setForeground(new java.awt.Color(0, 0, 0));
        direccionTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        direccionTextField.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        direccionTextField.setEnabled(false);

        telefonoTextField.setFont(new java.awt.Font("Lilex ExtraLight", 0, 18)); // NOI18N
        telefonoTextField.setForeground(new java.awt.Color(0, 0, 0));
        telefonoTextField.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        telefonoTextField.setEnabled(false);

        fnacTextField.setFont(new java.awt.Font("Lilex ExtraLight", 0, 18)); // NOI18N
        fnacTextField.setForeground(new java.awt.Color(0, 0, 0));
        fnacTextField.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        fnacTextField.setEnabled(false);

        cedulaTextField.setFont(new java.awt.Font("Lilex ExtraLight", 0, 18)); // NOI18N
        cedulaTextField.setForeground(new java.awt.Color(0, 0, 0));
        cedulaTextField.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        cedulaTextField.setEnabled(false);

        nombreTextField.setFont(new java.awt.Font("Lilex ExtraLight", 0, 18)); // NOI18N
        nombreTextField.setForeground(new java.awt.Color(0, 0, 0));
        nombreTextField.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        nombreTextField.setEnabled(false);

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
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(apellidoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cedulaTxt)
                    .addComponent(direccionTxt)
                    .addComponent(direccionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cedulaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreTxt)
                    .addComponent(telefonoTxt)
                    .addComponent(telefonoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellidoTxt)
                    .addComponent(fnacTxt)
                    .addComponent(fnacTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellidoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        derechaBtn.setFont(new java.awt.Font("Lilex ExtraThick", 0, 20)); // NOI18N
        derechaBtn.setText(">>");
        derechaBtn.setToolTipText("");
        derechaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                derechaBtnActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Lilex ExtraThick", 0, 20)); // NOI18N
        jLabel8.setText("Indice:");
        jLabel8.setToolTipText("");

        izquierdaBtn.setFont(new java.awt.Font("Lilex ExtraThick", 0, 20)); // NOI18N
        izquierdaBtn.setText("<<");
        izquierdaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                izquierdaBtnActionPerformed(evt);
            }
        });

        numeroIndice.setEditable(false);
        numeroIndice.setFont(new java.awt.Font("Lilex ExtraThick", 0, 20)); // NOI18N
        numeroIndice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numeroIndice.setText("0");
        numeroIndice.setCaretColor(new java.awt.Color(0, 0, 0));
        numeroIndice.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        numeroIndice.setEnabled(false);

        buscarTextField.setFont(new java.awt.Font("Lilex ExtraLight", 0, 18)); // NOI18N

        buscarBtn.setFont(new java.awt.Font("Lilex ExtraThick", 0, 20)); // NOI18N
        buscarBtn.setText("Buscar");
        buscarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buscarTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(46, 46, 46))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(izquierdaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)))
                .addComponent(numeroIndice, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(263, 263, 263)
                .addComponent(derechaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(izquierdaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(derechaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroIndice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarBtn))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void izquierdaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_izquierdaBtnActionPerformed

        String indice = numeroIndice.getText();
        int indi = Integer.parseInt(indice);

        if (indi > 0) {
            indi = indi - 1;
            llenarCampos(indi); // Usa el método para actualizar los campos
        }

    }//GEN-LAST:event_izquierdaBtnActionPerformed

    private void derechaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_derechaBtnActionPerformed

        String indice = numeroIndice.getText();
        int indi = Integer.parseInt(indice);

        if (indi < 9) {
            indi = indi + 1;
            llenarCampos(indi); // Usa el método para actualizar los campos
        }

    }//GEN-LAST:event_derechaBtnActionPerformed

    private void buscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBtnActionPerformed

        String terminoBusqueda = normalize(buscarTextField.getText().trim());
        java.util.List<String[]> resultados = new java.util.ArrayList<>();

        for (int i = 0; i < cedulas.length; i++) {
            if (normalize(cedulas[i]).toLowerCase().contains(terminoBusqueda)
                    || normalize(nombres[i]).toLowerCase().contains(terminoBusqueda)
                    || normalize(apellidos[i]).toLowerCase().contains(terminoBusqueda)
                    || normalize(direcciones[i]).toLowerCase().contains(terminoBusqueda)
                    || normalize(telefonos[i]).toLowerCase().contains(terminoBusqueda)
                    || normalize(fechasdenac[i]).toLowerCase().contains(terminoBusqueda)) {

                resultados.add(new String[]{String.valueOf(i), nombres[i], apellidos[i], cedulas[i], direcciones[i], telefonos[i], fechasdenac[i]});
            }
        }

        if (resultados.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "No se encontró ningún resultado.");
        } else {
            String[] columnas = {"Índice", "Nombre", "Apellido", "Cédula", "Dirección", "Teléfono", "F. Nac"};
            ResultadosBusqueda ventanaResultados = new ResultadosBusqueda(resultados.toArray(new String[0][0]), columnas, terminoBusqueda);
            ventanaResultados.setVisible(true);
        }

    }//GEN-LAST:event_buscarBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidoTextField;
    private javax.swing.JLabel apellidoTxt;
    private javax.swing.JButton buscarBtn;
    private javax.swing.JTextField buscarTextField;
    private javax.swing.JTextField cedulaTextField;
    private javax.swing.JLabel cedulaTxt;
    private javax.swing.JButton derechaBtn;
    private javax.swing.JTextField direccionTextField;
    private javax.swing.JLabel direccionTxt;
    private javax.swing.JTextField fnacTextField;
    private javax.swing.JLabel fnacTxt;
    private javax.swing.JButton izquierdaBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField nombreTextField;
    private javax.swing.JLabel nombreTxt;
    private javax.swing.JTextField numeroIndice;
    private javax.swing.JTextField telefonoTextField;
    private javax.swing.JLabel telefonoTxt;
    // End of variables declaration//GEN-END:variables
}
