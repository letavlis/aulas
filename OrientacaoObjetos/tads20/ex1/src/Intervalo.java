public class Intervalo {
    public static void main(String[] args) throws Exception {
        int i, j, count = 0;
        System.out.println("Intervalo de 1 a 2500");
        System.out.println();

        System.out.println("Numeros que divididos por 11 tem resto 5:");
        for (i = 1; i <= 2500; i++) {
            if (i % 11 == 5) {
                if (i != 5) {
                    System.out.printf(", %d", i);
                } else {
                    System.out.printf("%d", i);
                }
            }
        }
        System.out.println();
        System.out.println();

        System.out.println("Numeros pares:");
        for (i = 1; i <= 2500; i++) {
            if (i % 2 == 0) {
                if (i != 2) {
                    System.out.printf(", %d", i);
                } else {
                    System.out.printf("%d", i);
                }
            }
        }
        System.out.println();
        System.out.println();

        System.out.println("Numeros impares:");
        for (i = 1; i <= 2500; i++) {
            if (i % 2 != 0) {
                if (i != 1) {
                    System.out.printf(", %d", i);
                } else {
                    System.out.printf("%d", i);
                }
            }
        }
        System.out.println();
        System.out.println();

        System.out.println("Numeros primos:");
        i = 1;
        do {
            for (j = 1; j <= 2500; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count != 2) {
                i++;
                count = 0;
            } else {
                if (i != 2) {
                    System.out.printf(", %d", i);
                } else {
                    System.out.printf("%d", i);
                }
                i++;
                count = 0;
            }
        } while (i < 2500);
        System.out.println();
    }
}