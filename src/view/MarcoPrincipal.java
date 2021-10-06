package view;

import com.toedter.calendar.JDateChooser;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.JOptionPane;

public class MarcoPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MarcoPrincipal
     */
    public MarcoPrincipal() {
        initComponents();
        
        
    }

    
    private void mostrarEnArea(JDateChooser date){
        jLabel1.setText(date.getDateFormatString());
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
        NombreYApArea = new javax.swing.JTextField();
        cedulaArea = new javax.swing.JTextField();
        ReservarButton = new javax.swing.JButton();
        typeOfRoom = new javax.swing.JComboBox<>();
        jDateChooserEntrada = new com.toedter.calendar.JDateChooser();
        jDateChooserSalida = new com.toedter.calendar.JDateChooser();
        plazaDegarajeCheck = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        BuscarPanel = new javax.swing.JPanel();
        EliminarPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nombreYApLabel.setText("Nombre y Apellido:");

        cedulaLabel.setText("Cedula:");

        jLabelFechaentrada.setText("Fecha Entrada:");

        jLabelFechasalida.setText("Fecha Salida:");

        jLabelTipohabitacion.setText("Tipo de habitacion:");

        NombreYApArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreYApAreaActionPerformed(evt);
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

        javax.swing.GroupLayout ReservarPanelLayout = new javax.swing.GroupLayout(ReservarPanel);
        ReservarPanel.setLayout(ReservarPanelLayout);
        ReservarPanelLayout.setHorizontalGroup(
            ReservarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReservarPanelLayout.createSequentialGroup()
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
                        .addComponent(nombreYApLabel)))
                .addGap(18, 18, 18)
                .addGroup(ReservarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(plazaDegarajeCheck)
                    .addComponent(cedulaArea)
                    .addGroup(ReservarPanelLayout.createSequentialGroup()
                        .addGroup(ReservarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(typeOfRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooserEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooserSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ReservarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(NombreYApArea))
                .addContainerGap(565, Short.MAX_VALUE))
        );
        ReservarPanelLayout.setVerticalGroup(
            ReservarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReservarPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(ReservarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NombreYApArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(18, 18, 18)
                .addComponent(plazaDegarajeCheck)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(252, Short.MAX_VALUE))
        );

        Pestañas.addTab("Reservar", ReservarPanel);

        javax.swing.GroupLayout BuscarPanelLayout = new javax.swing.GroupLayout(BuscarPanel);
        BuscarPanel.setLayout(BuscarPanelLayout);
        BuscarPanelLayout.setHorizontalGroup(
            BuscarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 994, Short.MAX_VALUE)
        );
        BuscarPanelLayout.setVerticalGroup(
            BuscarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 583, Short.MAX_VALUE)
        );

        Pestañas.addTab("Buscar", BuscarPanel);

        javax.swing.GroupLayout EliminarPanelLayout = new javax.swing.GroupLayout(EliminarPanel);
        EliminarPanel.setLayout(EliminarPanelLayout);
        EliminarPanelLayout.setHorizontalGroup(
            EliminarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 994, Short.MAX_VALUE)
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
        // TODO add your handling code here:
    }//GEN-LAST:event_typeOfRoomActionPerformed

    private void NombreYApAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreYApAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreYApAreaActionPerformed

    private void ReservarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReservarButtonActionPerformed
        
        //Recibimos fecha
        Date fecha = jDateChooserEntrada.getDate();
        
        //Le damos formato a esa fecha
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        
        System.out.println(formato.format(fecha));
        //mostrarEnArea();
    }//GEN-LAST:event_ReservarButtonActionPerformed

    
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
    private javax.swing.JPanel EliminarPanel;
    private javax.swing.JTextField NombreYApArea;
    private javax.swing.JTabbedPane Pestañas;
    private javax.swing.JButton ReservarButton;
    private javax.swing.JPanel ReservarPanel;
    private javax.swing.JTextField cedulaArea;
    private javax.swing.JLabel cedulaLabel;
    private com.toedter.calendar.JDateChooser jDateChooserEntrada;
    private com.toedter.calendar.JDateChooser jDateChooserSalida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelFechaentrada;
    private javax.swing.JLabel jLabelFechasalida;
    private javax.swing.JLabel jLabelTipohabitacion;
    private javax.swing.JLabel nombreYApLabel;
    private javax.swing.JRadioButton plazaDegarajeCheck;
    private javax.swing.JComboBox<String> typeOfRoom;
    // End of variables declaration//GEN-END:variables

    
}
