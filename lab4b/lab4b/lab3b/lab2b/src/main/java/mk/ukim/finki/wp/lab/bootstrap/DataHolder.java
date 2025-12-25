package mk.ukim.finki.wp.lab.bootstrap;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import mk.ukim.finki.wp.lab.model.Chef;
import mk.ukim.finki.wp.lab.model.Dish;
import mk.ukim.finki.wp.lab.repository.ChefRepository;
import mk.ukim.finki.wp.lab.repository.DishRepository;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataHolder {

    private final DishRepository dishRepository;
    private final ChefRepository chefRepository;

    @PostConstruct
    public void initializeData() {

        for (int i = 0; i < 5; i++) {
            Chef chef = new Chef(
                    "FirstName" + i,
                    "LastName" + i,
                    "Bio" + i);
            chefRepository.save(chef);

            Dish dish = new Dish(Integer.toString(i),
                    "DishName" + i,
                    "Cuisine" + i,
                    i,
                    chef);
            dishRepository.save(dish);
        }
    }
}