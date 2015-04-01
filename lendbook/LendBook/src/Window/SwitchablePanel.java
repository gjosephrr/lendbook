/*
 * Equipe:	        Erick de Azevedo Alcântara
 * 			Gabriel Joseph Ramos Rafael
 * 			José Lucas Silva Freitas
 * 			Wesley Nunes Marques Torres
 */

package Window;

import javax.swing.JPanel;


public abstract class SwitchablePanel extends JPanel {
    
    private Window mainFrame;
    

    public SwitchablePanel(Window mainFrame) {
        this.mainFrame = mainFrame;
    }
    

    protected void switchTo(SwitchablePanel newPanel) {
        this.mainFrame.switchPanels(newPanel);
    }
    
    protected Window getMainFrame() {
        return mainFrame;
    }
    
}
