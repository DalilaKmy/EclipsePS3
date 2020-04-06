import java.util.Scanner;

public class CarHub
{
    public static void main (String[] args)
    {
        Scanner sr = new Scanner(System.in);
        System.out.println("***************************");
        System.out.println("Welcome to CarHub System");
        System.out.println("***************************");

        System.out.println();
        System.out.println("Type of Car Available to Rent");
        System.out.println("Type A  : Small [4 seat]    - RM 80/Days");
        System.out.println("Type B  : Medium [6 seat]   - RM 100/Days");
        System.out.println("Type C  : Large [10 seat]   - RM 130/Days");
        System.out.println();
        System.out.print("Your Car Type (A/B/C)     : ");
        String carType = sr.nextLine();
        System.out.print("Name                      : ");
        String name = sr.nextLine();
        System.out.print("Total Days to Rent        : ");
        int days = sr.nextInt();

        switch (carType.toLowerCase())
        {
            case "a":
                        SizeOfCar soc1 = new SizeOfCar("Small Car");
                        SizeOfCar car1 = new Small("Small Car",days);
                        System.out.println("\n\n***************************");
                        System.out.println("**** RECEIPT STATEMENT ****");
                        System.out.println("***************************");
                        System.out.println("Name              : " + name);
                        System.out.println(soc1);
                        System.out.println(car1);
                        System.out.println("***************************");
                        System.out.println("Thank You For Rent With Us");
                        System.out.println("Please Pay RM " + car1.getPrice() + " within 24hours for confirmation.");
                        break;
            case "b":
                        SizeOfCar soc2 = new SizeOfCar("Medium Car");
                        SizeOfCar car2 = new Medium("Medium Car",days);
                        System.out.println("\n\n***************************");
                        System.out.println("**** RECEIPT STATEMENT ****");
                        System.out.println("***************************");
                        System.out.println("Name              : " + name);
                        System.out.println(soc2);
                        System.out.println(car2);
                        System.out.println("***************************");
                        System.out.println("Thank You For Rent With Us");
                        System.out.println("Please Pay RM " + car2.getPrice() + " within 24hours for confirmation.");
                        break;
            case "c":
                        SizeOfCar soc3 = new SizeOfCar("Large Car");
                        SizeOfCar car3 = new Large("Large Car",days);
                        System.out.println("\n\n***************************");
                        System.out.println("**** RECEIPT STATEMENT ****");
                        System.out.println("***************************");
                        System.out.println("Name              : " + name);
                        System.out.println(soc3);
                        System.out.println(car3);
                        System.out.println("***************************");
                        System.out.println("Thank You For Rent With Us");
                        System.out.println("Please Pay RM " + car3.getPrice() + " within 24hours for confirmation.");
                        break;
            default:
                        System.out.println();
                        System.out.println("Sorry, Your Car Type Are Not Available");
                        break;
        }

        
    }
}

