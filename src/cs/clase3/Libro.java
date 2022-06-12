/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs.clase3;

/**
 *
 * @author zujeily
 */
public class Libro extends Publicacion{
    
    protected int CantidadPaginas;

    public Libro() {
        super();
        this.CantidadPaginas = 0;
    }

    public int getCantidadPaginas() {
        return CantidadPaginas;
    }

    public void setCantidadPaginas(int CantidadPaginas) {
        this.CantidadPaginas = CantidadPaginas;
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
