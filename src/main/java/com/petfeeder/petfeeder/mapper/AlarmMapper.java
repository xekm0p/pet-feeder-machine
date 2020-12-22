package com.petfeeder.petfeeder.mapper;

import com.petfeeder.petfeeder.domain.Alarm;
import com.petfeeder.petfeeder.dto.AlarmDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import javax.persistence.ManyToOne;

@Mapper(componentModel = "spring")
public interface AlarmMapper  extends EntityMapper<Alarm, AlarmDto>{

    @Override
    @Mapping(target="machineId", source ="machine.id")
    public AlarmDto toDto(Alarm alarm);

    @Override
    @Mapping(target="machine.id", source ="machineId")
    public Alarm toEntity(AlarmDto alarmDto);

}
