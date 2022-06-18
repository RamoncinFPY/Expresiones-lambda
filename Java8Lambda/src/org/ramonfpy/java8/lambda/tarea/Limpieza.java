package org.ramonfpy.java8.lambda.tarea;

public class Limpieza {

    public String limpiar (String frase, EliminarEspacioSigno lambda) {

        return lambda.fraseLimpia(frase);

    }
}
