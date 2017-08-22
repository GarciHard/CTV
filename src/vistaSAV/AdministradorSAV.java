package vistaSAV;
//@author GarciHard
public class AdministradorSAV extends javax.swing.JFrame {

    /**
     * Creates new form AdministradorSAV
     */
    public AdministradorSAV() {
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

        panelAdminBackground = new javax.swing.JPanel();
        panelAdminGral = new javax.swing.JPanel();
        lblLogoAdministrador = new javax.swing.JLabel();
        btnAdminEmpleados = new javax.swing.JButton();
        btnAdminAviones = new javax.swing.JButton();
        btnAdminCerrarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Administrador SAV");
        setResizable(false);

        panelAdminBackground.setBackground(new java.awt.Color(52, 152, 219));

        javax.swing.GroupLayout panelAdminGralLayout = new javax.swing.GroupLayout(panelAdminGral);
        panelAdminGral.setLayout(panelAdminGralLayout);
        panelAdminGralLayout.setHorizontalGroup(
            panelAdminGralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1158, Short.MAX_VALUE)
        );
        panelAdminGralLayout.setVerticalGroup(
            panelAdminGralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );

        lblLogoAdministrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesSAV/LogoPanelAdminBackground.png"))); // NOI18N

        btnAdminEmpleados.setBackground(new java.awt.Color(26, 188, 156));
        btnAdminEmpleados.setFont(new java.awt.Font("Heiti SC", 0, 18)); // NOI18N
        btnAdminEmpleados.setForeground(new java.awt.Color(255, 255, 255));
        btnAdminEmpleados.setText("Empleados");
        btnAdminEmpleados.setBorder(null);
        btnAdminEmpleados.setBorderPainted(false);
        btnAdminEmpleados.setContentAreaFilled(false);
        btnAdminEmpleados.setOpaque(true);

        btnAdminAviones.setBackground(new java.awt.Color(0, 100, 133));
        btnAdminAviones.setFont(new java.awt.Font("Heiti SC", 0, 18)); // NOI18N
        btnAdminAviones.setForeground(new java.awt.Color(255, 255, 255));
        btnAdminAviones.setText("Aviones");
        btnAdminAviones.setBorderPainted(false);
        btnAdminAviones.setContentAreaFilled(false);
        btnAdminAviones.setOpaque(true);

        btnAdminCerrarSesion.setBackground(new java.awt.Color(211, 84, 0));
        btnAdminCerrarSesion.setFont(new java.awt.Font("Heiti SC", 0, 18)); // NOI18N
        btnAdminCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnAdminCerrarSesion.setText("Salir");
        btnAdminCerrarSesion.setBorder(null);
        btnAdminCerrarSesion.setBorderPainted(false);
        btnAdminCerrarSesion.setContentAreaFilled(false);
        btnAdminCerrarSesion.setOpaque(true);

        javax.swing.GroupLayout panelAdminBackgroundLayout = new javax.swing.GroupLayout(panelAdminBackground);
        panelAdminBackground.setLayout(panelAdminBackgroundLayout);
        panelAdminBackgroundLayout.setHorizontalGroup(
            panelAdminBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAdminBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAdminBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdminCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAdminBackgroundLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblLogoAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAdminBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelAdminGral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelAdminBackgroundLayout.createSequentialGroup()
                        .addComponent(btnAdminEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAdminAviones, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        panelAdminBackgroundLayout.setVerticalGroup(
            panelAdminBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdminBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAdminBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAdminBackgroundLayout.createSequentialGroup()
                        .addComponent(lblLogoAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdminCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(panelAdminBackgroundLayout.createSequentialGroup()
                        .addGroup(panelAdminBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdminEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdminAviones, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(panelAdminGral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAdminBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAdminBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(AdministradorSAV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministradorSAV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministradorSAV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministradorSAV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministradorSAV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAdminAviones;
    public javax.swing.JButton btnAdminCerrarSesion;
    public javax.swing.JButton btnAdminEmpleados;
    private javax.swing.JLabel lblLogoAdministrador;
    private javax.swing.JPanel panelAdminBackground;
    public javax.swing.JPanel panelAdminGral;
    // End of variables declaration//GEN-END:variables
}
