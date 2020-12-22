package com.petfeeder.petfeeder.rest;

import com.petfeeder.petfeeder.dto.MachineDto;
import com.petfeeder.petfeeder.service.MachineInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/machine-info")
public class MachineInfoController {

    Logger logger = LoggerFactory.getLogger(MachineInfoController.class);

    private MachineInfoService machineInfoService;

    public MachineInfoController(MachineInfoService machineInfoService) {
        this.machineInfoService = machineInfoService;
    }

    @PostMapping
    public MachineDto createMachine(@RequestBody MachineDto machineDto) {
        return machineInfoService.createMachine(machineDto);
    }

    @GetMapping("/{id}")
    public MachineDto findById(@PathVariable(value = "id") Long id) {
        return machineInfoService.findById(id);
    }

    @PutMapping()
    public MachineDto update(@RequestBody MachineDto machineDto) {
        return machineInfoService.update(machineDto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable(value = "id") Long id) {
        machineInfoService.delete(id);
    }

    @GetMapping()
    public List<MachineDto> findAll() {
        return machineInfoService.findAll();
    }
}
