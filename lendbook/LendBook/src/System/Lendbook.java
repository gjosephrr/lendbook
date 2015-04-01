package System;

import Code.SystemManager;
import Code.User;
import Window.Home;
import Window.Window;

public class Lendbook {
    public static User user;
    public static SystemManager system; 
    
    public static void main(String[] args) {

        system = new SystemManager();
        //Main screen window
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                
               new Window().setVisible(true);
            }
            
            
        });
        
    }
}