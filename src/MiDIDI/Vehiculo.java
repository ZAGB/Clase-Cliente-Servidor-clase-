/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MiDIDI;

/**
 *
 * @author zujeily
 */

class Conductores{
    int id;
    int edad;
    String nombre;
    String numLicen;

    public Conductores(int id, int edad, String nombre, String numLicen) {
        this.id = id;
        this.edad = edad;
        this.nombre = nombre;
        this.numLicen = numLicen;
    }

    public Conductores() {
    }

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumLicen() {
        return numLicen;
    }

    public void setNumLicen(String numLicen) {
        this.numLicen = numLicen;
    }

}


class VehiculoDidi {
    
    int CantidadPasajeros;
    int CantidadPuertas;
    String NumPlaca;
    String Marca;
    int Modelo;

    public int getCantidadPasajeros() {
        return CantidadPasajeros;
    }

    public void setCantidadPasajeros(int CantidadPasajeros) {
        this.CantidadPasajeros = CantidadPasajeros;
    }

    public int getCantidadPuertas() {
        return CantidadPuertas;
    }

    public void setCantidadPuertas(int CantidadPuertas) {
        this.CantidadPuertas = CantidadPuertas;
    }

    public String getNumPlaca() {
        return NumPlaca;
    }

    public void setNumPlaca(String NumPlaca) {
        this.NumPlaca = NumPlaca;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getModelo() {
        return Modelo;
    }

    public void setModelo(int Modelo) {
         if(this.Modelo >=2020){
         this.Modelo = Modelo;
        }
         else{
         System.out.println("El Modelo debe ser menor a 3 años");
         }
        
    }
    
    
    
    
    
    
}

public class Vehiculo {
      
    public static void main(String[] args) {
        
        VehiculoDidi DiDiXL = new VehiculoDidi();
        VehiculoDidi DiDiSM = new VehiculoDidi();
        Conductores ConductorPrin = new Conductores();
        
       
       ConductorPrin.setId(1000);
       ConductorPrin.setNombre("Osiris Lord");
       
                
         System.out.println("Hola, recuerda Osiris es un Dios   "  + ConductorPrin.getNombre());
        
        
      
    }
    




}