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
                    Pantalla.intercambiarVar(aux, arr[j], arr);
                }
            }
            fin--;
        }
        System.out.print("Lista ordenada: ");
        Pantalla.mostrarArr(arr);
    }
    
    public static void SelectionSort(int[] a) {
        for (int i = 0; i<a.length; i++){
            int iMin=i;
            for(int j = i+1; j<a.length; j++){
                if(a[j]<a[iMin]){
                    iMin = j;
                }
            }
            int aux = a[i];
            a[i]=a[iMin];
            a[iMin]=aux;
            Pantalla.intercambiarVar(aux, a[i], a);
        }
        System.out.print("Lista ordenada: ");
        Pantalla.mostrarArr(a);
    }

    public static void InsertionSort(int[] a) {
        int tem;
        for(int i = 1; i<a.length; i++){
            tem = a[i];
            int j;
            for(j = i-1; j>=0;j--){
                if(a[j]>tem){
                    a[j+1]=a[j];
                }
                else{ break; }
            }
            if (a[j+1]!=tem){
                Pantalla.incertarVar(tem, a);
            }
            a[j+1]=tem;
        }
        System.out.print("Lista ordenada: ");
        Pantalla.mostrarArr(a);
    }

    public static void ShellSort(int[] a) {     
        int n = a.length;
        int incremento = n;
        do {
            incremento = incremento / 2;
            for (int k = 0; k < incremento; k++) {
                for (int i = incremento + k; i < n; i += incremento) {
                    int j = i;
                    while (j - incremento >= 0 && a[j] < a[j - incremento]) {
                        int tmp = a[j];
                        a[j] = a[j - incremento];
                        a[j - incremento] = tmp;
                        Pantalla.intercambiarVar(tmp, a[j], a);
                        j -= incremento;
                        }
                    }
                }
            } 
        while (incremento > 1);
        System.out.print("Lista ordenada: ");
        Pantalla.mostrarArr(a);
    }

    // public static void ShellSort(int[] a) {     
    //     int inter = a.length;
    //     do{
    //         inter = inter/2;
    //         for (int i = 0; i<a.length-inter; i++){
    //             for (int j = i;j>=0;j-=inter){
    //                 if (a[j]>a[j+inter]){
    //                     int aux = a[i];
    //                     a[i]=a[i+inter];
    //                     a[i+inter]=aux;
    //                 }
    //             }
    //         }
    //     }
    //     while(inter/2>=1);
    //     Pantalla.mostrarArr(a);
    // }

    public static void mergeSort(int[] a){
        int[] res = mergeSortAl(a);
        System.out.print("Lista ordenada: ");
        Pantalla.mostrarArr(res);
    }

    private static int[] mergeSortAl(int[] a) {
        if (a.length < 2) {return a;}
        int mid = a.length / 2;
        int[] left = new int[mid];
        int[] right = new int[a.length - mid];
 
        System.arraycopy(a, 0, left, 0, mid);
        System.arraycopy(a, mid, right, 0, a.length - mid);
 
        mergeSortAl(left);
        mergeSortAl(right);
        merge(a, left, right);
        return a;
    }

    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                Pantalla.incertarVar(arr[k], arr);
                i++;
            } else {
                arr[k] = right[j];
                Pantalla.incertarVar(arr[k], arr);
                j++;
            }
            k++;
        }
        while (i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    public static void quickSort(int[] a){
        int[] res = quickSortAl(a, 0, a.length-1);
        System.out.print("Lista ordenada: ");
        Pantalla.mostrarArr(res);
    }

    private static int[] quickSortAl(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partitionQuick(arr, low, high);
            quickSortAl(arr, low, pivotIndex - 1);
            quickSortAl(arr, pivotIndex + 1, high);
        }
        return arr;
    }
    
    private static int partitionQuick(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                Pantalla.intercambiarVar(temp, arr[i], arr);
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        
        return i + 1;
    }
}