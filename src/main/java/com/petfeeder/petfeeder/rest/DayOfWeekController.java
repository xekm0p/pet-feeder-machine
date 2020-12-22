package com.petfeeder.petfeeder.rest;

import com.petfeeder.petfeeder.service.DayOfWeekService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DayOfWeekController {

    Logger logger = LoggerFactory.getLogger(DayOfWeekController.class);

    private DayOfWeekService dayOfWeekService;

    public DayOfWeekController(DayOfWeekService dayOfWeekService) {
        this.dayOfWeekService = dayOfWeekService;
    }


}
