package com.petfeeder.petfeeder.mapper;

import com.petfeeder.petfeeder.domain.Alarm;
import com.petfeeder.petfeeder.domain.User;
import com.petfeeder.petfeeder.dto.AlarmDto;
import com.petfeeder.petfeeder.dto.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper extends EntityMapper<User, UserDto> {

    @Override
    public UserDto toDto(User user);

    @Override
    public User toEntity(UserDto userDto);
}
