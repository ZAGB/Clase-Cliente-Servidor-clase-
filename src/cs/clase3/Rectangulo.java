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
public class Rectangulo extends Figura{
    
    protected double resultado;

    public Rectangulo(double base, double altura) {
        super(base, altura);
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

       public double CalcularArea(){
       
       resultado=base*altura;
       
       JOptionPane.showMessageDialog(null, "La area del rectangulo es multiplicar el largo: "+ getBase()+" por el ancho: "+ getAltura() +" Eso nos da el siguiente resultado: "+ resultado);
       
       return resultado;
   } 
    
    
}
