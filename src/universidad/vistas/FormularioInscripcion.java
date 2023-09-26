package universidad.vistas;

import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.table.DefaultTableModel;
import universidad.acceso.AlumnoData;
import universidad.acceso.InscripcionData;
import universidad.entidades.Materia;

public class FormularioInscripcion extends javax.swing.JInternalFrame {

    private final DefaultTableModel modelo = new DefaultTableModel();
    ButtonGroup grupoRb = new ButtonGroup();
    boolean alumnoSeleccionado = false;

    public FormularioInscripcion() {
        initComponents();
        Uni univ = new Uni();
        univ.centrarInternalFrame(this);
        cargarCombo();
        armarCabecera();
        checkCampos();
        grupoRb.add(jrbMateriasInscriptas);
        grupoRb.add(jrbMateriasNoInscriptas);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jcbAlumnos = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jrbMateriasInscriptas = new javax.swing.JRadioButton();
        jrbMateriasNoInscriptas = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMaterias = new javax.swing.JTable();
        jbInscribir = new javax.swing.JButton();
        jbAnularInscripcion = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setTitle("Formulario Inscripcion");

        jLabel1.setText("Seleccione un alumno:");

        jcbAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcbAlumnosMouseClicked(evt);
            }
        });
        jcbAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAlumnosActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setText("Listado de materias");

        jrbMateriasInscriptas.setText("Materias Inscriptas");
        jrbMateriasInscriptas.setEnabled(false);
        jrbMateriasInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbMateriasInscriptasActionPerformed(evt);
            }
        });

        jrbMateriasNoInscriptas.setText("Materias no inscriptas");
        jrbMateriasNoInscriptas.setEnabled(false);
        jrbMateriasNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbMateriasNoInscriptasActionPerformed(evt);
            }
        });

        jtMaterias.setModel(new javax.swing.table.DefaultTableModel(
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
        jtMaterias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtMateriasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtMaterias);

        jbInscribir.setText("Inscribir");
        jbInscribir.setEnabled(false);
        jbInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInscribirActionPerformed(evt);
            }
        });

        jbAnularInscripcion.setText("Eliminar Inscripción");
        jbAnularInscripcion.setEnabled(false);
        jbAnularInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAnularInscripcionActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setText("Formulario de Inscripcion");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jrbMateriasInscriptas)
                                .addGap(39, 39, 39)
                                .addComponent(jrbMateriasNoInscriptas))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jbInscribir)
                                    .addGap(18, 18, 18)
                                    .addComponent(jbAnularInscripcion)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbSalir))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel2)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jcbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbMateriasInscriptas)
                    .addComponent(jrbMateriasNoInscriptas))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbInscribir)
                    .addComponent(jbAnularInscripcion)
                    .addComponent(jbSalir))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jrbMateriasInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbMateriasInscriptasActionPerformed
        actualizarTabla();

    }//GEN-LAST:event_jrbMateriasInscriptasActionPerformed

    private void jrbMateriasNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbMateriasNoInscriptasActionPerformed
        actualizarTabla();

    }//GEN-LAST:event_jrbMateriasNoInscriptasActionPerformed

    private void jcbAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbAlumnosMouseClicked

        alumnoSeleccionado = true;
        limpiarRb();
        checkCampos();

    }//GEN-LAST:event_jcbAlumnosMouseClicked

    private void jcbAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAlumnosActionPerformed
        // este evento action performed lanza una excepcion de arreglo fuera de limites (i have no idea why)
    }//GEN-LAST:event_jcbAlumnosActionPerformed

    private void jbInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInscribirActionPerformed
        inscribirAlumno();
        checkCampos();
    }//GEN-LAST:event_jbInscribirActionPerformed

    private void jbAnularInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAnularInscripcionActionPerformed
        anularInscripcion();
        checkCampos();
    }//GEN-LAST:event_jbAnularInscripcionActionPerformed

    private void jtMateriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtMateriasMouseClicked
        checkCampos();
    }//GEN-LAST:event_jtMateriasMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAnularInscripcion;
    private javax.swing.JButton jbInscribir;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<String> jcbAlumnos;
    private javax.swing.JRadioButton jrbMateriasInscriptas;
    private javax.swing.JRadioButton jrbMateriasNoInscriptas;
    private javax.swing.JTable jtMaterias;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("año");
        jtMaterias.setModel(modelo);
    }

    private void borrarFilas() {
        int filas = jtMaterias.getRowCount() - 1;
        for (int f = filas; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }

    private void cargarCombo() {

        AlumnoData alumnos = new AlumnoData();
        List lista = alumnos.listarAlumnos();

        for (int indice = 0; indice < lista.size(); indice++) {
            jcbAlumnos.addItem(String.valueOf(lista.get(indice)));
        }
    }

    private void limpiarRb() {
        borrarFilas();
        grupoRb.clearSelection();
    }

    private void actualizarTabla() {
        borrarFilas();

        String selectedItem = (String) jcbAlumnos.getSelectedItem();
        String[] parts = selectedItem.split(" - ");
        int idAlumno = Integer.parseInt(parts[0]);

        if (jrbMateriasInscriptas.isSelected()) {
            InscripcionData id = new InscripcionData();
            List<Materia> lista = id.obtenerMateriasCursadas(idAlumno);
            jtMaterias.setModel(modelo);
            lista.forEach((elemento) -> {
                modelo.addRow(new Object[]{elemento.getIdMateria(), elemento.getNombre(), elemento.getAnioMateria()});
            });
        } else if (jrbMateriasNoInscriptas.isSelected()) {
            InscripcionData id = new InscripcionData();
            List<Materia> lista = id.obtenerMateriasNoCursadas(idAlumno);
            jtMaterias.setModel(modelo);
            lista.forEach((elemento) -> {
                modelo.addRow(new Object[]{elemento.getIdMateria(), elemento.getNombre(), elemento.getAnioMateria()});
            });
        }
        checkCampos();

    }

    private void anularInscripcion() {
        //Seleccion del alumno
        String selectedItem = (String) jcbAlumnos.getSelectedItem();
        String[] parts = selectedItem.split(" - ");
        int idAlumno = Integer.parseInt(parts[0]);

        //seleccionar materia
        int filaSelec = jtMaterias.getSelectedRow();
        int idMateria = (int) jtMaterias.getValueAt(filaSelec, 0);

        //llamar a InscripcionData
        InscripcionData id = new InscripcionData();
        id.borrarInscripcionMateriaAlumno(idAlumno, idMateria);

        //actualizamos tabla para ver el cambio
        actualizarTabla();
    }

    private void inscribirAlumno() {
        //Seleccion del alumno
        String selectedItem = (String) jcbAlumnos.getSelectedItem();
        String[] parts = selectedItem.split(" - ");
        int idAlumno = Integer.parseInt(parts[0]);

        //seleccionar materia
        int filaSelec = jtMaterias.getSelectedRow();
        int idMateria = (int) jtMaterias.getValueAt(filaSelec, 0);

        //llamar a inscripcion Data
        InscripcionData id = new InscripcionData();
        id.guardarInscripcion(idAlumno, idMateria);

        actualizarTabla();
    }

    private void checkCampos() {

        if (alumnoSeleccionado) {
            jrbMateriasInscriptas.setEnabled(true);
            jrbMateriasNoInscriptas.setEnabled(true);
        }

        if (jrbMateriasInscriptas.isSelected() && jtMaterias.getSelectedRow() != -1) {
            jbAnularInscripcion.setEnabled(true);
            jbInscribir.setEnabled(false);
        } else if (jrbMateriasNoInscriptas.isSelected() && jtMaterias.getSelectedRow() != -1) {
            jbAnularInscripcion.setEnabled(false);
            jbInscribir.setEnabled(true);

        } else {

            jbInscribir.setEnabled(false);
            jbAnularInscripcion.setEnabled(false);
        }
    }

}
