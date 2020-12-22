package com.petfeeder.petfeeder.mapper;

import com.petfeeder.petfeeder.domain.Machine;
import com.petfeeder.petfeeder.dto.MachineDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MachineMapper extends EntityMapper<Machine, MachineDto> {
}
