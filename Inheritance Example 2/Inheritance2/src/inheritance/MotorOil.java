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
class MotorOil extends Product {
    private String type;
    private String viscosity;
    
    public MotorOil(String d, double p, String type, String viscosity)
    {
        super(d,p);
	this.type =type;
        this.viscosity = viscosity;
    }

    public String getType()
    {
        return type;
    }
    
    public String getViscosity()
    {
        return viscosity;
    }
    
    public String display()
    {
        return("Description = "+ getDescription() + "\nType = " + type + "\nViscosity Grade = " + viscosity +"\nPrice = RM " + getPrice()+ "\n");
    }
    
}
