package manejadorArreglos;

import java.util.Random;

/**
 *
 * @author Eyder, Cristhian, Franco
 */

public class ManejadorArreglos {

    static Random rnd = new Random();

    public static int[] arregloOrdenado(int[] arreglo) {

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = i + 1;
        }

        return arreglo;
    }

    public static int[] arregloAleatorio(int[] arreglo) {
        int numAleatorio = 0;

        for (int i = 0; i < arreglo.length; i++) {
            numAleatorio = rnd.nextInt(arreglo.length - 1);
            arreglo[i] = numAleatorio;
        }

        return arreglo;
    }

}
