import manejadorArreglos.*;
// import busquedaternaria.BusquedaTernaria;
import java.util.Scanner;
import algoritmosBusqueda.*;

import java.util.Date;
import java.util.Arrays;

/**
 *
 * @author Eyder, Cristhian, Franco
 */

public class main {
    public static void main(String[] args) {
        int arreglo[];
        int opcionOrden = 0;
        int opcionAlgoritmo = 0;
        int longitud = 0;
        int numero = 0;
        int resultado = 0;
        double tiempo1;
        double tiempo2;
        String tiempoTotal = "";

        System.out.println(
                "Escoja el algoritmo:\n0-Algoritmo iterativo\n1-Algoritmo busqueda binaria\n2-Algoritmo busqueda ternaria");
        Scanner leer = new Scanner(System.in);
        opcionAlgoritmo = leer.nextInt();

        switch (opcionAlgoritmo) {
            case 0: {

                System.out.println("Escoja el orden del arreglo\n0-Ordenado ascendentemente\n1-Aleatorio");
                opcionOrden = leer.nextInt();

                if (opcionOrden == 0 || opcionOrden == 1) {

                    if (opcionOrden == 0) {
                        System.out.println("Escoja el tamaño del arreglo");
                        leer = new Scanner(System.in);
                        longitud = leer.nextInt();
                        arreglo = new int[longitud];
                        arreglo = ManejadorArreglos.arregloOrdenado(arreglo);
                        System.out.println(Arrays.toString(arreglo));
                        System.out.println("Escoja el numero a buscar");
                        numero = leer.nextInt();
                        // ACA
                        tiempo1 = new Date().getTime();
                        resultado = AlgoritmosBusqueda.busquedaRecursiva(arreglo, numero);
                        tiempo2 = new Date().getTime();
                        tiempoTotal = String.valueOf((tiempo2 - tiempo1) / 1000);
                        System.out.println("El numero " + numero + " fue encontrado en la posición " + resultado
                                + " en " + tiempoTotal + " segundos");
                    } else {
                        System.out.println("Escoja el tamaño del arreglo");
                        leer = new Scanner(System.in);
                        longitud = leer.nextInt();
                        arreglo = new int[longitud];
                        arreglo = ManejadorArreglos.arregloAleatorio(arreglo);
                        System.out.println(Arrays.toString(arreglo));
                        System.out.println("Escoja el numero a buscar");
                        numero = leer.nextInt();
                        // ACA
                        tiempo1 = new Date().getTime();
                        resultado = AlgoritmosBusqueda.busquedaRecursiva(arreglo, numero);
                        tiempo2 = new Date().getTime();
                        tiempoTotal = String.valueOf((tiempo2 - tiempo1) / 1000);
                        System.out.println("El numero " + numero + " fue encontrado en la posición " + resultado
                                + " en " + tiempoTotal + " segundos");
                    }

                } else {
                    System.out.println("Numero erroneo");
                }
                break;
            }

            case 1: {
                System.out.println("Escoja el orden del arreglo\n0-Ordenado ascendentemente\n1-Aleatorio");
                opcionOrden = leer.nextInt();

                if (opcionOrden == 0 || opcionOrden == 1) {
                    if (opcionOrden == 0) {
                        System.out.println("Escoja el tamaño del arreglo");
                        leer = new Scanner(System.in);
                        longitud = leer.nextInt();
                        arreglo = new int[longitud];
                        arreglo = ManejadorArreglos.arregloOrdenado(arreglo);
                        System.out.println(Arrays.toString(arreglo));
                        System.out.println("Escoja el numero a buscar");
                        numero = leer.nextInt();
                        // ACA
                        tiempo1 = new Date().getTime();
                        resultado = AlgoritmosBusqueda.busquedaBinaria(arreglo, 0, arreglo.length - 1, numero);
                        tiempo2 = new Date().getTime();
                        tiempoTotal = String.valueOf((tiempo2 - tiempo1) / 1000);
                        System.out.println("El numero " + numero + " fue encontrado en la posición " + resultado
                                + " en " + tiempoTotal + " segundos");
                    } else {
                        System.out.println("Escoja el tamaño del arreglo");
                        leer = new Scanner(System.in);
                        longitud = leer.nextInt();
                        arreglo = new int[longitud];
                        arreglo = ManejadorArreglos.arregloAleatorio(arreglo);
                        System.out.println(Arrays.toString(arreglo));
                        System.out.println("Escoja el numero a buscar");
                        numero = leer.nextInt();
                        // ACA
                        tiempo1 = new Date().getTime();
                        resultado = AlgoritmosBusqueda.busquedaBinariaAleatoria(arreglo, 0, arreglo.length - 1, numero);
                        tiempo2 = new Date().getTime();
                        tiempoTotal = String.valueOf((tiempo2 - tiempo1) / 1000);
                        System.out.println("El numero " + numero + " fue encontrado en la posición " + resultado
                                + " en " + tiempoTotal + " segundos");
                    }
                } else {
                    System.out.println("Numero erroneo");
                }

                break;
            }

            case 2: {
                System.out.println("Escoja el orden del arreglo\n0-Ordenado ascendentemente\n1-Aleatorio");
                opcionOrden = leer.nextInt();

                if (opcionOrden == 0 || opcionOrden == 1) {
                    if (opcionOrden == 0) {
                        System.out.println("Escoja el tamaño del arreglo");
                        leer = new Scanner(System.in);
                        longitud = leer.nextInt();
                        arreglo = new int[longitud];
                        arreglo = ManejadorArreglos.arregloOrdenado(arreglo);
                        System.out.println(Arrays.toString(arreglo));
                        System.out.println("Escoja el numero a buscar");
                        numero = leer.nextInt();
                        // ACA
                        tiempo1 = new Date().getTime();
                        resultado = AlgoritmosBusqueda.busquedaTernaria(arreglo, 0, arreglo.length - 1, numero);
                        tiempo2 = new Date().getTime();
                        tiempoTotal = String.valueOf((tiempo2 - tiempo1) / 1000);
                        System.out.println("El numero " + numero + " fue encontrado en la posición " + resultado
                                + " en " + tiempoTotal + " segundos");

                    } else {
                        System.out.println("Escoja el tamaño del arreglo");
                        leer = new Scanner(System.in);
                        longitud = leer.nextInt();
                        arreglo = new int[longitud];
                        arreglo = ManejadorArreglos.arregloAleatorio(arreglo);
                        System.out.println(Arrays.toString(arreglo));
                        System.out.println("Escoja el numero a buscar");
                        numero = leer.nextInt();
                        // ACA
                        tiempo1 = new Date().getTime();
                        resultado = AlgoritmosBusqueda.busquedaTernariaAleatoria(arreglo, 0, arreglo.length - 1, numero);
                        tiempo2 = new Date().getTime();
                        tiempoTotal = String.valueOf((tiempo2 - tiempo1) / 1000);
                        System.out.println("El numero " + numero + " fue encontrado en la posición " + resultado
                                + " en " + tiempoTotal + " segundos");

                    }
                } else {
                    System.out.println("Numero erroneo");
                }

                break;
            }

            default: {
                System.out.println("Numero erroneo");
            }

        }

    }
}
