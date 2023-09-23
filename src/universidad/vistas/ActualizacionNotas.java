package universidad.vistas;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import universidad.acceso.AlumnoData;
import universidad.acceso.InscripcionData;

public class ActualizacionNotas extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel();

    public ActualizacionNotas() {
        initComponents();
        cargarCombo();
        armarLista();
        Uni univ = new Uni();
        univ.centrarInternalFrame(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbAlumno = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtNotas = new javax.swing.JTable();
        jbGuardar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        setTitle("Carga de notas");

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setText("Carga de notas");

        jLabel2.setText("Seleccione un alumno:");

        jcbAlumno.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbAlumnoItemStateChanged(evt);
            }
        });

        jtNotas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtNotas);

        jbGuardar.setText("Guardar");
        jbGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbGuardarMouseClicked(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(30, 30, 30)
                                .addComponent(jcbAlumno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jbGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbSalir)
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jcbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar)
                    .addComponent(jbSalir))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jcbAlumnoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbAlumnoItemStateChanged
        String alumnoSeleccionado = (String) jcbAlumno.getSelectedItem();
        String[] elementos = alumnoSeleccionado.split(" ");
        int num = Integer.parseInt(elementos[0]);
        cargarDatos(num);

    }//GEN-LAST:event_jcbAlumnoItemStateChanged

    private void jbGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbGuardarMouseClicked

        InscripcionData ins = new InscripcionData();
        int filaSelec = (int) jtNotas.getSelectedRow();
        int idMateria = Integer.parseInt((String) jtNotas.getValueAt(filaSelec, 0));

        String selectedItem = (String) jcbAlumno.getSelectedItem();
        String[] parts = selectedItem.split(" ");
        int idAlumno = Integer.parseInt(parts[0]);

        double nota = Double.parseDouble((String) jtNotas.getValueAt(filaSelec, 3));

        System.out.println(idAlumno + " " + idMateria + " " + nota);
        ins.actualizarNota(idAlumno, idMateria, nota);

    }//GEN-LAST:event_jbGuardarMouseClicked

    private void cargarCombo() {
        AlumnoData alumnos = new AlumnoData();
        List lista = alumnos.listarAlumnos();

        for (int indice = 0; indice < lista.size(); indice++) {
            jcbAlumno.addItem(String.valueOf(lista.get(indice)));
        }
    }

    private void armarLista() {
        modelo.addColumn("ID Materia");
        modelo.addColumn("Alumno");
        modelo.addColumn("Materia");
        modelo.addColumn("Nota");
        jtNotas.setModel(modelo);
    }

    private void cargarDatos(int i) {
        modelo.setRowCount(0);
        InscripcionData inscripcion = new InscripcionData();
        //List lista=alumnos.listarAlumnos();    
        List lista = inscripcion.obtenerInscripcionesPorAlumno(i);

        for (int indice = 0; indice < lista.size(); indice++) {
            String cadena = String.valueOf(lista.get(indice));
            // Utilizamos el método split() para dividir la cadena en elementos
            String[] elementos = cadena.split(" ");
            // Iteramos a través del arreglo de elementos y los imprimimos           
            modelo.addRow(new Object[]{elementos[0], elementos[1] + " " + elementos[2], elementos[3] + " " + elementos[4], elementos[5]});

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<String> jcbAlumno;
    private javax.swing.JTable jtNotas;
    // End of variables declaration//GEN-END:variables

}
