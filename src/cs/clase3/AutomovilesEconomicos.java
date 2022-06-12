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
public class AutomovilesEconomicos extends Vehiculos{
    
    protected int CantidadPasajeros;

    
    public AutomovilesEconomicos(String NumSerieMotor, String Marca, int Año, String Combustible, String Color, int CantidadPasajeros) {
        super(NumSerieMotor, Marca, Año, Combustible, Color);
        this.CantidadPasajeros = CantidadPasajeros;
    }
    

    public int getCantidadPasajeros() {
        return CantidadPasajeros;
    }

    public void setCantidadPasajeros(int CantidadPasajeros) {
        this.CantidadPasajeros = CantidadPasajeros;
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
       setCantidadPasajeros(Integer.parseInt(JOptionPane.showInputDialog(null,"Dame la cantidad de pasajeros")));

        
    }

    @Override
    public void mostrarInfo(){
       super.mostrarInfo();
       JOptionPane.showMessageDialog(null, "La cantidad de pasajeros en este carro es: " + getCantidadPasajeros()); 
  
        
    }
    
    
    
    
}
