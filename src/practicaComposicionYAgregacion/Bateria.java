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
public class Bateria {
    
    protected int mAh;
    protected String marca;

    public Bateria(int mAh, String marca) {
        this.mAh = mAh;
        this.marca = marca;
    }
    
    
    
   public void mostrarBateriaDatos (){
           
       JOptionPane.showMessageDialog(null, "Capacidad de la bateria: " +mAh);
       JOptionPane.showMessageDialog(null, "Marca de bateria : " + marca);
       
   } 
    
    
}
