/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs.clase2;

/**
 *
 * @author zujeily
 */
public class estado extends estudiantePractica{
    
    private String estado;
    private double calificacion;
    
      public estado() {
        super();
        this.estado = "";
        this.calificacion = 0.00;
        
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCursoActual() {
        return cursoActual;
    }

    public void setCursoActual(String cursoActual) {
        this.cursoActual = cursoActual;
    }
      
      
      
      
      
      
}
