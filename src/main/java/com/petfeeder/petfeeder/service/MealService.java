package com.petfeeder.petfeeder.service;

import com.petfeeder.petfeeder.dto.MealDto;

import java.util.List;

public interface MealService {
    MealDto createMeal(MealDto MealDto);

    MealDto findById(Long id);

    MealDto update(MealDto user);

    void delete(Long id);

    List<MealDto> findAll();
}
