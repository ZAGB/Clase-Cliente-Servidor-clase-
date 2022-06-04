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
public class Deporte {
    
    protected String Persona;
    protected int numJugadores;
    protected String Popularidad;

    public Deporte() {
        this.Persona = "";
        this.numJugadores = 0;
        this.Popularidad = "";
    }
    
    
   public String PopuBaja(){
       
       this.Popularidad= "baja";
     
      // JOptionPane.showMessageDialog(null, "Mejor suerte para la proxima el presupuesto no es tan alto, tipo de popularidad: " + Popularidad);
       
     return Popularidad;
       
   } 
    
   public String PopuAlta(){
       
       this.Popularidad= "alta";
     
     //  JOptionPane.showMessageDialog(null, "Que suertudo, tipo de popularidad: " + Popularidad+ "  El presupuesto para esta temporada se ve bueno. ");
       
     return Popularidad;
       
   }  
    
    
    
}
