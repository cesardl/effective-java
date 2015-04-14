package item02.telescopingconstructorpattern;

//Telescoping constructor pattern - does not scale well!
public class NutritionFacts {

    /**
     * (mL) required
     */
    private final int servingSize;
    /**
     * (per container) required
     */
    private final int servings;
    /**
     * optional
     */
    private final int calories;
    /**
     * (g) optional
     */
    private final int fat;
    /**
     * (mg) optional
     */
    private final int sodium;
    /**
     * (g) optional
     */
    private final int carbohydrate;

    public NutritionFacts(int servingSize, int servings) {
        this(servingSize, servings, 0);
    }

    public NutritionFacts(int servingSize, int servings, int calories) {
        this(servingSize, servings, calories, 0);
    }

    public NutritionFacts(int servingSize, int servings, int calories, int fat) {
        this(servingSize, servings, calories, fat, 0);
    }

    public NutritionFacts(int servingSize, int servings, int calories, int fat,
            int sodium) {
        this(servingSize, servings, calories, fat, sodium, 0);
    }

    public NutritionFacts(int servingSize, int servings, int calories, int fat,
            int sodium, int carbohydrate) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(
                "Nutrition facts\n[\nServing size: ");
        sb.append(servingSize);
        sb.append("\nServings: ");
        sb.append(servings);

        if (calories != 0) {
            sb.append("\nCalories: ");
            sb.append(calories);
        }

        if (fat != 0) {
            sb.append("\nFat: ");
            sb.append(fat);
        }

        if (sodium != 0) {
            sb.append("\nSodium: ");
            sb.append(sodium);
        }

        if (carbohydrate != 0) {
            sb.append("\nCarbohydrate: ");
            sb.append(carbohydrate);
        }

        sb.append("\n]");

        return sb.toString();
    }

}
