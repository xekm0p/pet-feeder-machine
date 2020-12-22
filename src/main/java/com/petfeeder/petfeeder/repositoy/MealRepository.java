package com.petfeeder.petfeeder.repositoy;

import com.petfeeder.petfeeder.domain.Meal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MealRepository extends JpaRepository<Meal, Long> {
}
