import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O numero é par.");
        } else {
            System.out.println("O numero é impar.");
        }
        sc.close();
    }
}
