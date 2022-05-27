/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs.clase2;

import javax.swing.JOptionPane;

/**
 *
 * @author zujeily
 */
public class Suma extends OperacionAritmetica{
private String mensaje;
    public Suma() {
       super();
       this.mensaje="";
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
        
    }
    
    public double calcularSuma() {
       return resultado = num1 + num2;
        
        
    }
    
    public void mostrarMensaje(){
        mensaje= "hemos terminado";
       JOptionPane.showMessageDialog(null, "resultado " +resultado);
    }
    
}
