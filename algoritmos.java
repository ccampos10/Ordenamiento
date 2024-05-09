public class algoritmos {
    public static void BubleSort(int[] arr){
        int fin = arr.length;
        int aux;
        for (int i = 0; i<arr.length; i++){
            for (int j = 0; j<fin-1; j++){
                if (arr[j] > arr[j+1]){
                    aux = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = aux;
                    Pantalla.cambioVar(aux, arr[j],j+1,j+2);
                }
            }
            fin--;
        }
        Pantalla.mostrarArr(arr);
    }

    public static void SelectionSort(int[] arr){
        int aux;
        for (int i = 1; i<arr.length; i++){
            if (arr[i]<arr[i-1]){
                for (int j = i; j>0; j--){
                    aux = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = aux;
                }
            }
        }
        Pantalla.mostrarArr(arr);
    }
}
