/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaComposicionYAgregacion;
import javax.swing.JOptionPane;
/**
 *
 * @author zujeily
 */
public class main {
    
     public static void main(String[] args) {
   
      Smartphone newCel = new Smartphone(
     JOptionPane.showInputDialog(null,"Digite el modelo :"),
     Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la capacidad de la bateria :")),
     JOptionPane.showInputDialog(null,"Digite el modelo del celular:"));
         
      Chip Movistar = new Chip (
      JOptionPane.showInputDialog(null,"Digite La empresa :"),
      JOptionPane.showInputDialog(null,"Digite el numero :")        
      );
         
    Chip Tigo = new Chip (
      JOptionPane.showInputDialog(null,"Digite La empresa :"),
      JOptionPane.showInputDialog(null,"Digite el numero :")        
      );
      
    newCel.agregarChip(Movistar);
    newCel.agregarChip(Tigo);
    newCel.mostrarSmart();
    
    }
    
    
}
