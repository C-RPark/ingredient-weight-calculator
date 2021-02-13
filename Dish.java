/**
 * Objects of the Dish class, loosely model the real world relationship between 
 * a dish and its ingredients. This class has attributes representing the dish name and
 * the ingredients. The size of the dish is based on the weight of igredients in grams,
 * and the difficulty is based on the size.
 * 
 * Dish is an exanple of a composite class.
 * 
 * An object of the Dish class has-an object of the Ingredient class,
 * which represents an ingredient in a dish.
 * 
 * The value of calculateDishSize is set to a string value representing
 * the size of a dish. A similar method calculateDifficulty is then used 
 * to caluculate the difficulty, thus also setting the difficulty to a string.
 * 
 * The method for peopleRequired simply returns a string stating how many 
 * people a dish will feed, based on the size of the dish.
 * 
 * @author Connor Park 
 * @version 27/12/2020
 */
public class Dish
{
   private Ingredient ingredient; // a dish has-an ingredient of type Ingredient
   private String dishName; // a dish has a name, e.g. "omelet"
   private String dishSize; // the size of the dish, e.g. "small"
   private String difficulty; // the difficulty of a dish, e.g. "hard"
   
   /*
    * Constructor for objects of the class Dish
    * allowing the dish name to be set. The ingredient, dishSize
    * and difficulty are set using a setter method which caluculates
    * these values.
    */
   Dish(Ingredient anIngredient, String dishName){
      setIngredient(anIngredient);
      this.dishName = dishName;
   }
   
   /*
    * Method for calculating the dish size based on
    * the ingredient weight and setting it to the dish size.
    */
   
   private void calculateDishSize() {
      if(ingredient.getWeight() >= 0 && ingredient.getWeight() < 500){
         this.dishSize = "small";
      } else if (ingredient.getWeight() >= 500  && ingredient.getWeight() < 1000){
         this.dishSize = "medium";
      } else {
         this.dishSize = "large";
      } 
   }
   
   /*
    * Method for caluculating the difficulty of the dish
    * based on the size of the size.
    */
   
   private void calculateDifficulty() {
      if (dishSize == "small") {
         this.difficulty = "easy";
      } else if (dishSize == "medium") {
         this.difficulty = "average";
      } else if (dishSize == "large") {
         this.difficulty = "hard";
      }
   }
   
   /*
    * Setter method for setting the dish size and the difficulty
    * to the object of class Dish.
    * Uses the methods created for caluculting each of the values needed
    * for the variables dishSize and difficulty.
    */
   
   public void setIngredient(Ingredient anIngredient){
      this.ingredient = anIngredient;
      calculateDishSize();
      calculateDifficulty();
   }
   
   /*
    * Method for printing out the amount of people
    * a dish will feed based on the size of that dish. 
    */
 
   public void peopleRequired(){
      if (this.dishSize == "small"){
         System.out.println("This dish will feed 1 person");
      } else if (this.dishSize == "medium"){
         System.out.println("This dish will feed 2 people");
      } else {
         System.out.println("This dish will feed 3 people");
      }
   }
   
   /*
    * returns a string describing the object 
    */
   public String toString(){
      return String.format("Dish name = '%s', Difficulty = '%s', size = '%s'. Ingredient = (%s)", dishName, difficulty, dishSize, ingredient);
   }
}

      
   
   


