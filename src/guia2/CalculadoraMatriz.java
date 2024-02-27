
package guia2;
import java.util.Scanner;


public class CalculadoraMatriz {
  
    public int [][] matriz1;
    public int [][] matriz2;
    public int [][] resultado;

    public void llenarMatriz(int[][] matriz, Scanner scanner) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Ingrese el valor para la fila " + (i+1) + " y columna " + (j+1) + ": ");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    public void suma(){
        if (matriz1.length != matriz2.length || matriz1[0].length != matriz2[0].length) {
            System.out.println("Las matrices deben tener las mismas dimensiones para poder sumarlas.");
            return;
        }
        int filas = matriz1.length;
        int columnas = matriz1[0].length;
        resultado = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
    }
    
   public void producto(){
        if (matriz1[0].length != matriz2.length) {
            System.out.println("El número de columnas de la primera matriz debe ser igual al número de filas de la segunda matriz para poder multiplicarlas.");
            return;
        }
        int filas = matriz1.length;
        int columnas = matriz2[0].length;
        resultado = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                for (int k = 0; k < matriz1[0].length; k++) {
                    resultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }
   }
    public void productoEscalar(int escalar){
        int filas = matriz1.length;
        int columnas = matriz1[0].length;
        resultado = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = escalar * matriz1[i][j];
            }
        }
    }
    public void transpuesta(){
        int filas = matriz1.length;
        int columnas = matriz1[0].length;
        resultado = new int[columnas][filas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[j][i] = matriz1[i][j];
            }
        }
    }
}


    


