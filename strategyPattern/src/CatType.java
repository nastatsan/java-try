public abstract class CatType {
    EatStrategy eatStrategy;

    public CatType(){}

    public void setEatStrategy(EatStrategy eatStrategy) {
        this.eatStrategy = eatStrategy;
    }

    public void feedCat() {
        eatStrategy.eat();
    }
}