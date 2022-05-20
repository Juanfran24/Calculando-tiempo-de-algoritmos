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

    public static int busquedaRecursiva(int arreglo[], int numero) {
        int resultado = 0;

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == numero) {
                resultado = i;
            }
        }

        return resultado;

    }

    public static int busquedaBinaria(int arreglo[], int primerNum, int ultimoNum,int numero) {
        int resultado = -1;
        int indexMitad = 0;
        int numeroEnMitad = 0;

        if (ultimoNum >= primerNum) {
            indexMitad = primerNum + (ultimoNum - primerNum) / 2;
            numeroEnMitad = arreglo[indexMitad];

            if (numeroEnMitad == numero) {
                return resultado = indexMitad;
            }

            if (numeroEnMitad > numero) {
                return busquedaBinaria(arreglo, primerNum, indexMitad - 1, numero);
            } else {
                return busquedaBinaria(arreglo, indexMitad + 1, ultimoNum, numero);
            }
            
        }
        
        return resultado;
    }

    public static int busquedaTernaria(int arreglo[], int primerNum, int ultimoNum,int numero) {
        int resultado = -1;
        int indexMitad1 = 0;
        int indexMitad2 = 0;
        int numeroEnMitad1 = 0;
        int numeroEnMitad2 = 0;

        if (primerNum <= ultimoNum) {
            indexMitad1 = primerNum + (ultimoNum - primerNum) / 3;
            indexMitad2 = ultimoNum - (ultimoNum - primerNum) / 3;
            numeroEnMitad1 = arreglo[indexMitad1];
            numeroEnMitad2 = arreglo[indexMitad2];

            if (numeroEnMitad1 == numero) {
                return resultado = indexMitad1;
            }

            if (numeroEnMitad2 == numero) {
                return resultado = indexMitad2;
            }

            if (numeroEnMitad1 > numero) {
                return busquedaTernaria(arreglo, primerNum, indexMitad1 - 1, numero);

            } else if (numeroEnMitad2 < numero) {
                return busquedaTernaria(arreglo, indexMitad2 + 1, ultimoNum, numero);

            } else {
                return busquedaTernaria(arreglo, indexMitad1 + 1, indexMitad2 - 1, numero);
            }
        }

        return resultado;
    }

}
