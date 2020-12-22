package com.petfeeder.petfeeder.mapper;

import com.petfeeder.petfeeder.domain.Meal;
import com.petfeeder.petfeeder.dto.MealDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MealMapper extends EntityMapper<Meal, MealDto> {
}
