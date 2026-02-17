/*Cree una clase en Java.
A) numero maximo
encuentre del el numero maximo..
nombre: Isaias Mejía Morente
Carnet: 202503928
curso: estructura de datos
tutor: ing. Brandon Chitay*/

public class maxNumber {
    public static void main (String[] args) {
        long startTime = System.nanoTime();
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        int arr[] = {10,30,100,5000,20000,100000};
        int max = arr [0];
        for(int i = 1; i < arr.length; i ++ ) {
            if (max < arr[i]){
                max = arr[i];

                
            }
            
        }

        System.out.println("\n\n--- Estadísticas de rendimiento ---");
        System.out.println("Tiempo en nanosegundos: " + duration + " ns");
        System.out.printf("Tiempo en milisegundos: %.4f ms\n", duration / 1_000_000.0);
        System.out.println("max number " + max);
        
    }
}
