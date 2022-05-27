/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs.clase1;

/**
 *
 * @author zujeily
 */
public class Burbuja {
    
    public void Burbujita (){
        
        int datos [ ] = {3,2,4,1} ;
        int ult =3;
        int pre =2;
        int cam =0;
        boolean exit =false;
  
        while (!exit){
           if (datos[pre]>datos[ult]){
              cam = datos[pre];
              datos[pre]= datos [ult];
              datos[ult]=cam; 
             ult-=1;
           }
           else if(datos[pre]==datos[ult]){
            ult-=1;
            
           }
           else if(datos[pre]<=datos[ult]){
               ult-=1;
               
              cam = datos[pre];
              datos[pre]= datos [ult];
              datos[ult]=cam;  
   
              
              System.out.println(datos[0]); 
              System.out.println(datos[1]); 
              System.out.println(datos[2]);
              System.out.println(datos[3]); 
              
              exit = true;
              
              
           }
           
        }
         
        
}
    
    
public void Burburijilla (){
    
      int datos [ ] = {3,2,4,1} ;
        int ult =3;
        int pre =2;
        int cam =0;
        boolean exit =false;
  
        while (!exit){
   for (int a=9; a<10; a++ ){
       
       if (a<=4){
           if(datos[ult]>datos[pre]){
               cam = datos[pre];
               datos[pre]= datos [ult];
               datos[ult]=cam; 
               ult-=1;
               pre-=1;
               
               
           }else{
               
              System.out.println(datos[0]); 
              System.out.println(datos[1]); 
              System.out.println(datos[2]);
              System.out.println(datos[3]);   
           }    
           
       }else if (a>4 && a<=7){
       
       
   }
    
}    
    
}
}
}