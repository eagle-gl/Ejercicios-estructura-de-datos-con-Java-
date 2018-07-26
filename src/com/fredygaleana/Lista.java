/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fredygaleana;

import java.util.ArrayList;

/**
 *
 * @author eagle-g
 */
public class Lista {

    private ArrayList<String> nombres;

    public Lista() {
        nombres = new ArrayList();
    }

    public void IngresarNombre(String nombre) {

        nombres.add(nombre);

    }

    public void eliminarNombre(int indice) {

        if (!nombres.isEmpty()) {

            try {
                String aux = nombres.get(indice);
                System.out.println("Nombre " + aux + " borrado");
                nombres.remove(aux);

            } catch (Exception e) {

                System.out.println("El índice indicado no existe");

            }

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
