package item02.builderpattern;

/**
 * Builder Pattern
 *
 * @author cesardiaz
 */
public class NutritionFacts {

    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public static class Builder {

        // Required parameters
        private final int servingSize;
        private final int servings;
        // Optional parameters - initialized to default values
        private int calories = 0;
        private int fat = 0;
        private int carbohydrate = 0;
        private int sodium = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int val) {
            calories = val;
            return this;
        }

        public Builder fat(int val) {
            fat = val;
            return this;
        }

        public Builder carbohydrate(int val) {
            carbohydrate = val;
            return this;
        }

        public Builder sodium(int val) {
            sodium = val;
            return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }

    private NutritionFacts(Builder builder) {
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
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
