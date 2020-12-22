package com.petfeeder.petfeeder.mapper;

import com.petfeeder.petfeeder.domain.Setting;
import com.petfeeder.petfeeder.dto.SettingDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SettingMapper extends EntityMapper<Setting, SettingDto> {
}
