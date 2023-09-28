/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package universidadgrupo48.Vistas;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.*;

/**
 *
 * @author Loboplateado77
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        //import javax.swing.ImageIcon;
        //ImageIcon icono  = new  ImageIcon(getClass().getResource("/universidadgrupo48/Recursos/fondito.jpg"));
        //Image miImagenjpg = icono.getImage();
        escritorio = new javax.swing.JDesktopPane();//{

            //  public void paintComponent(Graphics g){
                //    g.drawImage(miImagenjpg,0,0,getWidth(),getHeight(),this);
                //}
            //};
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmFormularioAlumno = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmFormularioMateria = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmManejoInscripcion = new javax.swing.JMenuItem();
        jmManipulacionNota = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jmAlumnoxNota = new javax.swing.JMenuItem();
        salir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1086, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 597, Short.MAX_VALUE)
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidadgrupo48/Recursos/graduado.png"))); // NOI18N
        jMenu1.setMinimumSize(new java.awt.Dimension(93, 43));

        jmFormularioAlumno.setText("Formulario de alumno");
        jmFormularioAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmFormularioAlumnoActionPerformed(evt);
            }
        });
        jMenu1.add(jmFormularioAlumno);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidadgrupo48/Recursos/gestion-de-materiales.png"))); // NOI18N
        jMenu2.setMinimumSize(new java.awt.Dimension(93, 43));

        jmFormularioMateria.setText("Formulario de materia");
        jmFormularioMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmFormularioMateriaActionPerformed(evt);
            }
        });
        jMenu2.add(jmFormularioMateria);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidadgrupo48/Recursos/profesor.png"))); // NOI18N
        jMenu3.setMinimumSize(new java.awt.Dimension(93, 43));

        jmManejoInscripcion.setText("Manejo de inscripciones");
        jmManejoInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmManejoInscripcionActionPerformed(evt);
            }
        });
        jMenu3.add(jmManejoInscripcion);

        jmManipulacionNota.setText("Manipulacion de notas");
        jmManipulacionNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmManipulacionNotaActionPerformed(evt);
            }
        });
        jMenu3.add(jmManipulacionNota);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidadgrupo48/Recursos/consultante.png"))); // NOI18N
        jMenu4.setMinimumSize(new java.awt.Dimension(93, 43));

        jmAlumnoxNota.setText("Alumnos por materia");
        jmAlumnoxNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAlumnoxNotaActionPerformed(evt);
            }
        });
        jMenu4.add(jmAlumnoxNota);

        jMenuBar1.add(jMenu4);

        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidadgrupo48/Recursos/salida.png"))); // NOI18N
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirMouseClicked(evt);
            }
        });
        jMenuBar1.add(salir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(escritorio)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmFormularioAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmFormularioAlumnoActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        FormulariodeAlumno fa = new FormulariodeAlumno();
        fa.setVisible(true);
        escritorio.add(fa);
        escritorio.moveToFront(fa);
        
    }//GEN-LAST:event_jmFormularioAlumnoActionPerformed

    private void jmFormularioMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmFormularioMateriaActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        FormularioDeMateria fm = new FormularioDeMateria();
        fm.setVisible(true);
        escritorio.add(fm);
        escritorio.moveToFront(fm);
    }//GEN-LAST:event_jmFormularioMateriaActionPerformed

    private void jmManejoInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmManejoInscripcionActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        ManejoDeInscripciones mi = new ManejoDeInscripciones();
        mi.setVisible(true);
        escritorio.add(mi);
        escritorio.moveToFront(mi);
        
    }//GEN-LAST:event_jmManejoInscripcionActionPerformed

    private void jmManipulacionNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmManipulacionNotaActionPerformed
        // Manipulacion de notas
       
        escritorio.removeAll();
        escritorio.repaint();
        ManipulacionDeNotas mi = new ManipulacionDeNotas();
        mi.setVisible(true);
        escritorio.add(mi);
        escritorio.moveToFront(mi);
    }//GEN-LAST:event_jmManipulacionNotaActionPerformed

    private void jmAlumnoxNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAlumnoxNotaActionPerformed
        // alumnos x materia 
        escritorio.removeAll();
        escritorio.repaint();
        AlumnosPorMateria mi = new AlumnosPorMateria();
        mi.setVisible(true);
        escritorio.add(mi);
        escritorio.moveToFront(mi);
    }//GEN-LAST:event_jmAlumnoxNotaActionPerformed

    private void salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_salirMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jmAlumnoxNota;
    private javax.swing.JMenuItem jmFormularioAlumno;
    private javax.swing.JMenuItem jmFormularioMateria;
    private javax.swing.JMenuItem jmManejoInscripcion;
    private javax.swing.JMenuItem jmManipulacionNota;
    private javax.swing.JMenu salir;
    // End of variables declaration//GEN-END:variables
}
