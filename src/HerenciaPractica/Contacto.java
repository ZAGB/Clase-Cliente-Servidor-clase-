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
public class Contacto extends Deporte{
    
    protected String EjerContacto;

    public Contacto() {
        super();
        this.EjerContacto = "";
    }
 
    public String getEjerContacto() {
        return EjerContacto;
    }

    public void setEjerContacto(String EjerContacto) {
        this.EjerContacto = EjerContacto;
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
    
    
    
    
     public String GolpesFijo(){
        
         this.EjerContacto= "Full contacto, fijo se queda sin cara ";
     
         JOptionPane.showMessageDialog(null, "Este deporte es tipo: " + EjerContacto +" y el presupuesto es: "+ super.PopuAlta());
       
         return EjerContacto;
        
        
    }   
    
    
}
