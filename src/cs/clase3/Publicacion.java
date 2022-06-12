/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs.clase3;

import javax.swing.JOptionPane;

/**
 *
 * @author zujeily
 */
public class Publicacion {
    
    protected String tituloLibro;
    protected double PrecioPublicacion;

    public Publicacion() {
        this.tituloLibro = "";
        this.PrecioPublicacion = 0.00;
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
    
    public String TituloLibro (String Libro){
    
    Libro = JOptionPane.showInputDialog(null,"Dame el nombre del libro nuevo a publicar");
    
    return Libro;
    }
    

    public int ValorPublicacion (int valor){
    
    valor = Integer.parseInt(JOptionPane.showInputDialog(null,"Dame el formato del libro a publicar"));
    
    return valor;
    }  
    
    
    
    
}
