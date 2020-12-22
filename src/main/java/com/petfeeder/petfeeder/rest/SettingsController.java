package com.petfeeder.petfeeder.rest;

import com.petfeeder.petfeeder.dto.SettingDto;
import com.petfeeder.petfeeder.service.SettingsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/settings")
public class SettingsController {

    Logger logger = LoggerFactory.getLogger(SettingsController.class);

    private SettingsService settingsService;

    public SettingsController(SettingsService settingsService) {
        this.settingsService = settingsService;
    }


    @PostMapping
    public SettingDto createMachine(@RequestBody SettingDto settingDto) {
        return settingsService.createSetting(settingDto);
    }

    @GetMapping("/{id}")
    public SettingDto findById(@PathVariable(value = "id") Long id) {
        return settingsService.findById(id);
    }

    @PutMapping()
    public SettingDto update(@RequestBody SettingDto settingDto) {
        return settingsService.update(settingDto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable(value = "id") Long id) {
        settingsService.delete(id);
    }

    @GetMapping()
    public List<SettingDto> findAll() {
        return settingsService.findAll();
    }
}
