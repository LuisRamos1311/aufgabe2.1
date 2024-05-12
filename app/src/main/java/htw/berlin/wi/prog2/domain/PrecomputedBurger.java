package htw.berlin.wi.prog2.domain;

import java.util.ArrayList;
import java.util.List;

public class PrecomputedBurger implements Burger {

    private double price;
    private int calories;
    private List<String> ingredientNameList = new ArrayList<>();

    public PrecomputedBurger(List<Ingredient> ingredientList) {
        for (Ingredient ingredient : ingredientList) {
        this.price += ingredient.getPrice();
        this.calories += ingredient.getCalories();
        this.ingredientNameList.add(ingredient.getName());
        };


    }

    @Override
    public double calculatePrice() {
        return this.price;
    }

    @Override
    public int calculateCalories() {
        return this.calories;
    }

    @Override
    public List<String> getIngredientNames() {
        return this.ingredientNameList;
    }
}
