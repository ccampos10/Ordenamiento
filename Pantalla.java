import java.util.Scanner;

public class Pantalla {
    public static boolean flag = false;

    public static Scanner scan = new Scanner(System.in);
    public static int menu(){
        Scanner scan = new Scanner(System.in);
        int op=-1;
        flag = false;

        do {
            System.out.println("\nOpciones");
            System.out.println("1.- Buble sort");
            System.out.println("2.- Selection sort");
            System.out.println("3.- Insertion sort");
            System.out.println("4.- Shell sort");
            System.out.println("5.- Merge sort");
            System.out.println("6.- Quick sort");
            System.out.println("7.- Salir");
            System.out.println("Agrega v despues del numero de opcion para mostrar el procedimiento del algoritmo. Eje: 1v");
            System.out.print("Elija una opcion: ");
            try{
                String str = scan.nextLine();
                if (str.length() == 2 && str.charAt(1) == 'v'){ flag = true; }
                else if (str.length() == 2 && str.charAt(1) != 'v') { throw new Exception(); }
                op = Integer.parseInt(""+str.charAt(0));
                if (op<1 || 7<op) { throw new Exception(); }
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

    public static void incertarVar(int a, int[] list){
        if(flag){
            System.out.println("Se inserto el valor " + a);
            System.out.print("    ");
            mostrarArr(list);
            System.out.println("");
        }
    }
    public static void intercambiarVar(int a, int b, int[] list){
        if (flag){
            System.out.println("Se intercambio el valor " + a + " y " + b);
            System.out.print("    ");
            mostrarArr(list);
            System.out.println("");
        }
    }

    public static void mostrarListaOr(int[] arr){
        System.out.print("Lista original: ");
        Pantalla.mostrarArr(arr);
    }

    public static void comp(String com){
        System.out.println("Algoritmo, en el peor de los casos, con complejidad: "+com);
    }
}
