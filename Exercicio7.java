import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe 10 números: ");
        int[] numeros = new int[10];
        for (int i = 0; i < 10; i++) {
            numeros[i] = sc.nextInt();
        }

        System.out.println("Números pares:");
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        } sc.close();
    }
}
