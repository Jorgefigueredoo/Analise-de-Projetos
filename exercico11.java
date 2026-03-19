import java.util.Scanner;

public class exercico11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Informe o primeiro número:");
        int a = sc.nextInt();
        System.out.printf("Informe o segundo número:");
        int b = sc.nextInt();
        System.out.printf("Informe o terceiro número:");
        int c = sc.nextInt();

        int resultado = maiorNumero(a, b, c);
        System.out.println("O maior número é: " + resultado);
        sc.close();
    }

    public static int maiorNumero(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        } 
    }
}
