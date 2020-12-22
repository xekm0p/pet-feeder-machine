package com.petfeeder.petfeeder.service.impl;

import com.petfeeder.petfeeder.domain.Alarm;
import com.petfeeder.petfeeder.dto.AlarmDto;
import com.petfeeder.petfeeder.mapper.AlarmMapper;
import com.petfeeder.petfeeder.repositoy.AlarmRepository;
import com.petfeeder.petfeeder.repositoy.MachineRepository;
import com.petfeeder.petfeeder.service.AlarmService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlarmServiceImpl implements AlarmService {

    private Logger logger = LoggerFactory.getLogger(AlarmServiceImpl.class);

    private AlarmMapper alarmMapper;

    private AlarmRepository alarmRepository;

    private MachineRepository machineRepository;

    public AlarmServiceImpl(AlarmMapper alarmMapper, AlarmRepository alarmRepository) {
        this.alarmMapper = alarmMapper;
        this.alarmRepository = alarmRepository;
    }

    @Override
    public AlarmDto createAlarm(AlarmDto alarmDto) {
        logger.info("Save alarm with params: date{}", alarmDto.getDate());

        if (machineRepository.findById(alarmDto.getMachineId()).isPresent()) {
            Alarm saveAlarm = alarmMapper.toEntity(alarmDto);
            return alarmMapper.toDto(saveAlarm);
        }
        logger.error("Failed to save alarm!");
        return null;
    }

    @Override
    public AlarmDto findById(Long id) {
        logger.info("Searching for alarm with id = {}", id);

        Optional<Alarm> foundAlarm = alarmRepository.findById(id);

        if (foundAlarm.isPresent()) {
            return alarmMapper.toDto(foundAlarm.get());
        }

        logger.error("Failed to find alarm with id {}", id);
        return null;
    }

    @Override
    public AlarmDto update(AlarmDto user) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<AlarmDto> findAll() {
        return null;
    }
}
