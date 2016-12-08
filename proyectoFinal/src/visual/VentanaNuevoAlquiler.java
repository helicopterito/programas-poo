/*
 * Copyright (C) 2016 Néstor A. M. alvarado.nestor@yandex.com
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package visual;

import java.util.Date;
import control.*;
import java.awt.Color;

/**
 *
 * @author Néstor A. M. alvarado.nestor@yandex.com
 */
public class VentanaNuevoAlquiler extends javax.swing.JFrame {

    /**
     * Creates new form VentanaNuevoAlquiler
     */
    public VentanaNuevoAlquiler() {
        initComponents();
        this.setVisible(true);
        this.setTitle("Nuevo Alquiler");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLblNuevoAlquiler = new javax.swing.JLabel();
        jBtnCerrar = new javax.swing.JButton();
        jLblNumeroDeCliente = new javax.swing.JLabel();
        jLblPlacas = new javax.swing.JLabel();
        jLblFechaInicio = new javax.swing.JLabel();
        jLblFechaInicioDia = new javax.swing.JLabel();
        jLblFechaInicioMes = new javax.swing.JLabel();
        jLblFechaInicioAnio = new javax.swing.JLabel();
        jTxtFieldFechaInicioDia = new javax.swing.JTextField();
        jTxtFieldFechaInicioMes = new javax.swing.JTextField();
        jTxtFieldFechaInicioAnio = new javax.swing.JTextField();
        jTxtFieldNumeroCliente = new javax.swing.JTextField();
        jTxtFieldPlaca = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLblFechaInicioDia1 = new javax.swing.JLabel();
        jLblFechaInicioMes1 = new javax.swing.JLabel();
        jLblFechaInicioAnio1 = new javax.swing.JLabel();
        jTxtFieldFechaFinDia = new javax.swing.JTextField();
        jTxtFieldFechaFinMes = new javax.swing.JTextField();
        jTxtFieldFechaFinAnio = new javax.swing.JTextField();
        jBtnAgregar = new javax.swing.JButton();
        jBtnReestablecer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLblNuevoAlquiler.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLblNuevoAlquiler.setText("Nuevo Alquiler");

        jBtnCerrar.setText("Cerrar");
        jBtnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnCerrarMouseClicked(evt);
            }
        });

        jLblNumeroDeCliente.setText("Numero de Cliente:");

        jLblPlacas.setText("Placas:");

        jLblFechaInicio.setText("Fecha de Inicio:");

        jLblFechaInicioDia.setText("Dia:");

        jLblFechaInicioMes.setText("Mes:");

        jLblFechaInicioAnio.setText("Año:");

        jTxtFieldFechaInicioDia.setText("31");

        jTxtFieldFechaInicioMes.setText("12");

        jTxtFieldFechaInicioAnio.setText("2016");

        jTxtFieldNumeroCliente.setText("05");

        jTxtFieldPlaca.setText("15ADS5");

        jLabel1.setText("Fecha de Fin:");

        jLblFechaInicioDia1.setText("Dia:");

        jLblFechaInicioMes1.setText("Mes:");

        jLblFechaInicioAnio1.setText("Año:");

        jTxtFieldFechaFinDia.setText("10");

        jTxtFieldFechaFinMes.setText("01");

        jTxtFieldFechaFinAnio.setText("2017");

        jBtnAgregar.setText("Agregar");
        jBtnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnAgregarMouseClicked(evt);
            }
        });

        jBtnReestablecer.setText("Reestablecer");
        jBtnReestablecer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnReestablecerMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLblPlacas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTxtFieldPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLblNumeroDeCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                                .addComponent(jTxtFieldNumeroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(143, 143, 143))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jTxtFieldFechaFinDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTxtFieldFechaFinMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTxtFieldFechaFinAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnReestablecer)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jBtnCerrar))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLblFechaInicioDia1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLblFechaInicioMes1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLblFechaInicioAnio1)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBtnAgregar)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLblFechaInicio)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLblFechaInicioDia)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLblFechaInicioMes))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTxtFieldFechaInicioDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTxtFieldFechaInicioMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLblFechaInicioAnio)
                                    .addComponent(jTxtFieldFechaInicioAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLblNuevoAlquiler)
                .addGap(121, 121, 121))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLblNuevoAlquiler)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnCerrar)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblNumeroDeCliente)
                    .addComponent(jTxtFieldNumeroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblPlacas)
                    .addComponent(jTxtFieldPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLblFechaInicio)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblFechaInicioDia)
                    .addComponent(jLblFechaInicioMes)
                    .addComponent(jLblFechaInicioAnio))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtFieldFechaInicioDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtFieldFechaInicioMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtFieldFechaInicioAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLblFechaInicioDia1)
                            .addComponent(jLblFechaInicioMes1)
                            .addComponent(jLblFechaInicioAnio1))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtFieldFechaFinDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtFieldFechaFinMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtFieldFechaFinAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnReestablecer)
                        .addGap(10, 10, 10))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnCerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_jBtnCerrarMouseClicked

    private void jBtnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnAgregarMouseClicked
        if ((VentanaPrincipal.buscarAutomovil(this.jTxtFieldPlaca.getText()) != null)
                & (VentanaPrincipal.buscarCliente(Integer.parseInt(this.jTxtFieldNumeroCliente.getText())) != null)) {
            Date fechaInicial = new Date(
                    (Integer.parseInt(this.jTxtFieldFechaInicioAnio.getText()) - 1900),
                    (Integer.parseInt(this.jTxtFieldFechaInicioMes.getText()) - 1),
                    Integer.parseInt(this.jTxtFieldFechaInicioDia.getText()));

            Date fechaFinal = new Date(
                    (Integer.parseInt(this.jTxtFieldFechaFinAnio.getText()) - 1900),
                    (Integer.parseInt(this.jTxtFieldFechaFinMes.getText()) - 1),
                    Integer.parseInt(this.jTxtFieldFechaFinDia.getText()));

            if (fechaInicial.compareTo(fechaFinal) < 0) {
                
                Alquiler alquilerNuevo = new Alquiler(
                        VentanaPrincipal.buscarAutomovil(this.jTxtFieldPlaca.getText()),
                        VentanaPrincipal.buscarCliente(Integer.parseInt(this.jTxtFieldNumeroCliente.getText())),
                        fechaInicial,
                        fechaFinal,
                        (VentanaPrincipal.listaDeAlquileres.size() + 1)
                );
                
                VentanaPrincipal.listaDeAlquileres.add(alquilerNuevo);
                VentanaPrincipal.buscarAutomovil(this.jTxtFieldPlaca.getText()).setDisponible(false);
                VentanaExito vExito = new VentanaExito(VentanaPrincipal.listaDeAlquileres.size());
                reestablecer();

            }
            else
            {
                this.jTxtFieldFechaFinAnio.setText("Introduce una fecha valida");
                this.jTxtFieldFechaFinAnio.setForeground(Color.red);
            }

        }
    }//GEN-LAST:event_jBtnAgregarMouseClicked

    private void jBtnReestablecerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnReestablecerMouseClicked
        reestablecer();
    }//GEN-LAST:event_jBtnReestablecerMouseClicked

    
    public void reestablecer()
    {
        this.jTxtFieldNumeroCliente.setText("");
        this.jTxtFieldPlaca.setText("");
        this.jTxtFieldFechaInicioDia.setText("");
        this.jTxtFieldFechaInicioMes.setText("");
        this.jTxtFieldFechaInicioAnio.setText("");
        this.jTxtFieldFechaFinDia.setText("");
        this.jTxtFieldFechaFinMes.setText("");
        this.jTxtFieldFechaFinAnio.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAgregar;
    private javax.swing.JButton jBtnCerrar;
    private javax.swing.JButton jBtnReestablecer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLblFechaInicio;
    private javax.swing.JLabel jLblFechaInicioAnio;
    private javax.swing.JLabel jLblFechaInicioAnio1;
    private javax.swing.JLabel jLblFechaInicioDia;
    private javax.swing.JLabel jLblFechaInicioDia1;
    private javax.swing.JLabel jLblFechaInicioMes;
    private javax.swing.JLabel jLblFechaInicioMes1;
    private javax.swing.JLabel jLblNuevoAlquiler;
    private javax.swing.JLabel jLblNumeroDeCliente;
    private javax.swing.JLabel jLblPlacas;
    private javax.swing.JTextField jTxtFieldFechaFinAnio;
    private javax.swing.JTextField jTxtFieldFechaFinDia;
    private javax.swing.JTextField jTxtFieldFechaFinMes;
    private javax.swing.JTextField jTxtFieldFechaInicioAnio;
    private javax.swing.JTextField jTxtFieldFechaInicioDia;
    private javax.swing.JTextField jTxtFieldFechaInicioMes;
    private javax.swing.JTextField jTxtFieldNumeroCliente;
    private javax.swing.JTextField jTxtFieldPlaca;
    // End of variables declaration//GEN-END:variables
}
