
package universidad.vistas;

import javax.swing.JOptionPane;
import universidad.acceso.MateriaData;
import universidad.entidades.Materia;

public class GestionMaterias extends javax.swing.JInternalFrame {

    public GestionMaterias() {
        initComponents();
        
         Uni univ = new Uni();
        univ.centrarInternalFrame(this); //crea un objeto Uni para ejecutar el metodo de centrado de ventana
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbBuscar = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jtfAnio = new javax.swing.JTextField();
        jtfNombre = new javax.swing.JTextField();
        jtfCodigo = new javax.swing.JTextField();
        jrbEstado = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jbModificarDatos = new javax.swing.JButton();

        setTitle("Gestion Materias");

        jbBuscar.setText("Buscar");
        jbBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbBuscarMouseClicked(evt);
            }
        });

        jbLimpiar.setText("Limpiar");
        jbLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbLimpiarMouseClicked(evt);
            }
        });

        jbEliminar.setText("Eliminar");
        jbEliminar.setEnabled(false);
        jbEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbEliminarMouseClicked(evt);
            }
        });

        jbGuardar.setText("Guardar");
        jbGuardar.setEnabled(false);
        jbGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbGuardarMouseClicked(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbSalirMouseClicked(evt);
            }
        });

        jLabel1.setText("Código:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Año:");

        jLabel4.setText("Estado:");

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel5.setText("Materia");

        jbModificarDatos.setText("Modificar datos");
        jbModificarDatos.setEnabled(false);
        jbModificarDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbModificarDatosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbModificarDatos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbGuardar)
                .addGap(18, 18, 18)
                .addComponent(jbSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(47, 47, 47)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbBuscar))
                    .addComponent(jrbEstado)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jtfNombre, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jtfAnio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jrbEstado))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbLimpiar)
                    .addComponent(jbEliminar)
                    .addComponent(jbGuardar)
                    .addComponent(jbModificarDatos)
                    .addComponent(jbSalir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbBuscarMouseClicked
     int id = Integer.valueOf(jtfCodigo.getText());
        MateriaData md = new MateriaData();
        Materia m =  md.buscarMateriaPorId(id);
        jtfNombre.setText(m.getNombre());
        jtfAnio.setText(String.valueOf(m.getAnioMateria()));
        jrbEstado.setSelected(m.isActivo());
    }//GEN-LAST:event_jbBuscarMouseClicked

    private void jbGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbGuardarMouseClicked
       MateriaData md = new MateriaData();
       Materia m = new Materia();
       m.setActivo(jrbEstado.isSelected());
       m.setAnioMateria(Integer.valueOf(jtfAnio.getText()));
       m.setNombre(jtfNombre.getText());
       md.guardarMateria(m);
       
    }//GEN-LAST:event_jbGuardarMouseClicked

    private void jbSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbSalirMouseClicked
       this.dispose();
    }//GEN-LAST:event_jbSalirMouseClicked

    private void jbLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbLimpiarMouseClicked
        jtfCodigo.setText("");
        jtfNombre.setText("");
        jtfAnio.setText("");
        jrbEstado.setSelected(false);
        
    }//GEN-LAST:event_jbLimpiarMouseClicked

    private void jbEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbEliminarMouseClicked
        int id = Integer.valueOf(jtfCodigo.getText());
        MateriaData md = new MateriaData();
      
       Object[] options = {"Sí", "No", "Cancelar"};
       int result = JOptionPane.showOptionDialog(
                null,
                "¿Desea eliminar esta materia?",
                "Confirmar",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[2]
        );
        switch (result) {
            case JOptionPane.YES_OPTION:
                md.eliminarMateriaPorId(id);
                break;
            
            case JOptionPane.CANCEL_OPTION:
                System.out.println("Operación cancelada");
                break;
    }//GEN-LAST:event_jbEliminarMouseClicked
    }
    private void jbModificarDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbModificarDatosMouseClicked
        
    }//GEN-LAST:event_jbModificarDatosMouseClicked
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbModificarDatos;
    private javax.swing.JButton jbSalir;
    private javax.swing.JRadioButton jrbEstado;
    private javax.swing.JTextField jtfAnio;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JTextField jtfNombre;
    // End of variables declaration//GEN-END:variables
}
