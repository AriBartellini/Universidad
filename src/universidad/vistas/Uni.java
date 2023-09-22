package universidad.vistas;

import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;

public class Uni extends javax.swing.JFrame {

    public Uni() {
        initComponents();
        determinarFondo();
        this.setLocationRelativeTo(null); //centramos la ventana
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiFormularioAlumno = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmiFormularioMateria = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmiManejoInscripciones = new javax.swing.JMenuItem();
        jmiManipulacionNotas = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jmiAlumnosPorMateria = new javax.swing.JMenuItem();
        jmSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de gestion escolar");
        setResizable(false);

        escritorio.setName(""); // NOI18N
        escritorio.setPreferredSize(new java.awt.Dimension(800, 600));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jMenu1.setText("Alumno");

        jmiFormularioAlumno.setText("Formulario de alumno");
        jmiFormularioAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFormularioAlumnoActionPerformed(evt);
            }
        });
        jMenu1.add(jmiFormularioAlumno);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Materia");

        jmiFormularioMateria.setText("Formulario de materia");
        jmiFormularioMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFormularioMateriaActionPerformed(evt);
            }
        });
        jMenu2.add(jmiFormularioMateria);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Administracion");

        jmiManejoInscripciones.setText("Manejo de inscripciones");
        jmiManejoInscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiManejoInscripcionesActionPerformed(evt);
            }
        });
        jMenu3.add(jmiManejoInscripciones);

        jmiManipulacionNotas.setText("Manipulacion de notas");
        jmiManipulacionNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiManipulacionNotasActionPerformed(evt);
            }
        });
        jMenu3.add(jmiManipulacionNotas);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Consultas");

        jmiAlumnosPorMateria.setText("Alumnos por materia");
        jmiAlumnosPorMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAlumnosPorMateriaActionPerformed(evt);
            }
        });
        jMenu4.add(jmiAlumnosPorMateria);

        jMenuBar1.add(jMenu4);

        jmSalir.setText("Salir");
        jmSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmSalirMouseClicked(evt);
            }
        });
        jmSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSalirActionPerformed(evt);
            }
        });
        jMenuBar1.add(jmSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmiFormularioAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFormularioAlumnoActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        determinarFondo();
        GestionAlumnos ga = new GestionAlumnos();
        ga.setVisible(true);
        escritorio.add(ga);
        escritorio.moveToFront(ga);
    }//GEN-LAST:event_jmiFormularioAlumnoActionPerformed

    private void jmiFormularioMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFormularioMateriaActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        determinarFondo();
        GestionMaterias gm = new GestionMaterias();
        gm.setVisible(true);
        escritorio.add(gm);
        escritorio.moveToFront(gm);

    }//GEN-LAST:event_jmiFormularioMateriaActionPerformed

    private void jmiManejoInscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiManejoInscripcionesActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        determinarFondo();
        FormularioInscripcion fi = new FormularioInscripcion();
        fi.setVisible(true);
        escritorio.add(fi);
        escritorio.moveToFront(fi);
    }//GEN-LAST:event_jmiManejoInscripcionesActionPerformed

    private void jmiManipulacionNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiManipulacionNotasActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        determinarFondo();
        ActualizacionNotas an = new ActualizacionNotas();
        an.setVisible(true);
        escritorio.add(an);
        escritorio.moveToFront(an);
    }//GEN-LAST:event_jmiManipulacionNotasActionPerformed

    private void jmiAlumnosPorMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAlumnosPorMateriaActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        determinarFondo();
        ConsultaAlumnosPorMateria cam = new ConsultaAlumnosPorMateria();
        cam.setVisible(true);
        escritorio.add(cam);
        escritorio.moveToFront(cam);
    }//GEN-LAST:event_jmiAlumnosPorMateriaActionPerformed

    private void jmSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSalirActionPerformed
        // esto no hace nada 
    }//GEN-LAST:event_jmSalirActionPerformed

    private void jmSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jmSalirMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Uni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Uni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Uni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Uni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Uni().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jmSalir;
    private javax.swing.JMenuItem jmiAlumnosPorMateria;
    private javax.swing.JMenuItem jmiFormularioAlumno;
    private javax.swing.JMenuItem jmiFormularioMateria;
    private javax.swing.JMenuItem jmiManejoInscripciones;
    private javax.swing.JMenuItem jmiManipulacionNotas;
    // End of variables declaration//GEN-END:variables

    public void centrarInternalFrame(JInternalFrame internalFrame) {
        int ancho = escritorio.getWidth();
        int alto = escritorio.getHeight();
        int anchoFrame = internalFrame.getWidth();
        int altoFrame = internalFrame.getHeight();

        int x = (ancho - anchoFrame) / 2;
        int y = (alto - altoFrame) / 2;

        internalFrame.setLocation(x, y);
    }
    
    private void determinarFondo(){
    JLabel fondo= new JLabel();
    fondo.setIcon(new ImageIcon("fondo2.jpg"));
    fondo.setBounds(0,0,escritorio.getWidth(),escritorio.getHeight());
    fondo.setHorizontalAlignment(JLabel.CENTER); // Alinea la imagen en el centro
    fondo.setVerticalAlignment(JLabel.CENTER);   // Alinea la imagen en el centro
    escritorio.add(fondo);
    escritorio.setComponentZOrder(fondo, 0);
    fondo.setOpaque(false);
    escritorio.setOpaque(false);
}
}
