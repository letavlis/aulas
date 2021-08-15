import java.util.Scanner;

public class VerificaVetor {
  public static void main(String[] args) {
    int[] arr;
    arr = new int[99];

    int maior = 0, menor = 0, media = 0, soma = 0, i = 0, n = 0, d = 0, stp = 0;
    Scanner scan = new Scanner(System.in);

    System.out.println("Digite até 100 numeros inteiros [-1 para parar]");
    while (i < 100) {
      System.out.printf("\nDigite um numero inteiro: ");
      n = scan.nextInt();
      if (n != -1) {
        arr[i] = n;
        if (i == 0) {
          maior = arr[i];
          menor = arr[i];
          soma = arr[i];
        } else {
          if (arr[i] > maior) {
            maior = arr[i];
          }
          if (arr[i] < menor) {
            menor = arr[i];
          }
          soma = soma + arr[i];
        }
        i++;
      } else {
        stp = i;
        i = 100;
      }
    }
    scan.close();

    System.out.println("\nTodos os numeros digitados");
    for (int j = 0; j < stp; j++) {
      System.out.printf("%d", arr[j]);
      if (j < stp - 1) {
        System.out.printf(", ");
      }
    }
    System.out.println();

    media = soma / stp;
    System.out.printf("\nMaior numero digitado: %d\n", maior);
    System.out.printf("Menor numero digitado: %d\n", menor);
    System.out.printf("Soma de todos os numeros: %d\n", soma);
    System.out.printf("\nMédia: %d\n", media);

    System.out.println("\nCada numero subtraido do maior");
    for (int j = 0; j < stp; j++) {
      System.out.printf("%d", arr[j] - maior);
      if (j < stp - 1) {
        System.out.printf(", ");
      }
    }
    System.out.println();

    System.out.println("\nCada numero acrescido do menor");
    for (int j = 0; j < stp; j++) {
      System.out.printf("%d", arr[j] + menor);
      if (j < stp - 1) {
        System.out.printf(", ");
      }
    }
    System.out.println();

    System.out.println("\nA diferença entre o numero digitado e a média");
    for (int j = 0; j < stp; j++) {
      d = arr[j] - media;
      System.out.printf("%d", d);
      if (j < stp - 1) {
        System.out.printf(", ");
      }
    }
    System.out.println();
  }
}