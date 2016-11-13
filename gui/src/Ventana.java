
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author uchitel
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
        personas = new ArrayList();
        totalPersonas = 0;
        posicionActual = 0;
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
        lblCorreo = new javax.swing.JLabel();
        txtFieldNombre = new javax.swing.JTextField();
        txtFieldAPaterno = new javax.swing.JTextField();
        txtFieldAMaterno = new javax.swing.JTextField();
        txtFieldDireccion = new javax.swing.JTextField();
        txtFieldCorreo = new javax.swing.JTextField();
        btnAnterior = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        btnReestablecer = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNombre.setText("Nombre:");

        lblAPaterno.setText("Apellido Paterno:");

        lblAMaterno.setText("Apellido Materno:");

        lblDireccion.setText("Direccion:");

        lblCorreo.setText("Correo:");

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

        txtFieldCorreo.setText("Correo");

        btnAnterior.setText("Anterior");
        btnAnterior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAnteriorMouseClicked(evt);
            }
        });

        btnSiguiente.setText("Siguiente");
        btnSiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSiguienteMouseClicked(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblNombre)
                                .addComponent(lblAPaterno)
                                .addComponent(lblAMaterno)
                                .addComponent(lblDireccion)
                                .addComponent(lblCorreo))
                            .addComponent(btnAnterior))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFieldAMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFieldAPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSiguiente))))
                    .addComponent(btnReestablecer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGuardar)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreo)
                    .addComponent(txtFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnterior)
                    .addComponent(btnSiguiente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReestablecer)
                    .addComponent(btnGuardar))
                .addContainerGap(15, Short.MAX_VALUE))
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
        crearPersona();
    }//GEN-LAST:event_btnGuardarMouseClicked
        //Borra el contenido de los campos
    private void btnReestablecerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReestablecerMouseClicked
        
        reestablecer();
    }//GEN-LAST:event_btnReestablecerMouseClicked

    private void btnSiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiguienteMouseClicked
        personaSiguiente();
    }//GEN-LAST:event_btnSiguienteMouseClicked

    private void btnAnteriorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnteriorMouseClicked
        personaAnterior();
    }//GEN-LAST:event_btnAnteriorMouseClicked
        // Crea una persona con los datos introducidos en los TextField
    public void crearPersona()
    {
        //pasamos al constructor los valores del campo
        Persona p1 = new Persona(
        this.txtFieldNombre.getText(),
        this.txtFieldAPaterno.getText(),
        this.txtFieldAMaterno.getText(),
        this.txtFieldDireccion.getText(),
        this.txtFieldCorreo.getText());
        this.getPersonas().add(p1);
        //aumenta el total de personas
        totalPersonas++;
    }
    
    public void reestablecer()
    {
        this.txtFieldNombre.setText("");
        this.txtFieldAPaterno.setText("");
        this.txtFieldAMaterno.setText("");
        this.txtFieldDireccion.setText("");
        this.txtFieldCorreo.setText("");
    }
    
    public void personaSiguiente()
    {

        if(totalPersonas == 1)
        {
            mostrarPersona(posicionActual);
        }
        else if(totalPersonas > 1)
        {
            mostrarPersona(++posicionActual);
        }
        
        
    }
    
    public void personaAnterior()
    {
        if(totalPersonas == 0 | posicionActual < 0)
        {
            reestablecer();
        }
        else if(totalPersonas == 1)
        {
            posicionActual = 0;
        }
        else if(totalPersonas > 1)
        {
            --posicionActual;
        }
        mostrarPersona(posicionActual);
    }
    
    public void mostrarPersona(int posicion)
    {
        this.txtFieldNombre.setText(personas.get(posicion).getNombre());
        this.txtFieldAPaterno.setText(personas.get(posicion).getaPaterno());
        this.txtFieldAMaterno.setText(personas.get(posicion).getaMaterno());
        this.txtFieldDireccion.setText(personas.get(posicion).getDireccion());
        this.txtFieldCorreo.setText(personas.get(posicion).getCorreo());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnReestablecer;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JLabel lblAMaterno;
    private javax.swing.JLabel lblAPaterno;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTextField txtFieldAMaterno;
    private javax.swing.JTextField txtFieldAPaterno;
    private javax.swing.JTextField txtFieldCorreo;
    private javax.swing.JTextField txtFieldDireccion;
    private javax.swing.JTextField txtFieldNombre;
    // End of variables declaration//GEN-END:variables
    private ArrayList<Persona> personas;
    private int totalPersonas;
    private int posicionActual;

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    public int getTotalPersonas() {
        return totalPersonas;
    }

    public void setTotalPersonas(int totalPersonas) {
        this.totalPersonas = totalPersonas;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

}
