package com.fredygaleana;

import java.util.ArrayList;

public class Cola {

    private ArrayList<String> nombres;

    public Cola() {
        nombres = new ArrayList<>();
    }

    public void IngresarNombre(String nombre) {

        nombres.add(nombre);

    }

    public void eliminarNombre() {

        if (!nombres.isEmpty()) {
            String aux = nombres.get(nombres.size() - nombres.size());
            // System.out.println(aux);
            nombres.remove(aux);

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
