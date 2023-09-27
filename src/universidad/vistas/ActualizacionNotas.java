package universidad.vistas;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import universidad.acceso.AlumnoData;
import universidad.acceso.InscripcionData;

public class ActualizacionNotas extends javax.swing.JInternalFrame {

    private final DefaultTableModel modelo = new DefaultTableModel();
    boolean notaCargada = false;
    public ActualizacionNotas() {
        initComponents();
        cargarCombo();
        armarLista();
        Uni univ = new Uni();
        univ.centrarInternalFrame(this);
        cargarDatos(1);
        jbGuardar.setEnabled(false);
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

        jcbAlumno.setName(""); // NOI18N
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jbGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSalir)))
                .addContainerGap(19, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar)
                    .addComponent(jbSalir))
                .addGap(21, 21, 21))
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
        notaCargada= true;

    }//GEN-LAST:event_jcbAlumnoItemStateChanged

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        guardarDatos();
    }//GEN-LAST:event_jbGuardarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<String> jcbAlumno;
    private javax.swing.JTable jtNotas;
    // End of variables declaration//GEN-END:variables

    private void cargarDatos(int i) {
        modelo.setRowCount(0);
        InscripcionData inscripcion = new InscripcionData();
        List lista = inscripcion.obtenerInscripcionesPorAlumno(i);

        for (int indice = 0; indice < lista.size(); indice++) {
            String cadena = String.valueOf(lista.get(indice));
            String[] elementos = cadena.split(" ");
            modelo.addRow(new Object[]{elementos[0], elementos[3] + " " + elementos[4], elementos[1] + " " + elementos[2], elementos[5]});
            //elemento 0 id   //1 nombre    //2 apellido   //3 materia    //4 anio      //5 nota
        }
  }

    private void cargarCombo() {
        AlumnoData alumnos = new AlumnoData();
        List lista = alumnos.listarAlumnos();
        for (int indice = 0; indice < lista.size(); indice++) {
            jcbAlumno.addItem(String.valueOf(lista.get(indice)));
        }
    }

    private void armarLista() {
        modelo.addColumn("ID Materia");
        modelo.addColumn("Materia");
        modelo.addColumn("Alumno");    
        modelo.addColumn("Nota");
        jtNotas.setModel(modelo);
    }
 
    private void guardarDatos(){
        jtNotas.putClientProperty("terminateEditOnFocusLost", Boolean.TRUE); // ahce
        
        InscripcionData ins = new InscripcionData();
        int filaSelec = (int) jtNotas.getSelectedRow();
        int idMateria = Integer.parseInt((String) jtNotas.getValueAt(filaSelec, 0));

        String selectedItem = (String) jcbAlumno.getSelectedItem();
        String[] parts = selectedItem.split(" ");
        int idAlumno = Integer.parseInt(parts[0]);
        try {
            double nota = Double.parseDouble((String) jtNotas.getValueAt(filaSelec, 3));

            if (nota >= 1 && nota <= 10) {

                ins.actualizarNota(idAlumno, idMateria, nota);
                
            } else {
                JOptionPane.showMessageDialog(null, "Los datos ingresados no estan dentro de los valores correspondiente");
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Nota no cargada, vuelva a intentarlo");
            ins.actualizarNota(idAlumno, idMateria, 0.0);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El campo nota solo permite ingresar numeros, vuelva a intentarlo");
        }
    }
    
    //agregar un checkCampos
    private void checkCampos(){
         if (notaCargada) {
        jbGuardar.setEnabled(true);
    } 
    
    }   
}
