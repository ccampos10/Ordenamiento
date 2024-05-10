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
            switch (op) {
                case 1:
                    Pantalla.comp("O(n^2)");
                    Pantalla.mostrarListaOr(arr);
                    algoritmos.BubleSort(arr.clone());
                    break;
                case 2:
                    Pantalla.comp("O(n^2)");
                    Pantalla.mostrarListaOr(arr);
                    algoritmos.SelectionSort(arr.clone());
                    break;
                case 3:
                    Pantalla.comp("O(n^2)");
                    Pantalla.mostrarListaOr(arr);
                    algoritmos.InsertionSort(arr.clone());
                    break;
                case 4:
                    Pantalla.comp("O(n^2)");
                    Pantalla.mostrarListaOr(arr);
                    algoritmos.ShellSort(arr.clone());
                    break;
                case 5:
                    Pantalla.comp("O(n*log(n))");
                    Pantalla.mostrarListaOr(arr);
                    algoritmos.mergeSort(arr.clone());
                    break;
                case 6:
                    Pantalla.comp("O(n*log(n))");
                    Pantalla.mostrarListaOr(arr);
                    algoritmos.quickSort(arr.clone());
                    break;
            }
        } while (op != 7);
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