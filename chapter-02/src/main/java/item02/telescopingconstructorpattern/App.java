package item02.telescopingconstructorpattern;

/**
 * @author cesardiaz
 */
public class App {

    public static void main(String[] args) {
        NutritionFacts cocaCola = new NutritionFacts(240, 8, 100, 0, 35, 27);
        System.out.println(cocaCola);

        NutritionFacts incaCola = new NutritionFacts(320, 100, 65);
        System.out.println(incaCola);

        NutritionFacts kolaReal = new NutritionFacts(248, 150);
        System.out.println(kolaReal);
    }

}
