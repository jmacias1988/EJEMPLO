
package smartdiary;

import dataBase.Conectar;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class CheckIn extends javax.swing.JFrame {

    public CheckIn() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/images/logoSDP.png")).getImage());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelApellido = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldApellido = new javax.swing.JTextField();
        jTextFieldUsuario = new javax.swing.JTextField();
        jButtonCancelar = new javax.swing.JButton();
        jButtonRegistrar = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabelIcono = new javax.swing.JLabel();
        jLabelFondoCheckIn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 153, 51));
        jLabelTitulo.setText("REGISTRO DE USUARIO O EQUIPO.");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 650, 60));

        jLabelPassword.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelPassword.setForeground(new java.awt.Color(255, 153, 51));
        jLabelPassword.setText("CONTRASEÑA: ");
        getContentPane().add(jLabelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, -1, -1));

        jLabelNombre.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(255, 153, 51));
        jLabelNombre.setText("NOMBRE: ");
        getContentPane().add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jLabelApellido.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelApellido.setForeground(new java.awt.Color(255, 153, 51));
        jLabelApellido.setText("APELLIDO: ");
        getContentPane().add(jLabelApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        jLabelUsuario.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(255, 153, 51));
        jLabelUsuario.setText("USUARIO: ");
        getContentPane().add(jLabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 280, 40));

        jTextFieldApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldApellidoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 280, 40));

        jTextFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 280, 40));

        jButtonCancelar.setBackground(new java.awt.Color(255, 153, 51));
        jButtonCancelar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(51, 51, 255));
        jButtonCancelar.setText("CANCELAR");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 550, 150, 40));

        jButtonRegistrar.setBackground(new java.awt.Color(255, 153, 51));
        jButtonRegistrar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonRegistrar.setForeground(new java.awt.Color(51, 51, 255));
        jButtonRegistrar.setText("REGISTRARSE");
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 550, -1, 40));

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, 280, 40));

        jLabelIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/registro.png"))); // NOI18N
        getContentPane().add(jLabelIcono, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 210, 200));

        jLabelFondoCheckIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/loginFondo.jpg"))); // NOI18N
        getContentPane().add(jLabelFondoCheckIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        login entrar=new login();
        entrar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        jTextFieldNombre.transferFocus();
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jTextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioActionPerformed
        jTextFieldUsuario.transferFocus();
    }//GEN-LAST:event_jTextFieldUsuarioActionPerformed

    private void jTextFieldApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldApellidoActionPerformed
        jTextFieldApellido.transferFocus();
    }//GEN-LAST:event_jTextFieldApellidoActionPerformed

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        String nombre,apellido,usuario,password,sql="";
        nombre=jTextFieldNombre.getText().replace(" ", "");
        apellido=jTextFieldApellido.getText().replace(" ", "");
        usuario=jTextFieldUsuario.getText().replace(" ", "");
        password=jPasswordField1.getText().replace(" ", "");
        System.out.println(password);
        if (nombre.equals("") || apellido.equals("") || password.equals("") ||usuario.equals("")){
            JOptionPane.showMessageDialog(null, "ERROR!\nTodos los campos son obligatorios");
            jTextFieldNombre.setText("");
            jTextFieldApellido.setText("");
            jTextFieldUsuario.setText("");
            jPasswordField1.setText("");
        }
        else{
            System.out.println("Validado");
            Conectar cc=new Conectar();
            sql="INSERT INTO usuario (pass_usu, usu_usu, nom_usu, ape_usu) VALUES (?,?,?,?)";
            try {
                int n=cc.enviarLogIN(cc, password, usuario, nombre, apellido, sql);
                if (n>0){
                    JOptionPane.showMessageDialog(null, "GUARDADO!\nRegistro almacenado exitosamente");
                    login entrar=new login();
                    entrar.setVisible(true);
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "ERROR DE CONEXION!\nError de registro en la base de datos!");
                    jTextFieldNombre.setText("");
                    jTextFieldApellido.setText("");
                    jTextFieldUsuario.setText("");
                    jPasswordField1.setText("");
                }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "ERROR DE REGISTRO!\nIntente cambiando su contraseña!");
                    jPasswordField1.setText("");
                //Logger.getLogger(CheckIn.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        jPasswordField1.transferFocus();
    }//GEN-LAST:event_jPasswordField1ActionPerformed


    public static void main(String args[]) {
             try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
     
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelFondoCheckIn;
    private javax.swing.JLabel jLabelIcono;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
