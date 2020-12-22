package com.petfeeder.petfeeder.dto;


import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.time.DayOfWeek;
import java.util.Objects;
import java.util.Set;

public class AlarmDto {

    private Long id;

    private Timestamp date;

    private Boolean isActive;

    @NotNull
    private int portionSize;

    private Boolean repeat;

    private Set<DayOfWeek> dayOfWeek;

    @NotNull
    private Long machineId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public int getPortionSize() {
        return portionSize;
    }

    public void setPortionSize(int portionSize) {
        this.portionSize = portionSize;
    }

    public Boolean getRepeat() {
        return repeat;
    }

    public void setRepeat(Boolean repeat) {
        this.repeat = repeat;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Set<DayOfWeek> getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(Set<DayOfWeek> dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public Long getMachineId() {
        return machineId;
    }

    public void setMachineId(Long machineId) {
        this.machineId = machineId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlarmDto alarmDto = (AlarmDto) o;
        return Objects.equals(id, alarmDto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
