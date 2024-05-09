import java.util.Random;

public class main{
    public static void main(String[] _args) {
        int largo = 5;
        int[] arr = new int[largo];
        Random ran = new Random();
        for (int i = 0; i<arr.length;i++){
            arr[i] = ran.nextInt(100);
        }
        Pantalla.mostrarArr(arr);
        algoritmos.BubleSort(arr.clone());
        algoritmos.SelectionSort(arr.clone());
    }
}