package com.petfeeder.petfeeder.service;

import com.petfeeder.petfeeder.domain.DayOfWeek;

import java.util.List;

public interface DayOfWeekService {
    DayOfWeek createDayOfWeek(DayOfWeek DayOfWeekDto);

    DayOfWeek findById(Long id);

    DayOfWeek update(DayOfWeek user);

    void delete(Long id);

    List<DayOfWeek> findAll();
}
