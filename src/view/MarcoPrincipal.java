package view;
import model.Serializar;
import controller.Reserva;
import com.toedter.calendar.JDateChooser;
import controller.Buscar;
import java.awt.event.ItemEvent;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class MarcoPrincipal extends javax.swing.JFrame {
    
    Reserva rese;
    private boolean garaje;
    Serializar guarda = new Serializar();
    boolean focoReservar = true;
    
    //Creamos un ArrayList de tipo objeto para guardar temporalmente los clientes
    ArrayList<Reserva> lista = new ArrayList();
        
        
    /**
     * Creates new form MarcoPrincipal
     */
    public MarcoPrincipal() {
        initComponents();            
    }

    private String getNombre(){       
        return nombreArea.getText();
    }  
    private String getCedula(){
        return cedulaArea.getText();
    }
    private String getTipo(){
        if(typeOfRoom.getSelectedIndex() == 0){
            return "Individual";
        }else if(typeOfRoom.getSelectedIndex()==1){
            return "Doble";
        }else if(typeOfRoom.getSelectedIndex()==2){
            return "Familiar";
        }
        return "";
    }
    private String getEntrada(){
        
        //Recibimos fecha
        Date fecha = jDateChooserEntrada.getDate();
        
        //Le damos formato a esa fecha
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        
        //retrnamos la fecha
        return formato.format(fecha);     
    }
    private String getSalida(){
        
        //Recibimos fecha
        Date fecha = jDateChooserSalida.getDate();
        
        //Le damos formato a esa fecha
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        
        //retrnamos la fecha
        return formato.format(fecha); 
    }     
    private boolean getGaraje(){
        return garaje;
    }
    private int getPersonas(){
        return Integer.parseInt(jTextNPersonas.getText());
    }
    private void setTextoExitoso(){
        ExitoConfiguracion.setText("Registro con Exito");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pestañas = new javax.swing.JTabbedPane();
        ReservarPanel = new javax.swing.JPanel();
        nombreYApLabel = new javax.swing.JLabel();
        cedulaLabel = new javax.swing.JLabel();
        jLabelFechaentrada = new javax.swing.JLabel();
        jLabelFechasalida = new javax.swing.JLabel();
        jLabelTipohabitacion = new javax.swing.JLabel();
        nombreArea = new javax.swing.JTextField();
        cedulaArea = new javax.swing.JTextField();
        ReservarButton = new javax.swing.JButton();
        typeOfRoom = new javax.swing.JComboBox<>();
        jDateChooserEntrada = new com.toedter.calendar.JDateChooser();
        jDateChooserSalida = new com.toedter.calendar.JDateChooser();
        plazaDegarajeCheck = new javax.swing.JRadioButton();
        ExitoConfiguracion = new javax.swing.JLabel();
        jLabelNPersonas = new javax.swing.JLabel();
        jTextNPersonas = new javax.swing.JTextField();
        BuscarPanel = new javax.swing.JPanel();
        TextBuscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ButtonBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextAreaDatos = new javax.swing.JTextArea();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        EliminarPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        ReservarPanel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                ReservarPanelComponentHidden(evt);
            }
            public void componentShown(java.awt.event.ComponentEvent evt) {
                ReservarPanelComponentShown(evt);
            }
        });

        nombreYApLabel.setText("Nombre y Apellido:");

        cedulaLabel.setText("Cedula:");

        jLabelFechaentrada.setText("Fecha Entrada:");

        jLabelFechasalida.setText("Fecha Salida:");

        jLabelTipohabitacion.setText("Tipo de habitacion:");

        nombreArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreAreaActionPerformed(evt);
            }
        });

        ReservarButton.setText("Reservar");
        ReservarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReservarButtonActionPerformed(evt);
            }
        });

        typeOfRoom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Individual", "Doble", "Familiar" }));
        typeOfRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeOfRoomActionPerformed(evt);
            }
        });

        plazaDegarajeCheck.setText("Plaza de garaje");
        plazaDegarajeCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plazaDegarajeCheckActionPerformed(evt);
            }
        });

        ExitoConfiguracion.setText("            Aun no se ha hecho ninguna reserva");

        jLabelNPersonas.setText("Numero de Personas");

        jTextNPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNPersonasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ReservarPanelLayout = new javax.swing.GroupLayout(ReservarPanel);
        ReservarPanel.setLayout(ReservarPanelLayout);
        ReservarPanelLayout.setHorizontalGroup(
            ReservarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReservarPanelLayout.createSequentialGroup()
                .addGroup(ReservarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelNPersonas)
                    .addGroup(ReservarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ReservarPanelLayout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addGroup(ReservarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(cedulaLabel)
                                .addComponent(jLabelFechaentrada)
                                .addComponent(jLabelFechasalida)
                                .addComponent(jLabelTipohabitacion)))
                        .addGroup(ReservarPanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(nombreYApLabel))))
                .addGap(18, 18, 18)
                .addGroup(ReservarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ReservarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(ExitoConfiguracion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(plazaDegarajeCheck)
                        .addComponent(cedulaArea)
                        .addGroup(ReservarPanelLayout.createSequentialGroup()
                            .addGroup(ReservarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(typeOfRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jDateChooserEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jDateChooserSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ReservarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(nombreArea))
                    .addComponent(jTextNPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(190, Short.MAX_VALUE))
        );
        ReservarPanelLayout.setVerticalGroup(
            ReservarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReservarPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(ReservarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nombreArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreYApLabel))
                .addGap(18, 18, 18)
                .addGroup(ReservarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cedulaArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cedulaLabel))
                .addGap(18, 18, 18)
                .addGroup(ReservarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ReservarPanelLayout.createSequentialGroup()
                        .addGroup(ReservarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(ReservarPanelLayout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabelFechaentrada))
                            .addComponent(jDateChooserEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(ReservarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelFechasalida)
                            .addComponent(jDateChooserSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(ReservarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTipohabitacion)
                            .addComponent(typeOfRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(ReservarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(ReservarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextNPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(plazaDegarajeCheck)
                .addGap(18, 18, 18)
                .addComponent(ExitoConfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(195, Short.MAX_VALUE))
        );

        Pestañas.addTab("Reservar", ReservarPanel);

        BuscarPanel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BuscarPanelFocusGained(evt);
            }
        });
        BuscarPanel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                BuscarPanelComponentShown(evt);
            }
        });

        TextBuscar.setText("jTextField1");
        TextBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextBuscarActionPerformed(evt);
            }
        });

        jLabel2.setText("Escriba nombre o cedula");

        ButtonBuscar.setText("Buscar");
        ButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBuscarActionPerformed(evt);
            }
        });

        jLabel3.setText("Datos de la Reserva");

        TextAreaDatos.setColumns(20);
        TextAreaDatos.setRows(5);
        jScrollPane1.setViewportView(TextAreaDatos);

        jFormattedTextField1.setText("jFormattedTextField1");

        javax.swing.GroupLayout BuscarPanelLayout = new javax.swing.GroupLayout(BuscarPanel);
        BuscarPanel.setLayout(BuscarPanelLayout);
        BuscarPanelLayout.setHorizontalGroup(
            BuscarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BuscarPanelLayout.createSequentialGroup()
                .addGroup(BuscarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BuscarPanelLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(BuscarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jFormattedTextField1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
                            .addComponent(ButtonBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TextBuscar)))
                    .addGroup(BuscarPanelLayout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(jLabel3)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        BuscarPanelLayout.setVerticalGroup(
            BuscarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BuscarPanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        Pestañas.addTab("Buscar", BuscarPanel);

        EliminarPanel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                EliminarPanelFocusGained(evt);
            }
        });
        EliminarPanel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                EliminarPanelComponentShown(evt);
            }
        });

        javax.swing.GroupLayout EliminarPanelLayout = new javax.swing.GroupLayout(EliminarPanel);
        EliminarPanel.setLayout(EliminarPanelLayout);
        EliminarPanelLayout.setHorizontalGroup(
            EliminarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 619, Short.MAX_VALUE)
        );
        EliminarPanelLayout.setVerticalGroup(
            EliminarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 583, Short.MAX_VALUE)
        );

        Pestañas.addTab("Eliminar", EliminarPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pestañas)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pestañas)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void typeOfRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeOfRoomActionPerformed
        
    }//GEN-LAST:event_typeOfRoomActionPerformed

    private void nombreAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreAreaActionPerformed

    private void ReservarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReservarButtonActionPerformed
        
        if(focoReservar){ 
            //Creamos el objeto con los datos de los campos
            rese = new Reserva(getNombre(),getCedula(),getEntrada(),getSalida(),
            getPersonas(),getTipo(),getGaraje());
               
            //Agrega a una lista el objeto   
            lista.add(rese);          
            System.out.println("Agregado en lista");
            
            }
        
        nombreArea.setText(" ");
        cedulaArea.setText(" ");
        
        jTextNPersonas.setText(" ");
        plazaDegarajeCheck.setSelected(false);
                
        setTextoExitoso();  
    
    }//GEN-LAST:event_ReservarButtonActionPerformed

    private void plazaDegarajeCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plazaDegarajeCheckActionPerformed
       
        if(plazaDegarajeCheck.isSelected()){
            garaje=true;
        }else{
            garaje=false;
        }
        
        
             
    }//GEN-LAST:event_plazaDegarajeCheckActionPerformed

    private void jTextNPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNPersonasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNPersonasActionPerformed

    private void BuscarPanelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BuscarPanelFocusGained
        
    }//GEN-LAST:event_BuscarPanelFocusGained

    private void EliminarPanelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EliminarPanelFocusGained
        
    }//GEN-LAST:event_EliminarPanelFocusGained

    private void ReservarPanelComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_ReservarPanelComponentShown
        focoReservar = true;
    }//GEN-LAST:event_ReservarPanelComponentShown

    private void BuscarPanelComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_BuscarPanelComponentShown
        System.out.println("Buscar tiene foco");
    }//GEN-LAST:event_BuscarPanelComponentShown

    private void EliminarPanelComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_EliminarPanelComponentShown
        System.out.println("Eliminar tiene foco");
    }//GEN-LAST:event_EliminarPanelComponentShown

    private void ReservarPanelComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_ReservarPanelComponentHidden
        focoReservar = false;
        
        if(focoReservar == false && !lista.isEmpty()){
                try{                
                    try {
                        guarda.escribirEnFichero(lista);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(MarcoPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    

            }catch(FileNotFoundException e){
                JOptionPane.showMessageDialog(null, "Registro fallido Intente de nuevo");
                }             
            }
    }//GEN-LAST:event_ReservarPanelComponentHidden

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
        
        try {
            for(int i =0;i<guarda.getTemporal();i++){
                
                try {
                    
                    lista.add(guarda.rescribir(i));
                    
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(MarcoPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(MarcoPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                try{
                    try{
                        guarda.escribirEnFichero(lista);
                        
                    }catch(ClassNotFoundException ex) {
                        Logger.getLogger(MarcoPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }catch(FileNotFoundException e){
                    JOptionPane.showMessageDialog(null, "Registro fallido Intente de nuevo");
                }             
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MarcoPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        System.out.println("Cerre el programa");
    }//GEN-LAST:event_formWindowClosing

    private void ButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBuscarActionPerformed
        // TODO add your handling code here:
        
        String textbuscar = TextBuscar.getText();
        Buscar busqueda = new Buscar(textbuscar);
        
        
        
    }//GEN-LAST:event_ButtonBuscarActionPerformed

    private void TextBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextBuscarActionPerformed

    
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
            java.util.logging.Logger.getLogger(MarcoPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MarcoPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MarcoPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MarcoPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MarcoPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BuscarPanel;
    private javax.swing.JButton ButtonBuscar;
    private javax.swing.JPanel EliminarPanel;
    private javax.swing.JLabel ExitoConfiguracion;
    private javax.swing.JTabbedPane Pestañas;
    private javax.swing.JButton ReservarButton;
    private javax.swing.JPanel ReservarPanel;
    private javax.swing.JTextArea TextAreaDatos;
    private javax.swing.JTextField TextBuscar;
    private javax.swing.JTextField cedulaArea;
    private javax.swing.JLabel cedulaLabel;
    private com.toedter.calendar.JDateChooser jDateChooserEntrada;
    private com.toedter.calendar.JDateChooser jDateChooserSalida;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelFechaentrada;
    private javax.swing.JLabel jLabelFechasalida;
    private javax.swing.JLabel jLabelNPersonas;
    private javax.swing.JLabel jLabelTipohabitacion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextNPersonas;
    private javax.swing.JTextField nombreArea;
    private javax.swing.JLabel nombreYApLabel;
    private javax.swing.JRadioButton plazaDegarajeCheck;
    private javax.swing.JComboBox<String> typeOfRoom;
    // End of variables declaration//GEN-END:variables

    
}
