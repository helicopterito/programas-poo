package visual;

import control.*;

public class VentanaAgregarCliente extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public VentanaAgregarCliente() {
        initComponents();
        this.setVisible(true);
        this.setTitle("Agregar Cliente");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombre = new javax.swing.JLabel();
        lblAPaterno = new javax.swing.JLabel();
        lblAMaterno = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        txtFieldNombre = new javax.swing.JTextField();
        txtFieldAPaterno = new javax.swing.JTextField();
        txtFieldAMaterno = new javax.swing.JTextField();
        txtFieldDireccion = new javax.swing.JTextField();
        btnReestablecer = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jBtnCerrar = new javax.swing.JButton();
        jLblAgregarCliente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));

        lblNombre.setText("Nombre:");

        lblAPaterno.setText("Apellido Paterno:");

        lblAMaterno.setText("Apellido Materno:");

        lblDireccion.setText("Direccion:");

        txtFieldNombre.setText("Nombre");
        txtFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldNombreActionPerformed(evt);
            }
        });

        txtFieldAPaterno.setText("Apellido");
        txtFieldAPaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldAPaternoActionPerformed(evt);
            }
        });

        txtFieldAMaterno.setText("Apellido");

        txtFieldDireccion.setText("Direccion");

        btnReestablecer.setText("Reestablecer");
        btnReestablecer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReestablecerMouseClicked(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
        });

        jBtnCerrar.setText("Cerrar");
        jBtnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnCerrarMouseClicked(evt);
            }
        });

        jLblAgregarCliente.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLblAgregarCliente.setText("Agregar Cliente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre)
                            .addComponent(lblAPaterno)
                            .addComponent(lblAMaterno)
                            .addComponent(lblDireccion))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFieldAMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFieldAPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnReestablecer)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLblAgregarCliente)
                        .addGap(9, 9, 9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGuardar)
                        .addContainerGap(35, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBtnCerrar))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLblAgregarCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre)
                            .addComponent(txtFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jBtnCerrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAPaterno)
                    .addComponent(txtFieldAPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAMaterno)
                    .addComponent(txtFieldAMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDireccion)
                    .addComponent(txtFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReestablecer)
                    .addComponent(btnGuardar))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldNombreActionPerformed

    private void txtFieldAPaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldAPaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldAPaternoActionPerformed

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        crearCliente();
        
    }//GEN-LAST:event_btnGuardarMouseClicked
        //Borra el contenido de los campos
    private void btnReestablecerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReestablecerMouseClicked
        
        reestablecer();
    }//GEN-LAST:event_btnReestablecerMouseClicked

    private void jBtnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnCerrarMouseClicked
        
        this.dispose();
    }//GEN-LAST:event_jBtnCerrarMouseClicked


    
    // Crea una persona con los datos introducidos en los TextField
    public void crearCliente()
    {
        
        Cliente clienteNuevo = new Cliente(
        this.txtFieldNombre.getText(),
        this.txtFieldAPaterno.getText(),
        this.txtFieldAMaterno.getText(),
        this.txtFieldDireccion.getText());
        
        VentanaPrincipal.listaDeClientes.add(clienteNuevo);
        
        
        reestablecer();
    }
    
    //Limpia el valor de los TextField
    public void reestablecer()
    {
        this.txtFieldNombre.setText("");
        this.txtFieldAPaterno.setText("");
        this.txtFieldAMaterno.setText("");
        this.txtFieldDireccion.setText("");
        
    }
    //Muestra los datos de la persona en la posicion siguiente
    

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnReestablecer;
    private javax.swing.JButton jBtnCerrar;
    private javax.swing.JLabel jLblAgregarCliente;
    private javax.swing.JLabel lblAMaterno;
    private javax.swing.JLabel lblAPaterno;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTextField txtFieldAMaterno;
    private javax.swing.JTextField txtFieldAPaterno;
    private javax.swing.JTextField txtFieldDireccion;
    private javax.swing.JTextField txtFieldNombre;
    // End of variables declaration//GEN-END:variables
    


}
