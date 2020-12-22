package com.petfeeder.petfeeder.mapper;

import org.mapstruct.Mapper;

import java.util.List;

public interface EntityMapper<V, T> {

    T toDto(V v);

    V toEntity(T t);

    List<T> toDtos(List<V> v);

    List<V> toEntities(List<T> t);

}
