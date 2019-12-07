
package smartdiary;

import dataBase.Conectar;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;



public  class login extends javax.swing.JFrame {

     
    public login() {
        initComponents();
        this.setLocationRelativeTo(null);
        try{ 
            setIconImage(new ImageIcon(getClass().getResource("/images/logoSDP.png")).getImage());
        } catch(NullPointerException e){
            System.out.println("No se pudó cargar la imagen");
        }
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSalir = new javax.swing.JButton();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButtonRegistrar = new javax.swing.JButton();
        jButtonIngresar = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelUser = new javax.swing.JLabel();
        jLabelLogo = new javax.swing.JLabel();
        jLabelFondoLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonSalir.setBackground(new java.awt.Color(255, 153, 51));
        jButtonSalir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(51, 51, 255));
        jButtonSalir.setText("SALIR");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, -1, -1));

        jLabelUsuario.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(255, 153, 51));
        jLabelUsuario.setText("USUARIO: ");
        getContentPane().add(jLabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, -1, -1));

        jLabelPassword.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelPassword.setForeground(new java.awt.Color(255, 153, 51));
        jLabelPassword.setText("CONTRASEÑA: ");
        getContentPane().add(jLabelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, -1, 40));
        getContentPane().add(jTextFieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 560, 240, 40));
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 620, 240, 40));

        jButtonRegistrar.setBackground(new java.awt.Color(255, 153, 51));
        jButtonRegistrar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonRegistrar.setForeground(new java.awt.Color(51, 51, 255));
        jButtonRegistrar.setText("REGISTRARSE");
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 680, -1, 40));

        jButtonIngresar.setBackground(new java.awt.Color(255, 153, 51));
        jButtonIngresar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonIngresar.setForeground(new java.awt.Color(51, 51, 255));
        jButtonIngresar.setText("INGRESAR");
        jButtonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 680, 160, 40));

        jLabelTitulo.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 153, 51));
        jLabelTitulo.setText("CONTROL DE ACTIVIDADES");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 510, 70));

        jLabelUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/userLogin.png"))); // NOI18N
        getContentPane().add(jLabelUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 310, 330));

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoSDP.png"))); // NOI18N
        getContentPane().add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabelFondoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/loginFondo.jpg"))); // NOI18N
        getContentPane().add(jLabelFondoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIngresarActionPerformed
        String user,password,sql="",usuario;
        user=jTextFieldUsuario.getText().replace(" ", "");
        password=jPasswordField1.getText();
        if (password.equals("") ||user.equals("")){
            JOptionPane.showMessageDialog(null, "ERROR!\nTodos los campos son obligatorios");
            jTextFieldUsuario.setText("");
            jPasswordField1.setText("");
        }
        else{
            Conectar cc=new Conectar();
            sql="SELECT * FROM usuario WHERE usu_usu='"+user+"' AND pass_usu='"+password+"'";
            try {
                usuario=cc.consultarUser(cc, sql);
                //System.out.println(usuario);
                if(usuario!=""){
                    JOptionPane.showMessageDialog(null, "Bienvenido "+usuario+" a las Actividades!");
                    Main principal=new Main(password);
                    principal.setVisible(true);
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "ERROR!\nUsuario no registrado!");
                    jTextFieldUsuario.setText("");
                    jPasswordField1.setText("");
                }
            } catch (SQLException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            }
            cc.desconectar();
        }
    }//GEN-LAST:event_jButtonIngresarActionPerformed

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        CheckIn checkin=new CheckIn();
        checkin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    
    public static void main(String args[]) {
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
                java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIngresar;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabelFondoLogin;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
