/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HerenciaPractica;

/**
 *
 * @author zujeily
 */
public class Tennis extends noContacto{
    
    protected String TipoDeporte;
    
     public Tennis() {
        super();
        this.TipoDeporte = "";
    }

    public String getTipoDeporte() {
        return TipoDeporte;
    }

    public void setTipoDeporte(String TipoDeporte) {
        this.TipoDeporte = TipoDeporte;
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

    
    public String PerfilJugador (){
        
        this.TipoDeporte="Es un deporte individual";
        
        return TipoDeporte;
    }
 
    
    
    
    
}
