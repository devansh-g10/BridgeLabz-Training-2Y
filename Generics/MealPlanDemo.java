interface MealPlan {
    void showMeal();
}

// Subclasses for different meal types
class VegetarianMeal implements MealPlan {
    public void showMeal() {
        System.out.println("Vegetarian Meal: Paneer Curry, Rice, Salad 🥗");
    }
}

class VeganMeal implements MealPlan {
    public void showMeal() {
        System.out.println("Vegan Meal: Tofu Stir Fry, Brown Rice, Smoothie 🥤");
    }
}

class KetoMeal implements MealPlan {
    public void showMeal() {
        System.out.println("Keto Meal: Grilled Chicken, Avocado, Eggs 🥑");
    }
}

// Generic Meal class
class Meal<T extends MealPlan> {
    private T plan;

    public void setMeal(T plan) {
        this.plan = plan;
    }

    public void displayMeal() {
        if (plan != null) {
            plan.showMeal();
        } else {
            System.out.println("No meal plan selected!");
        }
    }
}

// Generic method to generate meal plan
class MealPlanner {
    public static <T extends MealPlan> void generatePlan(T meal) {
        System.out.println("✅ Generating your personalized meal plan...");
        meal.showMeal();
        System.out.println("Enjoy your meal! 😋");
    }
}

public class MealPlanDemo {
    public static void main(String[] args) {
        Meal<VegetarianMeal> vegMeal = new Meal<>();
        vegMeal.setMeal(new VegetarianMeal());
        vegMeal.displayMeal();

        System.out.println();

        // Using generic method
        MealPlanner.generatePlan(new KetoMeal());
    }
}
