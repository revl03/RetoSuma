package com.retoSumaRon.infrastructure.api.mappers;

import com.retoSumaRon.domain.RetoRes;
import com.retoSumaRon.infrastructure.api.dto.RetoResDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RetoResDtoMapper {

    RetoResDto toDto(RetoRes domain);
}
