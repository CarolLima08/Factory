
package com.mycompany.projeto;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Client {
     public static void main(String[] args) {
        
    CarFactory factory = new FiatFactory();
    SedanCar sedan = factory.buildSedanCar();
    HatchCar hatch = factory.buildHatchCar();
    
    sedan.showSedanInformation();
    System.out.println();
    hatch.showHatchInformation();
    System.out.println();
 
    factory = new VolksFactory();
    sedan = factory.buildSedanCar();
    hatch = factory.buildHatchCar();
    
    sedan.showSedanInformation();
    System.out.println();
    hatch.showHatchInformation(); 
        
    }
}