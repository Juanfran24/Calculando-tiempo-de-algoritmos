import manejadorArreglos.*;
// import busquedaternaria.BusquedaTernaria;
import java.util.Scanner;
import algoritmosBusqueda.*;
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
        double tiempoInicial = 0;
        double tiempoFinal = 0;
        double tiempoTotal = 0;

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
                        tiempoInicial = System.currentTimeMillis();
                        resultado = AlgoritmosBusqueda.busquedaRecursiva(arreglo, numero, 0);
                        tiempoFinal = System.currentTimeMillis();
                        tiempoTotal = tiempoFinal - tiempoInicial;
                        System.out.println("El numero " + numero + " fue encontrado en la posición " + resultado
                                + " en " + tiempoTotal);
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
                        tiempoInicial = System.currentTimeMillis();
                        resultado = AlgoritmosBusqueda.busquedaRecursiva(arreglo, numero, 0);
                        tiempoFinal = System.currentTimeMillis();
                        tiempoTotal = tiempoFinal - tiempoInicial;
                        System.out.println("El numero " + numero + " fue encontrado en la posición " + resultado
                                + " en " + tiempoTotal);
                    }

                } else {
                    System.out.println("Numero erroneo");
                }
                break;
            }

            case 1: {
                System.out.println("Escoja el tamaño del arreglo");
                leer = new Scanner(System.in);
                longitud = leer.nextInt();
                arreglo = new int[longitud];
                arreglo = ManejadorArreglos.arregloOrdenado(arreglo);
                System.out.println(Arrays.toString(arreglo));
                System.out.println("Escoja el numero a buscar");
                numero = leer.nextInt();
                // ACA
                tiempoInicial = System.currentTimeMillis();
                resultado = AlgoritmosBusqueda.busquedaBinaria(arreglo, numero);
                tiempoFinal = System.currentTimeMillis();
                tiempoTotal = tiempoFinal - tiempoInicial;
                System.out.println("El numero " + numero + " fue encontrado en la posición " + resultado
                        + " en " + tiempoTotal);

                break;
            }

            case 2: {
                System.out.println("Escoja el tamaño del arreglo");
                leer = new Scanner(System.in);
                longitud = leer.nextInt();
                arreglo = new int[longitud];
                arreglo = ManejadorArreglos.arregloOrdenado(arreglo);
                System.out.println(Arrays.toString(arreglo));
                System.out.println("Escoja el numero a buscar");
                numero = leer.nextInt();
                // ACA
                tiempoInicial = System.currentTimeMillis();
                resultado = AlgoritmosBusqueda.busquedaTernaria(arreglo, numero);
                tiempoFinal = System.currentTimeMillis();
                tiempoTotal = tiempoFinal - tiempoInicial;
                System.out.println("El numero " + numero + " fue encontrado en la posición " + resultado
                        + " en " + tiempoTotal);

                break;
            }

            default: {
                System.out.println("Numero erroneo");
            }

        }

    }
}
