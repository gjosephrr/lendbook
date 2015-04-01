/*
 * Equipe:	        Erick de Azevedo Alcântara
 * 			Gabriel Joseph Ramos Rafael
 * 			José Lucas Silva Freitas
 * 			Wesley Nunes Marques Torres
 */
package Window;

import Code.*;
import System.Lendbook;
import static System.Lendbook.system;
import javax.swing.JOptionPane;

public class Home extends SwitchablePanel {

    private User user;

    public Home(Window frame) {
        super(frame);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        password = new javax.swing.JPasswordField();
        name = new javax.swing.JTextField();
        register = new javax.swing.JButton();
        login = new javax.swing.JButton();
        emailLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        copyright = new javax.swing.JLabel();

        setBackground(background.getBackground());
        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setToolTipText("");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        password.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 260, 30));

        name.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        name.setName("Email"); // NOI18N
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 260, 30));

        register.setBackground(new java.awt.Color(255, 160, 0));
        register.setFont(new java.awt.Font("Dialog", 1, 15));
        register.setForeground(new java.awt.Color(0, 0, 140));
        register.setText("Cadastre-se!");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });
        add(register, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, 140, 40));

        login.setBackground(new java.awt.Color(-16777076,true));
        login.setFont(new java.awt.Font("DialogInput", 1, 18));
        login.setForeground(new java.awt.Color(-24576,true));
        login.setText("Entrar");
        login.setBorder(null);
        login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                loginMouseMoved(evt);
            }
        });
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 370, 110, 40));

        emailLabel.setFont(new java.awt.Font("DialogInput", 1, 18));
        emailLabel.setForeground(new java.awt.Color(-16777076,true));
        emailLabel.setText("E-mail:");
        emailLabel.setBorder(null);
        add(emailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 90, 30));

        passwordLabel.setFont(new java.awt.Font("DialogInput", 1, 18));
        passwordLabel.setForeground(new java.awt.Color(-16777076,true));
        passwordLabel.setText("Senha:");
        passwordLabel.setToolTipText("");
        passwordLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 80, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/capa.png"))); // NOI18N
        background.setAlignmentY(0.0F);
        add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        copyright.setText("©‎2013 Lendbook");
        add(copyright, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 500, 120, -1));
    }// </editor-fold>//GEN-END:initComponents

private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_nameActionPerformed

private void loginMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseMoved
// TODO add your handling code here:
}//GEN-LAST:event_loginMouseMoved

private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
    try {
        if (name.getText().length() == 0) {
            throw new Exception("Insira o email!");
        }
        if (password.getPassword().length == 0) {
            throw new Exception("Insira a Senha!");
        }
        user = system.login(name.getText(), new String(password.getPassword()));
        if (user == null) {
            throw new Exception("Usuário e/ou senha incorretos!");
        }
        Lendbook.user = this.user;
        getMainFrame().switchPanels(new Aplication(getMainFrame()));

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, e.getMessage());
    }
}//GEN-LAST:event_loginActionPerformed

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        getMainFrame().switchPanels(new UserRegister(getMainFrame()));
    }//GEN-LAST:event_registerActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel copyright;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JButton login;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton register;
    // End of variables declaration//GEN-END:variables
}
