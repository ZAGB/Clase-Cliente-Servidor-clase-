/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaComposicionYAgregacion;

import javax.swing.JOptionPane;

/**
 *
 * @author zujeily
 */
public class Smartphone {
    
    protected String modelo;
    protected Bateria bateria;
    protected int numChips;
    protected Chip[] chips;

    public Smartphone(String modelo, int catMaH, String marBateria) {
        this.modelo = modelo;
        this.bateria = new Bateria(catMaH, marBateria);
        this.numChips = 0;
        this.chips = new Chip[2];
    }
    
    
  public void mostrarSmart(){
      
      JOptionPane.showMessageDialog(null, "Modelo: "+modelo);
      bateria.mostrarBateriaDatos();
      JOptionPane.showMessageDialog(null, "Cantidad de Chip:  "+numChips);
      for(int i=0; i< numChips; i++){
          chips[i].mostrarChipDatos();
      }
  }  
    
  public void agregarChip(Chip nuevoChip){
      if(numChips <2){
          chips[numChips]= nuevoChip;
          numChips++;
      }    
  }
  
  
}
