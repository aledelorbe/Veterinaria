package app;


import domain.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class ConsultasBajas extends javax.swing.JFrame {
   
    public ConsultasBajas() {
        initComponents();
        this.setLocationRelativeTo(null); 
    }
    
    // Funcion para dejar limpia la tabla con la informacion de las mascotas.
    public void limpiarTabla(){
        DefaultTableModel modelo = (DefaultTableModel)jTableMascotas.getModel();
        
        while (modelo.getRowCount() > 0)
            modelo.removeRow(0);
    }
    
    // Funcion para limpiar todos los textField que esten dentro de determinado
    // panel.
    public void limpiarTextFields(JPanel panel){
        JTextField caja;
        
        for (int i = 0; i < panel.getComponentCount(); i++) {
            if( panel.getComponent(i).getClass().getName().equals("javax.swing.JTextField"))
            {
                caja = (JTextField)panel.getComponent(i);
                caja.setText("");
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jLabel7 = new javax.swing.JLabel();
        SpanelBuscar = new javax.swing.JPanel();
        SpanelBuscar1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMascotas = new javax.swing.JTable();
        btnRegresar = new javax.swing.JButton();
        btnBaja = new javax.swing.JButton();
        btnLimpiarDatos = new javax.swing.JButton();
        jPanelCliente = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPaterno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMaterno = new javax.swing.JTextField();
        txtBuscar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jLabel7.setForeground(new java.awt.Color(255, 0, 51));
        jLabel7.setText("DATOS DEL CLIENTE");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jLabel1.setForeground(new java.awt.Color(0, 153, 204));
        jLabel1.setText("MASCOTA");

        jTableMascotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Especie", "Descripcion"
            }
        ));
        jScrollPane1.setViewportView(jTableMascotas);

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnBaja.setText("Baja");
        btnBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajaActionPerformed(evt);
            }
        });

        btnLimpiarDatos.setText("Limpiar Datos");
        btnLimpiarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SpanelBuscar1Layout = new javax.swing.GroupLayout(SpanelBuscar1);
        SpanelBuscar1.setLayout(SpanelBuscar1Layout);
        SpanelBuscar1Layout.setHorizontalGroup(
            SpanelBuscar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SpanelBuscar1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(SpanelBuscar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(SpanelBuscar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(SpanelBuscar1Layout.createSequentialGroup()
                            .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLimpiarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(36, 36, 36)
                            .addComponent(btnBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        SpanelBuscar1Layout.setVerticalGroup(
            SpanelBuscar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SpanelBuscar1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(SpanelBuscar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel8.setForeground(new java.awt.Color(255, 0, 51));
        jLabel8.setText("CLIENTE");

        jLabel2.setText("Nombre");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel3.setText("Ap Paterno");

        txtPaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaternoActionPerformed(evt);
            }
        });

        jLabel4.setText("Ap Materno");

        txtMaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaternoActionPerformed(evt);
            }
        });

        txtBuscar.setText("Consulta");
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelClienteLayout = new javax.swing.GroupLayout(jPanelCliente);
        jPanelCliente.setLayout(jPanelClienteLayout);
        jPanelClienteLayout.setHorizontalGroup(
            jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClienteLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelClienteLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8)
                        .addGroup(jPanelClienteLayout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(29, 29, 29)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelClienteLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtBuscar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(15, 15, 15))
        );
        jPanelClienteLayout.setVerticalGroup(
            jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClienteLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout SpanelBuscarLayout = new javax.swing.GroupLayout(SpanelBuscar);
        SpanelBuscar.setLayout(SpanelBuscarLayout);
        SpanelBuscarLayout.setHorizontalGroup(
            SpanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SpanelBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SpanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SpanelBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        SpanelBuscarLayout.setVerticalGroup(
            SpanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SpanelBuscarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SpanelBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );

        jMenu3.setText("Consulta y Baja");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(SpanelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(SpanelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed

        // si el usuario no ha llenado todo los campos, se le avisa que no se puede continuar.
        if(txtNombre.getText().isEmpty() || txtPaterno.getText().isEmpty() || txtMaterno.getText().isEmpty() )
            JOptionPane.showMessageDialog(null,"Todos los campos deben ser llenados para continuar.");
        else
        {
            // Con la informacion extraida de los textField se crea un cliente.
            DefaultTableModel modelo = (DefaultTableModel)jTableMascotas.getModel();
            Cliente cliente = new Cliente(txtNombre.getText(), txtPaterno.getText(), txtMaterno.getText());
            // Se busca todas las mascotas que tiene el cliente con la informacion proporcionada.
            List<Mascota> mascotas = Principal.vet.busquedaMascotasCliente(cliente);
            
            // Si el cliente no cuenta con mascotas, se le avisa al usuario.
            if(mascotas.isEmpty())
                JOptionPane.showMessageDialog(null,"Esta persona no cuenta con mascotas registradas en ese lugar.");
            else
            {
                // Si el cliente cuenta con mascotas, se despliega la informacion mas importante de cada una 
                // de ellas en una tabla.
                limpiarTabla();
                Object[] fila=new Object[3];

                for (int i = 0; i < mascotas.size(); i++) {
                    fila[0]=mascotas.get(i).getNombre();
                    fila[1]=mascotas.get(i).getEspecie();
                    fila[2]=mascotas.get(i).getDescripcion();

                    modelo.addRow(fila); 
                }
            }
        }
        System.out.println("-----------------------Consultas/Bajas--------------------------------");
        Principal.vet.mostrarClientes();
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void btnBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajaActionPerformed
        // si el usuario no ha llenado todo los campos, se le avisa que no se puede continuar.
        if(txtNombre.getText().isEmpty() || txtPaterno.getText().isEmpty() || txtMaterno.getText().isEmpty() )
            JOptionPane.showMessageDialog(null,"Todos los campos deben ser llenados para continuar.");
        // Si el usuario no selecciona una fila, se le avisa que debe hacerlo.
        else if ( jTableMascotas.getSelectedRow() == -1 ) 
            JOptionPane.showMessageDialog(null,"Debe seleccionar una fila de la tabla.");
        else
        {
            // Se crea un objeto mascota y cliente, con los datos extraidos de la tabla y los textField repectivamente.
            // Con base a dichas instancias, se manda a llamar el metodo que da de baja a la mascota de cierto cliente.
            Mascota mascota = new Mascota((String)jTableMascotas.getValueAt(jTableMascotas.getSelectedRow(), 0), (String)jTableMascotas.getValueAt(jTableMascotas.getSelectedRow(), 1), (String)jTableMascotas.getValueAt(jTableMascotas.getSelectedRow(), 2));
            Cliente cliente = new Cliente(txtNombre.getText(), txtPaterno.getText(), txtMaterno.getText());
            Principal.vet.eliminarMascotaCliente(cliente, mascota);
            
            // La fila seleecionada por el usuario se elimina para que el visualmente observe que se ha eliminado
            // el registro.
            DefaultTableModel modelo = (DefaultTableModel)jTableMascotas.getModel();
            modelo.removeRow(jTableMascotas.getSelectedRow());
            
            JOptionPane.showMessageDialog(null,"Registro eliminado correctamente.");
        }
    }//GEN-LAST:event_btnBajaActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // Si el usuario presiona este boton regresara a la ventana principal.
        Principal Bienve=new Principal();
        Bienve.setVisible(true);
        
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void txtPaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaternoActionPerformed
    }//GEN-LAST:event_txtPaternoActionPerformed

    private void txtMaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaternoActionPerformed
    }//GEN-LAST:event_txtMaternoActionPerformed

    private void btnLimpiarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarDatosActionPerformed
        // Si el usuario presiona este boton, todos los textField relacionados a la informacion
        // del cliente se vaciaran adicionalmente la informacion en la tabla.
        limpiarTabla();
        limpiarTextFields(jPanelCliente);
    }//GEN-LAST:event_btnLimpiarDatosActionPerformed

    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultasBajas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel SpanelBuscar;
    private javax.swing.JPanel SpanelBuscar1;
    private javax.swing.JButton btnBaja;
    private javax.swing.JButton btnLimpiarDatos;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanelCliente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableMascotas;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton txtBuscar;
    private javax.swing.JTextField txtMaterno;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPaterno;
    // End of variables declaration//GEN-END:variables
}
