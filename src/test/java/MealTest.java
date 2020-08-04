import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class MealTest {

    @Test (expected = IllegalArgumentException.class)
    public void nullNameForMealThrowsError(){
        Meal meal = new Meal(null);
    }

    @Test
    public void addFoodContainsFood(){
        Meal meal = new Meal("Lunch");
        Food food = new Food("Strawberries", 25, 24, 0, 1);
        meal.addFood(food);
        assertThat(meal.getFoods().contains(food), equalTo(true));
    }

    @Test
    public void toStringReturnsMealName(){
        Meal meal = new Meal("Lunch");
        Food food = new Food("Strawberries", 25, 24, 0, 1);
        meal.addFood(food);
        assertThat(meal.toString(), containsString("Lunch"));
    }
}
