public class Food {

    private String name;
    private int calories;
    private int carbohydrates;
    private int fat;
    private int protein;

    public Food(String name, int calories, int carbohydrates, int fat, int protein){
        if(name == null || name.equals("")){
            throw new IllegalArgumentException("Name of food cannot be null");
        }
        this.name = name;
        this.calories = calories;
        this.carbohydrates = carbohydrates;
        this.fat = fat;
        this.protein = protein;
    }

    public void editNutrientFacts(String nutrient, int value){
        if(nutrient.equals("calories")){
            this.calories = value;
        }
    }

    @Override
    public String toString(){
        return "Name: " + name + "\n" +
                "Calories: " + calories + "\n" +
                "Carbohydrates: " + carbohydrates + "\n" +
                "Fat: " + fat + "\n" +
                "Protein: " + protein + "\n";
    }
}
