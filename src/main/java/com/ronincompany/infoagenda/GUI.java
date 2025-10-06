package com.ronincompany.infoagenda;

import java.text.Normalizer;

public class GUI extends javax.swing.JFrame { 

    String ids[] = {"23.456.789", "18.234.567", "27.678.901", "19.345.678", "22.567.890", "21.234.567", "20.789.012", "25.890.123", "24.678.901", "26.345.678"};
    String firstNames[] = {"María", "Juan", "Ana", "Carlos", "Luisa", "Pedro", "Laura", "José", "Carmen", "Miguel"};
    String lastNames[] = {"Pérez", "López", "Castillo", "Morales", "Torres", "Herrera", "Suárez", "Flores", "Gil", "Mendoza"};
    String addresses[] = {"Los Almendros Ave, Caracas", "Solano Street, Maracaibo", "La Trinidad Res., Valencia", "Las Palmas Ave, Barquisimeto", "Los Próceres Street, Mérida", "El Bosque Res., Puerto Ordaz", "Bolivar Ave, Cumaná", "Main Street, Maturin", "El Hatillo Res., San Cristobal", "Libertador Ave, Maracay"};
    String phones[] = {"0412-1234567", "0414-2345678", "0416-3456789", "0412-4567890", "0414-5678901", "0416-6789012", "0412-7890123", "0414-8901234", "0416-9012345", "0412-0123456"};
    String birthDates[] = {"15/03/1985", "22/07/1990", "30/11/1992", "10/01/1988", "05/05/1983", "12/09/1986", "18/02/1994", "25/06/1987", "09/12/1991", "03/08/1989"};

    private void fillFields(int index) {
        idTextField.setText(ids[index]);
        firstNameTextField.setText(firstNames[index]);
        lastNameTextField.setText(lastNames[index]);
        addressTextField.setText(addresses[index]);
        phoneTextField.setText(phones[index]);
        birthDateTextField.setText(birthDates[index]);
        indexNumber.setText(String.valueOf(index));

    }
    
    public static String normalize(String input) {
        String normalized = Normalizer.normalize(input, Normalizer.Form.NFD);
        return normalized.replaceAll("\\p{M}", "").toLowerCase();
    }
    
    public GUI() {
        initComponents();
        fillFields(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel = new javax.swing.JPanel();
        idLabel = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        lastNameTextField = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        phoneLabel = new javax.swing.JLabel();
        birthDateLabel = new javax.swing.JLabel();
        addressTextField = new javax.swing.JTextField();
        phoneTextField = new javax.swing.JTextField();
        birthDateTextField = new javax.swing.JTextField();
        idTextField = new javax.swing.JTextField();
        firstNameTextField = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        nextBtn = new javax.swing.JButton();
        indexLabel = new javax.swing.JLabel();
        prevBtn = new javax.swing.JButton();
        indexNumber = new javax.swing.JTextField();
        searchTextField = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agenda");

        Title.setFont(new java.awt.Font("Lilex", 1, 36)); // NOI18N
        Title.setText("Electronic Agenda");

        idLabel.setFont(new java.awt.Font("Lilex ExtraLight", 0, 18)); // NOI18N
        idLabel.setText("ID               :");

        firstNameLabel.setFont(new java.awt.Font("Lilex ExtraLight", 0, 18)); // NOI18N
        firstNameLabel.setText("First name :");

        lastNameLabel.setFont(new java.awt.Font("Lilex ExtraLight", 0, 18)); // NOI18N
        lastNameLabel.setText("Last name :");

        lastNameTextField.setFont(new java.awt.Font("Lilex ExtraLight", 0, 18)); // NOI18N
        lastNameTextField.setForeground(new java.awt.Color(0, 0, 0));
        lastNameTextField.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        lastNameTextField.setEnabled(false);

        addressLabel.setFont(new java.awt.Font("Lilex ExtraLight", 0, 18)); // NOI18N
        addressLabel.setText("Address :");

        phoneLabel.setFont(new java.awt.Font("Lilex ExtraLight", 0, 18)); // NOI18N
        phoneLabel.setText("Phone    :");

        birthDateLabel.setFont(new java.awt.Font("Lilex ExtraLight", 0, 18)); // NOI18N
        birthDateLabel.setText("Birthday :");

        addressTextField.setFont(new java.awt.Font("Lilex ExtraLight", 0, 18)); // NOI18N
        addressTextField.setForeground(new java.awt.Color(0, 0, 0));
        addressTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        addressTextField.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        addressTextField.setEnabled(false);

        phoneTextField.setFont(new java.awt.Font("Lilex ExtraLight", 0, 18)); // NOI18N
        phoneTextField.setForeground(new java.awt.Color(0, 0, 0));
        phoneTextField.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        phoneTextField.setEnabled(false);

        birthDateTextField.setFont(new java.awt.Font("Lilex ExtraLight", 0, 18)); // NOI18N
        birthDateTextField.setForeground(new java.awt.Color(0, 0, 0));
        birthDateTextField.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        birthDateTextField.setEnabled(false);

        idTextField.setFont(new java.awt.Font("Lilex ExtraLight", 0, 18)); // NOI18N
        idTextField.setForeground(new java.awt.Color(0, 0, 0));
        idTextField.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        idTextField.setEnabled(false);

        firstNameTextField.setFont(new java.awt.Font("Lilex ExtraLight", 0, 18)); // NOI18N
        firstNameTextField.setForeground(new java.awt.Color(0, 0, 0));
        firstNameTextField.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        firstNameTextField.setEnabled(false);

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(firstNameLabel)
                    .addComponent(lastNameLabel)
                    .addComponent(idLabel))
                .addGap(6, 6, 6)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(103, 103, 103)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phoneLabel)
                            .addComponent(birthDateLabel))
                        .addGap(6, 6, 6)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phoneTextField)
                            .addComponent(birthDateTextField)))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addComponent(addressLabel)
                        .addGap(6, 6, 6)
                        .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel)
                    .addComponent(addressLabel)
                    .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel)
                    .addComponent(phoneLabel)
                    .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameLabel)
                    .addComponent(birthDateLabel)
                    .addComponent(birthDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        nextBtn.setFont(new java.awt.Font("Lilex ExtraThick", 0, 20)); // NOI18N
        nextBtn.setText(">>");
        nextBtn.setToolTipText("");
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });

        indexLabel.setFont(new java.awt.Font("Lilex ExtraThick", 0, 20)); // NOI18N
        indexLabel.setText("Index");
        indexLabel.setToolTipText("");

        prevBtn.setFont(new java.awt.Font("Lilex ExtraThick", 0, 20)); // NOI18N
        prevBtn.setText("<<");
        prevBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevBtnActionPerformed(evt);
            }
        });

        indexNumber.setEditable(false);
        indexNumber.setFont(new java.awt.Font("Lilex ExtraThick", 0, 20)); // NOI18N
        indexNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        indexNumber.setText("0");
        indexNumber.setCaretColor(new java.awt.Color(0, 0, 0));
        indexNumber.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        indexNumber.setEnabled(false);

        searchTextField.setFont(new java.awt.Font("Lilex ExtraLight", 0, 18)); // NOI18N

        searchBtn.setFont(new java.awt.Font("Lilex ExtraThick", 0, 20)); // NOI18N
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
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
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2)
                            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(Title)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(46, 46, 46))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(prevBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(indexLabel)
                        .addGap(18, 18, 18)))
                .addComponent(indexNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(263, 263, 263)
                .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prevBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(indexNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(indexLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prevBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevBtnActionPerformed

        String index = indexNumber.getText();
        int i = Integer.parseInt(index);

        if (i > 0) {
            i = i - 1;
            fillFields(i); 
        }

    }//GEN-LAST:event_prevBtnActionPerformed

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed

        String index = indexNumber.getText();
        int i = Integer.parseInt(index);

        if (i < 9) {
            i = i + 1;
            fillFields(i);
        }

    }//GEN-LAST:event_nextBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed

        String searchTerm = normalize(searchTextField.getText().trim());
        java.util.List<String[]> results = new java.util.ArrayList<>();

        for (int i = 0; i < ids.length; i++) {
            if (normalize(ids[i]).toLowerCase().contains(searchTerm)
                    || normalize(firstNames[i]).toLowerCase().contains(searchTerm)
                    || normalize(lastNames[i]).toLowerCase().contains(searchTerm)
                    || normalize(addresses[i]).toLowerCase().contains(searchTerm)
                    || normalize(phones[i]).toLowerCase().contains(searchTerm)
                    || normalize(birthDates[i]).toLowerCase().contains(searchTerm)) {

                results.add(new String[]{String.valueOf(i), firstNames[i], lastNames[i], ids[i], addresses[i], phones[i], birthDates[i]});
            }
        }

        if (results.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "No results found.");
        } else {
            String[] columns = {"Index", "First Name", "Last Name", "ID", "Address", "Phone", "Birth Date"};
            SearchResults resultWindow = new SearchResults(results.toArray(new String[0][0]), columns, searchTerm);
            resultWindow.setVisible(true);
        }

    }//GEN-LAST:event_searchBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JLabel birthDateLabel;
    private javax.swing.JTextField birthDateTextField;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel indexLabel;
    private javax.swing.JTextField indexNumber;
    private javax.swing.JPanel jPanel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JButton nextBtn;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JButton prevBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchTextField;
    // End of variables declaration//GEN-END:variables
}
