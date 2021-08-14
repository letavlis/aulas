import java.util.Scanner;

public class VerificaTriangulo{
    public static void main(String[] args) {
        int a, b, c;
        Scanner scan = new Scanner(System.in);
        System.out.println("#Digite a medida dos lados de um triangulo qualquer#");
        System.out.printf("\n1º lado: ");
        a = scan.nextInt();
        System.out.printf("\n2º lado: ");
        b = scan.nextInt();
        System.out.printf("\n3º lado: ");
        c = scan.nextInt();

        if (a + b > c && a + c > b && b + c > a){
            if (a == b && b == c) {
                System.out.println("\n Esse triangulo é Equilatero");
            }
            else if (b == c || b == a || c == a) {
                System.out.println("\n Esse triangulo é Isosceles");                
            }
            else if(a != b && b != c && c != a){
                System.out.println("\n Esse triangulo é Escaleno");
            }
        }else{
            System.out.println("\n Valores não formam um triangulo!!");
        }
    }
}