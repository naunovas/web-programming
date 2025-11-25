package mk.ukim.finki.wp.lab.service.impl;

import lombok.RequiredArgsConstructor;
import mk.ukim.finki.wp.lab.model.Dish;
import mk.ukim.finki.wp.lab.repository.DishRepository;
import mk.ukim.finki.wp.lab.service.DishService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DishServiceImpl implements DishService {

    private final DishRepository dishRepository;

    @Override
    public List<Dish> listDishes() {
        return dishRepository.findAll();
    }

    @Override
    public Dish findByDishId(String dishId) {
        return dishRepository.findByDishId(dishId);
    }

    @Override
    public Dish findById(Long id) {
        return dishRepository.findById(id).get();
    }

    @Override
    public Dish create(String dishId, String name, String cuisine, int preparationTime) {
        Dish dish = new Dish(dishId, name, cuisine, preparationTime);
        dishRepository.save(dish);
        return dish;
    }

    @Override
    public Dish update(Long id, String dishId, String name, String cuisine, int preparationTime) {
        Dish dish = new Dish(id, dishId, name, cuisine, preparationTime);
        dishRepository.save(dish);
        return dish;
    }

    @Override
    public void delete(Long id) {
        dishRepository.deleteById(id);
    }
}