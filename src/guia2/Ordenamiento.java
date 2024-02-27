

package guia2;

import java.util.Random;

public class Ordenamiento {

    public static void burbuja(double[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    double temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }

    public static void insercion(double[] arreglo) {
        int n = arreglo.length;
        for (int i = 1; i < n; ++i) {
            double key = arreglo[i];
            int j = i - 1;

            while (j >= 0 && arreglo[j] > key) {
                arreglo[j + 1] = arreglo[j];
                j = j - 1;
            }
            arreglo[j + 1] = key;
        }
    }

    public static void seleccion(double[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arreglo[j] < arreglo[min_idx])
                    min_idx = j;
            double temp = arreglo[min_idx];
            arreglo[min_idx] = arreglo[i];
            arreglo[i] = temp;
        }
    }

    public static void mergesort(double[] arreglo, int inicio, int fin) {
        if (inicio < fin) {
            int mitad = (inicio + fin) / 2;
            mergesort(arreglo, inicio, mitad);
            mergesort(arreglo, mitad + 1, fin);
            merge(arreglo, inicio, mitad, fin);
        }
    }

    private static void merge(double[] arreglo, int inicio, int mitad, int fin) {
        int n1 = mitad - inicio + 1;
        int n2 = fin - mitad;

        double[] L = new double[n1];
        double[] R = new double[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arreglo[inicio + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arreglo[mitad + 1 + j];

        int i = 0, j = 0;
        int k = inicio;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arreglo[k] = L[i];
                i++;
            } else {
                arreglo[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arreglo[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arreglo[k] = R[j];
            j++;
            k++;
        }
    }
}

