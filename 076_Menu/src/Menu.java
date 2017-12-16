
import java.util.ArrayList;

public class Menu {

    //create method addMeal for add name of meal to meals
    //create method printMeals for show all meals
    //create method clearMenu for clear meals of all 
    //BEGIN SOLUTION
    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();
    }

    public void addMeal(String meal) {
        if (!this.meals.contains(meal)){
            this.meals.add(meal);
        }      
    }
    
    public void printMeals() {
        for(String i : this.meals){
            System.out.println(i);
        }
    }
    
    public void clearMenu(){
        this.meals.clear();
    }
    //END SOLUTION
    
}
