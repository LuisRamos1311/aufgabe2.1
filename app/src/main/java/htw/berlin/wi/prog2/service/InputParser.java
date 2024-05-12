package htw.berlin.wi.prog2.service;

import htw.berlin.wi.prog2.domain.Ingredient;

import java.util.List;

//Diese Methode ist dafür verantwortlich, eine Eingabezeile zu analysieren
//und eine Liste von Ingredient-Objekten zurückzugeben.

//Durch die Definition dieser Interface wird der Code flexibler und folgt dem Prinzip,
//nach einer Interface und nicht nach einer Implementierung zu programmieren.

public interface InputParser {
    public List<Ingredient> ingredientsFromInput(String inputLine);
}
