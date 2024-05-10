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
            Pantalla.intercambiarVar(aux, a[i]);
        }
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
            if (a[j+1]!=tem){ Pantalla.insertionVar(tem); }
            a[j+1]=tem;
        }
        Pantalla.mostrarArr(a);
    }

    // public static void ShellSort(int[] a) {     
    //     int n = a.length;
    //     int incremento = n;
    //     do {
    //         incremento = incremento / 2;
    //         for (int k = 0; k < incremento; k++) {
    //             for (int i = incremento + k; i < n; i += incremento) {
    //                 int j = i;
    //                 while (j - incremento >= 0 && a[j] < a[j - incremento]) {
    //                     int tmp = a[j];
    //                     a[j] = a[j - incremento];
    //                     a[j - incremento] = tmp;
    //                     Pantalla.intercambiarVar(tmp, a[j]);
    //                     j -= incremento;
    //                     }
    //                 }
    //             }
    //         } 
    //     while (incremento > 1);
    //     Pantalla.mostrarArr(a);
    // }

    public static void ShellSort(int[] a) {     
        int inter = a.length;
        do{
            inter = inter/2;
            for (int i = 0; i<a.length-inter; i++){
                for (int j = i;j>=0;j-=inter){
                    if (a[j]>a[j+inter]){
                        int aux = a[i];
                        a[i]=a[i+inter];
                        a[i+inter]=aux;
                    }
                }
            }
        }
        while(inter/2>=1);
        Pantalla.mostrarArr(a);
    }

    public static void mergeSort(int[] a) {
        if (a.length < 2) {return;}
        int mid = a.length / 2;
        int[] left = new int[mid];
        int[] right = new int[a.length - mid];
 
        System.arraycopy(a, 0, left, 0, mid);
        System.arraycopy(a, mid, right, 0, a.length - mid);
 
        mergeSort(left);
        mergeSort(right);
        merge(a, left, right);
        Pantalla.mostrarArr(a);
    }

    public static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
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
}
