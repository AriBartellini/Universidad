package universidad.vistas;


import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import universidad.acceso.AlumnoData;
import universidad.entidades.Alumno;

public class GestionAlumnos extends javax.swing.JInternalFrame {

    private boolean buscando = false;

    LocalDate fechaNacimientoMaxima = LocalDate.now().minusYears(90);
    LocalDate fechaNacimientoMinima = LocalDate.now().minusYears(18);
  

    public GestionAlumnos() {
        initComponents();

        Uni univ = new Uni();
        univ.centrarInternalFrame(this); //crea un objeto Uni para ejecutar el metodo de centrado de ventana

        jdFechaNacimiento.addPropertyChangeListener("date", new PropertyChangeListener() {
            @Override
         public void propertyChange(PropertyChangeEvent evt) {
                if ("date".equals(evt.getPropertyName())) {
                    java.util.Date selectedDate = (java.util.Date) evt.getNewValue();
                    if (selectedDate != null) {
                        checkCampos();
                    }
                }
            }
        });

       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendar1 = new com.toedter.calendar.JCalendar();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jbBuscar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jtfDocumento = new javax.swing.JTextField();
        jtfNombre = new javax.swing.JTextField();
        jtfApellido = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jrbEstado = new javax.swing.JRadioButton();
        jdFechaNacimiento = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jbModificarDatos = new javax.swing.JButton();

        setTitle("Gestion Alumnos");

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbNuevo.setText("Limpiar");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
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
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jtfDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfDocumentoKeyReleased(evt);
            }
        });

        jtfNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfNombreKeyReleased(evt);
            }
        });

        jtfApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfApellidoKeyReleased(evt);
            }
        });

        jLabel1.setText("Documento:");

        jLabel2.setText("Apellido:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Estado:");

        jLabel5.setText("Fecha de nacimiento:");

        jdFechaNacimiento.setForeground(new java.awt.Color(240, 240, 240));
        jdFechaNacimiento.setToolTipText("");
        jdFechaNacimiento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jdFechaNacimiento.setMaxSelectableDate(new java.util.Date(1735704116000L));
        jdFechaNacimiento.setMinSelectableDate(new java.util.Date(-1577904076000L));
        jdFechaNacimiento.setMinimumSize(new java.awt.Dimension(55, 50));

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel6.setText("Alumno");

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
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrbEstado)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jtfNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtfApellido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jtfDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34)
                                        .addComponent(jbBuscar))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jdFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbModificarDatos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbSalir)))
                .addContainerGap(19, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbBuscar)
                            .addComponent(jtfDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addComponent(jrbEstado))
                    .addComponent(jLabel4))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jdFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevo)
                    .addComponent(jbEliminar)
                    .addComponent(jbGuardar)
                    .addComponent(jbModificarDatos)
                    .addComponent(jbSalir))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        guardarAlumno();
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        eliminarAlumno();
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jtfDocumentoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfDocumentoKeyReleased
        checkCampos();
    }//GEN-LAST:event_jtfDocumentoKeyReleased

    private void jtfApellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfApellidoKeyReleased
        checkCampos();
    }//GEN-LAST:event_jtfApellidoKeyReleased

    private void jtfNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNombreKeyReleased
        checkCampos();
    }//GEN-LAST:event_jtfNombreKeyReleased

    private void jbModificarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarDatosActionPerformed
        modificarAlumno();
    }//GEN-LAST:event_jbModificarDatosActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        buscarAlumno();
    }//GEN-LAST:event_jbBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JCalendar jCalendar1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbModificarDatos;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private com.toedter.calendar.JDateChooser jdFechaNacimiento;
    private javax.swing.JRadioButton jrbEstado;
    private javax.swing.JTextField jtfApellido;
    private javax.swing.JTextField jtfDocumento;
    private javax.swing.JTextField jtfNombre;
    // End of variables declaration//GEN-END:variables

    public void limpiarCampos() {
        jtfDocumento.setText("");
        jtfApellido.setText("");
        jtfNombre.setText("");
        jrbEstado.setSelected(false);
        jdFechaNacimiento.setDate(null);
        buscando = false;
        checkCampos();
    }

    private void checkCampos() {
        // proceso de checkeo de campos para habilitado de botones borrar, guardar y modificar
        if (buscando) {
            jbBuscar.setEnabled(false);
            jbGuardar.setEnabled(false);
            jbModificarDatos.setEnabled(true);
            jbEliminar.setEnabled(true);
        } else if ("".equals(jtfDocumento.getText()) || "".equals(jtfApellido.getText()) || "".equals(jtfNombre.getText()) || jdFechaNacimiento.getDate() == null) {
            jbEliminar.setEnabled(false);
            jbGuardar.setEnabled(false);
            jbModificarDatos.setEnabled(false);
            jbBuscar.setEnabled(true);
        } else if ("".equals(jtfDocumento.getText()) || "".equals(jtfApellido.getText()) || "".equals(jtfNombre.getText()) || jdFechaNacimiento.getDate() == null || !buscando) {
            jbEliminar.setEnabled(false);
            jbGuardar.setEnabled(true);
            jbModificarDatos.setEnabled(false);
            jbBuscar.setEnabled(true);
        }
    }

    private void buscarAlumno() {
        try {
            if (!buscando) {
                int dni = Integer.parseInt(jtfDocumento.getText());
                AlumnoData alumno = new AlumnoData();
                Alumno alu = alumno.buscarAlumnoPorDni(dni);
                jtfApellido.setText(alu.getApellido());
                jtfNombre.setText(alu.getNombre());
                jrbEstado.setSelected(alu.isActivo());
                jdFechaNacimiento.setDate(Date.valueOf(alu.getFechaNac()));

                buscando = true;
                checkCampos();
            }

        } catch (NullPointerException | NumberFormatException e) {
            limpiarCampos();
            buscando = false;
            checkCampos();
        }
    }

    private void modificarAlumno() {
        int dni = Integer.parseInt(jtfDocumento.getText());
        String nombre = jtfNombre.getText();
        String apellido = jtfApellido.getText();
        LocalDate fechaNacimiento = jdFechaNacimiento.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        boolean estado = jrbEstado.isSelected();

        AlumnoData alumnoData = new AlumnoData();
        Alumno alumnoExistente = alumnoData.buscarAlumnoPorDni(dni);

        int respuesta = JOptionPane.showConfirmDialog(
                GestionAlumnos.this,
                "¿Estás seguro de que deseas modificar los datos del alumno seleccionado?",
                "Confirmación",
                JOptionPane.YES_NO_OPTION
        );

        if (respuesta == JOptionPane.YES_OPTION) {
            int id = alumnoExistente.getIdAlumno();
            Alumno alumnoModificado = new Alumno(id, dni, apellido, nombre, fechaNacimiento, estado);
            alumnoData.modificarAlumno(alumnoModificado);
            limpiarCampos();



        } else {
            JOptionPane.showMessageDialog(
                    GestionAlumnos.this,
                    "Operación cancelada",
                    "Información",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }

    }

    private void guardarAlumno() {
        try {
            int dni = Integer.parseInt(jtfDocumento.getText());
            String nombre = jtfNombre.getText();
            String apellido = jtfApellido.getText();
            LocalDate fechaNacimiento = jdFechaNacimiento.getCalendar().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            Boolean estado = jrbEstado.isSelected();

            if (fechaNacimiento.isBefore(fechaNacimientoMaxima) || fechaNacimiento.isAfter(fechaNacimientoMinima)) {
                JOptionPane.showMessageDialog(this, "La fecha de nacimiento no es válida.");
            } else {
                Alumno alu = new Alumno(dni, apellido, nombre, fechaNacimiento, estado);
                AlumnoData alumno = new AlumnoData();
                alumno.guardarAlumno(alu);
                limpiarCampos();
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El campo 'documento' solo acepta numeros, intente nuevamente");
            limpiarCampos();

        }
    }

    private void eliminarAlumno() {
        int dni = Integer.parseInt(jtfDocumento.getText());
        AlumnoData alumno = new AlumnoData();

        int respuesta = JOptionPane.showConfirmDialog(
                GestionAlumnos.this,
                "¿Está seguro de que deseas dar de baja al alumno con dni: " + "'" + dni + "'",
                "Confirmación",
                JOptionPane.YES_NO_OPTION
        );
        if (respuesta == JOptionPane.YES_OPTION) {
            alumno.eliminarAlumnoPorDni(dni);

        } else {
            JOptionPane.showMessageDialog(
                    GestionAlumnos.this,
                    "Operación cancelada",
                    "Información",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }

        limpiarCampos();
    }
}
