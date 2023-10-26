package com.example.furniture.data.mapper;

public interface EntityMapper <DTO, Entity> {
    Entity toEntity(DTO dto);
}
