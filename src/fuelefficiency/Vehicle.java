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
public abstract class Vehicle {
    
    private double fuelEff;
    private String name;
    
    /**
     * Creates a new vehicle with the specified fuel efficiency.
     * pre: fuel efficiency is a positive number
     * post: new Vehicle returned
     * @param fuelEfficiency 
     */
    public Vehicle(double fuelEfficiency, String vehicleName) {
        fuelEff = fuelEfficiency;
        name = vehicleName;
    }
    
    /**
     * Returns the distance the car can travel, in kilometers.
     * pre: litersFuel is whole number (otherwise a negative distance will be given because I'm lazy)
     * post: Distance vehicle can travel is returned
     * @param litersFuel
     * @return distance car can travel in kilometers
     */
    public double getDistance(double litersFuel) {
        return (litersFuel * 100 / fuelEff);
    }
    
    /**
     * Returns the name of the type of this vehicle.
     * pre: none
     * post: vehicle type name returned
     * @return vehicle type name
     */
    public String getName() {
        return name;
    }
    
}
