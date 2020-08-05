import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class CalorieCounter extends HttpServlet{

    private final Map<String, Food> foods = new HashMap<>();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType( "text/plain" );

        String foodName = getParameter("foodName", request);
        if(foodName == null){
            missingRequiredParameter(response, "foodName");
        }

        Food food = getFood(foodName);
        writeFood(response, food);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType( "text/plain" );

        String foodName = getParameter("foodName", request);
        if(foodName == null){
            missingRequiredParameter(response, "foodName");
        }
        String calories = getParameter("calories", request);
        if(calories == null){
            missingRequiredParameter(response, "calories");
        }
        String carbohydrates = getParameter("carbohydrates", request);
        if(carbohydrates == null){
            missingRequiredParameter(response, "carbohydrates");
        }
        String fat = getParameter("fat", request);
        if(fat == null){
            missingRequiredParameter(response, "fat");
        }
        String protein = getParameter("protein", request);
        if(protein == null){
            missingRequiredParameter(response, "protein");
        }
        Food food = new Food(foodName, Integer.parseInt(calories), Integer.parseInt(carbohydrates), Integer.parseInt(fat), Integer.parseInt(protein));
        this.foods.put(foodName, food);
        response.setStatus(HttpServletResponse.SC_OK);
    }

    private String getParameter(String name, HttpServletRequest request) {
        String value = request.getParameter(name);
        if (value == null || "".equals(value)) {
            return null;

        } else {
            return value;
        }
    }

    private void missingRequiredParameter( HttpServletResponse response, String parameterName )
            throws IOException
    {
        String message = "The required parameter " + parameterName + " is missing";
        response.sendError(HttpServletResponse.SC_PRECONDITION_FAILED, message);
    }

    private Food getFood(String foodName){
        return this.foods.get(foodName);
    }

    private void writeFood(HttpServletResponse response, Food food) throws IOException {
        PrintWriter pw = response.getWriter();
        pw.println(food.toString());

        pw.flush();
        response.setStatus(HttpServletResponse.SC_OK);
    }
}
