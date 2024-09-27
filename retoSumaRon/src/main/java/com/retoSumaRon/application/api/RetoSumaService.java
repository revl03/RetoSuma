package com.retoSumaRon.application.api;

import com.retoSumaRon.domain.RetoRes;
import com.retoSumaRon.domain.exceptions.CaracterException;
import com.retoSumaRon.domain.exceptions.NegativeException;

public interface RetoSumaService {
    RetoRes suma(String num) throws Exception;
    boolean comprobarNegativo(String numero) throws NegativeException;
    boolean comprobarCaracter(String numero) throws CaracterException;

}
