/**
 * Ingredients represents an ingredient in a dish
 * It simply has a name and a weight
 * This is a component class
 * 
 * @author Connor Park 
 * @version 27/12/2020
 */
public class Ingredient
{
   private String name;
   private int weightInGrams; // weight in grams
   
   /*
    * A constructor which takes two arguemnts of the name and weight.
    */
   Ingredient(String name, int weight){
      this.name = name;
      this.weightInGrams = weight;
   }
   
   /*
    * Getter for an ingredients weight. This will return the weight
    * and will be used in the Dish class.
    */
   public int getWeight(){
      return weightInGrams;
   }
 
   /*
    * returns a description of the object as a string and gives the weight in kg.
    */
   public String toString(){
      return String.format("Name = '%s', Weight = '%s'", name, weightInGrams);
   }
}


