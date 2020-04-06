/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

import java.util.ArrayList;

/**
 *
 * @author My-Hp
 * 
 * inheritance example for Motor Trade products
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<MotorOil> oilList = new ArrayList<MotorOil>();
        
        MotorVehicle product1 = new MotorVehicle("Proton", 56000, "Car");
        
        System.out.println("====MOTOR TRADE PRODUCTS INFO====\n");
        System.out.println("--Vehicles--\n");
        System.out.println(product1.display());
        
        MotorOil product2 = new MotorOil("Shell",120, "Premium Conventional Oil", "10W-30");
        MotorOil product3 = new MotorOil("Shell",170, "Semi Synthetic Oil", "10W-40");
        
	oilList.add(product2);
        oilList.add(product3);
        
        
        System.out.println("--Motor Oils--\n");
        for(int i = 0; i<oilList.size();i++)
	{
            System.out.println((oilList.get(i)).display());
	}  
        
    }
    
}
