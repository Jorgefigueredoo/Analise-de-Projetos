import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        // Criamos o scanner para ler a entrada do usuário
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número para ver a tabuada: ");

        // Verificamos se o que foi digitado é realmente um número
        if (leitor.hasNextInt()) {
            int numero = leitor.nextInt();

            exibirTabuada(numero);
        } else {
            System.out.println("Erro: Por favor, insira um número inteiro válido.");
        }

        leitor.close(); // Fechamos o scanner para liberar recursos
    }

    private static void exibirTabuada(int n) {
        System.out.println("\n--- Tabuada do " + n + " ---");
        for (int i = 1; i <= 10; i++) {
            // Usando printf para deixar o texto alinhado e bonito
            System.out.printf("%d x %d = %d%n", n, i, (n * i));
        }
        System.out.println("-----------------------");
    }
}