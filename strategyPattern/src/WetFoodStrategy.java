public class WetFoodStrategy implements EatStrategy {
    @Override
    public void eat() {
        System.out.println("Cat needs a wet food");
    }
}