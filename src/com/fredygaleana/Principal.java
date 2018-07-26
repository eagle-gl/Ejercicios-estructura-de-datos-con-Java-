package com.fredygaleana;

import java.util.Scanner;

/**
 *
 * @author Fredy Galeana
 */
public class Principal {

    public static void main(String[] args) {
        //objeto de la clase Pila
        Pila pila = new Pila();
        //objeto de la clase Cola
        Cola cola = new Cola();
        //objeto de la clase Lista
        Lista lista = new Lista();

        System.out.println("*****************");

        //bienvenida al menú principal
        System.out.println("Ingrese un numero de acuedo a la opción que desea!!!");
        System.out.println("1:Pila\n2:Cola\n3:Lista");

        //objeto para ingresar datos por teclado
        Scanner entrada = new Scanner(System.in);

        int opcion = entrada.nextInt();
        String nombre;

        //validamos las opciones del menú
        if (opcion <= 3) {
            //opciones del menú principal
            switch (opcion) {

                case 1:
                    while (opcion < 5) {
                        //menú de la Pila
                        System.out.println("Menú de Pila");
                        System.out.println("1:Inserta un nombre\n2:muestra los nombres"
                                + "\n3:comprobar si la lista está vacía\n4:borrar un nombre\n"
                                + "5:salir");
                        opcion = entrada.nextInt();

                        switch (opcion) {
                            case 1://ingresar nombre
                                do {
                                    System.out.println("inserte un nombre");
                                    nombre = entrada.next();
                                    pila.IngresarNombre(nombre);
                                    System.out.println("Para seguir ingresando presione 1, para salir presione cualquier numero1");
                                    opcion = entrada.nextInt();
                                } while (opcion == 1);

                                break;
                            case 2:
                                System.out.println("mostrar nombres");
                                pila.mostrarNombres();
                                break;
                            case 3://verificar si está vacía
                                System.out.println("verificar si la lista está vacíia");
                                pila.estaVacia();
                                break;
                            case 4://borrar  nombre
                                System.out.println("borrar un nomnbre");
                                do {
                                    System.out.println("borrar nombre");

                                    pila.eliminarNombre();
                                    System.out.println("Para seguir borrando presione 1, para salir presione cualquier numero");
                                    opcion = entrada.nextInt();
                                } while (opcion == 1);

                                break;

                        }
                    }

                    break;
                case 2:
                    while (opcion < 5) {
                        //menú de la cola
                        System.out.println("Menú de Cola");
                        System.out.println("1:Inserta un nombre\n2:muestra los nombres"
                                + "\n3:comprobar si la lista está vacía\n4:borrar un nombre\n"
                                + "5:salir");
                        opcion = entrada.nextInt();

                        switch (opcion) {
                            case 1://insertar nombres
                                do {
                                    System.out.println("inserte un nombre");
                                    nombre = entrada.next();
                                    cola.IngresarNombre(nombre);
                                    System.out.println("Para seguir ingresando presione 1, para salir presione cualquier numero1");
                                    opcion = entrada.nextInt();
                                } while (opcion == 1);

                                break;
                            case 2://mostrar nombres
                                System.out.println("mostrar nombres");
                                cola.mostrarNombres();
                                break;
                            case 3://verificar si está vacía
                                System.out.println("verificar si la lista está vacíia");
                                cola.estaVacia();
                                break;
                            case 4: //borrar nombres
                                System.out.println("borrar un nomnbre");
                                do {
                                    System.out.println("borrar nombre");

                                    cola.eliminarNombre();
                                    System.out.println("Para seguir borrando presione 1, para salir presione cualquier numero");
                                    opcion = entrada.nextInt();
                                } while (opcion == 1);

                                break;

                        }
                    }
                    break;
                case 3:
                    while (opcion < 5) {
                        //menú de la lista
                        System.out.println("Menú de Lista");
                        System.out.println("1:Inserta un nombre\n2:muestra los nombres"
                                + "\n3:comprobar si la lista está vacía\n4:borrar un nombre\n"
                                + "5:salir");
                        opcion = entrada.nextInt();

                        switch (opcion) {
                            case 1://insertar nombres
                                do {
                                    System.out.println("inserte un nombre");
                                    nombre = entrada.next();

                                    lista.IngresarNombre(nombre);

                                    System.out.println("Para seguir ingresando presione 1, para salir presione cualquier numero1");
                                    opcion = entrada.nextInt();
                                } while (opcion == 1);

                                break;
                            case 2://mostrar nombres
                                System.out.println("mostrar nombres");
                                lista.mostrarNombres();
                                break;
                            case 3:// verificar si está vacía
                                System.out.println("verificar si la lista está vacíia");
                                lista.estaVacia();
                                break;
                            case 4://eliminar nombre
                                System.out.println("borrar un nomnbre");
                                do {
                                    System.out.println("Indique el indice del nombre a borrar");
                                    opcion = entrada.nextInt();

                                    lista.eliminarNombre(opcion);
                                    System.out.println("Para seguir borrando presione 1, para salir presione cualquier numero");
                                    opcion = entrada.nextInt();
                                } while (opcion == 1);

                                break;

                        }
                    }
                    break;

            }

        } else {
            System.out.println("Esa opción no existe, porfavor ingrese un numero valido");
        }

    }

}
