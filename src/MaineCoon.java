import java.util.ArrayList;
import java.util.List;

final class MaineCoon {
    private final String name;
    private final int age;
    private final String color;
    private final String food;
    private final List<String> diseases;

    public MaineCoon(String name, int age,
                     String color, String food, List<String> diseases)
    {
        this.name = name;
        this.age = age;
        this.color = color;
        this.food = food;

        this.diseases = new ArrayList<>(diseases);;
    }

    public String getName() { return name; }

    public int getAge() { return age; }

    public String getColor() { return color; }

    public String getFood() { return food; }

    public List<String> getDiseases() { return diseases; }


}
