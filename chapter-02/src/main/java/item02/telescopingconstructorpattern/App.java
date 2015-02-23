package item02.telescopingconstructorpattern;

/**
 * 	
 * @author cesardiaz
 *
 */
public class App {

	public static void main(String[] args) {
		NutritionFacts cocaCola = new NutritionFacts(240, 8, 100, 0, 35, 27);
		System.out.println(cocaCola);
	}

}
