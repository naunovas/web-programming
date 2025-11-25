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
    public void initializeData() {


        dishes.add(new Dish("1", "Spaghetti Carbonara", "Italian", 25));
        dishes.add(new Dish("2", "Chicken Tikka Masala", "Indian", 35));
        dishes.add(new Dish("3", "Beef Burger", "American", 20));
        dishes.add(new Dish("4", "Sushi Rolls", "Japanese", 40));
        dishes.add(new Dish("5", "Greek Salad", "Greek", 10));

        chefs.add(new Chef(1L, "Gordon", "Ramsay", "Expert in fine dining", new ArrayList<>()));
        chefs.add(new Chef(2L, "Jamie", "Oliver", "Healthy food specialist", new ArrayList<>()));
        chefs.add(new Chef(3L, "Wolfgang", "Puck", "Fusion cuisine master", new ArrayList<>()));
        chefs.add(new Chef(4L, "Massimo", "Bottura", "Modern Italian kitchen", new ArrayList<>()));
        chefs.add(new Chef(5L, "Anthony", "Bourdain", "Street food lover", new ArrayList<>()));
    }
}
