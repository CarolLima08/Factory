
package com.mycompany.projeto;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class VolksFactory extends CarFactory {
    public SedanCar buildSedanCar() {
        return new Voyage();
    }
 
    public HatchCar buildHatchCar() {
        return new Gol();
    }
}