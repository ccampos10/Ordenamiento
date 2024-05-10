import java.util.Scanner;

public class Pantalla {
    public static Scanner scan = new Scanner(System.in);
    public static int menu(){
        Scanner scan = new Scanner(System.in);
        int op=-1;

        System.out.println("\nOpciones");
        System.out.println("1.- Buble sort");
        System.out.println("2.- Selection sort");
        System.out.println("3.- Insertion sort");
        System.out.println("4.- Shell sort");
        System.out.println("5.- Merge sort");
        System.out.println("6.- Salir");
        System.out.print("Elija una opcion: ");
        do {
            try{
                op = scan.nextInt();
                if (op<1 || 6<op) { throw new Exception(); }
            }
            catch (Exception e) {
                System.out.println("Valor ingresado invalido, intente nuevamente");
                op=-1;
            }
        } while (op==-1);

        return op;
    }

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
    public static void incertarVar(int a){
        System.out.println("Se incerto el valor " + a);
    }
    public static void intercambiarVar(int a, int b){
        System.out.println("Se intercambio el valor " + a + " y " + b);
    }

    public static void insertionVar(int tem){
        System.out.println("Inserto " + tem);
    }
}
