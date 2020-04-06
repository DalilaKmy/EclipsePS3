public class SizeOfCar
{
    private String size;

    public SizeOfCar (String size)
    {
        this.size = size;
    }

    @Override
    public String toString()
    {
        return "Car Type          : "+size;
    }

    public float getPrice()
    {
        System.out.println("Sorry, Your Car Type Are Not Available");
        return 0;
    }
}