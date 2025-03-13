public class Feeding {
    public static void main(String[] args) {
        CatType longHairedCat = new LongHairedCat();
        CatType sphynx = new Sphynx();

        longHairedCat.feedCat();
        sphynx.feedCat();
        sphynx.setEatStrategy(new WetFoodStrategy());
        sphynx.feedCat();
    }
}
