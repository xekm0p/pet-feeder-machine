package com.petfeeder.petfeeder.rest;

import com.petfeeder.petfeeder.domain.Alarm;
import com.petfeeder.petfeeder.dto.AlarmDto;
import com.petfeeder.petfeeder.service.AlarmService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alarm")
public class AlarmController {

    Logger logger = LoggerFactory.getLogger(AlarmController.class);

    private AlarmService alarmService;

    public AlarmController(AlarmService alarmService) {
        this.alarmService = alarmService;
    }

    @PostMapping
    public AlarmDto createAlarm(@RequestBody AlarmDto alarmDto) {
        return alarmService.createAlarm(alarmDto);
    }

    @GetMapping("/{id}")
    public AlarmDto findById(@PathVariable(value = "id") Long id) {
        return alarmService.findById(id);
    }

    @PutMapping()
    public AlarmDto update(@RequestBody AlarmDto alarmDto) {
        return alarmService.update(alarmDto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable(value = "id") Long id) {
        alarmService.delete(id);
    }

    @GetMapping()
    public List<AlarmDto> findAll() {
        return alarmService.findAll();
    }
}
