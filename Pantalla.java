public class Pantalla {
    public static void mostrarArr(int[] arr){
        System.out.print("[");
        for (int e : arr) {
            System.out.print(" " + e);
        }
        System.out.println("]");
        
    }
    public static void cambioVar(int a, int b, int i, int j){
        System.out.println("Se intercambiaron los valores " + a + " y " + b + " en las posiciones " + i + " y " + j + " respectivamente");
    }
}
