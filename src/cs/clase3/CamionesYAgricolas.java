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
public class CamionesYAgricolas extends Vehiculos{
    
    protected double CargaKilogramos;
    protected int CantidadEjes;
    protected int CantidadLlantas;

    public CamionesYAgricolas(String NumSerieMotor, String Marca, int Año, String Combustible, String Color, double CargaKilogramos, int CantidadEjes, int CantidadLlantas) {
        super(NumSerieMotor, Marca, Año, Combustible, Color);
        this.CargaKilogramos = CargaKilogramos;
        this.CantidadEjes = CantidadEjes;
        this.CantidadLlantas = CantidadLlantas;
    }

    public double getCargaKilogramos() {
        return CargaKilogramos;
    }

    public void setCargaKilogramos(double CargaKilogramos) {
        this.CargaKilogramos = CargaKilogramos;
    }

    public int getCantidadEjes() {
        return CantidadEjes;
    }

    public void setCantidadEjes(int CantidadEjes) {
        this.CantidadEjes = CantidadEjes;
    }

    public int getCantidadLlantas() {
        return CantidadLlantas;
    }

    public void setCantidadLlantas(int CantidadLlantas) {
        this.CantidadLlantas = CantidadLlantas;
    }

    public String getNumSerieMotor() {
        return NumSerieMotor;
    }

    public void setNumSerieMotor(String NumSerieMotor) {
        this.NumSerieMotor = NumSerieMotor;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getAño() {
        return Año;
    }

    public void setAño(int Año) {
        this.Año = Año;
    }

    public String getCombustible() {
        return Combustible;
    }

    public void setCombustible(String Combustible) {
        this.Combustible = Combustible;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }
    
       @Override
    public void InfoVehiculo() {
       super.InfoVehiculo(); 
       setCargaKilogramos(Double.parseDouble(JOptionPane.showInputDialog(null,"Dame el peso de la carga en kilogrmaos")));
       setCantidadEjes(Integer.parseInt(JOptionPane.showInputDialog(null,"Dame la cantidad de ejes que tiene el Camion o agricola")));
       setCantidadLlantas(Integer.parseInt(JOptionPane.showInputDialog(null,"Dame la cantidad de ejes que tiene el Camion o agricola")));
    }

    @Override
    public void mostrarInfo(){
       super.mostrarInfo();
       JOptionPane.showMessageDialog(null, "La cantidad de peso en kilogramos es de : " + getCargaKilogramos()); 
       JOptionPane.showMessageDialog(null, "La cantidad de ejes es de: " + getCantidadEjes()); 
       JOptionPane.showMessageDialog(null, "La cantidad de llantas es de : " + getCantidadLlantas()); 
        
    } 
    
    
    
}
