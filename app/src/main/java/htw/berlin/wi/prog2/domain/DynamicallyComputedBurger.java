package htw.berlin.wi.prog2.domain;

import java.util.ArrayList;
import java.util.List;

public class DynamicallyComputedBurger implements Burger {

    //Im Gegensatz zu PrecomputedBurger werden den Gesamtpreis, die Gesamtkalorien
    // oder die Liste der Zutatennamen nicht während der Objekterstellung berechnet.

    List<Ingredient> ingredientList;

    public DynamicallyComputedBurger(List<Ingredient> ingredientList) {
        this.ingredientList = ingredientList;
    };

    //Werte werden dynamisch berechnet, wenn sie durch die entsprechenden Methoden angefordert werden:

    @Override
    public double calculatePrice() {
        double price = 0;
        for (Ingredient ingredient : ingredientList) {
            price += ingredient.getPrice();
        }
        return price;
    }

    @Override
    public int calculateCalories() {
        int calories = 0;
        for (Ingredient ingredient : ingredientList) {
            calories += ingredient.getCalories();
        }
        return calories;    }

    @Override
    public List<String> getIngredientNames() {
        List<String> ingredientNameList = new ArrayList<String>();

        for (Ingredient ingredient : ingredientList) {
            ingredientNameList.add(ingredient.getName());
        }
        return ingredientNameList;    }
}
