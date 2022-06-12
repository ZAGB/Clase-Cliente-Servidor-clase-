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
public class Chip {
    
    protected String empresa;
    protected String numero;

    public Chip(String empresa, String numero) {
        this.empresa = empresa;
        this.numero = numero;
    }
    
    
      public void mostrarChipDatos (){
       
       JOptionPane.showMessageDialog(null, "Empresa relacionada al chip: " +empresa);
       JOptionPane.showMessageDialog(null, "Numero de celular : " + numero);
       
   } 
    
}
