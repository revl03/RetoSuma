package com.retoSumaRon.infrastructure.api.mappers;

import com.retoSumaRon.domain.RetoRes;
import com.retoSumaRon.infrastructure.api.dto.RetoResDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-09-27T14:48:12+0200",
    comments = "version: 1.6.0, compiler: javac, environment: Java 17.0.11 (OpenLogic)"
)
@Component
public class RetoResDtoMapperImpl implements RetoResDtoMapper {

    @Override
    public RetoResDto toDto(RetoRes domain) {
        if ( domain == null ) {
            return null;
        }

        RetoResDto retoResDto = new RetoResDto();

        retoResDto.setResultado( domain.getResultado() );

        return retoResDto;
    }
}
