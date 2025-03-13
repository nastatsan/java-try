public class TomatoDecorator extends PizzaDecorator {
    public TomatoDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", tomatoes";
    }

    @Override
    public double cost() {
        return decoratedPizza.cost() + 0.75;
    }
}
