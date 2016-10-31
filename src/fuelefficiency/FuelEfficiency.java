/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fuelefficiency;

/**
 *
 * @author DaTho7561
 */
public class FuelEfficiency {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Vehicle[] vehicles = new Vehicle[] {new Car(), new Truck(), new Motorcycle(), new HybridCar()};
        
        for(Vehicle v: vehicles) {
            System.out.println(v.getName() + " can travel " + v.getDistance(50) + "km on 50.0L of fuel");
        }
    }
    
}
