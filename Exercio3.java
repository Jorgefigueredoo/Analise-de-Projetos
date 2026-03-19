import java.util.Scanner;

public class Exercio3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro numero:");
        int x = sc.nextInt();

        System.out.println("Informe o segundo numero:");
        int y = sc.nextInt();


        System.out.println("Escolha entre as operações: 1 - Somar, 2 - Subtrair, 3 - Multiplicar, 4 - Dividir");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Resultado: " + somar(x, y));
                break;
            case 2:
                System.out.println("Resultado: " + subtrair(x, y));
                break;
            case 3:
                System.out.println("Resultado: " + multiplicar(x, y));
                break;
            case 4:
                System.out.println("Resultado: " + dividir(x, y));
                break;
            default:
                System.out.println("Opção inválida.");
        } sc.close();
    }

    public static int somar(int x , int y) {
            return x + y;
        }

    public static int subtrair(int x, int y) {
        return x -y;
    }

    public static int multiplicar(int x, int y) {
        return x * y;
    }

    public static double dividir(int x, int y) {
        if (y == 0) {
            System.out.println("Não é possível dividir por zero.");
            return Double.NaN; 
        }
        return (double) x / y;
    }
}
