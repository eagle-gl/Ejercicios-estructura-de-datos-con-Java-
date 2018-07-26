package com.fredygaleana;

import java.util.ArrayList;

/**
 *
 * @author Fredy Galeana
 */
public class Pila {

    private ArrayList<String> nombres;

    public Pila() {
        nombres = new ArrayList<>();
    }

    public void IngresarNombre(String nombre) {

        nombres.add(nombre);

    }

    public void eliminarNombre() {

        if (!nombres.isEmpty()) {

            nombres.get(nombres.size() - 1);
            nombres.remove(nombres.size() - 1);

        } else {
            System.out.println("No hay nada que borrar");
        }

    }

    public void estaVacia() {
        if (nombres.isEmpty()) {
            System.out.println("La lista está vacía");
        } else {
            System.out.println("La lista no está vacía");
        }

    }

    public void mostrarNombres() {

        if (!nombres.isEmpty()) {
            System.out.println(nombres);
        } else {

            System.out.println("No hay nada que mostrar, la lista está vacía");
        }

    }
}
