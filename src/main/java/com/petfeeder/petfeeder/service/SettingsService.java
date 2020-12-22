package com.petfeeder.petfeeder.service;

import com.petfeeder.petfeeder.dto.SettingDto;

import java.util.List;

public interface SettingsService {

    SettingDto createSetting(SettingDto SettingDto);

    SettingDto findById(Long id);

    SettingDto update(SettingDto user);

    void delete(Long id);

    List<SettingDto> findAll();
}
