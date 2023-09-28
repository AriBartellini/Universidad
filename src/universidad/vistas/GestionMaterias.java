package universidad.vistas;


import javax.swing.JOptionPane;
import universidad.acceso.MateriaData;
import universidad.entidades.Materia;

public class GestionMaterias extends javax.swing.JInternalFrame {

    private boolean buscando = false;

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
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 20), new java.awt.Dimension(0, 20), new java.awt.Dimension(32767, 20));

        setTitle("Gestion Materias");

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
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
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbGuardar.setText("Guardar");
        jbGuardar.setEnabled(false);
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbSalirMouseClicked(evt);
            }
        });

        jtfAnio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfAnioKeyReleased(evt);
            }
        });

        jtfNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfNombreKeyReleased(evt);
            }
        });

        jLabel1.setText("Código:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Año:");

        jLabel4.setText("Estado:");

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel5.setText("Materia");

        jbModificarDatos.setText("Modificar Datos");
        jbModificarDatos.setEnabled(false);
        jbModificarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbModificarDatos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(62, 62, 62))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jtfCodigo)
                                        .addComponent(jtfAnio)
                                        .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jrbEstado))
                                .addGap(35, 35, 35)))
                        .addComponent(jbBuscar)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbBuscar)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jtfAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrbEstado)
                            .addComponent(jLabel4))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbLimpiar)
                            .addComponent(jbEliminar)
                            .addComponent(jbGuardar)
                            .addComponent(jbSalir)
                            .addComponent(jbModificarDatos))
                        .addGap(0, 19, Short.MAX_VALUE))
                    .addComponent(filler1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbSalirMouseClicked
        this.dispose();
    }//GEN-LAST:event_jbSalirMouseClicked

    private void jbLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbLimpiarMouseClicked
        limpiarCampos();
    }//GEN-LAST:event_jbLimpiarMouseClicked

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        buscarMateria();
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        eliminarMateria();
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbModificarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarDatosActionPerformed
        modificarMateria();
    }//GEN-LAST:event_jbModificarDatosActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        guardarMateria();
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jtfAnioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfAnioKeyReleased
        checkCampos();
    }//GEN-LAST:event_jtfAnioKeyReleased

    private void jtfNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNombreKeyReleased
        checkCampos();
    }//GEN-LAST:event_jtfNombreKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
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

    public void limpiarCampos() {
        jtfCodigo.setText("");
        jtfNombre.setText("");
        jtfAnio.setText("");
        jrbEstado.setSelected(false);
        buscando = false;
        checkCampos();
    }

    private void checkCampos() {
        if (buscando) {
            jbBuscar.setEnabled(false);
            jbEliminar.setEnabled(true);
            jbModificarDatos.setEnabled(true);
            jbGuardar.setEnabled(false);
            jtfCodigo.setEnabled(false);

        } else if ("".equals(jtfNombre.getText()) ||  "".equals(jtfAnio.getText())) {
            jbBuscar.setEnabled(true);
            jbEliminar.setEnabled(false);
            jbModificarDatos.setEnabled(false);
            jbGuardar.setEnabled(false);
            jtfCodigo.setEnabled(true);

        } else if ("".equals(jtfNombre.getText()) ||  "".equals(jtfAnio.getText()) || !buscando) {
            jbBuscar.setEnabled(true);
            jbEliminar.setEnabled(false);
            jbModificarDatos.setEnabled(false);
            jbGuardar.setEnabled(true);
            jtfCodigo.setEnabled(true);
        }

    }

    private void buscarMateria() {

        try {
            if (!buscando) {
                int id = Integer.valueOf(jtfCodigo.getText());
                MateriaData md = new MateriaData();
                Materia m = md.buscarMateriaPorId(id);
                jtfNombre.setText(m.getNombre());
                jtfAnio.setText(String.valueOf(m.getAnioMateria()));
                jrbEstado.setSelected(m.isActivo());
                buscando = true;
                
                checkCampos();

            }

        } catch (NullPointerException | NumberFormatException e) {
            limpiarCampos();
            buscando = false;
            checkCampos();
        }
    }

    private void modificarMateria() {
        try{
        int id = Integer.parseInt(jtfCodigo.getText());
        String nombre = jtfNombre.getText();
        int anio = Integer.parseInt(jtfAnio.getText());
        //cambiar a numeros romanos el año de la materia!!!!!
        boolean estado = jrbEstado.isSelected();

        MateriaData materiaData = new MateriaData();
        Materia materiaExistente = materiaData.buscarMateriaPorId(id);
        
        int respuesta = JOptionPane.showConfirmDialog(
                GestionMaterias.this,
                "¿Estás seguro de que deseas modificar los datos de la materia seleccionada?",
                "Confirmación",
                JOptionPane.YES_NO_OPTION
        );
        
        if(anio > 0 && anio < 6 ){

        if (respuesta == JOptionPane.YES_OPTION) {
           int idmodif = materiaExistente.getIdMateria();
            Materia materiaModificada = new Materia(idmodif, nombre, anio, estado);
            materiaData.modificarMateria(materiaModificada);
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(
                    GestionMaterias.this,
                    "Operación cancelada",
                    "Información",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
        } else{
            JOptionPane.showMessageDialog(null, "El año debe ser de 1 a 5, intente nuevamente");
        }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Numero introducido en año, intente nuevamente");
        }
        
    }
    
    private void guardarMateria(){
        try{
            
        MateriaData materiaData = new MateriaData();
        Materia materia = new Materia();
        materia.setActivo(jrbEstado.isSelected());
        materia.setAnioMateria(Integer.valueOf(jtfAnio.getText()));
        materia.setNombre(jtfNombre.getText());
        
        
        if(materia.getAnioMateria()<6 && materia.getAnioMateria()>0){
            if (!"".equals(jtfCodigo.getText())){
                JOptionPane.showMessageDialog(null, "Usted ha ingresado un codigo que sera ignorado por el sistema");
            }
            materiaData.guardarMateria(materia);
            limpiarCampos();
        }else{
            JOptionPane.showMessageDialog(null, "El año debe ser de 1 a 5, intente nuevamente");
        }
        
        
            
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Numero introducido en año, intente nuevamente");
            
        }
    }
    
    private void eliminarMateria() {
        int id = Integer.parseInt(jtfCodigo.getText());
        String nombre = jtfNombre.getText();
        MateriaData materia = new MateriaData();

        int respuesta = JOptionPane.showConfirmDialog(
                GestionMaterias.this,
                "¿Seguro de que deseas dar de baja la materia: " + "'" + nombre + "'",
                "Confirmación",
                JOptionPane.YES_NO_OPTION
        );

        if (respuesta == JOptionPane.YES_OPTION) {
            materia.eliminarMateriaPorId(id);

        } else {
            JOptionPane.showMessageDialog(
                    GestionMaterias.this,
                    "Operación cancelada",
                    "Información",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
        limpiarCampos();
    }
}
