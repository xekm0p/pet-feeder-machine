package com.petfeeder.petfeeder.rest;

import com.petfeeder.petfeeder.dto.MealDto;
import com.petfeeder.petfeeder.service.MealService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/meal")
public class MealController {

    Logger logger = LoggerFactory.getLogger(MealController.class);

    private MealService mealService;

    public MealController(MealService mealService) {
        this.mealService = mealService;
    }

    @PostMapping
    public MealDto createMeal(@RequestBody MealDto mealDto) {
        return mealService.createMeal(mealDto);
    }

    @GetMapping("/{id}")
    public MealDto findById(@PathVariable(value = "id") Long id) {
        return mealService.findById(id);
    }

    @PutMapping()
    public MealDto update(@RequestBody MealDto mealDto) {
        return mealService.update(mealDto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable(value = "id") Long id) {
        mealService.delete(id);
    }

    @GetMapping()
    public List<MealDto> findAll() {
        return mealService.findAll();
    }
}
