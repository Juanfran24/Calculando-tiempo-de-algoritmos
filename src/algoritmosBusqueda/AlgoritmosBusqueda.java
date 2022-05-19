/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmosBusqueda;

/**
 *
 * @author Eyder, Cristhian, Franco
 */

public class AlgoritmosBusqueda {

    /**
     * @param args the command line arguments
     */

    // revisar
    public static int busquedaRecursiva(int arreglo[], int numero) {
        int resultado = 0;

        for (int i = 0; i < arreglo.length; i++) {
            if(arreglo[i] == numero){
                resultado = i;
            }
        }

        return resultado;

    }

    public static int busquedaBinariaOrdenada(int arreglo[], int numero) {
        int resultado = -1;
        int primerNum = 0;
        int indexMitad = 0;
        int numeroEnMitad = 0;
        int ultimoNum = arreglo.length - 1;

        while (primerNum <= ultimoNum) {
            indexMitad = primerNum + (ultimoNum - primerNum) / 2;
            numeroEnMitad = arreglo[indexMitad];

            if (numeroEnMitad == numero) {
                resultado = indexMitad;
            }

            if (numeroEnMitad < numero) {
                primerNum = indexMitad + 1;
            } else {
                ultimoNum = indexMitad - 1;
            }
        }

        return resultado;
    }


    //============================  PRUEBA BUSQUEDA BINARIA COMO DIJO ALMACHE (NO FUNCIONA) ================================
    // public static int busquedaBinaria(int[] arreglo, int primerNum, int ultimoNum, int numero) {
    //     int resultado = -1;
    //     int indexMitad = (arreglo.length / 2);

    //     if (arreglo.length == 0) {
    //         return resultado;
    //     }

    //     if (arreglo[primerNum] == numero) {
    //         resultado = 0;
    //     }

    //     busquedaBinaria(arreglo, primerNum, indexMitad, numero);
    //     busquedaBinaria(arreglo, indexMitad + 1, ultimoNum, numero);

    //     return resultado;
    // }

    public static int busquedaTernaria(int arreglo[], int numero) {
        int resultado = -1;
        int primerNum = 0;
        int indexMitad1 = 0;
        int indexMitad2 = 0;
        int numeroEnMitad1 = 0;
        int numeroEnMitad2 = 0;
        int ultimoNum = arreglo.length - 1;

        while (primerNum <= ultimoNum) {
            indexMitad1 = primerNum + (ultimoNum - primerNum) / 3;
            indexMitad2 = ultimoNum - (ultimoNum - primerNum) / 3;
            numeroEnMitad1 = arreglo[indexMitad1];
            numeroEnMitad2 = arreglo[indexMitad2];

            if (numeroEnMitad1 == numero) {
                resultado = indexMitad1;
            }

            if (numeroEnMitad2 == numero) {
                resultado = indexMitad2;
            }

            if (numeroEnMitad1 > numero) {
                ultimoNum = indexMitad1 - 1;

            } else if (numeroEnMitad2 < numero) {
                primerNum = indexMitad2 + 1;

            } else {
                primerNum = indexMitad1 + 1;
                ultimoNum = indexMitad2 - 1;
            }
        }

        return resultado;
    }

}
