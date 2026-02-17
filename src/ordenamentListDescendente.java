public class ordenamentListDescendente {

    public static void main(String[] arguments) {
        long startTime = System.nanoTime();
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        int arr [] = {5,20,800,7000,10000};
        System.out.print("original array: ");
        for (int i = 0; i < arr.length ; i ++)
            System.out.print(arr[i] + " ");
        int temp = 0;
        for (int i = 0; i < arr.length; i ++) {
            for (int j = i + 1; j < arr.length; j ++) {
                if ( arr [j] > arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("\n decreasing array: ");
        for (int i = 0; i < arr.length; i ++)
            System.out.print(arr[i] + " ");
        System.out.println("\n\n--- Estadísticas de rendimiento ---");
        System.out.println("Tiempo en nanosegundos: " + duration + " ns");
        System.out.printf("Tiempo en milisegundos: %.4f ms\n", duration / 1_000_000.0);
    }
    
}
