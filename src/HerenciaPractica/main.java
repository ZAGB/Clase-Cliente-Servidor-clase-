/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HerenciaPractica;

import javax.swing.JOptionPane;

/**
 *
 * @author zujeily
 */
public class main {
    
    public static void main(String[] args) {
        
        int deporte = Integer.parseInt(JOptionPane.showInputDialog(null, "***Ecoja un numero deacuerdo a el perfil de deportista que desea crear ***\n\n"
               + "1 MMA"+
               "\n2 Boxeo "+""
              +"\n3 Karate"+
               "\n4 Natacion"+
               "\n5 Tennis"));
        
        switch (deporte) {
        case 1:
         
        MMA M =new MMA();    
            
       M.setPersona(JOptionPane.showInputDialog(null, "Digite su nombre" )); 
       
       JOptionPane.showMessageDialog(null, "Hola " +M.getPersona()+ " por favor tenga a consideracion lo siguiente\n\n"
       + M.PerfilJugador() +
       "\n y " +M.GolpesFijo());   
        
        break;
        
        case 2:
            
          Boxeo B =new Boxeo();   
           
        B.setPersona(JOptionPane.showInputDialog(null, "Digite su nombre" )); 
       
       JOptionPane.showMessageDialog(null, "Hola " +B.getPersona()+ " por favor tenga a consideracion lo siguiente\n\n"
       + B.PerfilJugador() +
       "\n y " +B.GolpesFijo());  
       
        break;
        
        case 3:
            
        Karate K =new Karate();   
           
        K.setPersona(JOptionPane.showInputDialog(null, "Digite su nombre" )); 
       
       JOptionPane.showMessageDialog(null, "Hola " +K.getPersona()+ " por favor tenga a consideracion lo siguiente\n\n"
       + K.PerfilJugador() +
       "\n y " +K.GolpesFijo());      
      
        break;
        
        case 4:
        Natacion N =new Natacion();   
           
        N.setPersona(JOptionPane.showInputDialog(null, "Digite su nombre" )); 
       
       JOptionPane.showMessageDialog(null, "Hola " +N.getPersona()+ " por favor tenga a consideracion lo siguiente\n\n"
       + N.PerfilJugador() +
       "\n y " +N.SinGolpes());             
            
            
        break;
        
        case 5:
        Tennis T =new Tennis();   
           
        T.setPersona(JOptionPane.showInputDialog(null, "Digite su nombre" )); 
       
       JOptionPane.showMessageDialog(null, "Hola " +T.getPersona()+ " por favor tenga a consideracion lo siguiente\n\n"
       + T.PerfilJugador() +
       "\n y " +T.SinGolpes());                
            
            
        break;
        
        default:
                
        JOptionPane.showMessageDialog(null, "Esa opcion que digito no es valida sea serio por favor ");       
        
        }
        
        
        
        
    }
    
}
