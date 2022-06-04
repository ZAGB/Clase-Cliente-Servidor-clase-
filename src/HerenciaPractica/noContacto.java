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
public class noContacto extends Deporte{
    
    protected String EjerNoContacto;

    public noContacto() {
        super();
        this.EjerNoContacto = "";
    }

    public String getEjerNoContacto() {
        return EjerNoContacto;
    }

    public void setEjerNoContacto(String EjerNoContacto) {
        this.EjerNoContacto = EjerNoContacto;
    }

    public String getPersona() {
        return Persona;
    }

    public void setPersona(String Persona) {
        this.Persona = Persona;
    }

    public int getNumJugadores() {
        return numJugadores;
    }

    public void setNumJugadores(int numJugadores) {
        this.numJugadores = numJugadores;
    }

    public String getPopularidad() {
        return Popularidad;
    }

    public void setPopularidad(String Popularidad) {
        this.Popularidad = Popularidad;
    }
    
  
          public String SinGolpes(){
        
         this.EjerNoContacto= "No contacto ";
     
         JOptionPane.showMessageDialog(null, "Este deporte es tipo: " + EjerNoContacto +" y el presupuesto es: "+ super.PopuBaja());
       
         
         return EjerNoContacto;
        
        
    }  
    
    
    
}
