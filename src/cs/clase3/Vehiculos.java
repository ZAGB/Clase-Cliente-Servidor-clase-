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
public class Vehiculos {
    
    protected String NumSerieMotor;
    protected String Marca;
    protected int Año;
    protected String Combustible;
    protected String Color;
    

    public Vehiculos(String NumSerieMotor, String Marca, int Año, String Combustible, String Color) {
        this.NumSerieMotor = NumSerieMotor;
        this.Marca = Marca;
        this.Año = Año;
        this.Combustible = Combustible;
        this.Color = Color;
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
    
    
    
    public void InfoVehiculo (){
    
    setNumSerieMotor( JOptionPane.showInputDialog(null,"Dame el numero de serie del Motor"));
    setMarca( JOptionPane.showInputDialog(null,"Nombre de la Marca del carro"));
    setAño( Integer.parseInt(JOptionPane.showInputDialog(null,"Año de produccion del carro")));
    setCombustible( JOptionPane.showInputDialog(null,"Tipo de combustible del Motor"));
    setColor(JOptionPane.showInputDialog(null,"Dame el color del carro"));

    
    }
    
    
    public void mostrarInfo(){
        
        JOptionPane.showMessageDialog(null, "***Los datos del carro  ***\n\n"
               + "1 Numero de serie del Motor: " +getNumSerieMotor()+
               "\n2 Marca del carro: "+ getMarca() + ""
              +"\n3 Año de produccion del carro: "+getAño() +
               "\n4 Tipo de combustible del Motor: "+getCombustible() +
               "\n5 Color del carro: " + getColor());
         
    }
    
    
    
}
