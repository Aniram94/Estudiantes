/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isc.isma4.estudiantes;

/**
 *
 * @author marina
 */
public class Gastronomia extends Estudiante{
    String color;
    public Gastronomia(String color){
        this.color = color;
    } 
    
    @Override
   public String getColor(){
      return color;
    }
    
}
