package item02.builderpattern;

/**
 * @author cesardiaz
 */
public class App {

    public static void main(String[] args) {
        NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8).
                calories(100).sodium(35).carbohydrate(27).build();
        System.out.println(cocaCola);

        NutritionFacts incaCola = new NutritionFacts.Builder(320, 100)
                .calories(65).build();
        System.out.println(incaCola);

        NutritionFacts kolaReal = new NutritionFacts.Builder(248, 150)
                .build();
        System.out.println(kolaReal);
    }

}
