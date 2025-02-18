interface MealPlan {
    String getMealName();
}

class VegetarianMeal implements MealPlan {
    public String getMealName() {
        return "Vegetarian Meal";
    }
}

class VeganMeal implements MealPlan {
    public String getMealName() {
        return "Vegan Meal";
    }
}

class Meal<T extends MealPlan> {
    private T meal;

    public Meal(T meal) {
        this.meal = meal;
    }

    public T getMeal() {
        return meal;
    }
}

public class MealGenerator {
    public static <T extends MealPlan> void generateMealPlan(T meal) {
        System.out.println("Generated Meal Plan: " + meal.getMealName());
    }

    public static void main(String[] args) {
        Meal<VegetarianMeal> meal = new Meal<>(new VegetarianMeal());
        generateMealPlan(meal.getMeal());
    }
}
