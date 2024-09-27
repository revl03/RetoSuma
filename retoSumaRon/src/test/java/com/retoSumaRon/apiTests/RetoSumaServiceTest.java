package com.retoSumaRon.apiTests;

import com.retoSumaRon.application.api.RetoSumaService;
import com.retoSumaRon.domain.RetoRes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RetoSumaServiceTest{

    @Autowired
    private RetoSumaService service;

    @Test
    void sumaDe1numero() throws Exception {
        String numero="1";

        RetoRes resultadoEsp= new RetoRes("La suma de las unidades 1 es: 1");
        RetoRes resultadoObt= service.suma(numero);

        Assertions.assertEquals(resultadoEsp,resultadoObt);
    }
}
