public final class PillsDosage {
    private  float currentDosage;

    public PillsDosage(float currentDosage) {
        this.currentDosage = currentDosage;
    }

    public void setCurrentDosage(float currentDosage) {
        this.currentDosage = currentDosage;
    }

    public float getCurrentDosage() { return currentDosage; }

    public static int addDosage(int startDosage, int addingDosage) {
        int val;
        val = startDosage + addingDosage;

        return val;
    }

    public static float addDosage(float startDosage, float addingDosage) {
        float val;
        val = startDosage + addingDosage;

        return val;
    }

    public static float remainingPills(float currentDosage, int remainingDays) {
        boolean isRecipeEnded = false;
        if (remainingDays < 10)
            isRecipeEnded = true;

        return checkDosageByRecipe(isRecipeEnded,currentDosage);
    }

    private static float checkDosageByRecipe(boolean isRecipeEnded, float dosage) {
        if (isRecipeEnded)
            return dosage/2;
        else return dosage;
    }
}