
package guia2;

import java.util.Scanner;


public class Menu {

   
     
    public static void main(String[] args) {
       CalculadoraMatriz matriz= new CalculadoraMatriz(); 
     Scanner ingreso = new Scanner(System.in);

     int a,b;
     
    int opcion;
    do {
      System.out.println("Bienvenido al menu de inicio");
      System.out.println("Seleccione una opcion:");
      System.out.println("1. Calculadora de Matricez");
      System.out.println("2. Tabla de ordenamiento");
      System.out.println("3. Interfaz");
      System.out.println("4. Salir");
      
       opcion = ingreso.nextInt();
      if (opcion < 1 || opcion > 4) {
        System.out.println("Opcion invalida. Intente de nuevo.");
      } else { switch (opcion) {
          case 1: 
            System.out.println("Bienvenido a la calculadora de matrices");
            System.out.println("Seleccione una opcion:");
            System.out.println("1. Suma de matricez");
            System.out.println("2. producto de matricez");
            System.out.println("3. producto de un escalar con una matriz");
            System.out.println("4. Transpuesta de matricez");
            System.out.println("5. salir");
            int opcionCalculadora = ingreso.nextInt();
            if(opcionCalculadora <1 || opcionCalculadora > 5 ){
             System.out.println("Opcion invalida. Intente de nuevo.");       
            }
         else { switch(opcionCalculadora){
        case 1:
            System.out.print("Ingrese el numero de filas de la matriz 1: ");
            a= ingreso.nextInt();
            System.out.print("Ingrese el numero de columnas de la matriz 1: ");
            b= ingreso.nextInt();
            matriz.matriz1 = new int[a][b];
            matriz.llenarMatriz(matriz.matriz1, ingreso);
            System.out.print("Ingrese el numero de filas de la matriz 2: ");
            a= ingreso.nextInt();
            System.out.print("Ingrese el numero de columnas de la matriz 2: ");
            b= ingreso.nextInt();
            matriz.matriz2 = new int[a][b]; 
            matriz.llenarMatriz(matriz.matriz2, ingreso);
            matriz.suma();
            System.out.println("La suma de las matrices es: ");
            for (int i = 0; i < matriz.resultado.length; i++) {
            for (int j = 0; j < matriz.resultado[0].length; j++) {
            System.out.print(matriz.resultado[i][j] + " ");
             }
            System.out.println();
            }
            break;
             case 2:
                 
            System.out.print("Ingrese el numero de filas de la matriz 1: ");
            a= ingreso.nextInt();
            System.out.print("Ingrese el numero de columnas de la matriz 1: ");
            b= ingreso.nextInt();
            matriz.matriz1 = new int[a][b];
            matriz.llenarMatriz(matriz.matriz1, ingreso);
            System.out.print("Ingrese el numero de filas de la matriz 2: ");
            a= ingreso.nextInt();
            System.out.print("Ingrese el numero de columnas de la matriz 2: ");
            b= ingreso.nextInt();
            matriz.matriz2 = new int[a][b]; 
            matriz.llenarMatriz(matriz.matriz2, ingreso);
            matriz.producto();
            System.out.println("El producto de las matrices es: ");
            for (int i = 0; i < matriz.resultado.length; i++) {
            for (int j = 0; j < matriz.resultado[0].length; j++) {
            System.out.print(matriz.resultado[i][j] + " ");
                }
            System.out.println();
                }
                 break;
             case 3:
            System.out.print("Ingrese el numero de filas de la matriz: ");
            a= ingreso.nextInt();
            System.out.print("Ingrese el numero de columnas de la matriz: ");
            b= ingreso.nextInt();
            matriz.matriz1 = new int[a][b];
            matriz.llenarMatriz(matriz.matriz1, ingreso);
            System.out.print("Ingrese el escalar: ");
            int escalar = ingreso.nextInt();
            matriz.productoEscalar(escalar);
            System.out.println("El producto del escalar por la matriz es: ");
            for (int i = 0; i < matriz.resultado.length; i++) {
            for (int j = 0; j < matriz.resultado[0].length; j++) {
            System.out.print(matriz.resultado[i][j] + " ");
            }
            System.out.println();
            }
                 break;
             case 4:
            System.out.print("Ingrese el numero de filas de la matriz: ");
            a= ingreso.nextInt();
            System.out.print("Ingrese el numero de columnas de la matriz: ");
            b= ingreso.nextInt();
            matriz.matriz1 = new int[a][b];
            matriz.llenarMatriz(matriz.matriz1, ingreso);
            matriz.transpuesta();
            System.out.println("La transpuesta de la matriz es: ");
            for (int i = 0; i < matriz.resultado.length; i++) {
            for (int j = 0; j < matriz.resultado[0].length; j++) {
            System.out.print(matriz.resultado[i][j] + " ");
                    }
            System.out.println();
            }
                break;  
             case 5:
                 opcionCalculadora=5;
                 break;
         }
         } while (opcionCalculadora !=5);
      
            break;
            case 2:
          System.out.println("Bienvenido al metodo de ordenamiento");
            System.out.println("Seleccione una metodo de ordenamiento:");
            System.out.println("1. 100");
            System.out.println("2. 500");
            System.out.println("3. 1000");
            System.out.println("4. 5000");
            System.out.println("5. 10000");
            System.out.println("6. salir");
            int opcionOrdenamiento = ingreso.nextInt();
            if(opcionOrdenamiento <1 || opcionOrdenamiento > 6 ){
             System.out.println("Opcion invalida. Intente de nuevo.");       
           } else {
                        int tamano = 0;
            switch (opcionOrdenamiento) {
            case 1:
                tamano = 100;
                double[] arreglo100 = generarArregloAleatorio(tamano);
                long tiempoInicio100, tiempoFin100;
                
               
                tiempoInicio100 = System.nanoTime();
                Ordenamiento.burbuja(arreglo100);
                tiempoFin100 = System.nanoTime();
                System.out.println("Tiempo de burbuja para 100 elementos: "+ (tiempoFin100 - tiempoInicio100) + " nanosegundos");
               
                tiempoInicio100 = System.nanoTime();
                Ordenamiento.insercion(arreglo100);
                tiempoFin100 = System.nanoTime();
                System.out.println("Tiempo de insercion para 100 elementos: " + (tiempoFin100 - tiempoInicio100) + " nanosegundos");
           
                tiempoInicio100 = System.nanoTime();
                Ordenamiento.seleccion(arreglo100);
                tiempoFin100 = System.nanoTime();
                System.out.println("Tiempo de seleccion para 100 elementos: "+ (tiempoFin100 - tiempoInicio100) + " nanosegundos");
                
                tiempoInicio100 = System.nanoTime();
                Ordenamiento.mergesort(arreglo100, 0, arreglo100.length - 1);
                tiempoFin100 = System.nanoTime();
                System.out.println("Tiempo de mergesort para 100 elementos: "+ (tiempoFin100 - tiempoInicio100) + " nanosegundos");
                break;
            case 2:
                tamano = 500;
                double[] arreglo500 = generarArregloAleatorio(tamano);
                long tiempoInicio500, tiempoFin500;
                
                tiempoInicio500 = System.nanoTime();
                Ordenamiento.burbuja(arreglo500);
                tiempoFin500 = System.nanoTime();
                System.out.println("Tiempo de burbuja para 500 elementos: "+ (tiempoFin500 - tiempoInicio500) + " nanosegundos");
               
                tiempoInicio500 = System.nanoTime();
                Ordenamiento.insercion(arreglo500);
                tiempoFin500 = System.nanoTime();
                System.out.println("Tiempo de insercion para 500 elementos: " + (tiempoFin500 - tiempoInicio500) + " nanosegundos");
           
                tiempoInicio500 = System.nanoTime();
                Ordenamiento.seleccion(arreglo500);
                tiempoFin500 = System.nanoTime();
                System.out.println("Tiempo de seleccion para 500 elementos: "+ (tiempoFin500 - tiempoInicio500) + " nanosegundos");
                
                tiempoInicio500 = System.nanoTime();
                Ordenamiento.mergesort(arreglo500, 0, arreglo500.length - 1);
                tiempoFin500 = System.nanoTime();
                System.out.println("Tiempo de mergesort para 500 elementos: "+ (tiempoFin500 - tiempoInicio500) + " nanosegundos");
                break;
            case 3:
                tamano = 1000;
                double[] arreglo1000 = generarArregloAleatorio(tamano);
                long tiempoInicio1000, tiempoFin1000;
                
               
                tiempoInicio1000 = System.nanoTime();
                Ordenamiento.burbuja(arreglo1000);
                tiempoFin1000 = System.nanoTime();
                System.out.println("Tiempo de burbuja para 1000 elementos: "+ (tiempoFin1000 - tiempoInicio1000) + " nanosegundos");
               
                tiempoInicio1000 = System.nanoTime();
                Ordenamiento.insercion(arreglo1000);
                tiempoFin1000 = System.nanoTime();
                System.out.println("Tiempo de insercion para 1000 elementos: " + (tiempoFin1000 - tiempoInicio1000) + " nanosegundos");
           
                tiempoInicio1000 = System.nanoTime();
                Ordenamiento.seleccion(arreglo1000);
                tiempoFin1000 = System.nanoTime();
                System.out.println("Tiempo de seleccion para 1000 elementos: "+ (tiempoFin1000 - tiempoInicio1000) + " nanosegundos");
                
                tiempoInicio1000 = System.nanoTime();
                Ordenamiento.mergesort(arreglo1000, 0, arreglo1000.length - 1);
                tiempoFin1000 = System.nanoTime();
                System.out.println("Tiempo de mergesort para 1000 elementos: "+ (tiempoFin1000 - tiempoInicio1000) + " nanosegundos");
                break;
            case 4:
                tamano = 5000;
                double[] arreglo5000 = generarArregloAleatorio(tamano);
                long tiempoInicio5000, tiempoFin5000;
                
                tiempoInicio5000 = System.nanoTime();
                Ordenamiento.burbuja(arreglo5000);
                tiempoFin5000 = System.nanoTime();
                System.out.println("Tiempo de burbuja para 5000 elementos: "+ (tiempoFin5000 - tiempoInicio5000) + " nanosegundos");
               
                tiempoInicio5000 = System.nanoTime();
                Ordenamiento.insercion(arreglo5000);
                tiempoFin5000 = System.nanoTime();
                System.out.println("Tiempo de insercion para 5000 elementos: " + (tiempoFin5000 - tiempoInicio5000) + " nanosegundos");
           
                tiempoInicio5000 = System.nanoTime();
                Ordenamiento.seleccion(arreglo5000);
                tiempoFin5000 = System.nanoTime();
                System.out.println("Tiempo de seleccion para 5000 elementos: "+ (tiempoFin5000 - tiempoInicio5000) + " nanosegundos");
                
                tiempoInicio5000 = System.nanoTime();
                Ordenamiento.mergesort(arreglo5000, 0, arreglo5000.length - 1);
                tiempoFin5000 = System.nanoTime();
                System.out.println("Tiempo de mergesort para 5000 elementos: "+ (tiempoFin5000 - tiempoInicio5000) + " nanosegundos");
                break;
            case 5:
                tamano = 10000;
                double[] arreglo10000 = generarArregloAleatorio(tamano);
                long tiempoInicio10000, tiempoFin10000;
                
               
                tiempoInicio10000 = System.nanoTime();
                Ordenamiento.burbuja(arreglo10000);
                tiempoFin10000 = System.nanoTime();
                System.out.println("Tiempo de burbuja para 10000 elementos: "+ (tiempoFin10000 - tiempoInicio10000) + " nanosegundos");
               
                tiempoInicio10000 = System.nanoTime();
                Ordenamiento.insercion(arreglo10000);
                tiempoFin10000 = System.nanoTime();
                System.out.println("Tiempo de insercion para 10000 elementos: " + (tiempoFin10000 - tiempoInicio10000) + " nanosegundos");
           
                tiempoInicio10000 = System.nanoTime();
                Ordenamiento.seleccion(arreglo10000);
                tiempoFin10000 = System.nanoTime();
                System.out.println("Tiempo de seleccion para 10000 elementos: "+ (tiempoFin10000 - tiempoInicio10000) + " nanosegundos");
                
                tiempoInicio10000 = System.nanoTime();
                Ordenamiento.mergesort(arreglo10000, 0, arreglo10000.length - 1);
                tiempoFin10000 = System.nanoTime();
                System.out.println("Tiempo de mergesort para 10000 elementos: "+ (tiempoFin10000 - tiempoInicio10000) + " nanosegundos");
                break;               
            case 6:
                opcionOrdenamiento=6;
                break;
                        }
                        
                         } while (opcionOrdenamiento != 6);
                  
      
          case 3: 
            Interfaz int1=new Interfaz();
            int1.setVisible(true);
            break;
            
        }
      }
    } while (opcion != 4);
  }
    public static double[] generarArregloAleatorio(int tamano) {
        double[] arreglo = new double[tamano];
        return arreglo;
    }
}

    
    

