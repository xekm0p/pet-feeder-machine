package com.petfeeder.petfeeder.service;

import com.petfeeder.petfeeder.domain.Alarm;
import com.petfeeder.petfeeder.dto.AlarmDto;

import java.util.List;

public interface AlarmService {

    AlarmDto createAlarm(AlarmDto alarmDto);

    AlarmDto findById(Long id);

    AlarmDto update(AlarmDto user);

    void delete(Long id);

    List<AlarmDto> findAll();
}
