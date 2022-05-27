/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs.clase2;

import javax.swing.JOptionPane;

/**
 *
 * @author zujeily
 */
public class OperacionAritmetica {
    protected double num1;
    protected double num2;
    protected double resultado;

    public OperacionAritmetica() {
        this.num1 = 0.00;
        this.num2 = 0.00;
        this.resultado = 0.00;
    }
    
    
   public void mostrarDatosIniciales(){
     JOptionPane.showMessageDialog(null, "datos para operaciones " + num1+ " y "+ num2);
       
       
   } 
   
   
 
}
