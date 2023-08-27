public class Milk implements Beverage{

    Beverage b;
    public Milk(Beverage b)
    {
        this.b=b;
    }
    @Override
    public int cost() {
        return b.cost() + 10;
    }

    @Override
    public String description() {
        return (b.description() + " Milk Chocolate");
    }
}
