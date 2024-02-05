
package Interfaz;

import java.io.File;
import javax.swing.WindowConstants;
import java.awt.FileDialog;
import java.awt.Frame;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


import Clases.Documento;
import olc.dataforge.AppState;

public class Principal extends javax.swing.JFrame {

    static private String rutaGlobal;
            
    
    
    public Principal() {
        initComponents();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("DATAFORGE");
        llenarPestañas();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        CodigoTextArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaPestañas = new javax.swing.JTable();
        cambiar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        ConsolaTextArea = new javax.swing.JTextArea();
        menu = new javax.swing.JMenuBar();
        archivo = new javax.swing.JMenu();
        nuevo = new javax.swing.JMenuItem();
        abrir = new javax.swing.JMenuItem();
        guardar = new javax.swing.JMenuItem();
        guardar_como = new javax.swing.JMenuItem();
        cerrar = new javax.swing.JMenuItem();
        ejecutarM = new javax.swing.JMenu();
        ejecutar = new javax.swing.JMenuItem();
        reportes = new javax.swing.JMenu();
        reporte_tokens = new javax.swing.JMenuItem();
        reporte_errores = new javax.swing.JMenuItem();
        reporte_tabla_de_simbolos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CodigoTextArea.setColumns(20);
        CodigoTextArea.setRows(5);
        jScrollPane1.setViewportView(CodigoTextArea);

        tablaPestañas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pestañas"
            }
        ));
        jScrollPane2.setViewportView(tablaPestañas);

        cambiar.setText("Cabiar");
        cambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarActionPerformed(evt);
            }
        });

        ConsolaTextArea.setBackground(new java.awt.Color(51, 51, 51));
        ConsolaTextArea.setColumns(20);
        ConsolaTextArea.setForeground(new java.awt.Color(255, 255, 255));
        ConsolaTextArea.setRows(5);
        jScrollPane3.setViewportView(ConsolaTextArea);

        archivo.setText("Archivo");

        nuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        nuevo.setText("Nuevo");
        archivo.add(nuevo);

        abrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        abrir.setText("Abrir");
        abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirActionPerformed(evt);
            }
        });
        archivo.add(abrir);

        guardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        guardar.setText("Guardar");
        archivo.add(guardar);

        guardar_como.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        guardar_como.setText("Guardar Como");
        archivo.add(guardar_como);

        cerrar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        cerrar.setText("Cerrar");
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });
        archivo.add(cerrar);

        menu.add(archivo);

        ejecutarM.setText("Ejecutar");

        ejecutar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        ejecutar.setText("Ejecutar");
        ejecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ejecutarActionPerformed(evt);
            }
        });
        ejecutarM.add(ejecutar);

        menu.add(ejecutarM);

        reportes.setText("Reportes");

        reporte_tokens.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        reporte_tokens.setText("Tokens");
        reportes.add(reporte_tokens);

        reporte_errores.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        reporte_errores.setText("Errores");
        reportes.add(reporte_errores);

        reporte_tabla_de_simbolos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        reporte_tabla_de_simbolos.setText("Tabla de Símbolos");
        reportes.add(reporte_tabla_de_simbolos);

        menu.add(reportes);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cambiar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 338, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 3, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cambiar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void llenarPestañas(){
        
       DefaultTableModel modeloDafault = new DefaultTableModel(new String[]{"Pestañas"},AppState.pestañas.size());
       tablaPestañas.setModel(modeloDafault);
       
       TableModel modeloDatos = tablaPestañas.getModel();
       for(int i =0; i <AppState.pestañas.size(); i++){
           modeloDatos.setValueAt(AppState.pestañas.get(i).getNombre(),i,0);
       }
        
    }
    
    private void actualizarContenido(){
        //Antes de cualquier cambio actualizaremos el contenido para evitar guardar el documento en la memoria estatica y asi 
        //darle a el usuario la decision si quiere guardar los cambios...
        for(int i =0; i <AppState.pestañas.size(); i++){
            Documento obj = AppState.pestañas.get(i);
            if(obj.getRuta().equals(rutaGlobal)){
                String texto = CodigoTextArea.getText();
                obj.setContenido(texto);
            }
        }
    }
    
    
    private void abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirActionPerformed
        FileDialog fileDialog = new FileDialog((Frame) null);
        fileDialog.setFilenameFilter((dir, name) -> name.endsWith(".txt"));

        fileDialog.setVisible(true);

        String nombreArchivo = fileDialog.getFile(); 
        String directorio = fileDialog.getDirectory();
        String rutaCompleta = directorio + nombreArchivo;

        

        if (nombreArchivo != null) {
            
            boolean encontrada = false;
            
            for(int i =0; i <AppState.pestañas.size(); i++){
                String rutaExistente = AppState.pestañas.get(i).getRuta();
                if(rutaExistente.equals(rutaCompleta)){
                    encontrada = true;
                    break;   
                }
            }
            
            if(encontrada == false){          
                try {
                    
                    actualizarContenido(); 
                    
                    rutaGlobal = rutaCompleta;
                    
                    // Leer el contenido del archivo
                    BufferedReader br = new BufferedReader(new FileReader(rutaCompleta));
                    StringBuilder contenido = new StringBuilder();


                    String linea;

                    while ((linea = br.readLine()) != null) {
                        contenido.append(linea).append("\n");
                    }

                    br.close();

                    // Colocar el contenido en el TextArea
                    CodigoTextArea.setText(contenido.toString());

                    // Agragar a la lista de pestañas el documento abierto
                    Documento documento = new Documento(nombreArchivo, rutaCompleta, contenido.toString());
                    AppState.pestañas.add(documento); 

                    llenarPestañas();


                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }else{
                JOptionPane.showMessageDialog(null, "El archivo ya se encuentra abierto", "Información", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_abrirActionPerformed

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cerrarActionPerformed

    

    
    private void ejecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ejecutarActionPerformed
        System.out.println(rutaGlobal);
    }//GEN-LAST:event_ejecutarActionPerformed

    private void cambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarActionPerformed
        int filaSeleccionada = tablaPestañas.getSelectedRow();

        if (filaSeleccionada >=0){
            actualizarContenido();                
            String contenido = AppState.pestañas.get(filaSeleccionada).getContenido();
            CodigoTextArea.setText(contenido);
            rutaGlobal = AppState.pestañas.get(filaSeleccionada).getRuta();  
        }
    }//GEN-LAST:event_cambiarActionPerformed


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea CodigoTextArea;
    private javax.swing.JTextArea ConsolaTextArea;
    private javax.swing.JMenuItem abrir;
    private javax.swing.JMenu archivo;
    private javax.swing.JButton cambiar;
    private javax.swing.JMenuItem cerrar;
    private javax.swing.JMenuItem ejecutar;
    private javax.swing.JMenu ejecutarM;
    private javax.swing.JMenuItem guardar;
    private javax.swing.JMenuItem guardar_como;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenuItem nuevo;
    private javax.swing.JMenuItem reporte_errores;
    private javax.swing.JMenuItem reporte_tabla_de_simbolos;
    private javax.swing.JMenuItem reporte_tokens;
    private javax.swing.JMenu reportes;
    private javax.swing.JTable tablaPestañas;
    // End of variables declaration//GEN-END:variables
}
