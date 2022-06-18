package org.ramonfpy.java8.lambda.tarea;

public class Aplicacion {
    public static void main(String[] args) {

        EliminarEspacioSigno eliminarEspacioSigno = frase -> {
             frase = frase.replace(" ", "").
                    replace(",", "").
                    replace(".", "").
                    toUpperCase();
             return frase;
        };

        Limpieza limpieza = new Limpieza();

       // System.out.println(eliminarEspacioSigno.fraseLimpia("e,,,st.a. es. una, prueba. ok."));

        String resultado = limpieza.limpiar("a,e.i      o,.    u.",eliminarEspacioSigno);
        System.out.println("Frase limpia de todo y en mayúsculas= " + resultado);
    }
}
