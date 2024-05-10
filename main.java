import java.util.Random;

public class main{
    public static void main(String[] _args) {
        int largo = 9;
        // int[] arr = {23,6,11,34,48,80,69,3,21};
        int[] arr;
        
        int op = -1;
        do {
            arr = gen(largo);
            op = Pantalla.menu();
            Pantalla.mostrarArr(arr);
            switch (op) {
                case 1:
                    algoritmos.BubleSort(arr.clone());
                    break;
                case 2:
                    algoritmos.SelectionSort(arr.clone());
                    break;
                case 3:
                    algoritmos.InsertionSort(arr.clone());
                    break;
                case 4:
                    algoritmos.ShellSort(arr.clone());
                    break;
                case 5:
                    algoritmos.mergeSort(arr.clone());
                    break;
            }
        } while (op != 6);
    }
    public static int[] gen(int largo){
        int[] arr = new int[largo];
        Random ran = new Random();
        for (int i = 0; i<arr.length;i++){
            arr[i] = ran.nextInt(100);
        }
        return arr;
    }
}