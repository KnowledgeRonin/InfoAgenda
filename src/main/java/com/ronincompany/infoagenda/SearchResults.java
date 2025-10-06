package com.ronincompany.infoagenda;

import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;


public class SearchResults extends javax.swing.JFrame {

    private String busqueda;
   
    public SearchResults(String[][] resultados, String[] columnas, String busqueda) {
        
        this.busqueda = busqueda.toLowerCase();
        initComponents();
        cargarResultados(resultados, columnas);
        this.setLocationRelativeTo(null);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tablaResultados = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Coincidencias de búsqueda");
        setLocation(new java.awt.Point(0, 0));

        tablaResultados.setFont(new java.awt.Font("Lilex ExtraLight", 0, 12)); // NOI18N
        tablaResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        tablaResultados.setEditingColumn(0);
        tablaResultados.setEditingRow(0);
        tablaResultados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaResultadosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaResultados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    
    private void tablaResultadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaResultadosMouseClicked
        
        int selectedRow = tablaResultados.getSelectedRow();
        if (selectedRow != -1) {
            String seleccion = "Seleccionado: "
                + tablaResultados.getValueAt(selectedRow, 0) + " "
                + tablaResultados.getValueAt(selectedRow, 1) + " ("
                + tablaResultados.getValueAt(selectedRow, 2) + ")";
            JOptionPane.showMessageDialog(this, seleccion);
        }
        
    }//GEN-LAST:event_tablaResultadosMouseClicked

    private void cargarResultados(String[][] resultados, String[] columnas) {
        DefaultTableModel model = new DefaultTableModel(resultados, columnas);
        tablaResultados.setModel(model);
        tablaResultados.setDefaultRenderer(Object.class, new HighlightRenderer(busqueda));
    }
    
    class HighlightRenderer extends DefaultTableCellRenderer {

        private String searchText;

        public HighlightRenderer(String searchText) {
            this.searchText = searchText;
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
                                                       boolean hasFocus, int row, int column) {
            Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

            if (value != null && value.toString().toLowerCase().contains(searchText)) {
                c.setBackground(Color.YELLOW); // Cambiar el fondo de la celda a amarillo si contiene el texto buscado
            } else {
                c.setBackground(Color.WHITE); // Mantener el fondo blanco si no coincide
            }

            return c;
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaResultados;
    // End of variables declaration//GEN-END:variables
}
