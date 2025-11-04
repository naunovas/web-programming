package mk.ukim.finki.wp.lab.bootstrap;

import jakarta.annotation.PostConstruct;
import mk.ukim.finki.wp.lab.model.Chef;
import mk.ukim.finki.wp.lab.model.Dish;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataHolder {
    public static List<Chef> chefs = new ArrayList<>();
    public static List<Dish> dishes = new ArrayList<>();

    @PostConstruct
    public void init() {
        chefs.add(new Chef(0L, "Ana", "Petrova", "Loves cooking desserts.", new ArrayList<>()));
        chefs.add(new Chef(1L, "Boris", "Markov", "Enjoys making pasta.", new ArrayList<>()));
        chefs.add(new Chef(2L, "Cvetan", "Georgiev", "Specializes in soups.", new ArrayList<>()));
        chefs.add(new Chef(3L, "Diana", "Ivanova", "Great at baking bread.", new ArrayList<>()));
        chefs.add(new Chef(4L, "Elena", "Stojanova", "Likes simple healthy meals.", new ArrayList<>()));


        dishes.add(new Dish("dish_0", "Tomato Soup", "International", 10));
        dishes.add(new Dish("dish_1", "Spaghetti", "Italian", 20));
        dishes.add(new Dish("dish_2", "Fruit Salad", "International", 5));
        dishes.add(new Dish("dish_3", "Grilled Cheese", "American", 8));
        dishes.add(new Dish("dish_4", "Pancakes", "Breakfast", 15));
    }
}