package day2session1.builder;

public class BuilderPatternDemo {

	public static void main(String[] args) {

		MealBuilder mealBuilder = new MealBuilder();

		Meal vegMeal = mealBuilder.prepareVegMeal();

		System.out.println("Veg Meal");

		vegMeal.showItems();

		System.out.println("Total Cost: " + vegMeal.getCost());
		
		Meal nVegMeal = mealBuilder.prepareNonVegMeal();

		System.out.println("NonVeg Meal");

		nVegMeal.showItems();

		System.out.println("Total Cost: " + nVegMeal.getCost());

	}

}