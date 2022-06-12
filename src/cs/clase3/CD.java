/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs.clase3;

/**
 *
 * @author zujeily
 */
public class CD extends Publicacion{
    
    protected String Duracion;

    public CD() {
        super();
        this.Duracion = "";
    }

    public String getDuracion() {
        return Duracion;
    }

    public void setDuracion(String Duracion) {
        this.Duracion = Duracion;
    }

    public String getTituloLibro() {
        return tituloLibro;
    }

    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

    public double getPrecioPublicacion() {
        return PrecioPublicacion;
    }

    public void setPrecioPublicacion(double PrecioPublicacion) {
        this.PrecioPublicacion = PrecioPublicacion;
    }
    
    
    
    
    
    
    
    
}
