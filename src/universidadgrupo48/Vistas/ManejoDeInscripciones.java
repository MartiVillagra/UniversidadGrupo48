package universidadgrupo48.Vistas;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import universidadgrupo48.AccesoDeDatos.AlumnoData;
import universidadgrupo48.AccesoDeDatos.InscripcionData;
import universidadgrupo48.AccesoDeDatos.MateriaData;
import universidadgrupo48.Entidades.Alumno;
import universidadgrupo48.Entidades.Inscripcion;
import universidadgrupo48.Entidades.Materia;

public class ManejoDeInscripciones extends javax.swing.JInternalFrame {
    private DefaultTableModel modelo = new DefaultTableModel(){
    
        public boolean isCellEditable(int f,int c){
        //si pongo false entonces las celdas no son editables
            return false;  
        }
    };
    /**
     * Creates new form manejoDeInscripciones
     */
    public ManejoDeInscripciones() {
        initComponents();
        armarCabecera();
        cargarComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbAlumno = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTmateria = new javax.swing.JTable();
        jBinscribir = new javax.swing.JButton();
        jBanularInscripcion = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jRadio1 = new javax.swing.JRadioButton();
        jRadio2 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(204, 255, 255));
        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 204));
        jLabel1.setText("Formulario de Inscripcion");

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Seleccione un alumno");

        jcbAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAlumnoActionPerformed(evt);
            }
        });

        jTmateria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Año"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTmateria);

        jBinscribir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBinscribir.setText("Inscribir");
        jBinscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBinscribirActionPerformed(evt);
            }
        });

        jBanularInscripcion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBanularInscripcion.setText("Anular Inscripcion");
        jBanularInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBanularInscripcionActionPerformed(evt);
            }
        });

        jBsalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jRadio1.setText("Materias inscriptas");
        jRadio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadio1ActionPerformed(evt);
            }
        });

        jRadio2.setText("Materias no inscriptas");
        jRadio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadio2ActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Listado de Materias");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jRadio1)
                        .addGap(87, 87, 87)
                        .addComponent(jRadio2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(jLabel3)))
                .addContainerGap(202, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadio1)
                    .addComponent(jRadio2))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBinscribir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBanularInscripcion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBsalir))
                            .addComponent(jScrollPane1)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 818, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBsalir)
                    .addComponent(jBanularInscripcion)
                    .addComponent(jBinscribir))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jcbAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAlumnoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jcbAlumnoActionPerformed

    private void jBinscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBinscribirActionPerformed
        int fila = jTmateria.getSelectedRow();
//        double nota= Math.random()*(10);
//        nota=Math.round(nota);
//        System.out.println(nota);
        if (fila != -1 && jRadio1.isSelected()==false) {
            
        int idMateria = (int) modelo.getValueAt(fila, 0);
            InscripcionData insData = new InscripcionData();
        MateriaData matData = new MateriaData();
        Materia mat = matData.buscarMateriaPorID(idMateria);
        Alumno alu = (Alumno) jcbAlumno.getSelectedItem();
            Inscripcion ins = new Inscripcion(alu, mat, 0);
            insData.guardarInscripcion(ins);
            borrarFila();
        } else {
            if (jRadio1.isSelected()==true && fila!=-1) {
                JOptionPane.showMessageDialog(this, "Usted ya está inscripto a la materia");
            }else{
             JOptionPane.showMessageDialog(this, "Selecione una materia!!");   
            }
            
        }
        
    }//GEN-LAST:event_jBinscribirActionPerformed

    private void jRadio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadio1ActionPerformed
        borrarFila();
        materiasCursadas();
    }//GEN-LAST:event_jRadio1ActionPerformed

    private void jRadio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadio2ActionPerformed
        borrarFila();
        materiasnoCursadas();
    }//GEN-LAST:event_jRadio2ActionPerformed

    private void jBanularInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBanularInscripcionActionPerformed
       int fila = jTmateria.getSelectedRow();
       if (fila != -1 && jRadio2.isSelected()==false) {
        int idMateria = (int) modelo.getValueAt(fila, 0);
        InscripcionData insData=new InscripcionData();
        Alumno alu=(Alumno) jcbAlumno.getSelectedItem();
        int idAlumno=alu.getIdAlumno();
        insData.borrarInscripcionMateriaAlumno(idAlumno, idMateria);
        borrarFila();
        
        } else {
            if (jRadio2.isSelected()==true && fila!=-1) {
                JOptionPane.showMessageDialog(this, "Usted no está inscripto a la materia");
            }else{
             JOptionPane.showMessageDialog(this, "Selecione una materia!!");   
            }
        }
    }//GEN-LAST:event_jBanularInscripcionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBanularInscripcion;
    private javax.swing.JButton jBinscribir;
    private javax.swing.JButton jBsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadio1;
    private javax.swing.JRadioButton jRadio2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTmateria;
    private javax.swing.JComboBox<Alumno> jcbAlumno;
    // End of variables declaration//GEN-END:variables
    private void armarCabecera(){
    
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Año");
    
        jTmateria.setModel(modelo);
    }
    
    private void cargarComboBox(){
        Alumno alum = new Alumno();     
        AlumnoData alu = new AlumnoData();
    
        for(Alumno alumn : alu.listarAlumno()){
            jcbAlumno.addItem(alumn);
        }
    }
    private void borrarFila(){
        int f=jTmateria.getRowCount()-1;
        for(;f>=0;f--){
            modelo.removeRow(f);
        }
    }
    private void materiasCursadas(){
       if (jRadio1.isSelected() == true){
           jRadio2.setSelected(false);
            InscripcionData insData = new InscripcionData();
            Alumno alu = (Alumno)jcbAlumno.getSelectedItem();
            Materia mat = new Materia();
            insData.obtenerMateriasCursadas(alu.getIdAlumno());
        
            for (Materia materia : insData.obtenerMateriasCursadas(alu.getIdAlumno())){
                modelo.addRow(new Object[]{
                    materia.getIdMateria(), 
                    materia.getNombre(), 
                    materia.getAnioMateria()
                });
            } 
    }else{borrarFila();}}
   private void materiasnoCursadas(){
       
       if (jRadio2.isSelected() == true){
           jRadio1.setSelected(false);
            InscripcionData insData = new InscripcionData();
            Alumno alu = (Alumno)jcbAlumno.getSelectedItem();
            Materia mat = new Materia();
            insData.obtenerMateriaNoCursada(alu.getIdAlumno());
        
            for (Materia materia : insData.obtenerMateriaNoCursada(alu.getIdAlumno())){
                modelo.addRow(new Object[]{
                    materia.getIdMateria(), 
                    materia.getNombre(), 
                    materia.getAnioMateria()
                });
            }
        }else{borrarFila();}
   
}}
