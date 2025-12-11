/*package mk.ukim.finki.wp.lab.repository.impl;

import mk.ukim.finki.wp.lab.bootstrap.DataHolder;
import mk.ukim.finki.wp.lab.model.Dish;
import mk.ukim.finki.wp.lab.repository.DishRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class InMemoryDishRepository implements DishRepository {
    @Override
    public List<Dish> findAll() {
        return DataHolder.dishes;
    }

    @Override
    public Dish findByDishId(String dishId) {
        for (Dish dish : DataHolder.dishes) {
            if(dish.getDishId().equals(dishId)) {
                return dish;
            }
        }
        return null;
    }

    @Override
    public Optional<Dish> findById(Long id) {
        for (Dish dish : DataHolder.dishes) {
            if(dish.getId().equals(id)) {
                return Optional.of(dish);
            }
        }
        return Optional.empty();
    }

    @Override
    public Dish save(Dish dish) {
        Optional<Dish> optionalDish = findById(dish.getId());

        if(optionalDish.isPresent()) {
            Dish existingDish = optionalDish.get();
            existingDish.setName(dish.getName());
            existingDish.setCuisine(dish.getCuisine());
            existingDish.setPreparationTime(dish.getPreparationTime());
            existingDish.setDishId(dish.getDishId());
        } else {
            DataHolder.dishes.add(dish);
        }

        return dish;
    }

    @Override
    public void deleteById(Long id) {
        for (Dish dish : DataHolder.dishes) {
            if(dish.getId().equals(id)) {
                DataHolder.dishes.remove(dish);
                break;
            }
        }
    }
}
*/
