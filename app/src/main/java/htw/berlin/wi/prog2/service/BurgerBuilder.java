package htw.berlin.wi.prog2.service;

import htw.berlin.wi.prog2.domain.*;

import java.util.ArrayList;
import java.util.List;

public class BurgerBuilder {

    private final List<Ingredient> ingredientList = new ArrayList<Ingredient>();

    //Methode fügt Zutaten zur internen ingredientList des BurgerBuilders hinzu.
    public BurgerBuilder add(Ingredient ingredient) {
        // TODO hier die Annahme von Zutaten implementieren
        ingredientList.add(ingredient);
        return this; // die Rückgabe von this sollte beibehalten bleiben (siehe Benutzung im BurgerBuilderTest)
    }

    public Burger buildPrecomputed() {
        // TODO hier stattdessen die neue Klasse PrecomputedBurger verwenden

        //Wird überprüft, ob sich mindestens zwei Zutaten in der Liste befinden.
        if (ingredientList.size() <= 1) {
            throw new IllegalBurgerException("You need at least two ingredients");
        }

        //Es wird eine Kopie der ingredientList erstellt, um sicherzustellen, dass Änderungen
        //an der Liste das Burgerobjekt nicht beeinflussen.
        //Nachdem das Burgerobjekt erstellt wurde, wird die ingredientList geleert.
        List<Ingredient> ingredientList2 = new ArrayList<>(ingredientList);
        Burger precomputedBurger = new PrecomputedBurger(ingredientList2);
        ingredientList.clear();
        return precomputedBurger;
    }

    public Burger buildDynamicallyComputed() {
        // TODO hier stattdessen die neue Klasse DynamicallyComputedBurger verwenden

        ////Wird überprüft, ob sich mindestens zwei Zutaten in der Liste befinden.
        if (ingredientList.size() <= 1) {
            throw new IllegalBurgerException("You need at least ingredients");
        }

        //Wie bei buildPrecomputed() wird eine Kopie der ingredientList erstellt.
        List<Ingredient> ingredientList2 = new ArrayList<>(ingredientList);
        Burger dynamicallyComputedBurger = new DynamicallyComputedBurger(ingredientList2);
        ingredientList.clear();
        return dynamicallyComputedBurger;
    }
}
