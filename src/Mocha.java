public class Mocha implements Beverage{
    Beverage b;
    public Mocha(Beverage b)
    {
        this.b=b;
    }
    @Override
    public int cost() {
        return b.cost() + 20;
    }

    @Override
    public String description() {
        return (b.description() + " Mocha");
    }
}
