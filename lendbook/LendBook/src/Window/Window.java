/*
 * Equipe:	        Erick de Azevedo Alcântara
 * 			Gabriel Joseph Ramos Rafael
 * 			José Lucas Silva Freitas
 * 			Wesley Nunes Marques Torres
 */

package Window;

import Code.DataBase;

import javax.swing.*;

public class Window extends JFrame {

    private Object user;
    private JPanel mainPanel = new JPanel();

    /**
     * Creates new form Home
     */
    public Window() {
        initComponents();
        
        mainPanel.setSize(800, 600);
        this.add(mainPanel);
        
        //mainPanel.setVisible(true);
        
        switchPanels(new Home(this));
    }
    
    public void switchPanels(SwitchablePanel newPanel) {

    mainPanel.removeAll();

    newPanel.setSize(800, 600);
    
    mainPanel.add(newPanel);

    mainPanel.validate();
}

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                formComponentAdded(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
}//GEN-LAST:event_formComponentShown

    private void formComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentAdded

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        DataBase.saveData("dbusers.dat");
        DataBase.saveData("dbitems.dat");
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        DataBase.saveData("dbusers.dat");
        DataBase.saveData("dbitems.dat");
         }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
