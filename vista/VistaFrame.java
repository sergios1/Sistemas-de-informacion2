//autor: sergio sarmiento
//clase constructora de la vista prcipal grafica
package vista;

import javax.swing.*;
public class VistaFrame extends JFrame {
    
     
    public VistaFrame(){
       setResizable(false); 
        setBounds(150, 200,800 ,600);
        setLocationRelativeTo(null); 
         setVisible(true);
        
       // Ahorcadolamina milamina = new Ahorcadolamina(this);
        
       // add(milamina); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    
}
    

