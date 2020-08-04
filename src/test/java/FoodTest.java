import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class FoodTest {

    @Test (expected = IllegalArgumentException.class)
    public void nullNameIssuesError(){
        Food food = new Food(null, 0, 0, 0, 0);
    }

    @Test
    public void toStringReturnsNutrients(){
        Food food = new Food("Strawberries", 25, 24, 0, 1);
        assertThat(food.toString(), containsString("Strawberries"));
    }
}
