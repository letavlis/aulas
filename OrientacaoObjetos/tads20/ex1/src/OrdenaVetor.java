import java.util.Scanner;

public class OrdenaVetor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            int i = 0, aux = 0;
            int[] arr;

            System.out.println("Quantos numeros serão digitados?");
            i = scan.nextInt();
            arr = new int[i];

            for (i = 0; i < arr.length; i++) {
                System.out.printf("Digite o %dº número: ", i + 1);
                arr[i] = scan.nextInt();
            }

            for (i = 1; i < arr.length; i++) {
                for (int j = i; j > 0; j--) {
                    if (arr[j] < arr[j - 1]) {
                        aux = arr[j - 1];
                        arr[j - 1] = arr[j];
                        arr[j] = aux;
                    } else
                        break;
                }
            }
            System.out.println("\nVetor ordenado:");
            for (i = 0; i < arr.length; i++) {
                System.out.printf("[%d] ", arr[i]);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (scan != null) {
                scan.close();
            }
        }

    }
}
