public class Large extends SizeOfCar
{
    private float price = 130;
    private int days;

    public Large (String size, int days)
    {
        super(size);
        this.days = days;
        this.price = days*price;
    }

    @Override
    public String toString()
    {
        return "Total Days Rent   : " + days + " Day(s) only \nTotal Price       : RM " + price;
    }

    @Override
    public float getPrice()
    {
        return days*price;
    }
    

}