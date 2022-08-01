// Interfaz grafica de usuario donde se presenta el diseño de la interfaz principal, en esta
// ventana el usuario se puede mover a las demas ventanas asi como salir de la aplicacion.
package app;

import domain.Cliente;
import domain.Mascota;
import negocio.Veterinaria;


public class Principal extends javax.swing.JFrame {

    public static Veterinaria vet = new Veterinaria();
    
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null); 
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAltas = new javax.swing.JButton();
        btnCargarDatos = new javax.swing.JButton();
        btnBajasConsulta = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setText("Bienvenido al portal ");

        jLabel2.setText("¿Que deseas hacer el dia de hoy?");

        btnAltas.setText("Altas");
        btnAltas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltasActionPerformed(evt);
            }
        });

        btnCargarDatos.setText("Cargar Datos");
        btnCargarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarDatosActionPerformed(evt);
            }
        });

        btnBajasConsulta.setText("Consultas y Bajas");
        btnBajasConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajasConsultaActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(81, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCargarDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(btnAltas, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnBajasConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAltas)
                    .addComponent(btnBajasConsulta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCargarDatos)
                    .addComponent(btnSalir))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCargarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarDatosActionPerformed
        System.out.println("----------------Datos Cargados---------------------------");
        
        Mascota mascota1 = new Mascota("rayas", 8, "masculino", "felino", "gatuno", "bañarse");
        Mascota mascota2 = new Mascota("bicho", 2, "hembra", "felino", "gatuno", "desparasitar");
        Mascota mascota3 = new Mascota("pancha", 4, "hembra", "reptil", "tortuga", "Inyectar");
        Mascota mascota4 = new Mascota("molly", 7, "hembra", "canino", "perro", "cortar cabello");
        
        Cliente cliente1 = new Cliente("Alejandro", "Granados", "bello", "ixtapa", "los heroes", 
                5454, "mz", "casa", 4546848);
        Cliente cliente2 = new Cliente("Bianca", "Hernandez", "bello", "coyoa", "culhuacan", 
                7878, "andador", "dp 101", 150154);
        Cliente cliente3 = new Cliente("Eli", "Bello", "Sanchez", "coyoa", "cu", 
                1010, "mirador", "dp", 78787);
        
        Principal.vet.agregarClienteMascota(cliente1, mascota1); 
        Principal.vet.agregarClienteMascota(cliente1, mascota2); 
        Principal.vet.agregarClienteMascota(cliente2, mascota3); 
        Principal.vet.agregarClienteMascota(cliente3, mascota4); 
        
        Principal.vet.mostrarClientes();
    }//GEN-LAST:event_btnCargarDatosActionPerformed

    private void btnAltasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltasActionPerformed
        Altas altas = new Altas();
        altas.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAltasActionPerformed

    private void btnBajasConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajasConsultaActionPerformed
        ConsultasBajas consultasBajas = new ConsultasBajas();
        consultasBajas.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBajasConsultaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

  
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAltas;
    private javax.swing.JButton btnBajasConsulta;
    private javax.swing.JButton btnCargarDatos;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
