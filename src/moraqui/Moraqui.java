/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moraqui;
import moraqui.ui.LoginUI;

/**
 *
 * @author Jessica Terada
 */
public class Moraqui {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LoginUI login = new LoginUI();
                login.setVisible(true);
                
            }
        });
    }
    
}
