import java.util.Random;

public class main{
    public static void main(String[] args) {
        int[] arr = new int[20];
        Random ran = new Random();
        for (int i = 0; i<arr.length;i++){
            arr[i] = ran.nextInt(100);
        }
        Pantalla.mostrarArr(arr);
        algoritmos.BubleSort(arr);
    }
}