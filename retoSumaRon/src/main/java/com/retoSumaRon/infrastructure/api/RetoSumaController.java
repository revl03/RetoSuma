package com.retoSumaRon.infrastructure.api;

import com.retoSumaRon.application.api.RetoSumaService;
import com.retoSumaRon.infrastructure.api.dto.RetoResDto;
import com.retoSumaRon.infrastructure.api.mappers.RetoResDtoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/retosuma")
@RequiredArgsConstructor
public class RetoSumaController {

    private final RetoSumaService service;
    private final RetoResDtoMapper mapper;

    @GetMapping("/suma")
    public ResponseEntity<RetoResDto> suma(
            @RequestParam String num) throws Exception {
            return ResponseEntity.ok(mapper.toDto(service.suma(num)));
    }
}
