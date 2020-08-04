import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class DietPlanTest {

    @Test (expected = IllegalArgumentException.class)
    public void nullNameForDietPlanThrowsError(){
        DietPlan plan = new DietPlan(null);
    }

    @Test
    public void addMealContainsMeal(){
        Meal meal = new Meal("Lunch");
        Food food = new Food("Strawberries", 25, 24, 0, 1);
        meal.addFood(food);
        DietPlan plan = new DietPlan("High Carbs");
        plan.addMeal(meal);
        assertThat(plan.getMeals().contains(meal), equalTo(true));
    }
}
