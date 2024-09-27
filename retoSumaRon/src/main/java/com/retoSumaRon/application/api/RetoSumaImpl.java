package com.retoSumaRon.application.api;

import com.retoSumaRon.domain.exceptions.CaracterException;
import com.retoSumaRon.domain.exceptions.ErrorMessage;
import com.retoSumaRon.domain.exceptions.NegativeException;
import com.retoSumaRon.domain.RetoRes;
import org.springframework.stereotype.Service;

@Service
public class RetoSumaImpl implements RetoSumaService {

    @Override
    public RetoRes suma(String num) throws Exception {
        int suma = 0;
        String cantidad = "";
        String respuesta;
        if (comprobarNegativo(num) && comprobarCaracter(num)){
            for (int i = 0; i < num.length(); i++) {
                char unidad = num.charAt(i);
                cantidad = cantidad + Character.getNumericValue(unidad);
                if (i < num.length() - 1) {
                    cantidad = cantidad + " + ";
                }
                suma = suma + Character.getNumericValue(unidad);
            }
            respuesta = "La suma de las unidades " + cantidad + " es: " + suma;
            return new RetoRes(respuesta);
        }
        return new RetoRes("error ineseperado");
    }



    @Override
    public boolean comprobarNegativo(String numero) throws NegativeException {
        if (numero.startsWith("-")) {
            throw new NegativeException("No se permite la suma de números negativos.");
        }
        return true;
    }

    @Override
    public boolean comprobarCaracter(String numero) throws CaracterException {
        if (!numero.matches("\\d+")) {
            throw new CaracterException("El valor no puede ser sumado. Contiene caracteres no numéricos");
        }
        return true;
    }

}
