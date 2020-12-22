package com.petfeeder.petfeeder.service;

import com.petfeeder.petfeeder.dto.MachineDto;

import java.util.List;

public interface MachineInfoService {
    MachineDto createMachine(MachineDto MachineDto);

    MachineDto findById(Long id);

    MachineDto update(MachineDto user);

    void delete(Long id);

    List<MachineDto> findAll();
}
