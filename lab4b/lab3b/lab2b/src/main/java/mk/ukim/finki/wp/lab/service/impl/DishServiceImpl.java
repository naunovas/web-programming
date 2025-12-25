package mk.ukim.finki.wp.lab.service.impl;

import lombok.RequiredArgsConstructor;
import mk.ukim.finki.wp.lab.model.Chef;
import mk.ukim.finki.wp.lab.model.Dish;
import mk.ukim.finki.wp.lab.repository.DishRepository;
import mk.ukim.finki.wp.lab.service.ChefService;
import mk.ukim.finki.wp.lab.service.DishService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DishServiceImpl implements DishService {

    private final DishRepository dishRepository;
    private final ChefService chefService;

    @Override
    public List<Dish> listDishes(Long chefId) {
        if(chefId == null) {
            return dishRepository.findAll();
        } else {
            return dishRepository.findAllByChefId(chefId);
        }
    }

    @Override
    public Dish findByDishId(String dishId) {
        return dishRepository.findByDishId(dishId).get();
    }

    @Override
    public Dish findById(Long id) {
        return dishRepository.findById(id).get();
    }

    @Override
    public Dish create(String dishId, String name, String cuisine, int preparationTime, Long chefId) {
        Chef chef = chefService.findById(chefId);
        Dish dish = new Dish(dishId, name, cuisine, preparationTime, chef);
        dishRepository.save(dish);
        return dish;
    }

    @Override
    public Dish update(Long id, String dishId, String name, String cuisine, int preparationTime, Long chefId) {
        Dish dish = findById(id);
        Chef chef = chefService.findById(chefId);
        dish.setDishId(dishId);
        dish.setName(name);
        dish.setCuisine(cuisine);
        dish.setPreparationTime(preparationTime);
        dish.setChef(chef);
        dishRepository.save(dish);
        return dish;
    }

    @Override
    public void delete(Long id) {
        dishRepository.deleteById(id);
    }
}