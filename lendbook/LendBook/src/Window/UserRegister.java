
package Window;

import Code.User;
import System.Lendbook;
import javax.swing.JOptionPane;



public class UserRegister extends SwitchablePanel {


    public UserRegister(Window frame) {
        super(frame);
        initComponents();
    }

    
    private boolean verifyPassword()  throws Exception{
        if(!(new String(passwordAssignedText.getPassword()).equals(new String(passwordText.getPassword())))){
            throw new Exception("Senhas não conferem!");
        }        
        return true;        
    }  
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameText = new javax.swing.JTextField();
        surnameText = new javax.swing.JTextField();
        roomText = new javax.swing.JTextField();
        blockText = new javax.swing.JTextField();
        emailText = new javax.swing.JTextField();
        title = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        surname = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        room = new javax.swing.JLabel();
        block = new javax.swing.JLabel();
        passwordAssigned = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        registerButton = new javax.swing.JButton();
        passwordText = new javax.swing.JPasswordField();
        passwordAssignedText = new javax.swing.JPasswordField();
        background = new javax.swing.JLabel();

        setName(""); // NOI18N
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextActionPerformed(evt);
            }
        });
        add(nameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 180, 212, 30));

        surnameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                surnameTextActionPerformed(evt);
            }
        });
        add(surnameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 180, 240, 30));

        roomText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomTextActionPerformed(evt);
            }
        });
        add(roomText, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 388, 100, 30));
        add(blockText, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 388, 100, 30));

        emailText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextActionPerformed(evt);
            }
        });
        add(emailText, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 278, 212, 30));

        title.setFont(new java.awt.Font("DialogInput", 1, 18));
        title.setForeground(new java.awt.Color(-16777202,true));
        title.setText(" Preencha com seus dados       e aperte em \"Cadastrar\" !");
        add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 82, -1, -1));

        name.setFont(new java.awt.Font("DialogInput", 1, 18));
        name.setForeground(new java.awt.Color(-16777076,true));
        name.setText("Nome: ");
        add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 148, -1, -1));

        surname.setFont(new java.awt.Font("DialogInput", 1, 18));
        surname.setForeground(new java.awt.Color(-16777076,true));
        surname.setText("Sobrenome: ");
        add(surname, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 148, -1, -1));

        email.setFont(new java.awt.Font("DialogInput", 1, 18));
        email.setForeground(new java.awt.Color(-16777076,true));
        email.setText("Email: ");
        add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 233, -1, -1));

        password.setFont(new java.awt.Font("DialogInput", 1, 18));
        password.setForeground(new java.awt.Color(-16777076,true));
        password.setText("Senha: ");
        add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 233, -1, -1));

        room.setFont(new java.awt.Font("DialogInput", 1, 18));
        room.setForeground(new java.awt.Color(-16777076,true));
        room.setText("Sala: ");
        add(room, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, -1, -1));

        block.setFont(new java.awt.Font("DialogInput", 1, 18));
        block.setForeground(new java.awt.Color(-16777076,true));
        block.setText("Bloco: ");
        add(block, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, -1, -1));

        passwordAssigned.setFont(new java.awt.Font("DialogInput", 1, 18));
        passwordAssigned.setForeground(new java.awt.Color(-16777076,true));
        passwordAssigned.setText("Confirmar senha: ");
        add(passwordAssigned, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 348, -1, -1));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sair.png"))); // NOI18N
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 500, 50, -1));

        registerButton.setFont(new java.awt.Font("DialogInput", 1, 18));
        registerButton.setForeground(new java.awt.Color(-16746496,true));
        registerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/registericon.png"))); // NOI18N
        registerButton.setText("Cadastrar!");
        registerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerButtonMouseClicked(evt);
            }
        });
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });
        add(registerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(524, 462, 184, -1));
        add(passwordText, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 278, 240, 30));
        add(passwordAssignedText, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 388, 240, 30));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cadastro.png"))); // NOI18N
        background.setPreferredSize(getMaximumSize());
        add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 0, 800, 600));
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerButtonActionPerformed
    private void nameTextActionPerformed(java.awt.event.ActionEvent evt){
              
    } 
    private void surnameTextActionPerformed(java.awt.event.ActionEvent evt){
              
    }
    private void roomTextActionPerformed(java.awt.event.ActionEvent evt){
              
    }
    private void emailTextActionPerformed(java.awt.event.ActionEvent evt){
              
    }
    private void registerButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonMouseClicked
        String msg = "Cadastro realizado com sucesso!";
        try{
            if(new String(passwordText.getPassword()) != "")
                verifyPassword();
            Lendbook.system.signUp(new User(nameText.getText(),surnameText.getText(),emailText.getText(),new String(passwordText.getPassword()),blockText.getText(),roomText.getText()));
            
            goToHome();
        }catch (Exception e){
            msg = e.getMessage();            
        }finally{
            JOptionPane.showMessageDialog(this, msg);
        }
        

    }//GEN-LAST:event_registerButtonMouseClicked

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        goToHome();
    }//GEN-LAST:event_backActionPerformed

    private void goToHome(){
        getMainFrame().switchPanels(new Home(getMainFrame()));        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel background;
    private javax.swing.JLabel block;
    private javax.swing.JTextField blockText;
    private javax.swing.JLabel email;
    private javax.swing.JTextField emailText;
    private javax.swing.JLabel name;
    private javax.swing.JTextField nameText;
    private javax.swing.JLabel password;
    private javax.swing.JLabel passwordAssigned;
    private javax.swing.JPasswordField passwordAssignedText;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JButton registerButton;
    private javax.swing.JLabel room;
    private javax.swing.JTextField roomText;
    private javax.swing.JLabel surname;
    private javax.swing.JTextField surnameText;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
