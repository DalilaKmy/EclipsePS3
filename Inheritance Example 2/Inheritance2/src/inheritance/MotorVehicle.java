/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author My-Hp
 */
class MotorVehicle extends Product {
    private String MotorType;
    
    public MotorVehicle(String d, double p, String MotorType )
    {
	super(d,p);
	this.MotorType = MotorType;
    }
    
    public String getMotorType()
    {
	return MotorType;
    }

    public String display()
    {
	return("Description = "+ getDescription() + "\nType = "+ MotorType + "\nPrice = RM " + getPrice() + "\n");
    }
}
