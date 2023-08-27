public class BaseBeverage implements Beverage{
    @Override
    public int cost() {
        return 10;
    }

    @Override
    public String description() {
        return "Frappe";
    }
}
